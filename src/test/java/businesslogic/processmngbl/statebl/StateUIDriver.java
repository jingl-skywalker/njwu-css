/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.statebl;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import businesslogicservice.processmngblservice.state.MyState;
import businesslogicservice.processmngblservice.state.StateBLService;
import businesslogicservice.processmngblservice.state.StateLogicFactory;
import businesslogicservice.processmngblservice.state.TimeFormat;
import businesslogic.framebl.FrameUIDriver;
import vo.processmngvo.StateVO;

/**
 *
 * @author Administrator
 */
public class StateUIDriver {
    
    int indexOfState;
    StateLogicFactory logicFactory=new StateLogicFactory();
    StateBLService sbls;
    MyState state;
    String startString;
    String endString;
    Date startDate;
    Date endDate;

    public StateUIDriver() {
        sbls=logicFactory.getStateLogic();
        TimeFormat tf = new TimeFormatImpl();
        DateFormat f1 = tf.getTimeFormat();
        StateList stateList=new StateList();
        state=stateList.getState(indexOfState);
        try {
            startDate = f1.parse(startString);
            endDate = f1.parse(endString);
        } catch (ParseException ex) {
            Logger.getLogger(StateUIDriver.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void startEnsurePressed() {
        //nothiing
    }

    public void endEnsurePressed() {
        StateVO svo=new StateVO(startDate, endDate, indexOfState);
        sbls.recordState(svo);
    }
    public void oneNoticePressed()
    {
        StateVO svo=sbls.lookStateInfo(indexOfState);
        System.out.println(svo.getStateNum()+" "+svo.getStartDate());
        
    }
 
}
