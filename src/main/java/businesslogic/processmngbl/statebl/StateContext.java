/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.statebl;

import businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class StateContext {

    CourseLaunchingState cls;
    DroppingState ds;
    FrameLaunchingState fls;
    GradeInState gis;
    PlanUploadingState pus;
    ReselectingState rss;
    SelectingState sls;
    StartState sts;
    MyState state;
    int count = 0;
    private volatile static StateContext uniqueContext;

    private StateContext() {
        cls = new CourseLaunchingState(this);
        ds = new DroppingState(this);
        fls = new FrameLaunchingState(this);
        gis = new GradeInState(this);
        pus = new PlanUploadingState(this);
        rss = new ReselectingState(this);
        sls = new SelectingState(this);
        sts = new StartState(this);
        state = sts;
    }

    public static StateContext getStateContext() { //双重加锁保证线程安全
        if (uniqueContext == null) {
            synchronized (StateContext.class) {
                if (uniqueContext == null) {
                    uniqueContext = new StateContext();
                }
            }
        }
        return uniqueContext;
    }

    public MyState getState() {
        return state;
    }

    public void setState(MyState state) {
        this.state = state;
    }

    public MyState getCurrentState() {
        return this.state;
    }

    public MyState getCourseLaunchingState() {
        this.state = cls;
        return cls;
    }

    public MyState getDroppingState() {
        this.state = ds;
        return ds;
    }

    public MyState getFrameLaunchingState() {
        this.state = fls;
        return fls;
    }

    public MyState getGradeInState() {
        this.state = gis;
        return gis;
    }

    public MyState getPlanUploadingState() {
        this.state = pus;
        return pus;
    }

    public MyState getReselectingState() {
        this.state = rss;
        return rss;
    }

    public MyState getSelectingState() {
        this.state = sls;
        return sls;
    }

    public MyState getStartState() {
        this.state = sts;
        return sts;
    }

    public int getCurrentStateNum() {
        return state.getStateNum();
    }
}
