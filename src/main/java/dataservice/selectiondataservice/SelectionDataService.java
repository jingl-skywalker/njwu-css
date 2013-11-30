/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.selectiondataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import po.selectionpo.SelectionPO;
import po.selectionpo.Selection_StudentPO;

/**
 *
 * @author Administrator
 */
public interface SelectionDataService extends Remote {

    public void insertSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException;

    public void deleteSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException;

    public Selection_StudentPO findStudent_Selection(String ID) throws RemoteException;
}
