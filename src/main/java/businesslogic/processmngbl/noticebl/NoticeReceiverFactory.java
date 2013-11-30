package businesslogic.processmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import businesslogicservice.processmngblservice.notice.ROLE;

public class NoticeReceiverFactory {

    public NoticeReceiverFactory() {
    }

    public NoticeReceiverService createReceiver(ROLE role) {
        return new NoticeReciever(role);
    }
}
