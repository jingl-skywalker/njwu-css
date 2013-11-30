package dataservice.processmngdataservice.statedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import po.processmngpo.StatePO;

public interface StateDataService extends Remote{

    public StatePO find(int stateNum) throws RemoteException;

    public boolean record(StatePO spo)throws  RemoteException;
}
