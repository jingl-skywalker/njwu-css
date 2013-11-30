/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.userblservice;

import businesslogic.userbl.UserInfoController;

/**
 *
 * @author 天
 */
public class UserInfoFactory {
    public UserBLService getUserBLService(String ip,int port){
        return new UserInfoController(ip,port);
    }
}
