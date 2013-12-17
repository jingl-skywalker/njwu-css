/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursebl;

import businesslogicservice.courseblservice.CourseBLService;
import enumeration.ResultMessage;
import java.rmi.RemoteException;
import java.util.ArrayList;
import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public class CourseController implements CourseBLService {

    private CourseList courseList;
    private Course course;

    public CourseController() {
        courseList =new CourseList();
    }

    public CourseController(String term) {
        courseList = new CourseList(term);
    }
    
    @Override/*创建课程*/
    public ResultMessage createCourse(CourseVO cvo) {
        
       return  courseList.addCourse(cvo);
    }

    @Override/*修改课程信息*/
    public ResultMessage modifyCourse(CourseVO cvo) {//任课老师完善课程信息通过cvo.set方
        return courseList.modifyCourse(cvo);
    }

    @Override/*查看课程列表*/
    public ArrayList<CourseVO> observeList(String field, String value) {
        return courseList.observeList(field, value);
    }

    @Override/*查看课程信息*/
    public CourseVO observeInfo(String courseID) {
        return courseList.observeInfo(courseID);
    }

    @Override/*删除课程*/
    public ResultMessage delete(String courseID) {
        return courseList.delete(courseID);
    }

   

    @Override
    public ArrayList<CourseVO> findCourseID(String text) {
        return courseList.findCourseID(text);
    }

    @Override
    public ArrayList<CourseVO> findCourseName(String text) {
        return courseList.findCourseName(text);
    }

    @Override
    public ArrayList<CourseVO> observeTeaAllCour(String teaID) {
        return courseList.findTeaAllCour(teaID);
    }

    /**
     * 院教务员查看本院所有的课程
     * @param depart
     * @return 
     */
    @Override
    public ArrayList<CourseVO> observeInsAllCour(String depart) {
         return courseList.findInsAllCour(depart);
    }

    /**
     * 查看该院系的所有要修的课程
     * @param deart
     * @return 
     */
    @Override
    public ArrayList<CourseVO> observeInsLeanCour(String depart) {
        return courseList.observeInsLeanCour(depart);
    }

    @Override
    public ArrayList<CourseVO> findModualCour(String modual) {
        return courseList.findModualCour(modual);
    }
    
     /**
      * 返回所有的学期数或null
      @return 
      */
    @Override
    public String[] getAllTerms(){
       
            return courseList.getAllTerms();
    }

    @Override
    public CourseVO addCourses(ArrayList<CourseVO> vos) throws RemoteException{
        return courseList.addCourses(vos);
    }

    @Override
    public CourseVO addCourses(String file) throws RemoteException{
        return courseList.addCourses(file);
    }

    @Override
    public String[] jgetAllTerms() {
        return courseList.jgetAllTerms();
    }

    @Override
    public CourseVO jaddCourses(ArrayList<CourseVO> vos) throws RemoteException {
        return courseList.jaddCourses(vos);
    }

    @Override
    public CourseVO jaddCourses(String text) throws RemoteException {
        return courseList.jaddCourses(text);
    }

    @Override
    public ArrayList<CourseVO> jobserveAllCour() {
        return courseList.jobserveAllCour();
    }

    @Override
    public void createTerm(String newTerm) {
        courseList.createTerm(newTerm);
    }

    @Override
    public ResultMessage jdelete(CourseVO v) {
        return courseList.jdelete(v);
    }

    @Override
    public ResultMessage jcreateCourse(CourseVO course) {
        return courseList.jcreateCourse(course);
    }

    @Override
    public ResultMessage jupdateCourse(CourseVO v) {
        return courseList.jupdateCourse(v);
    }

    @Override
    public void jcreateTerm(String newTerm) {
        courseList.jcreateTerm(newTerm);
    }

    @Override
    public ArrayList<CourseVO> observeInsCreateCour(String depart) {
        return courseList.observeInsCreateCour(depart);
    }

    @Override
    public ArrayList<CourseVO> getAllSelectedCour() {
        return courseList.getAllSelectedCour();
    }

}
