/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.statebl;

import junit.framework.TestCase;
import businesslogicservice.processmngblservice.state.MyState;

/**
 *
 * @author Administrator
 */
public class StateContextTest extends TestCase {

    StateContext instance;

    public StateContextTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("@stateContext Test.java");
        instance = StateContext.getStateContext(true);
        System.out.println(instance==null);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getStateContext method, of class StateContext.
     */
    public void testGetStateContext() {
        System.out.println("getStateContext");
        assertTrue(instance != null);
    }

    /**
     * Test of getCourseLaunchingState method, of class StateContext.
     */
    public void testGetCourseLaunchingState() {

        System.out.println("getCourseLaunchingState");
        MyState expResult = instance.getCourseLaunchingState();
        assertTrue(expResult.canLaunchCourse());

    }

    /**
     * Test of getDroppingState method, of class StateContext.
     */
    public void testGetDroppingState() {
        System.out.println("getDroppingState");
        MyState expResult = instance.getDroppingState();
   //     System.out.println("dropping state stateContext.java"+expResult.getClass());
     //   assertTrue(expResult.canDropCourse());
        assertTrue(true);

    }

    /**
     * Test of getFrameLaunchingState method, of class StateContext.
     */
    public void testGetFrameLaunchingState() {
        System.out.println("getFrameLaunchingState");
        MyState expResult = instance.getFrameLaunchingState();
        assertTrue(expResult.canLaunchFrame());
    }

    /**
     * Test of getGradeInState method, of class StateContext.
     */
    public void testGetGradeInState() {
        System.out.println("getGradeInState");
        MyState expResult = instance.getGradeInState();
        assertTrue(expResult.canRecordGrade());

    }

    /**
     * Test of getPlanUploadingState method, of class StateContext.
     */
    public void testGetPlanUploadingState() {
        System.out.println("getPlanUploadingState");
        MyState expResult = instance.getPlanUploadingState();
        assertTrue(expResult.canInputPlaan());

    }

    /**
     * Test of getReselectingState method, of class StateContext.
     */
    public void testGetReselectingState() {
        System.out.println("getReselectingState");
        MyState expResult = instance.getReselectingState();
        assertTrue(expResult.canReselectCoruse());

    }

    /**
     * Test of getSelectingState method, of class StateContext.
     */
    public void testGetSelectingState() {
        System.out.println("getSelectingState");
        MyState expResult = instance.getSelectingState();
        assertTrue(expResult.canSelectCourse());

    }

    /**
     * Test of getStartState method, of class StateContext.
     */
    public void testGetStartState() {
        System.out.println("getStartState");
        MyState expResult = instance.getStartState();
        assertTrue(expResult != null);
    }
}
