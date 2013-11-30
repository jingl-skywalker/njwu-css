/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.staticblservice;

import vo.staticvo.StudentStaticVO;

/**
 *
 * @author zili chen
 */

public interface StudentStaticBLService {
    
    public StudentStaticVO show();
    
    public StudentStaticVO show(String term,String department);
    
}
