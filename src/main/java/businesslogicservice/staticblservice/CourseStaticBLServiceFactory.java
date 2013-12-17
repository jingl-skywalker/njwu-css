/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.staticblservice;

import businesslogic.staticbl.CourseStaticController;

/**
 *
 * @author 天
 */
public class CourseStaticBLServiceFactory {

    public CourseStaticBLService getCourseStaticBLService(String ip,int port) {
        return new CourseStaticController(ip,port);
    }
    
}
