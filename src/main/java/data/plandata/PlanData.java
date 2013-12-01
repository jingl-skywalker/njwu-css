/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.plandata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import dataservice.plandataservice.PlanDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.planpo.PlanPO;

/**
 *
 * @author zili chen
 */
public class PlanData extends UnicastRemoteObject implements PlanDataService{

    FileUtility utility;
    ArrayList<PlanPO> pList;
    
    public PlanData() throws RemoteException{
        utility = new FileutilityImpl("src/main/resources/plan.txt");
        pList = new ArrayList<PlanPO>();
        pList = utility.readPlanInfo();
    }
    @Override
    public void insert(PlanPO ppo) throws RemoteException {
        pList.add(ppo);
    }

    @Override
    public void update(PlanPO ppo) throws RemoteException {
        for(int i=0;i<pList.size();i++) {
            if(pList.get(i).getCourseID().equals(ppo.getCourseID())&&
                    pList.get(i).getInstitute().equals(ppo.getInstitute())) {
                pList.remove(i);
            }
        }
        pList.add(ppo);
    }

    @Override
    public ArrayList<PlanPO> finds(String institute,String module) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String institute,String courseID) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void writeCourse(String file,String content) {
       FileutilityImpl.writeToFile(file, content);
    }
    
}
