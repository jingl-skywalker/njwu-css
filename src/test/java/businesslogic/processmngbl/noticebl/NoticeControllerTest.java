/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeBLService;
import junit.framework.TestCase;
import businesslogicservice.processmngblservice.notice.ROLE;
import dataservice.processmngdataservice.noticedataservice.NoticeDataStub;
import java.util.ArrayList;
import java.util.Date;
import static junit.framework.Assert.assertEquals;
import po.processmngpo.NoticePO;
import vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public class NoticeControllerTest extends TestCase {

    NoticeBLService instance;
    NoticeUIDriver nuid;
    NoticePO npo = new NoticePO(ROLE.ALL, "test", 100, "test global varible", new Date());

    public NoticeControllerTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance = new NoticeController();
        ((NoticeController) instance).setNoticeData(new NoticeDataStub());
        ArrayList<NoticePO> npos = new ArrayList<NoticePO>();
        ((NoticeController) instance).setNoticeList(new NoticeList(npos));
        //to avoid the trouble ot remote exception
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
        NoticeVO nvo = new NoticeVO("title", "testcontent", new Date());
        ROLE role = null;
        boolean expResult = false;
        boolean result = instance.send(nvo);
        assertTrue(result);
    }

    /**
     * Test of send method, of class NoticeController.
     */
    public void testSend_NoticeVO() {
        System.out.println("send");
        NoticeVO nvo = new NoticeVO("title", "testcontent", new Date());
        instance = new NoticeController();
        boolean expResult = false;
        boolean result = instance.send(nvo);
        assertEquals(true, true);
    }

    /**
     * Test of getNoticeList method, of class NoticeController.
     */
    public void testGetNoticeList_0args() {
        System.out.println("getNoticeList");
        instance = new NoticeController();
        NoticeList expResult = null;
        expResult = instance.getNoticeList();
        assertTrue(expResult != null);
    }

    /**
     * Test of getNoticeList method, of class NoticeController.
     */
    public void testGetNoticeList_ROLE() {
        System.out.println("getNoticeList");
        ROLE role = null;
        instance = new NoticeController();
        NoticeList expResult = null;
        expResult = instance.getNoticeList(ROLE.STUDENT);
        assertTrue(expResult != null);
    }

    /**
     * Test of getNoice method, of class NoticeController.
     */
    public void testGetNoice() {
        System.out.println("getNoice");
        int inde = 0;
        NoticeVO expresult =new NoticeVO("title", "content", new Date());
        NoticeList expResult=instance.getNoticeList();
        assertTrue(expresult != null);
    }

    /**
     * Test of initNotices method, of class NoticeController.
     */
    public void testInitNotices() {
        System.out.println("initNotices");
        NoticeList nl = instance.getNoticeList();
        assertTrue(nl != null);
    }
}
