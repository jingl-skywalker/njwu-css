/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import data.processmngdata.statedata.SystemTimer;
import java.rmi.RemoteException;
import data.fileutility.FileUtility;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class FileUtilityMockForSystemTimer extends FileutilityImpl {

    ArrayList<String> stateMsgs;

    public FileUtilityMockForSystemTimer(String fileString) {
        String s1 =
                "1@2013-12-19 0:00:00@2014-1-1 0:00:00\n";
        String s2 =
                "2@2011-8-2 0:00:00@2014-8-15 0:00:00\n";
        String s3 =
                "2@2011-8-2 0:00:00@2013-8-15 0:00:00\n";
        String s4 =
                "3@2013-8-15 1:00:00@2013-8-26 0:00:00\n";
        String s5 =
                "4@2013-8-26 1:00:00@2013-8-29 0:00:00\n";
        String s6 =
                "5@2013-9-1 1:00:00@2013-9-3 0:00:00\n";
        String s7 =
                "6@2013-9-10 1:00:00@2013-9-13 0:00:00\n";
        String s8 =
                "7@2013-9-13 1:00:00@2013-9-25 0:00:00\n";
        stateMsgs.add(s1);
        stateMsgs.add(s2);
        stateMsgs.add(s3);
        stateMsgs.add(s4);
        stateMsgs.add(s5);
        stateMsgs.add(s6);
        stateMsgs.add(s7);
        stateMsgs.add(s8);
    }

    @Override
    public ArrayList<String> find() {
        return stateMsgs;
    }
}
