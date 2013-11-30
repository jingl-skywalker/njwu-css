/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.userdata;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 天
 */
public class UserInfodataDriver {
    public static void main(String[] a){
        try {
           System.out.println( new UserInfoData().readMessage());
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfodataDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
