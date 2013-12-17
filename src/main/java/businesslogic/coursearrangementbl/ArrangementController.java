/*
 * To change this template, choose Tools | Templates|new
 * and open the template in the editor.
 */
package businesslogic.coursearrangementbl;

import data.processmngdata.statedata.SystemTimer;
import data.processmngdata.statedata.TimerThread;

/**
 *
 * @author Administrator
 */
public class ArrangementController {
    //  FileUtility fileUtility=new FileutilityImpl("tbd");

    static boolean has_arrangement = false;
    SystemTimer timerThread;

    public ArrangementController(SystemTimer systemTimer) {
        this.timerThread = systemTimer;
        systemTimer.addObserver(this);
    }

    public static void setHasArrangement(boolean has) {
        ArrangementController.has_arrangement = has;
    }

    protected void arrangement() {
    }

    public void reachState() {
        if (ArrangementController.has_arrangement == false) {
            arrangement();
        }
        ArrangementController.has_arrangement = true;
    }
}
