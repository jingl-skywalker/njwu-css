/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import businesslogicservice.staticblservice.CourseStaticBLService;
import vo.coursevo.CourseVO;
import vo.staticvo.CourseStaticVO;

/**
 *
 * @author 天
 */
public class CourseStaticController implements CourseStaticBLService{

    CourseStaticBL courseStaticBL;
    public CourseStaticController(String ip,int port) {
        courseStaticBL = new CourseStaticBL(ip,port);
    }

    
    @Override
    public CourseVO find(String id) {
        return  null;
    }

    @Override
    public CourseStatic show(String department) {
        return courseStaticBL.getCourse(department);
    }
    
}
