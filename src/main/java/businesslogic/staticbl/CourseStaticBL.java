/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import businesslogic.userbl.UserInfoBL;
import dataservice.coursedataservice.CourseDataService;
import dataservice.datafactory.DataFactory;
import dataservice.datafactory.UserInfoDataFactory;
import dataservice.userdataservice.UserInfoDataService;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.coursepo.CoursePO;
import vo.coursevo.CourseVO;

/**
 *
 * @author 天
 */
public class CourseStaticBL {
     Registry registry;
    
    CourseDataService courseData;
    
    public CourseStaticBL(String ip,int port) {
        try {
            registry = LocateRegistry.getRegistry(ip, port);
            DataFactory factory = (DataFactory) registry.lookup("dataFactory");
            courseData = factory.getCourseData();
        } catch (NotBoundException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccessException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public CourseStatic getCourse(String ins){
        ArrayList<CoursePO> courPo = new ArrayList<CoursePO>(1000);
        CourseStatic courseStatic = new CourseStatic();
        
        try {
        
            courPo=courseData.finds("institute",ins);
            //System.out.println("size:"+courPo.size());
        } catch (RemoteException ex) {
            Logger.getLogger(CourseStaticBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(CoursePO p:courPo){
            int credit = Integer.parseInt(p.getCredit());
            if("通识通修".contains(p.getModule())){
                courseStatic.addJournal(credit);
            }
            else if(p.getModule().equals("学科专业")){
                courseStatic.addProf(credit);
            }
            else if(p.getModule().equals("开放选修")){
                courseStatic.addSelect(credit);
            }
            else {
                courseStatic.addGrad(credit);
            }
        }
        return courseStatic;
    }
    
}
