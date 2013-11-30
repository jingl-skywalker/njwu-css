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
public class ReselectingState implements MyState {

    StateContext context;
    StateTime stm;
    StateOperation stateOperation;

    public ReselectingState(StateContext context) {
        this.context = context;
        stateOperation = new StateOperation(context);
    }

    @Override
    public int getStateNum() {
        return 6;
    }

    @Override
    public void setBegining(StateTime stm) {
        stateOperation.setBegining(stm);
    }

    @Override
    public void setEnding(StateTime stm) {
        stateOperation.setEnding(stm);
    }

    @Override
    public boolean reachBegining() {
        return stateOperation.reachBegining();
    }

    @Override
    public boolean reachEnding() {
        return stateOperation.reachEnding();
    }

    @Override
    public void nextState() {
        context.setState(context.getDroppingState());
    }

    @Override
    public boolean canLaunchFrame() {
        return false;
    }

    @Override
    public boolean canInputPlaan() {
        return false;
    }

    @Override
    public boolean canLaunchCourse() {
        return false;
    }

    @Override
    public boolean canSelectCourse() {
        return false;
    }

    @Override
    public boolean canDropCourse() {
        return false;
    }

    @Override
    public boolean canReselectCoruse() {
        return true;
    }

    @Override
    public boolean canRecordGrade() {
        return false;
    }
}
