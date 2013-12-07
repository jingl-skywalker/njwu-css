/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.processmngdataservice.noticedataservice;

import businesslogicservice.processmngblservice.notice.ROLE;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import po.processmngpo.NoticePO;

/**
 *
 */
public class NoticeDataStub implements NoticeDataService {

    @Override
    public boolean insert(NoticePO npo) throws RemoteException {
        return true;
    }

    @Override
    public ArrayList<NoticePO> find() throws RemoteException {

        NoticePO noticePO = new NoticePO(ROLE.ALL, "testNotice", 90, "test content", new Date());
        ArrayList<NoticePO> npos = new ArrayList<NoticePO>();
        npos.add(noticePO);
        return npos;
    }
}