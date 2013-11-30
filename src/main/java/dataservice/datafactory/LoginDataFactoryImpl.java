/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.userdata.UserLoginData;
import dataservice.userdataservice.UserLoginDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author 天
 */
public class LoginDataFactoryImpl extends UnicastRemoteObject implements LoginDataFactory {

    public LoginDataFactoryImpl() throws RemoteException {
    }

    @Override
    public UserLoginDataService getUserLoginDataService() throws RemoteException {
        return new UserLoginData();
    }
}
