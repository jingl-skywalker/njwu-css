/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.datafactory;

import java.rmi.Remote;
import java.rmi.RemoteException;
import dataservice.framedataservice.FrameDataService;
import dataservice.gradedataservice.GradeDataService;
import dataservice.plandataservice.PlanDataService;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import dataservice.processmngdataservice.statedataservice.StateDataService;

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
}
