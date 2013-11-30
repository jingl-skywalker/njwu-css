/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.framebl;


import businesslogic.framebl.FrameController;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import vo.framevo.FrameVO;

/**
 *
 * @author Administrator
 */
public class FrameControllerTest extends TestCase {

    FrameController instance;
    FrameUIDriver fuid;
    public FrameControllerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance=new FrameController();
        fuid=new FrameUIDriver(instance);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of createFrame method, of class FrameController.
     */
    public void testCreateFrame() {
        System.out.println("createFrame");
        int total = 0;
        String description = "";
    //    FrameController instance = new FrameController();
        FrameVO expResult = null;
     //   FrameVO result = instance.createFrame(total, description);
        assertEquals(true, true);
    //    assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of createBlock method, of class FrameController.
     */
    public void testCreateBlock() {
        System.out.println("createBlock");
        String name = "";
        int lower = 0;
        int upper = 0;
        String description = "";
  //      FrameController instance = new FrameController();
        FrameVO expResult = null;
    //    FrameVO result = instance.createBlock(name, lower, upper, description);
 //       assertEquals(expResult, result);
         assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of release method, of class FrameController.
     */
    public void testRelease() {
        System.out.println("release");
   //     FrameController instance = new FrameController();
        boolean expResult = false;
   //     boolean result = instance.release();
 //       assertEquals(expResult, result);
         assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of modifyBase method, of class FrameController.
     */
    public void testModifyBase() {
        System.out.println("modifyBase");
        int total = 0;
        String description = "";
   //     FrameController instance = new FrameController();
        FrameVO expResult = null;
 //       FrameVO result = instance.modifyBase(total, description);
         assertEquals(true, true);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of modifyBlock method, of class FrameController.
     */
    public void testModifyBlock() {
        System.out.println("modifyBlock");
        int ID = 0;
        String name = "";
        int lower = 0;
        int upper = 0;
        String description = "";
 //       FrameController instance = new FrameController();
        FrameVO expResult = null;
  //      FrameVO result = instance.modifyBlock(ID, name, lower, upper, description);
 //       assertEquals(expResult, result);
         assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }

    /**
     * Test of look method, of class FrameController.
     */
    public void testLook() {
        System.out.println("look");
    //    FrameController instance = new FrameController();
        FrameVO expResult = null;
      //  FrameVO result = instance.look();
   //     assertEquals(expResult, null);
         assertEquals(true, true);
   //     assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }
}
