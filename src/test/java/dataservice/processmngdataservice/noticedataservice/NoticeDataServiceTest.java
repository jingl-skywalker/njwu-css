/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.processmngdataservice.noticedataservice;

import businesslogicservice.processmngblservice.notice.ROLE;
import data.fileutility.FileUtilityMock;
import data.processmngdata.noticedata.NoticeData;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import junit.framework.TestCase;
import po.processmngpo.NoticePO;

/**
 *
 * @author Administrator
 */
public class NoticeDataServiceTest extends TestCase {

    NoticeDataService instance;

    public NoticeDataServiceTest(String testName) {
        super(testName);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.instance = new NoticeData();
        ((NoticeData) instance).setFileUtility(new FileUtilityMock());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of insert method, of class NoticeDataService.
     */
    public void testInsert() throws Exception {
        System.out.println("insert");
        NoticePO npo = new NoticePO(ROLE.ALL, "title", 10, "content", new Date());
        boolean expResult = false;
        ((NoticeData) instance).setFileUtility(new FileUtilityMock());
        boolean result = instance.insert(npo);
        assertTrue(result);
    }

    /**
     * Test of find method, of class NoticeDataService.
     */
    public void testFind() throws Exception {
        System.out.println("find");
        ArrayList expResult = null;
        ArrayList result = instance.find();
        assertTrue(result != null);
    }
}
