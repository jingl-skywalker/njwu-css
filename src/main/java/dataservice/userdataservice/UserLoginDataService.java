/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.userdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import po.userpo.UserInfoPO;

/**
 *
 * @author Administrator
 */
public interface UserLoginDataService extends Remote {

    public UserInfoPO find(String ID, String psw) throws RemoteException;
    /*
     * 获取公告
     */

    public String getNotice() throws RemoteException;
}
