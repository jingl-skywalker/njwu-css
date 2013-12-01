/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import dataservice.coursedataservice.CourseDataService;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author zili chen
 */
public interface CourseDataFactory extends Remote {
    
    public CourseDataService getCourseData() throws RemoteException;
    
}
