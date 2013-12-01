/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.plandataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.planpo.PlanPO;

/**
 *
 * @author Administrator
 */
public interface PlanDataService extends Remote{

    public void insert(PlanPO ppo)throws RemoteException;

    public void update(PlanPO ppo)throws RemoteException;

    public ArrayList<PlanPO> finds(String institute,String module) throws RemoteException;
    
    public void delete(String institute,String courseID) throws RemoteException;
    
    public void writeCourse(String file,String content) throws RemoteException;
}
