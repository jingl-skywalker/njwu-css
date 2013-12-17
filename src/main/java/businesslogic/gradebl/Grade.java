/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.gradebl;

import dataservice.datafactory.DataFactory;
import java.util.ArrayList;
import vo.gradevo.GradeVO;
import po.gradepo.Grade_StudentPO;
import po.gradepo.Grade_TeacherPO;
import dataservice.gradedataservice.GradeDataService;
import dataservice.selectiondataservice.SelectionDataService;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sheyunfeng
 */
public class Grade {
    private Student student = null;
    private Teacher teacher = null;
    GradeDataService gradedataservice;
    DataFactory dataFactory;
    
    public Grade(){
        gradedataservice = null;
        try{
            dataFactory = (DataFactory)Naming.lookup("dataFactory");
            gradedataservice = dataFactory.getGradeData();
        }catch(Exception e){
            System.out.println("SelectionDataService exception:" + e);
        }
        
    }
    
    /**
     * 
     * @param stuID
     * @return 
     * 若该成绩类还没有指定学生，则添加学生
     */
    private boolean addStudent(String stuID){
        Grade_StudentPO studentpo = null;
        try {
            studentpo = gradedataservice.findStudent_Grade(stuID);
        } catch (RemoteException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(studentpo != null){    
            student = new Student(studentpo);
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
            return student.getStuID().equals(stuID);
    }
    
    /**
     * 
     * @param stuID
     * @return 
     * 若该成绩类还没有指定老师，则添加老师
     */
    private boolean addTeacher(String teacherName){
        Grade_TeacherPO teacherpo = null;
        try {
            teacherpo = gradedataservice.findTeacher_Grade(teacherName);
        } catch (RemoteException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(teacherpo != null){    //if((teachervo = getTeacher(teacherID)) != null)
            teacher = new Teacher(teacherpo);
            return true;
        }
        else 
            return false;
    }
    
    /**
     * 
     * @param stuID
     * @return 
     * 检查老师是否为当前老师
     */
    private boolean checkTeacher(String teacherName){
        if(teacher == null){
            return addTeacher(teacherName);
        }
        else
            return teacher.getTeacherID().equals(teacherName);
    }
    
    public ArrayList<GradeVO> getCourseScore(String ID, String term){
        if(!checkStudent(ID))
            return null;
        
        else
            return student.getCourseScore(term);
    }
    
    public double getGPA(String ID, String term) {
        if(!checkStudent(ID))
            return -1;
        
        else
            return student.getGPA(term);
    }
    
    public int getGradeSum(String ID, String term){
        if(!checkStudent(ID))
            return -1;
        
        else
            return student.getGradeSum(term);
    }
    
    public boolean recordScore(String teacherName, ArrayList<GradeVO> scores){
        if(!checkTeacher(teacherName))
            return false;
        
        return teacher.recordScore(scores);
       
    }
    
    
}
