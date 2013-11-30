/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import dataservice.processmngdataservice.statedataservice.StateDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import po.processmngpo.StatePO;

/**
 *
 * @author Administrator
 */
public class StateData extends UnicastRemoteObject implements StateDataService {

    FileUtility fileUtility = new FileutilityImpl("src/main/resources/state.txt");

    public StateData() throws RemoteException {
        System.out.println("state data constr");
    }

    @Override
    public StatePO find(int stateNum) throws RemoteException {
        String s = fileUtility.find(stateNum);
        return new StatePO(s);
    }

    @Override
    public boolean record(StatePO spo) throws RemoteException {
        return fileUtility.append(spo.toStoreString());
    }
}
