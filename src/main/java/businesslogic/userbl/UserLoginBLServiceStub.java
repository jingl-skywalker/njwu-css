/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import businesslogicservice.userblservice.UserLoginBLService;
import enumeration.ResultMessage;
import vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public class UserLoginBLServiceStub implements UserLoginBLService {

    @Override
    public String getNotice() {
        return "na";
    }

    
     @Override
    public UserInfoVO login(String ID, String psw) {
        System.out.println("login success!");
        return new UserInfoVO("121250114","q","ret","student","softwate","male",
               "一年级","2012", "3444443535635856856");
    }

}
