/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import data.framedata.FrameData;
import data.processmngdata.noticedata.NoticeData;
import data.processmngdata.statedata.StateData;
import dataservice.framedataservice.FrameDataService;
import dataservice.gradedataservice.GradeDataService;
import dataservice.plandataservice.PlanDataService;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import dataservice.processmngdataservice.statedataservice.StateDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Administrator
 */
public class DataFactoryImpl extends UnicastRemoteObject implements DataFactory{
        public DataFactoryImpl() throws RemoteException {
    }

    @Override
    public FrameDataService getFrameData() throws RemoteException {
        return new FrameData();
    }

    @Override
    public PlanDataService getPlanData() throws RemoteException {
        return null;
    }

    @Override
    public StateDataService getStateData() throws RemoteException {
      return new StateData();
    }

    @Override
    public NoticeDataService getNoticeData() throws RemoteException {
        return new NoticeData();
    }

    @Override
    public GradeDataService getGradeData() throws RemoteException {
        return null;
    }
}
