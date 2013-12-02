package po.processmngpo;

import businesslogic.processmngbl.statebl.TimeFormatImpl;
import businesslogicservice.processmngblservice.state.TimeFormat;
import java.io.Serializable;
import java.util.Date;
import vo.processmngvo.StateVO;

public class StatePO implements  Serializable{

    private Date startDate;
    private Date endDate;
    private int stateNum;
    private String SEP = "@";
    private String startString;
    private String endString;

    public StatePO(int stateNum, Date s, Date end) {
        this.stateNum = stateNum;
        this.startDate = s;
        this.endDate = end;
        initDateString();
    }
    public StatePO(String toStoreString)
    {
        String strings[]=toStoreString.split(SEP);
        startString=strings[1];
        endString=strings[2];
        stateNum=Integer.parseInt(strings[0]);
         TimeFormat tf=new TimeFormatImpl();
         startDate=tf.getTime(startString);
         endDate=tf.getTime(endString);
    }

    public StatePO(StateVO svo) {
        this(svo.getStateNum(), svo.getStartDate(), svo.getEndDate());
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void initDateString() {
        TimeFormat tf = new TimeFormatImpl();
        startString = tf.getFormattedTimeString(startDate);
        endString = tf.getFormattedTimeString(endDate);
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getStateNum() {
        return stateNum;
    }

    public void setStateNum(int stateNum) {
        this.stateNum = stateNum;
    }

    public String toStoreString() {

        StringBuffer sbf = new StringBuffer();
        sbf.append(stateNum);
        sbf.append(SEP);
        sbf.append(startString);
        sbf.append(SEP);
        sbf.append(endString);

        return sbf.toString();
    }
}
