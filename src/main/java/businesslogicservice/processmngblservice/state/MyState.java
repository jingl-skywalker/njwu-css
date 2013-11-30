/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.state;

import businesslogic.processmngbl.statebl.StateTime;

/**
 *
 * @author Administrator
 */
public interface MyState {

    public void setBegining(StateTime stm);

    public void setEnding(StateTime stm);

    public boolean reachBegining();

    public boolean reachEnding();

    public void nextState();

    public int getStateNum();

    public boolean canLaunchFrame();

    public boolean canInputPlaan();

    public boolean canLaunchCourse();

    public boolean canSelectCourse();

    public boolean canDropCourse();

    public boolean canReselectCoruse();

    public boolean canRecordGrade();
}
