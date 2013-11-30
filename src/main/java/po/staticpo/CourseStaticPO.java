/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.staticpo;

import java.util.ArrayList;

/**
 *
 * @author zili chen
 */
public class CourseStaticPO  {
    
   private String department;//院系
   private int numOfCourse;
   private int creditOfModule;
   private double percent;
   private ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public CourseStaticPO(String department) {
        this.department = department;
    }

    public int getNumOfCourse() {
        return numOfCourse;
    }

    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }

    public int getCreditOfModule() {
        return creditOfModule;
    }

    public void setCreditOfModule(int creditOfModule) {
        this.creditOfModule = creditOfModule;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}
