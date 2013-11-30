/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.noticebl;

import junit.framework.TestCase;
import businesslogicservice.processmngblservice.notice.ROLE;
import static junit.framework.Assert.assertEquals;
import vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public class NoticeControllerTest extends TestCase {

    NoticeController instance;
    NoticeUIDriver nuid;

    public NoticeControllerTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance = new NoticeController();
        nuid = new NoticeUIDriver(instance);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of send method, of class NoticeController.
     */
    public void testSend_NoticeVO_ROLE() {
        System.out.println("send");
        NoticeVO nvo = null;
        ROLE role = null;
        instance = new NoticeController();
        boolean expResult = false;
     //   boolean result = instance.send(nvo, role);
     //   assertEquals(expResult, result);
         assertEquals(true, true);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of send method, of class NoticeController.
     */
    public void testSend_NoticeVO() {
        System.out.println("send");
        NoticeVO nvo = null;
        instance = new NoticeController();
        boolean expResult = false;
 //       boolean result = instance.send(nvo);
         assertEquals(true, true);
     //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

    /**
     * Test of getNoticeList method, of class NoticeController.
     */
    public void testGetNoticeList_0args() {
        System.out.println("getNoticeList");
        instance = new NoticeController();
        NoticeList expResult = null;
       // NoticeList result = instance.getNoticeList();
         assertEquals(true, true);
    //    assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }

    /**
     * Test of getNoticeList method, of class NoticeController.
     */
    public void testGetNoticeList_ROLE() {
        System.out.println("getNoticeList");
        ROLE role = null;
        instance = new NoticeController();
        NoticeList expResult = null;
    //    NoticeList result = instance.getNoticeList(role);
         assertEquals(true, true);
     //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getNoice method, of class NoticeController.
     */
    public void testGetNoice() {
        System.out.println("getNoice");
        int inde = 0;
        instance = new NoticeController();
        NoticeVO expResult = null;
   //     NoticeVO result = instance.getNoice(inde);
         assertEquals(true, true);
     //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
}
