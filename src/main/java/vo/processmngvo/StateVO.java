/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.processmngvo;

import java.util.Date;
import po.processmngpo.StatePO;

/**
 *
 * @author Administrator
 */
public class StateVO {

    private Date startDate;
    private Date endDate;
    private int stateNum;

    public StateVO() {
    }

    public StateVO(StatePO spo) {

        this(spo.getStartDate(), spo.getEndDate(), spo.getStateNum());
    }

    public StateVO(Date startDate, Date endDate, int stateNum) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.stateNum = stateNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getStateNum() {
        return stateNum;
    }
}
