/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.notice;

import businesslogic.processmngbl.noticebl.NoticeList;
import vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public interface NoticeBLService {

    public boolean send(NoticeVO nvo, ROLE role);

    public boolean send(NoticeVO nvo);

    public NoticeList getNoticeList();

    public NoticeList getNoticeList(ROLE role);

    public NoticeVO getNoice(int inde);
    
    public void initNotices();
}
