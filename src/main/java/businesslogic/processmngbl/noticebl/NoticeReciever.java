/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.noticebl;

import businesslogicservice.processmngblservice.notice.NoticeReceiverService;
import businesslogicservice.processmngblservice.notice.ROLE;

/**
 *
 * @author ljing12
 * performance the role to control the logic of users including teacher,student,instructors to
 * receive the notice
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
