/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.staticblservice;

import vo.staticvo.TeacherStaticVO;

/**
 *
 * @author zili chen
 */
public interface TeacherStaticBLService {
    
    public TeacherStaticVO show();
    
    public TeacherStaticVO show(String department);
}
