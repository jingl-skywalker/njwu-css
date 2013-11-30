/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.noticedata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import dataservice.processmngdataservice.noticedataservice.NoticeDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.processmngpo.NoticePO;

/**
 *
 * @author Administrator
 */
public class NoticeData extends UnicastRemoteObject implements NoticeDataService {

    FileUtility fileUtility = new FileutilityImpl("src/main/resources/notice.txt");

    public NoticeData() throws RemoteException {
        System.out.println("notice constructor");
    }

    @Override
    public boolean insert(NoticePO npo) throws RemoteException {
        System.out.println("notice insert @noticedata.java");
        return fileUtility.append(npo.toStoreString());

    }

    @Override
    public ArrayList<NoticePO> find() throws RemoteException {
        System.out.println("find notice @noticedata.java");
        ArrayList<NoticePO> list = new ArrayList<NoticePO>();
        ArrayList<String> strings = fileUtility.find();
        System.out.println("@noticedata.java  string.size:"+strings.size()+strings.isEmpty());
        System.out.println(strings.size());
        for (String s : strings) {
            list.add(new NoticePO(s));
        }
        return list;
    }
}
