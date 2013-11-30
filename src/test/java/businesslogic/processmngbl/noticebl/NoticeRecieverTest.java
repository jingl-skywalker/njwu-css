/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeBLService;
import businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import businesslogicservice.processmngblservice.notice.ROLE;
import java.util.Iterator;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Administrator
 */
public class NoticeRecieverTest extends TestCase {
    
    NoticeReceiverFactory nrf;
    NoticeReceiverService receiverService1;
    NoticeReceiverService receiverService2;
    public NoticeRecieverTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        nrf=new NoticeReceiverFactory();
        receiverService1=nrf.createReceiver(ROLE.ALL);
        receiverService2=nrf.createReceiver(ROLE.STUDENT);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getNoticeList method, of class NoticeReciever.
     */
    public void testGetNoticeList() {
        System.out.println("getNoticeList");
        NoticeReceiverService instance =receiverService1;
        NoticeList expResult = null;
        System.out.println("test notice receicer");
        expResult=instance.getNoticeList();
        System.out.println(expResult==null);
        System.out.println(expResult.getClass());
       Iterator<Notice> notices=expResult.getIterator();
       while(notices.hasNext()){
           System.out.println(notices.next().getRole());
       }
       // NoticeList result = instance.getNoticeList();
   //     assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    assertEquals(true, true);
    }
}
