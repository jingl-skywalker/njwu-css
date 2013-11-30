/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.gradevo;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GradeVO {

    String courseNum;
    String courseName;
    String courseProperity;
    String term;
    String stuID;
    String stuName;
    String teacherID;
    String teacherName;
    int credit;
    double grade;


    public GradeVO(String courseNum, String stuID, String term,double grade) {
        this.courseNum = courseNum;
        this.stuID = stuID;        
        this.term = term;
        this.grade = grade;
    }

    public void setCourseName(String name){
        courseName = name;
    }
    
    public void setTeacherID(String id){
        teacherID = id;
    }
    
    public void setTeacherName(String name){
        teacherName = name;
    }
        

    public String getCourseNum() {
        return courseNum;
    }

    public String getCouseName() {
        return courseName;
    }
    
    public String getCourseProperity(){
        return courseProperity;
    }
    
    public void setcourseProperity(String courseProperity){
        this.courseProperity = courseProperity;
    }

    public String getTerm(){
        return term;
    }
    public String getStuID() {
        return stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getCredit(){
        return credit;
    }
    
    public void setCredit(int credit){
        this.credit = credit;
    }
    
    public double getGrade() {
        return grade;
    }
}
