/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import dataservice.userdataservice.UserLoginDataService;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author 天
 */
public interface LoginDataFactory extends Remote {

    public UserLoginDataService getUserLoginDataService() throws RemoteException;
}
