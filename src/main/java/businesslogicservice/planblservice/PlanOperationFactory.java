/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.planblservice;

import businesslogic.planbl.PlanController;

/**
 *
 * @author Administrator
 */
public class PlanOperationFactory {
    public PlanBLService getPlanBLService(){
        return new PlanController();
    }
}
