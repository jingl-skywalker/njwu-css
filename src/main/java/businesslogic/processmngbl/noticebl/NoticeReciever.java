/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import businesslogicservice.processmngblservice.notice.ROLE;

/**
 *
 * @author Administrator
 */
public class NoticeReciever implements NoticeReceiverService{
    private NoticeController controller;
    ROLE role;

    public NoticeReciever( ROLE role) {
        controller=new NoticeController();
        this.role = role;
    }
    
    public NoticeList getNoticeList()
    {
        return controller.getNoticeList(role);
    }
    
}
