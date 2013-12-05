/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.staticblservice;

import businesslogic.staticbl.TeacherStaticController;

/**
 *
 * @author 天
 */
public class TeacherStaticBLServiceFactory {

    public TeacherStaticBLService getTeacherStaticBLService(String ip,int port){
        return new TeacherStaticController(ip,port);
    }
}
