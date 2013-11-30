/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.statebl;

import java.util.Date;
import businesslogicservice.processmngblservice.state.StateBLService;
import vo.processmngvo.StateVO;

/**
 *
 * @author Administrator
 */
public class StateOperation {

    StateBLService sbls;
    StateContext context;
    StateTime stm;

    public StateOperation() {
        sbls=new StateController();
    }

    public StateOperation(StateContext context) {
        this();
        this.context = context;
        initStateTime();
    }
    private void  initStateTime()
    {
        StateVO svo=sbls.lookStateInfo(this.context.getCurrentStateNum());
        stm=new StateTime(svo.getStartDate(), svo.getEndDate());
    }

    public void setBegining(StateTime stm) {
        this.stm.setEndTime(stm.getEndTime());
    }

    public void setEnding(StateTime stm) {
        this.stm = stm;
    }

    public boolean reachBegining() {
        Date current = new Date();
        return current.after(this.stm.getStartTime());
    }

    public boolean reachEnding() {
        Date current = new Date();
        return current.after(this.stm.getEndTime());
    }

    public StateVO getStateInfo(int stateNum) {
        return null;
    }

    public boolean saveStateTime(StateTime stm) {
        return true;
    }
}
