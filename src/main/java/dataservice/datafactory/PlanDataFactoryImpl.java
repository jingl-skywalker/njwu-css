/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.plandata.PlanData;
import dataservice.plandataservice.PlanDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author zili chen
 */
public class PlanDataFactoryImpl extends UnicastRemoteObject implements PlanDataFactory{

    public PlanDataFactoryImpl() throws RemoteException {
        
    }
    
    @Override
    public PlanDataService getPlanData() throws RemoteException {
        return new PlanData();
    }
    
}
