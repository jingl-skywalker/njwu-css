/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.userdata.UserInfoData;
import dataservice.userdataservice.UserInfoDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author 天
 */
public class UserInfoDataFactoryImpl extends UnicastRemoteObject implements UserInfoDataFactory{

    public UserInfoDataFactoryImpl() throws RemoteException {
    }

    @Override
    public UserInfoDataService getUserDataService() throws RemoteException {
        return new UserInfoData();
    }
    
}
