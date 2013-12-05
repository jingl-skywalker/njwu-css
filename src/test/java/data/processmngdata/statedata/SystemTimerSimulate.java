/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import data.fileutility.FileUtility;
import java.rmi.RemoteException;

/**
 *
 * @author Administrator
 */
public class SystemTimerSimulate extends SystemTimer {

    public SystemTimerSimulate() throws RemoteException {
        super();
    }
    /**
     *
     * @param fileUtility1
     */
    public SystemTimerSimulate(FileUtility fileUtility1)throws RemoteException{
        fileUtility=fileUtility1;
    }

   
    @Override
    public void updateState() {
        super.updateState(); //To change body of generated methods, choose Tools | Templates.
    }
}
