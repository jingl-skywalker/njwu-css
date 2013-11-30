/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.planvo;

import java.util.ArrayList;

import vo.coursevo.CourseVO;

/**
 *
 * @author Administrator
 */
public class PlanVO {

    private String institute;
    private ArrayList<CourseVO> courses = new ArrayList<CourseVO>();

    public PlanVO(String institute) {
        this.institute = institute;
    }

    public PlanVO(String institute, ArrayList<CourseVO> courses) {
        this.institute = institute;
        this.courses = courses;
    }

    public void updateCourse(CourseVO src, CourseVO cvo) {

        CourseVO courseVO = this.courses.get(this.courses.indexOf(src));
        courseVO = cvo;
    }

    public String getInstitute() {
        return institute;
    }

    public ArrayList<CourseVO> getCourses() {
        return courses;
    }
}
