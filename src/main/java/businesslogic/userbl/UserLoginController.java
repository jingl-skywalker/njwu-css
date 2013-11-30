/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import businesslogicservice.userblservice.UserLoginBLService;
import vo.uservo.UserInfoVO;


/**
 *用户登陆的controller
 * @author 天
 */
public class UserLoginController implements UserLoginBLService{

    UserLoginBL user;
    public UserLoginController(String ip,int port) {
        user = new UserLoginBL(ip,port);
    }

    @Override
    /**
     * 获取公告，如无公告则返回null
     */
    public String getNotice() {
        return user.getNotice();
    }
    
    @Override
    public UserInfoVO login(String ID, String psw) {
        return user.login(ID, psw);
    }
}
