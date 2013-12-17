/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursearrangementbl;

import businesslogicservice.coursearrangementblservice.Priority;

/**
 *
 * @author Administrator
 */
public class PriorityImplment1 implements Priority {

    /**
     * indicate the factor that will influence the priority
     */
    String stuNumString;
    double priority;
    int lowerCredit;
    int grade;
    int hasGottenGeneralCredit;

    public PriorityImplment1(int grade, int hasGottenGeneralCredit, int lowerBounds, String stuNumString) {
        // TODO Auto-generated constructor stub
        this.stuNumString = stuNumString;
        this.lowerCredit = lowerBounds;
        this.hasGottenGeneralCredit = hasGottenGeneralCredit;
        this.grade = grade;
        this.calculatorPriority();
    }

    private double calculatorPriority() {
        // TODO Auto-generated method stub
        if (grade == 4 && lowerCredit > hasGottenGeneralCredit) {
            priority = 1000000;//to make sure that  the graduates has the oppotunity to get their scholar
        } else {
            priority = 10 * (lowerCredit - hasGottenGeneralCredit) * (grade);
        }
        return priority;
    }

    @Override
    public void addPriority(double d) {
        // TODO Auto-generated method stub
        this.priority += d;
    }

    @Override
    public double getPriority() {
        // TODO Auto-generated method stub
        return priority;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        Priority p = (Priority) o;
        return (int) (this.getPriority() - p.getPriority());
    }

    @Override
    public String getNum() {
        // TODO Auto-generated method stub
        return this.stuNumString;
    }
}
