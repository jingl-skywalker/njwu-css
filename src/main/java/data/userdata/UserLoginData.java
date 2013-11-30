/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.userdata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import dataservice.userdataservice.UserLoginDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import po.userpo.UserInfoPO;
import po.userpo.UserLoginPO;

/**
 *
 * @author 天
 */
public class UserLoginData extends UnicastRemoteObject implements UserLoginDataService {

    public UserLoginData() throws RemoteException {
    }

    @Override
    public String getNotice() throws RemoteException {
        FileUtility f = new FileutilityImpl("src//main//resources//inform.txt");
        return f.getAll();
    }

    @Override
    public UserInfoPO find(String ID, String psw) throws RemoteException {
        //读取额管理员
        FileUtility f = new FileutilityImpl("src//main//resources//admin.txt");
        String[] infos = null;
        infos = f.getInfo(ID);
        if ((infos != null) && infos[1].equals(psw)) {
            return new UserInfoPO(infos);
        }
        //用户
        f = new FileutilityImpl("src//main//resources//user.txt");

        if ((infos = f.getInfo(ID)) != null) {
            if (infos[1].equals(psw)) {
                return new UserInfoPO(infos);
            }
        }
        return null;
    }
}
