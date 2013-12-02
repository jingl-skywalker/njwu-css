/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TimerThread implements Runnable {

    SystemTimer systemTimer;

    public TimerThread(SystemTimer timer) {
        this.systemTimer = timer;
    }

    @Override
    public void run() {
        System.out.println("start");
        while (true) {
            System.out.println("update");
            try {
              //  Thread.sleep(1000*60);
                Thread.sleep(5000);//5second update
            } catch (InterruptedException ex) {
                Logger.getLogger(TimerThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            systemTimer.updateState();
            //    try {

            //           }
            //    System.out.println("thread");
            //  Thread.sleep(5000);
            //      } catch (InterruptedException ex) {
            //         Logger.getLogger(TimerThread.class.getName()).log(Level.SEVERE, null, ex);
            //   }
        }
    }
}
