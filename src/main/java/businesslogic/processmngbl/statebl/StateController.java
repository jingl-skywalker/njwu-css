/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.statebl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import businesslogicservice.processmngblservice.state.StateBLService;
import dataservice.datafactory.DataFactory;
import dataservice.processmngdataservice.statedataservice.StateDataService;
import po.processmngpo.StatePO;
import vo.processmngvo.StateVO;

/**
 *
 * @author Administrator
 */
public class StateController implements StateBLService {

    DataFactory dataFactory;
    StateDataService sds;

    public StateController() {
        try {
            dataFactory = (DataFactory) Naming.lookup("dataFactory");
            sds = dataFactory.getStateData();
        } catch (NotBoundException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public boolean recordState(StateVO svo) {
        StatePO spo = new StatePO(svo);
        boolean result = true;
        try {
            result = sds.record(spo);
        } catch (RemoteException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public StateVO lookStateInfo(int stateNum) {
        StatePO spo = null;
        try {
            spo = sds.find(stateNum);
        } catch (RemoteException ex) {
            Logger.getLogger(StateController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new StateVO(spo);
    }
}
