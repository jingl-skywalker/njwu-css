/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import data.fileutility.FileUtility;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.assertTrue;
import junit.framework.TestCase;
import po.processmngpo.StatePO;

/**
 *
 * @author Administrator
 */
public class SystemTimerTest extends TestCase {
    FileUtility fileUtility;
    public SystemTimerTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
      //  fileUtility=new FileUtilityMockForSystemTimer("test");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of updateState method, of class SystemTimer.
     */
    public void testUpdateState() {
        System.out.println("updateState");
        SystemTimer instance = null;
        try {
            instance = new SystemTimer();
        } catch (RemoteException ex) {
            Logger.getLogger(SystemTimerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        instance.updateState();
        System.out.println(instance.getCurrentStateNum());
        assertTrue(instance.getCurrentStateNum()==2);
    }

    /**
     * Test of getCurrentStateNum method, of class SystemTimer.
     */
    public void testGetCurrentStateNum() {
        System.out.println("getCurrentStateNum");
        SystemTimer instance = null;
        try {
            instance = new SystemTimer();
        } catch (RemoteException ex) {
            Logger.getLogger(SystemTimerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 0;
        int result = instance.getCurrentStateNum();
        System.out.println(instance.getCurrentStateNum());
        assertTrue(instance.getCurrentStateNum()==2);
    }

    /**
     * Test of getCurrentStatePO method, of class SystemTimer.
     */
    public void testGetCurrentStatePO() {
        System.out.println("getCurrentStatePO");
        SystemTimer instance = null;
        try {
            instance = new SystemTimer();
        } catch (RemoteException ex) {
            Logger.getLogger(SystemTimerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        StatePO expResult = null;
        StatePO result = instance.getCurrentStatePO();
        System.out.println(instance.getCurrentStateNum());
        assertTrue(instance.getCurrentStateNum()==2);
    }
}
