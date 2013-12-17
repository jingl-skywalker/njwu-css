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
import po.selectionpo.TempSelectionPO;

/**
 *
 * @author Administrator
 */
public interface SelectionDataService extends Remote {
    
    public void insertTempSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException;

    public void insertSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException;
    
    public void deleteTempSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException;

    public void deleteSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException;

    public Selection_StudentPO findStudent_Selection(String ID) throws RemoteException;
    
    public ArrayList<TempSelectionPO> getTempSelection() throws RemoteException;
    
    public void saveTempSelection(ArrayList<TempSelectionPO> tempSelectionList) throws RemoteException;
    
    public boolean directInsertSelection(SelectionPO selectionpo) throws RemoteException;
    
    public boolean stuToUpperBound(String course, String term) throws RemoteException;
}
