/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.processmngvo;

import java.util.Date;
import businesslogic.processmngbl.noticebl.Notice;
import businesslogicservice.processmngblservice.notice.ROLE;

/**
 *
 * @author Administrator
 */
public class NoticeVO {

    static int count = 0;
    private int num;
    private String title;
    private String content;
    private Date time;
    private boolean R1;
    private boolean R2;
    private boolean R3;
    private ROLE role;
/**
 * if do not pass the role regart as the all role by default
 * @param title
 * @param content
 * @param time 
 */
    public NoticeVO(String title, String content, Date time) {
        num = (++count);
   //     System.out.println("@noticevo:"+title+content);
        this.title = title;
        this.content = content;
        this.time = time;
        this.role=ROLE.ALL;
    }

    public NoticeVO(String title, String content, Date time, boolean R1, boolean R2, boolean R3) {
        this(title, content, time);
        this.R1 = R1;
        this.R2 = R2;
        this.R3 = R3;
        initRole();
    }

    public NoticeVO(String title, String content, Date time, ROLE role) {
        this(title, content, time);
        this.role = role;
    }
    public ROLE getRole()
    {
        return this.role;
    }
    public NoticeVO(Notice notice) {
        this(notice.getName(), notice.getContent(), notice.getTime(), notice.getRole());
    }
    private void initRole() {
        if (this.R1 && this.R2 && this.R3) {
            this.role = ROLE.ALL;
        } else if (this.R1) {
            this.role = ROLE.INSJW;
        } else if (this.R2) {
            this.role = ROLE.TEACHER;
        } else if (this.R3) {
            this.role = ROLE.STUDENT;
        }
    }

    public String getContent() {
        return content;
    }

    public Date getTime() {
        return time;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num=num;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String s){
        this.title=s;
    }
}
