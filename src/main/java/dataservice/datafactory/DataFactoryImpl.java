/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.coursedata.CourseData;
import data.framedata.FrameData;
import data.plandata.PlanData;
import data.processmngdata.noticedata.NoticeData;
import data.processmngdata.statedata.StateData;
import data.processmngdata.statedata.SystemTimer;
import data.selectiondata.SelectionData;
import dataservice.coursedataservice.CourseDataService;
import dataservice.framedataservice.FrameDataService;
import dataservice.gradedataservice.GradeDataService;
import dataservice.plandataservice.PlanDataService;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import dataservice.processmngdataservice.statedataservice.StateDataService;
import dataservice.selectiondataservice.SelectionDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Administrator
 */
public class DataFactoryImpl extends UnicastRemoteObject implements DataFactory {

    SystemTimer systemTimer;

    public DataFactoryImpl() throws RemoteException {
    }

    public DataFactoryImpl(SystemTimer systemTimer) throws RemoteException {
        this.systemTimer = systemTimer;
    }

    @Override
    public FrameDataService getFrameData() throws RemoteException {
        return new FrameData();
    }

    @Override
    public PlanDataService getPlanData() throws RemoteException {
        return new PlanData();
    }

    @Override
    public StateDataService getStateData() throws RemoteException {
        // return new StateData();
        return new StateData(systemTimer);
    }

    @Override
    public NoticeDataService getNoticeData() throws RemoteException {
        return new NoticeData();
    }

    @Override
    public GradeDataService getGradeData() throws RemoteException {
        return new SelectionData();
    }

    @Override
    public SelectionDataService getSelectionData() throws RemoteException {
        return new SelectionData();
    }

    @Override
    public CourseDataService getCourseData() throws RemoteException {
        return new CourseData();
    }

    @Override
    public CourseDataService getCourseData(String file) throws RemoteException {
        return new CourseData(file);
    }
}
