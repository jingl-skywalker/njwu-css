/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.planbl;

import java.util.ArrayList;

import businesslogicservice.planblservice.PlanBLService;
import vo.coursevo.CourseVO;
import vo.planvo.PlanVO;

/**
 *
 * @author Administrator
 */
public class PlanBLServiceStub implements PlanBLService {

    private String institute;
    private ArrayList<CourseVO> courses = new ArrayList<CourseVO>();

    
    public PlanVO selectIns(String institute) {
        this.institute = institute;
        System.out.println("now the operation is on institute:" + this.institute);
        return new PlanVO(this.institute);
    }

    
    public PlanVO addCourse(CourseVO cvo) {
        this.courses.add(cvo);
        System.out.println("Successfully add the course");
        return new PlanVO(this.institute, this.courses);
    }

    
    public PlanVO deleteCourse(CourseVO cvo) {
        this.courses.remove(cvo);
        System.out.println("Successfully delete the course");
        return new PlanVO(institute, courses);
    }

    
    public PlanVO modifyCourse(CourseVO src, CourseVO target) {
        int i = this.courses.indexOf(src);
        this.courses.remove(src);
        this.courses.add(i, target);
        System.out.println("Successfully modify the course");
        return new PlanVO(this.institute, this.courses);
    }

    
    public PlanVO release() {
        System.out.println("successfully release the plan");
        return new PlanVO(this.institute, this.courses);
    }

    
    public PlanVO observe() {
        ArrayList<CourseVO> course = new ArrayList<CourseVO>();
        course.add(new CourseVO("testNum", "111111", "Test", null, 8, 4, null, null));
        return new PlanVO("software", course);
    }
}
