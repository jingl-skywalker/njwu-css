/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.staticblservice;

import businesslogic.staticbl.CourseStatic;
import vo.coursevo.CourseVO;
import vo.staticvo.CourseStaticVO;

/**
 *
 * @author zili chen
 */
public interface CourseStaticBLService {
    
    public CourseVO find(String id);
    
    public CourseStatic show(String department);
    
}
