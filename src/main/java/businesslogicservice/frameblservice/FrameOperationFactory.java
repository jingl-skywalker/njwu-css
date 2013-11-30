/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.frameblservice;

import businesslogic.framebl.FrameController;

/**
 *
 * @author Administrator
 */
public class FrameOperationFactory {
    public FrameBLService createFrameBL()
    {
        return new FrameController();
    }
}
