/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import businesslogic.processmngbl.statebl.StateList;
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

    int currentStateNum = 1;
    FileUtility fileUtility = new FileutilityImpl("src/main/resources/state.txt");
    SystemTimer timer;

    public StateData() throws RemoteException {
        System.out.println("state data constr");
    }

    public StateData(SystemTimer timer1) throws RemoteException {
        this();
        this.timer = timer1;
    }

    @Override
    public StatePO find(int stateNum) throws RemoteException {
        String s = fileUtility.find(stateNum);
        if (s == null) {
            System.out.println("state string nul");
            return null;
        }
        return new StatePO(s);
    }

    @Override
    public boolean record(StatePO spo) throws RemoteException {
        return fileUtility.append(spo.toStoreString());
    }

    @Override
    public StatePO getCurrentState() throws RemoteException {
        StatePO statePO=timer.getCurrentStatePO();
        return statePO;
   }
}
