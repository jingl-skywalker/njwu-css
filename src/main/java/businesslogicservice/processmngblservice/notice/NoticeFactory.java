/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.notice;

import businesslogic.processmngbl.noticebl.NoticeController;

/**
 *
 * @author Administrator
 */
public class NoticeFactory {

    public NoticeBLService bl;

    public NoticeBLService createNoticeBL() {
        return new NoticeController();
    }
}
