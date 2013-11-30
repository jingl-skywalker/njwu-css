/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.planpo;

import java.util.ArrayList;

import po.coursepo.CoursePO;

/**
 *
 * @author Administrator
 */
public class PlanPO {

    private String institute;
    private ArrayList<CoursePO> courses = new ArrayList<CoursePO>();

    public PlanPO(String institute) {
        this.institute = institute;
    }

    public void addCourse(CoursePO cpo) {
        getCourses().add(cpo);
    }
    public void deleteCourse(CoursePO cpoc){
        getCourses().remove(cpoc);
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public ArrayList<CoursePO> getCourses() {
        return courses;
    }
}
