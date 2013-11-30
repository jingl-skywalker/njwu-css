/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.staticvo;

import java.util.ArrayList;

/**
 *
 * @author zili chen
 */
public class CourseStaticVO {
    
    String department;//院系
    int numOfCourse;
    int creditOfModule;
    double percent;
    ArrayList<Integer> grades = new ArrayList<Integer>();
    
    public CourseStaticVO(String department) {
        this.department = department;
    }
    
    public CourseStaticVO() {
        
    }

    public int getNumOfCourse() {
        return numOfCourse;
    }

    public int getCreditOfModule() {
        return creditOfModule;
    }

    public double getPercent() {
        return percent;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getDepartment() {
        return department;
    }
    
}
