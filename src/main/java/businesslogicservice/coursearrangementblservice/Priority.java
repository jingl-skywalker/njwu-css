/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.coursearrangementblservice;

/**
 *
 * @author Administrator
 */
public interface Priority extends Comparable {

    public double getPriority();

    public void addPriority(double d);

    public String getNum();
}
