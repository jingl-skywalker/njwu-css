/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.plandataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.planpo.PlanPO;

/**
 *
 * @author Administrator
 */
public interface PlanDataService extends Remote{

    public void insert(PlanPO ppo)throws RemoteException;

    public void update(PlanPO ppo)throws RemoteException;

    public PlanPO find(String insttitute)throws RemoteException;
}
