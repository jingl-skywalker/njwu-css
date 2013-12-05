/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import businesslogic.userbl.UserInfoBL;
import dataservice.datafactory.UserInfoDataFactory;
import dataservice.userdataservice.UserInfoDataService;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.userpo.UserInfoPO;
import vo.uservo.UserInfoVO;

/**
 *
 * @author 天
 */
public class TeacherStaticBL {
    Registry registry;
    ArrayList<UserInfoVO> teaVo = new ArrayList<UserInfoVO>(1000);
    UserInfoDataService userInfo;
    public TeacherStaticBL(String ip,int port) {
        try {
            registry = LocateRegistry.getRegistry(ip, port);
            UserInfoDataFactory factory = (UserInfoDataFactory) registry.lookup("UserInfoFactory");
            userInfo = factory.getUserDataService();
        } catch (NotBoundException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccessException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 常看老师的统计信息
     * @param ins 查看的院系
     * @return 统计的信息
     */
    public TeacherStatic showTea(String ins){
        try {
            ArrayList<UserInfoPO> pos = userInfo.getTea(ins);
            Calendar ca = Calendar.getInstance();
            int currentYear = ca.get(Calendar.YEAR);
            TeacherStatic teaStatic = new TeacherStatic();
            for (UserInfoPO p : pos) {
                int birthYear = Integer.parseInt(p.getGrade());
                int old = currentYear - birthYear;
                if(old<=40){
                    teaStatic.addYoung();
                   
                 }
                else if(old<=60){
                    teaStatic.addYoungOld();
            
                }
                else{
                    teaStatic.addOld();
                }
            }
            return teaStatic;
        } catch (RemoteException ex) {
            Logger.getLogger(TeacherStaticBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new TeacherStatic();
    }
}
