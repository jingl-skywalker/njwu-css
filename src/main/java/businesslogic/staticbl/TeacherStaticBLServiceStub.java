/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import businesslogicservice.staticblservice.TeacherStaticBLService;
import vo.staticvo.TeacherStaticVO;

/**
 *
 * @author zili chen
 */
public class TeacherStaticBLServiceStub implements TeacherStaticBLService{
    
    public TeacherStaticVO show(){
        return new TeacherStaticVO();
    }
    
    
    @Override
    public TeacherStatic show(String department) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
