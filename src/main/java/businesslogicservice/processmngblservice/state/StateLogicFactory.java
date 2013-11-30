/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.state;

import businesslogic.processmngbl.statebl.StateController;

/**
 *
 * @author Administrator
 */
public class StateLogicFactory {

    public StateBLService getStateLogic() {
        return new StateController();
    }
}
