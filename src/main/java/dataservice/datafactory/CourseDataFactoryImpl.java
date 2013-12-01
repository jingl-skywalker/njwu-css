/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.coursedata.CourseData;
import dataservice.coursedataservice.CourseDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author zili chen
 */
public class CourseDataFactoryImpl extends UnicastRemoteObject implements CourseDataFactory{

    public CourseDataFactoryImpl() throws RemoteException {
        
    }
    
    @Override
    public CourseDataService getCourseData() throws RemoteException {
        return new CourseData();
    }
    
}
