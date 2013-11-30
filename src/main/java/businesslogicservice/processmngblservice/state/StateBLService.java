/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.state;

import vo.processmngvo.StateVO;

/**
 *
 * @author Administrator
 */
public interface StateBLService {

    public boolean recordState(StateVO svo);

    public StateVO lookStateInfo(int stateNum);
}
