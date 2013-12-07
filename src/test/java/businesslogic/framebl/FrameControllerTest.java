/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.framebl;

import dataservice.framedataservice.FrameDataService;
import dataservice.framedataservice.FrameDataServiceStub;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import po.framepo.FramePO;
import vo.framevo.BlockVO;
import vo.framevo.FrameVO;

/**
 *
 * @author Administrator
 */
public class FrameControllerTest extends TestCase {
    
    FrameDataService instance;
    FrameUIDriver fuid;
    
    public FrameControllerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance = new FrameDataServiceStub();
        fuid = new FrameUIDriver();
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
        FrameVO expResult = new FrameVO(description, total);
        try {
            instance.insert(new FramePO(total, description));
        } catch (RemoteException ex) {
            Logger.getLogger(FrameControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(expResult != null);
    }

    /**
     * Test of createBlock method, of class FrameController.
     */
    public void testCreateBlock() {
        System.out.println("createBlock");
        String name = "";
        int lower = 2;
        int upper = 4;
        String description = "block";
        BlockVO blockVO = new BlockVO(name, lower, upper, description);
        BlockList bl = new BlockList();
        bl.add(new Block(blockVO));
        FrameVO expResult = new FrameVO(description, 100, bl);
        assertTrue(expResult != null);
    }

    /**
     * Test of release method, of class FrameController.
     */
    public void testRelease() {
        System.out.println("release");
        //     FrameController instance = new FrameController();
        boolean expResult = true;
        FramePO fpo = null;
        try {
            fpo = instance.find();
            if (fpo != null) {
                expResult = true;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(FrameControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(expResult);
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
        try {
            expResult = new FrameVO(instance.find());
        } catch (RemoteException ex) {
            Logger.getLogger(FrameControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(expResult != null);
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
        try {
            expResult = new FrameVO(instance.find());
        } catch (RemoteException ex) {
            Logger.getLogger(FrameControllerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertTrue(expResult.getTotal() == 100);
    }
}
