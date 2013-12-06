/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursearrangementbl;

import data.processmngdata.statedata.SystemTimer;

/**
 *
 * @author ljing12
 * use observor pattern to ensure the strategy to be informed by the change of state
 */
public class ArrangementController {
    //  FileUtility fileUtility=new FileutilityImpl("tbd");

    static boolean has_arrangement = false;
    SystemTimer timerThread;
    
    public ArrangementController(SystemTimer systemTimer) {
        this.timerThread = systemTimer;
        systemTimer.addObserver(this);//to registe this to system timer,and keep in state
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
