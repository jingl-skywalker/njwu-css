/*syf
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.coursevo;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class CourseVO {
    
    private String courseID;//课程号
    private String courseName;//课程名
    private String module;//课程模块：通识通修、学科专业、开放选修、毕业论文/设计
    private String property;//课程性质：必修、指选、选修
    private String type;//课程类别：
    private char order;//序列：A,B,C,D,E,F,G,H,I,J,L
    private String term;//开设学期:1,8
    private int credit;//学分
    private int hour;//周学时
    private String teaName;//授课教师姓名
    private String time;//授课时间
    private String institute;//开设院系
    private String learnIns;//修读院系

    public CourseVO(String id,String name,String module,String property,String type,char order,String term,
            int credit,int hour,String teacher,String time,String institute,String learnIns) {
        this.courseID = id;
        this.courseName = name;
        this.module = module;
        this.property = property;
        this.type = type;
        this.order = order;
        this.term  = term;
        this.credit = credit;
        this.hour = hour;
        this.teaName = teacher;
        this.time = time;
        this.institute = institute;
        this.learnIns = learnIns;
    }

    /*getter*/
    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getModule() {
        return module;
    }

    public String getProperty() {
        return property;
    }

    public String getType() {
        return type;
    }

    public char getOrder() {
        return order;
    }

    public String getTerm() {
        return term;
    }

    public int getCredit() {
        return credit;
    }

    public int getHour() {
        return hour;
    }

    public String getTeaName() {
        return teaName;
    }

    public String getTime() {
        return time;
    }

    public String getInstitute() {
        return institute;
    }

    public String getLearnIns() {
        return learnIns;
    }
    
    public void setTerm(String s) {
        term =  s;
    }
    
}
