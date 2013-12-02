/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import businesslogic.processmngbl.statebl.CourseLaunchingState;
import businesslogic.processmngbl.statebl.DroppingState;
import businesslogic.processmngbl.statebl.FrameLaunchingState;
import businesslogic.processmngbl.statebl.GradeInState;
import businesslogic.processmngbl.statebl.PlanUploadingState;
import businesslogic.processmngbl.statebl.ReselectingState;
import businesslogic.processmngbl.statebl.SelectingState;
import businesslogic.processmngbl.statebl.StartState;
import businesslogic.processmngbl.statebl.StateList;
import businesslogicservice.processmngblservice.state.MyState;
import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import po.processmngpo.StatePO;
import vo.processmngvo.StateVO;

/**
 *
 * @author Administrator
 */
public class SystemTimer implements Serializable {

    int currentStateNum;
    MyState state;
    CourseLaunchingState cls;
    DroppingState ds;
    FrameLaunchingState fls;
    GradeInState gis;
    PlanUploadingState pus;
    ReselectingState rss;
    SelectingState sls;
    StartState sts;
    FileUtility fileUtility = new FileutilityImpl("src/main/resources/state.txt");
    ArrayList<StatePO> statePOs = new ArrayList<StatePO>();
    StatePO statePO;

    public SystemTimer() throws RemoteException {
        cls = new CourseLaunchingState();
        ds = new DroppingState();
        fls = new FrameLaunchingState();
        gis = new GradeInState();
        pus = new PlanUploadingState();
        rss = new ReselectingState();
        sls = new SelectingState();
        sts = new StartState();
        state = sts;
        updateState();
    }

    public void updateState() {
        ArrayList<String> strings = fileUtility.find();
        for (String s : strings) {
            statePOs.add(new StatePO(s));
        }
        Date date = new Date();
        currentStateNum = 1;
        statePO = null;
        for (StatePO spo : statePOs) {
            if (date.after(spo.getStartDate()) && spo.getEndDate().after(date)) {
                currentStateNum = spo.getStateNum();
                statePO = spo;
                break;
            }
        }
        StateList stateList = new StateList(true);
    }

    public int getCurrentStateNum() {
        return this.currentStateNum;
    }
    public StatePO getCurrentStatePO(){
        return this.statePO;
    }
}
