/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.userdata.UserInfoData;
import dataservice.userdataservice.UserInfoDataService;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author 天
 */
public interface UserInfoDataFactory extends Remote {

    public UserInfoDataService getUserDataService() throws RemoteException;
}
