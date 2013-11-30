/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.userblservice;

import enumeration.ResultMessage;
import vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public interface UserLoginBLService {
      public UserInfoVO login(String ID,String psw);
     /**
     * 获取公告，如无公告则返回null
     */
      public String getNotice();
}
