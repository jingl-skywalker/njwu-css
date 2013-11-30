/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.planblservice;

import vo.coursevo.CourseVO;
import vo.planvo.PlanVO;

/**
 *
 * @author Administrator
 */
public interface PlanBLService {

    public PlanVO selectIns(String institute);

    public PlanVO addCourse(CourseVO cvo);

    public PlanVO deleteCourse(CourseVO cvo);

    public PlanVO modifyCourse(CourseVO src, CourseVO target);

    public PlanVO release();

    public PlanVO observe();
}
