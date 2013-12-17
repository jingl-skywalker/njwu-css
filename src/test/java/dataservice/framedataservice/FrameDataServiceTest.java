/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.framedataservice;

import data.fileutility.FileUtilityMock;
import data.framedata.FrameData;
import java.rmi.RemoteException;
import junit.framework.TestCase;
import po.framepo.FramePO;

/**
 *
 * @author Administrator
 */
public class FrameDataServiceTest extends TestCase {

    FrameDataService instance;

    public FrameDataServiceTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
         instance = new FrameData();
         ((FrameData)instance).setFileUtility(new FileUtilityMock());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of insert method, of class FrameDataService.
     */
    public void testInsert() throws Exception {
        System.out.println("insert");
        FramePO fpo = new FramePO(100,"string");
        instance.insert(fpo);
    }

    /**
     * Test of update method, of class FrameDataService.
     */
    public void testUpdate() throws Exception {
        System.out.println("update");
        FramePO fpo = new FramePO(100, "string");
        instance.update(fpo);
    }

    /**
     * Test of find method, of class FrameDataService.
     */
    public void testFind() throws Exception {
        System.out.println("find");
        FramePO expResult = null;
        FramePO result = instance.find();
    }
}
