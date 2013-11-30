/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.gradedataservice;

import po.gradepo.GradePO;
import po.gradepo.Grade_StudentPO;
import po.gradepo.Grade_TeacherPO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface GradeDataService extends Remote {

    public void updateGrade(ArrayList<GradePO> gradelist) throws RemoteException;

    public Grade_StudentPO findStudent_Grade(String ID) throws RemoteException;
    
    public Grade_TeacherPO findTeacher_Grade(String ID) throws RemoteException;
}
