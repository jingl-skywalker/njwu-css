/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import dataservice.plandataservice.PlanDataService;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author zili chen
 */
public interface PlanDataFactory extends Remote{
    
    public PlanDataService getPlanData() throws RemoteException;
    
}
