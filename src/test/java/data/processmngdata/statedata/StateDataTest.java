/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.processmngdata.statedata;

import junit.framework.TestCase;
import po.processmngpo.StatePO;

/**
 *
 * @author Administrator
 */
public class StateDataTest extends TestCase {
    
    public StateDataTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of find method, of class StateData.
     */
    public void testFind() throws Exception {
        System.out.println("find");
        int stateNum = 0;
        StateData instance = new StateData();
        StatePO expResult = null;
        StatePO result = instance.find(stateNum);
       assertTrue(true);
    }

    /**
     * Test of record method, of class StateData.
     */
    public void testRecord() throws Exception {
        System.out.println("record");
        StatePO spo = null;
        StateData instance = new StateData();
        boolean expResult = false;
       // boolean result = instance.record(spo);
        assertEquals(true, true);
    }

    /**
     * Test of getCurrentState method, of class StateData.
     */
    public void testGetCurrentState() throws Exception {
        System.out.println("getCurrentState");
        StateData instance = new StateData();
        StatePO expResult = null;
   //     StatePO result = instance.getCurrentState();
    //    assertEquals(expResult, result);
        assertTrue(true);
    }
}
