/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import businesslogicservice.staticblservice.TeacherStaticBLService;
import vo.staticvo.TeacherStaticVO;

/**
 *
 * @author 天
 */
public class TeacherStaticController implements TeacherStaticBLService{

      String ip = null;
    int port ;
    TeacherStaticBL teaStaticBL;
    
    public TeacherStaticController(String ip,int port) {
        this.ip = ip;
        this.port = port;
        teaStaticBL = new TeacherStaticBL(ip,port);
    }

    @Override
    public TeacherStaticVO show() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public TeacherStatic show(String department) {
        return teaStaticBL.showTea(department);
    }
    
}
