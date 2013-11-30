/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.userblservice;

import businesslogic.userbl.UserLoginController;


/**
 *
 * @author 天
 */
public class UserLoginFactory {
    public UserLoginController getUserLoginController(String ip,int port){
        return new UserLoginController(ip,port);
    }
}
