/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogicservice.selectionblservice;

import businesslogic.selectionbl.SelectionController;
import businesslogicservice.selectionblservice.SelectionBLService;

/**
 *
 * @author sheyunfeng
 */
public class SelectionFactory {
    /**
     * 
     * @return 
     */
    public SelectionBLService getSelectionController(){
        SelectionBLService selection = new SelectionController();
        return selection;
    }
    
}
