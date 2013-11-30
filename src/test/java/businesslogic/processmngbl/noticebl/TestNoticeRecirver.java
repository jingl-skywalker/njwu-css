/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import businesslogicservice.processmngblservice.notice.ROLE;
import java.util.Iterator;

/**
 *
 * @author Administrator
 */
public class TestNoticeRecirver {

    public static void main(String[] args) {
        NoticeReceiverFactory noticeReceiverFactory = new NoticeReceiverFactory();
        NoticeReceiverService nrs = noticeReceiverFactory.createReceiver(ROLE.ALL);
        NoticeList nl = nrs.getNoticeList();
        Iterator<Notice> notices = nl.getIterator();
        while (notices.hasNext()) {
            System.out.println(notices.next().getRole());
        }
    }
}
