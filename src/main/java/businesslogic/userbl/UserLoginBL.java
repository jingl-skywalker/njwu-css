/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import dataservice.datafactory.LoginDataFactory;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import dataservice.userdataservice.UserLoginDataService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import vo.uservo.UserInfoVO;
import po.userpo.UserInfoPO;

/**
 *
 * @author 天
 */
public class UserLoginBL {
    Registry registry;
    UserLoginDataService userLogin;
    public UserLoginBL(String ip,int port) {
        try {
            registry = LocateRegistry.getRegistry(ip, port);
             LoginDataFactory factory =(LoginDataFactory) registry.lookup("LoginData");
            userLogin = factory.getUserLoginDataService();
        } catch (NotBoundException ex) {
            Logger.getLogger(UserLoginBL.class.getName()).log(Level.SEVERE, null, ex);
        }catch (RemoteException ex) {
            Logger.getLogger(UserLoginBL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public UserInfoVO login(String ID,String psw){
        try {
            UserInfoPO p=userLogin.find(ID, psw);
            if(p==null)
                return null;
            return new UserInfoVO(p);
        } catch (RemoteException ex) {
            Logger.getLogger(UserLoginBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    String getNotice() {
        try {
            String info = userLogin.getNotice();
            return info;
        } catch (RemoteException ex) {
            Logger.getLogger(UserLoginBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
