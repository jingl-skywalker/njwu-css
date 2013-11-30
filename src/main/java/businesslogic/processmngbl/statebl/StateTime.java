/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.statebl;

import java.util.Date;
import businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class StateTime {

    private Date startTime;
    private Date endTime;

    public StateTime() {
    }


    public StateTime( Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
