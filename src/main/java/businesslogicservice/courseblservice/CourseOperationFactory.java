/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.courseblservice;

import businesslogic.coursebl.CourseController;

/**
 *
 * @author zili chen
 */
public class CourseOperationFactory {
    
    public CourseBLService createCourseBL() {
        return new CourseController();
    }
    
}
