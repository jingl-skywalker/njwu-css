/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.selectionbl;

import businesslogic.userbl.UserInfoBL;
import businesslogic.userbl.UserInfoController;
import businesslogicservice.courseblservice.CourseBLService;
import businesslogicservice.courseblservice.CourseOperationFactory;
import businesslogicservice.userblservice.UserBLService;
import dataservice.datafactory.DataFactory;
import java.rmi.Naming;
import po.selectionpo.Selection_StudentPO;
import po.selectionpo.SelectionPO;
import dataservice.selectiondataservice.SelectionDataService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.selectionpo.Selection_CoursePO;
import vo.coursevo.CourseVO;
/**
 *
 * @author sheyunfeng
 */
public class Selection {
    private final int maxCourseNum = 4;
    private Student student = null;
    private CourseList courselist = null;
    private String term;
    
    private SelectionDataService selectiondataservice;
    private DataFactory dataFactory;
    
    public Selection(){
        selectiondataservice = null;
        try{
            dataFactory = (DataFactory)Naming.lookup("dataFactory");
            selectiondataservice = dataFactory.getSelectionData();
        }catch(Exception e){
            System.out.println("SelectionDataService exception:" + e);
        }
        
        Calendar calendar = Calendar.getInstance();         //根据当前日期确定选课记录的学期
        term = "" + calendar.get(Calendar.YEAR);
        if(calendar.get(Calendar.MONTH) < 6){
            term += "-1";
        }
        else{
            term += "-2";
        }
    }
    /**
     * 
     * @param stuID
     * @return 
     * 若该选课类还没有指定学生，则添加学生
     */
    private boolean addStudent(String stuID){       
        
        Selection_StudentPO studentpo = null;
        try {
            studentpo = selectiondataservice.findStudent_Selection(stuID);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
        
        if(!(studentpo == null)){
            student = new Student(studentpo);
            courselist = new CourseList(student.getTempCourseList());
            return true;
        }
        else 
            return false;
    }
    
    /**
     * 
     * @param stuID
     * @return 
     * 检查学生是否为当前学生
     */
    private boolean checkStudent(String stuID){
        if(student == null){
            return addStudent(stuID);
        }
        else
            return student.getID().equals(stuID);
    }
    
    /**
     * 
     * @param stuID
     * @param courseNum
     * @return 
     * 增加选修课选课
     */
    public boolean addCourse(String stuID, String courseNum){
        if(!checkStudent(stuID)){
            return false;
        }
        
        if(courselist.getCourseNum() < maxCourseNum){
            return courselist.add(courseNum);
        }
        
        return false;
    }

    /**
     * 
     * @param stuID
     * @param coruseNum
     * @return 
     * 删除未确认的选修课选课
     */
    public boolean deleteCourse(String stuID, String coruseNum){
        if(!checkStudent(stuID)){
            return false;
        }
        
        return courselist.delete(coruseNum);
        
    }
    
    /**
     * 
     * @param stuID
     * @param courseNum
     * @return 
     * 选课确认后，退课
     */
    public boolean quitCoruse(String stuID, String courseNum){        
        if(true){    //permitted
            SelectionPO selectionpo = new SelectionPO(courseNum, stuID, term);
            ArrayList<SelectionPO> selectionlist = new ArrayList<SelectionPO>();
            selectionlist.add(selectionpo);
            try {
                selectiondataservice.deleteSelection(selectionlist);
                
            } catch (RemoteException ex) {
                Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return true;
        }
  
        return false;
            
    }
    
    /**
     * 
     * @return 
     * 选修课选课结束，提交结果
     */
    public boolean verify(){
        CourseOperationFactory courseFactory = new CourseOperationFactory();
        CourseBLService coursebl = courseFactory.createCourseBL();
        
        try{
        ArrayList<String> newCourseList = courselist.getList();
        ArrayList<String> oldCourseList = student.getTempCourseList();
        
        Iterator<String> iterator = newCourseList.iterator();
        ArrayList<SelectionPO> selectionlist = new ArrayList<SelectionPO>();
        while(iterator.hasNext()){
            String courseNum = iterator.next();
            if(!oldCourseList.contains(courseNum)){
                CourseVO course = coursebl.observeInfo(courseNum);
                SelectionPO selectionpo = new SelectionPO(courseNum, student.getID(), term, course.getTeaName());
                //插入新选课记录是要附上老师姓名
                selectionlist.add(selectionpo);
            }
        }
        selectiondataservice.insertTempSelection(selectionlist);
        
        iterator = oldCourseList.iterator();
        selectionlist = new ArrayList<SelectionPO>();
        while(iterator.hasNext()){
            String courseNum = iterator.next();
            if(!newCourseList.contains(courseNum)){
                SelectionPO selectionpo = new SelectionPO(courseNum, student.getID(), term);
                //删除选课记录时不许要老师姓名
                selectionlist.add(selectionpo);
            }
        }
        selectiondataservice.deleteTempSelection(selectionlist);        
        
        return true;       
        }catch(Exception e){
            System.out.println("Exception:" + e);
            return false;
        }
    }
        
    
    /**
     * 
     * @return 
     * 获得全校课程
     * 将调用coursebl接口以获得课程信息
     */
    public ArrayList<CourseVO> getCourseList(){
        CourseOperationFactory courseFactory = new CourseOperationFactory();
        CourseBLService coursebl = courseFactory.createCourseBL();
        
        return coursebl.observeList("institute", "All");
    }
    
    /**
     * 
     * @return 
     * 获得本学期所有选修课
     */
    public ArrayList<CourseVO> getSelCourseList(){
        ArrayList<CourseVO> courselist = getCourseList();
        Iterator<CourseVO> iterator = courselist.iterator();
        while(iterator.hasNext()){
            CourseVO course = iterator.next();
            if((!course.getModule().equals("通识"))
                    || (!course.getTerm().equals(term))){
                iterator.remove();
            }
        }
        
        
        return courselist;
    }
    
    /**
     * 
     * @param stuID
     * @return 
     * 返回该学生所有的选课
     * 将调用courseblservice的接口以查询课程信息
     * 将调用selectiondtaservice以查询学生课程信息
     */
    public ArrayList<CourseVO> getCourseList(String stuID){
        
        CourseOperationFactory courseFactory = new CourseOperationFactory();
        CourseBLService coursebl = courseFactory.createCourseBL();
        
        Selection_StudentPO studentpo = null;
        try {
             studentpo = selectiondataservice.findStudent_Selection(stuID);
        } catch (RemoteException ex) {
            Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(studentpo == null){
            return null;
        }
        
        ArrayList<CourseVO> mycourselist = new ArrayList<CourseVO>();
        ArrayList<Selection_CoursePO> coursepolist = studentpo.getCourseList();
        Iterator<Selection_CoursePO> iterator = coursepolist.iterator();
        while(iterator.hasNext()){
            Selection_CoursePO coursepo = iterator.next();
            CourseVO course = coursebl.observeInfo(coursepo.getCourseNum());
            course.setTerm(coursepo.getTerm()); //将课程的学期改为学生修读的学期
            mycourselist.add(course);
        }
        return mycourselist;
    }
    
    /**
     * 
     * @param stuID
     * @return 
     * 获得该学生未确认的已选选修课列表
     * 将调用courseblservice接口以查询课程信息
     */
    public ArrayList<CourseVO> getTempCourseList(String stuID){
        if(!checkStudent(stuID)){
            return null;
        }
        
        CourseOperationFactory courseFactory = new CourseOperationFactory();
        CourseBLService coursebl = courseFactory.createCourseBL();
        
        ArrayList<CourseVO> tempCourselist = new ArrayList<CourseVO>();
        ArrayList<String> list = courselist.getList();
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            CourseVO course = coursebl.observeInfo(iterator.next());
            tempCourselist.add(course);
        }
        return tempCourselist;
         
    }
    
    /**
     * 
     * @return 
     * 获得补选课程列表
     */
    public ArrayList<CourseVO> getReSelCourseList(){
        ArrayList<CourseVO> courselist = getSelCourseList();
        
        Iterator<CourseVO> iterator = courselist.iterator();
        while(iterator.hasNext()){
            CourseVO course = iterator.next();
            try {
                if(!selectiondataservice.stuToUpperBound(course.getCourseID(), term)){
                    iterator.remove();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return courselist;
    }
    
    /**
     * 
     * @param course
     * @param institute
     * @param stuGrade
     * @param term
     * @return 
     * 增加必修课选课，直接生成选课记录
     */
    public boolean addCompulsoryCourse(CourseVO course, String institute, String stuGrade, String term){
        UserBLService userbl = new UserInfoController("", 0);
        ArrayList<String> stulist = userbl.getStu(institute, stuGrade);
        ArrayList<SelectionPO> selectionlist = new ArrayList<SelectionPO>();
        Iterator<String> iterator = stulist.iterator();
        while(iterator.hasNext()){
            SelectionPO selection = new SelectionPO(course.getCourseID(), iterator.next(), term, course.getTeaName());
            selectionlist.add(selection);
        }
        try {
            selectiondataservice.insertSelection(selectionlist);
            return true;
        } catch (RemoteException ex) {
            Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    
    /**
     * 
     * @param courseNum
     * @param stuID
     * @return 
     * 按照先到先得规则选课
     * 直接返回选课结果
     * 用于补选
     */
    public boolean addDirectCourse(String courseNum, String stuID){
        
        SelectionPO selectionpo = new SelectionPO(courseNum, stuID, term);
        try {
            if(selectiondataservice.directInsertSelection(selectionpo)){
                return true;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        return false;
    }
    
    /**
     * 
     * @param stuID
     * @return 
     * 获得本学期已选中的选修课
     */
    public ArrayList<String> getMySelectedCourseList(String stuID){
        ArrayList<String> selectedCourselist = new ArrayList<String>();
        
        ArrayList<CourseVO> myCourseList = getCourseList(stuID);
        Iterator<CourseVO> iterator = myCourseList.iterator();
        while(iterator.hasNext()){
            CourseVO course = iterator.next();
            if(course.getModule().equals("通识") && course.getTerm().equals(term)){
                selectedCourselist.add(course.getCourseID());
            }
        }
        
        return selectedCourselist;
    }
}
