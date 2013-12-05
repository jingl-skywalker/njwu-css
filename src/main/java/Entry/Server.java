/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entry;

import data.processmngdata.statedata.SystemTimer;
import data.processmngdata.statedata.TimerThread;
import dataservice.datafactory.DataFactory;
import dataservice.datafactory.DataFactoryImpl;
import dataservice.datafactory.LoginDataFactory;
import dataservice.datafactory.LoginDataFactoryImpl;
import dataservice.datafactory.UserInfoDataFactory;
import dataservice.datafactory.UserInfoDataFactoryImpl;
import dataservice.framedataservice.FrameDataService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.framepo.FramePO;

/**
 *
 * @author Administrator
 */
public class Server {

    public static void main(String[] args) {
        System.out.println("Server:");
        try {
            /*------Timer State about---------*/
            /*建立线程轮询系统时间*/
            SystemTimer systemTimer = new SystemTimer();
            TimerThread tThread = new TimerThread(systemTimer);
            Thread timerThread = new Thread(tThread, "TIMER");
            timerThread.setDaemon(true);
            timerThread.start();
            /*---------------------------------------*/
            DataFactory factory = new DataFactoryImpl(systemTimer);
            FrameDataService fds = factory.getFrameData();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("dataFactory", factory);
            Naming.rebind("frameDataService", fds);
            LoginDataFactory logindata = new LoginDataFactoryImpl();
            //  Registry registry = LocateRegistry.createRegistry(10000);
            //registry.bind("LoginData", logindata);            //绑定登陆
            Naming.rebind("LoginData", logindata);
            UserInfoDataFactory userInfoFactory = new UserInfoDataFactoryImpl();
            //registry.bind("UserInfoFactory", userInfoFactory);          //绑定用户信息类
            Naming.rebind("UserInfoFactory", userInfoFactory);
            System.out.println(">>>>>INFO:server start");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
