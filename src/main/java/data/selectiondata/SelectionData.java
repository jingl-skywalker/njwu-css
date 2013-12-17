/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.selectiondata;

import data.coursedata.CourseData;
import dataservice.selectiondataservice.SelectionDataService;
import dataservice.gradedataservice.GradeDataService;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.selectionpo.SelectionPO;
import po.selectionpo.Selection_StudentPO;
import po.selectionpo.Selection_CoursePO;
import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import data.userdata.UserInfoData;
import dataservice.coursedataservice.CourseDataService;
import dataservice.userdataservice.UserInfoDataService;
import java.util.Iterator;
import po.coursepo.CoursePO;
import po.gradepo.GradePO;
import po.gradepo.Grade_CoursePO;
import po.gradepo.Grade_StudentPO;
import po.gradepo.Grade_TeacherPO;
import po.selectionpo.TempSelectionPO;
import po.userpo.UserInfoPO;
/**
 *
 * @author sheyunfeng
 */
public class SelectionData extends UnicastRemoteObject implements SelectionDataService ,GradeDataService{
    private final String filename = "src/main/resources/selection&grade.txt";
    private final String filename2 = "src/main/resources/tempSelection.txt";
    private FileUtility fileutility;
    private FileUtility fileutility2;
    private static ArrayList<SelectionDataItem> selectionDataList;  //所有选课记录列表
    private ArrayList<SelectionDataItem> tempSelectionDataList;     //本学期所有未确认的选修课选课记录列表
            
    public SelectionData() throws RemoteException{
        fileutility = new FileutilityImpl(filename);                //将“selection&grade.txt”中内容读到selectionDataList中
        selectionDataList = new ArrayList<SelectionDataItem>();
        ArrayList<String> stringdata = fileutility.find();
        Iterator<String> iterator = stringdata.iterator();
        while(iterator.hasNext()){
            selectionDataList.add(new SelectionDataItem(iterator.next()));
        }
        
        fileutility2 = new FileutilityImpl(filename2);              //将“tempSelection.txt”中内容读到tempSelectionDataList中
        tempSelectionDataList = new ArrayList<SelectionDataItem>();
        ArrayList<String> stringdata2 = fileutility.find();
        Iterator<String> iterator2 = stringdata2.iterator();
        while(iterator.hasNext()){
            tempSelectionDataList.add(new SelectionDataItem(iterator2.next()));
        }
    }
    
    private void writeBack(String filename, ArrayList<SelectionDataItem> list){
        String writestring = "";
        Iterator<SelectionDataItem> iterator = list.iterator();
        while(iterator.hasNext()){
            writestring += iterator.next();
            writestring += "\r\n";
        }
        
        FileutilityImpl.writeToFile(filename, writestring);
    }
    /**
     * 
     * @param selectionlist
     * @throws RemoteException 
     * 插入选修课选课记录
     */
    public void insertTempSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException {
        Iterator<SelectionPO> iterator = selectionlist.iterator();
        while(iterator.hasNext()){
            tempSelectionDataList.add(new SelectionDataItem(iterator.next()));
            
        }
        
        writeBack(filename2, tempSelectionDataList);
    }
    
    /**
     * 
     * @param selectionlist
     * @throws RemoteException 
     * 插入选课记录
     */
    public void insertSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException {
        Iterator<SelectionPO> iterator = selectionlist.iterator();
        while(iterator.hasNext()){
            selectionDataList.add(new SelectionDataItem(iterator.next()));
            
        }
        
        writeBack(filename, selectionDataList);
    }
    
    /**
     * 
     * @param selectionlist
     * @throws RemoteException 
     * 删除选修课选课记录
     */
    public void deleteTempSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException {
        Iterator<SelectionPO> iteratorpo;
        Iterator<SelectionDataItem> iterator = tempSelectionDataList.iterator();
        while(iterator.hasNext()){
            if(selectionlist.isEmpty()){
                break;
            }
            iteratorpo = selectionlist.iterator();
            while(iteratorpo.hasNext()){
                if(iterator.next().equalsPO(iteratorpo.next())){
                    iterator.remove();
                    iteratorpo.remove();
                    break;
                }
            }
        }
        
        writeBack(filename2, tempSelectionDataList);
    }

    /**
     * 
     * @param selectionlist
     * @throws RemoteException 
     * 删除选课记录
     */
    public void deleteSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException {
        Iterator<SelectionPO> iteratorpo;
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            if(selectionlist.isEmpty()){
                break;
            }
            iteratorpo = selectionlist.iterator();            
            while(iteratorpo.hasNext()){
                if(iterator.next().equalsPO(iteratorpo.next())){
                    iterator.remove();
                    iteratorpo.remove();
                    break;
                }                
            }
        }
        
        writeBack(filename, selectionDataList);
    }

    /**
     * 
     * @param ID
     * @return
     * @throws RemoteException 
     * 返回一个包括所有选课信息的学生po
     */
    public Selection_StudentPO findStudent_Selection(String ID) throws RemoteException {
        ArrayList<Selection_CoursePO> courselist = new ArrayList<Selection_CoursePO>();
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            SelectionDataItem selectionitem = iterator.next();
            if(selectionitem.getStuID().equals(ID)){
                Selection_CoursePO coursePO = new Selection_CoursePO(selectionitem.getCourseNum(), selectionitem.getTerm());
                courselist.add(coursePO);
            }
        }
        
        ArrayList<Selection_CoursePO> tempCourselist = new ArrayList<Selection_CoursePO>();
        Iterator<SelectionDataItem> iterator2 = tempSelectionDataList.iterator();
        while(iterator2.hasNext()){
            SelectionDataItem selectionitem = iterator.next();
            if(selectionitem.getStuID().equals(ID)){
                Selection_CoursePO coursePO = new Selection_CoursePO(selectionitem.getCourseNum(), selectionitem.getTerm());
                tempCourselist.add(coursePO);
            }
        }
        
        return new Selection_StudentPO(ID, courselist, tempCourselist);
    }
    
        /**
         * 
         * @param gradelist
         * @throws RemoteException 
         */
    public void updateGrade(ArrayList<GradePO> gradelist) throws RemoteException {
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            SelectionDataItem selectionitem = iterator.next();
            if(gradelist.isEmpty()){
                break;
            }
            Iterator<GradePO> gradeiterator = gradelist.iterator();
            while(gradeiterator.hasNext()){
                if(selectionitem.updateGrade(gradeiterator.next())){
                    gradeiterator.remove();
                    break;
                }
            }
        }
        
        writeBack(filename, selectionDataList);
        
    }

    /**
     * 
     * @param ID
     * @return
     * @throws RemoteException 
     */
    public Grade_StudentPO findStudent_Grade(String ID) throws RemoteException {
        ArrayList<GradePO> gradelist = new ArrayList<GradePO>();
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            SelectionDataItem selectionitem = iterator.next();
            if(ID.equals(selectionitem.getStuID())){
                gradelist.add(selectionitem.getGradePO());
            }
        }
        
        return new Grade_StudentPO(ID, gradelist);
    }

    /**
     * 
     * @param ID
     * @return
     * @throws RemoteException 
     * 根据老师姓名返回一个老师对象，包括该老师开设的课程
     */
    public Grade_TeacherPO findTeacher_Grade(String name) throws RemoteException {
       ArrayList<GradePO> gradelist = new ArrayList<GradePO>();
       Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
       while(iterator.hasNext()){
           SelectionDataItem selection = iterator.next();
           if(selection.containsTeacher(name)){
               gradelist.add(selection.getGradePO());
           }
       }
       
       ArrayList<Grade_CoursePO> courselist = new ArrayList<Grade_CoursePO>();
       Iterator<GradePO> gradeiterator = gradelist.iterator();
       while(gradeiterator.hasNext()){
           GradePO grade = gradeiterator.next();
           Iterator<Grade_CoursePO> courseiterator = courselist.iterator();
           
           boolean gradeInCourse = false;
           while(courseiterator.hasNext()){
               Grade_CoursePO course = courseiterator.next();
               if(course.getCourseNum().equals(grade.getCourseID())
                       && course.getTerm().equals(grade.getTerm())){
                   course.addGradePO(grade);
                   gradeInCourse = true;
                   break;
               }                   
           }
           if(!gradeInCourse){
               Grade_CoursePO newCourse = new Grade_CoursePO(grade.getCourseID(), grade.getTerm());
               newCourse.addGradePO(grade);
               courselist.add(newCourse);
           }
       }
       
       return new Grade_TeacherPO(name, courselist);
       
       
    }
    
    /*public static void main(String args[]){
        try{
            LocateRegistry.createRegistry(1499);
            SelectionDataService selectiondata = new SelectionData();
            Naming.rebind("//localhost:1499/SelectionDataService", selectiondata);
            
            System.out.println("SelectionDataService is ready");         
        }catch(Exception e){
            System.out.println("SelectioinDataService is failed " + e);
        }
    }*/

    /**
     * 
     * @param courseNum
     * @param term
     * @return
     * @throws RemoteException 
     * 返回一门课程一个学期的成绩单
     */
    public ArrayList<GradePO> findCourseInfo(String courseNum, String term) throws RemoteException {
       ArrayList<GradePO> gradelist = new ArrayList<GradePO>();
       Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
       while(iterator.hasNext()){
           SelectionDataItem selection = iterator.next();
           if(selection.getCourseNum().equals(courseNum) && selection.getTerm().equals(term)){
               gradelist.add(selection.getGradePO());
           }
       }
       
       return gradelist;
    }

    @Override
    public ArrayList<GradePO> findStudentInfo(String stuID) throws RemoteException {
       ArrayList<GradePO> gradelist = new ArrayList<GradePO>();
       Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
       while(iterator.hasNext()){
           SelectionDataItem selection = iterator.next();
           if(selection.getStuID().equals(stuID)){
               gradelist.add(selection.getGradePO());
           }
       }
       
       return gradelist;
    }

    /**
     * 
     * @return
     * @throws RemoteException 
     * 获得未排课的选课记录
     */
    public ArrayList<TempSelectionPO> getTempSelection() throws RemoteException {
        CourseDataService courseData = new CourseData();
        UserInfoDataService userData = new UserInfoData();
        ArrayList<TempSelectionPO> tempSelectionList = new ArrayList<TempSelectionPO>();
        
        Iterator<SelectionDataItem> iterator = tempSelectionDataList.iterator();
        while(iterator.hasNext()){
            SelectionDataItem selection = iterator.next();
            SelectionPO selectionpo = selection.getSelectionPO();
            String courseNum = selection.getCourseNum();
            String stuID = selection.getStuID();
            String term = selection.getTerm();
                      
            int maxStuNum;
            int grade;
            int totalCredit = 0;
            
            CoursePO coursepo = courseData.find(courseNum);
            maxStuNum = Integer.parseInt(coursepo.getPeopleNum());
            
            UserInfoPO userpo = userData.getStudent(stuID);
            int yearIn = Integer.parseInt(userpo.getYearIn());
            String[] termArray = term.split("-");
            int year = Integer.parseInt(termArray[0]);
            int termNum = Integer.parseInt(termArray[1]);
            grade = year - yearIn +1 -(termNum -1); //根据课程学期和学生入学年份计算学生年级
            
            Iterator<SelectionDataItem> iterator2 = selectionDataList.iterator();
            while(iterator2.hasNext()){
                SelectionDataItem selection2 = iterator.next();
                if(stuID.equals(selection2.getStuID())){
                    CoursePO course = courseData.find(selection2.getCourseNum());
                    if(course.getModule().equals("通识")){
                        totalCredit += Integer.parseInt(course.getCredit());
                    }
                }
            }
            
            TempSelectionPO tempSelection = new TempSelectionPO(selectionpo, grade, totalCredit, maxStuNum);
            tempSelectionList.add(tempSelection);
        }
        return tempSelectionList;
    }

    /**
     * 
     * @param tempSelectionList
     * @throws RemoteException 
     * 将排好的选课保存
     */
    public void saveTempSelection(ArrayList<TempSelectionPO> tempSelectionList) throws RemoteException {
        Iterator<TempSelectionPO> iterator = tempSelectionList.iterator();
        while(iterator.hasNext()){
            SelectionPO selectionpo = iterator.next().getSelectionPO();
            SelectionDataItem selectionItem = new SelectionDataItem(selectionpo);
            selectionDataList.add(selectionItem);
        }
        
        tempSelectionDataList.clear();
        
        writeBack(filename, selectionDataList);
        writeBack(filename2, tempSelectionDataList);
    }

    /**
     * 
     * @param selectionpo
     * @return
     * @throws RemoteException 
     * 根据先到先得规则选课
     */
    public boolean directInsertSelection(SelectionPO selectionpo) throws RemoteException {
        CourseDataService courseData = new CourseData();
        String courseNum = selectionpo.getCouseNum();
        String term = selectionpo.getTerm();
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        int stuNum = 0;
        while(iterator.hasNext()){
            SelectionDataItem selectionItem = iterator.next();
            if(courseNum.equals(selectionItem.getCourseNum()) && 
                    term.equals(selectionItem.getTerm())){
                stuNum++;
            }           
        }
        
        CoursePO course = courseData.find(courseNum);
        int maxStuNum = Integer.parseInt(course.getPeopleNum());
        
        if(stuNum < maxStuNum){
            SelectionDataItem selectionItem = new SelectionDataItem(selectionpo);
            selectionDataList.add(selectionItem);
            
            return true;
        }
        
        return false;
    }

    /**
     * 
     * @param courseNum
     * @param term
     * @return
     * @throws RemoteException 
     * 检验一门课的选课人数是否已达上限
     */
    public boolean stuToUpperBound(String courseNum, String term) throws RemoteException {
       CourseDataService courseData = new CourseData();
       CoursePO course = courseData.find(courseNum);
       int num = Integer.parseInt(course.getPeopleNum());
       
       Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
       while(iterator.hasNext()){
           SelectionDataItem selection = iterator.next();
           if(selection.getCourseNum().equals(courseNum) && selection.getTerm().equals(term)){
               num--;
           }
       }
        
       if(num > 0){
           return true;
       }else{
           return false;
       }
    }

   

}
