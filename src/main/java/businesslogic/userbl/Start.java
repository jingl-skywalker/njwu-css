/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import dataservice.datafactory.LoginDataFactory;
import dataservice.userdataservice.UserLoginDataService;
import businesslogicservice.userblservice.UserLoginBLService;
import businesslogicservice.userblservice.UserLoginFactory;
import vo.uservo.UserInfoVO;
import po.userpo.UserInfoPO;

/**
 *
 * @author 天
 */
public class Start {
    public static void main(String[] arg){
       // System.setSecurityManager(new RMISecurityManager());  

        try {
            Registry registry = LocateRegistry.getRegistry("localhost",10000);
            UserLoginFactory ul =new UserLoginFactory();
            UserLoginBLService userLogin = ul.getUserLoginController("localhost",10000);
            UserInfoVO p = userLogin.login("00001", "00001");
            System.out.println(p.getName()+" "+userLogin.getNotice());
        } /*catch (NotBoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } */catch (AccessException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
