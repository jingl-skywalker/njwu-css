/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.coursedata.CourseData;
import dataservice.coursedataservice.CourseDataService;
import java.rmi.Remote;
import java.rmi.RemoteException;
import dataservice.framedataservice.FrameDataService;
import dataservice.gradedataservice.GradeDataService;
import dataservice.plandataservice.PlanDataService;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import dataservice.processmngdataservice.statedataservice.StateDataService;
import dataservice.selectiondataservice.SelectionDataService;

/**
 *
 * @author Administrator
 */
public interface DataFactory extends Remote {

    public FrameDataService getFrameData() throws RemoteException;

    public PlanDataService getPlanData() throws RemoteException;

    public StateDataService getStateData() throws RemoteException;

    public NoticeDataService getNoticeData() throws RemoteException;

    public GradeDataService getGradeData() throws RemoteException;

    public SelectionDataService getSelectionData() throws RemoteException;

    public CourseDataService getCourseData() throws RemoteException;
}
