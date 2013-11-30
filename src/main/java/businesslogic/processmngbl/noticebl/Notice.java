/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.processmngbl.noticebl;

import java.util.Date;

import businesslogicservice.processmngblservice.notice.ROLE;
import po.processmngpo.NoticePO;
import vo.processmngvo.NoticeVO;

/**
 *
 * @author Administrator
 */
public class Notice {

    private ROLE role;
    private static int index = 0;
    private String content;
    private Date time;
    private int num;
    private String name;

    public Notice() {
        index++;
        this.num = index;
    }

    public Notice(ROLE role, String content, Date time, int num, String name) {
        this.role = role;
        this.content = content;
        this.time = time;
        this.num = num;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Notice(String content, Date time) {
        this();
        this.content = content;
        this.time = time;
    }

    public Notice(NoticeVO nvo) {
        this(nvo.getRole(), nvo.getContent(), nvo.getTime(), nvo.getNum(), nvo.getTitle());

    }

    public Notice(NoticePO npo) {
        this(npo.getRole(), npo.getContent(), npo.getTime(), npo.getNum(), npo.getName());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getNum() {
        return this.num;
    }

    public ROLE getRole() {
        return this.role;
    }

    public boolean send() {
        NoticePO npo = new NoticePO(this);

        return true;
    }

    public boolean send(ROLE role) {
        return true;
    }
}
