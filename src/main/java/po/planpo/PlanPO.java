/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.planpo;

import java.util.ArrayList;

import po.coursepo.CoursePO;
import vo.planvo.PlanVO;

/**
 *
 * @author Administrator
 */
public class PlanPO {
    
    private String institute;//院系
    private String term;//学期：2012-1,2012-2
    private String module;//课程模块：通识通修
    private String property;//课程性质：指选、必修、选修
    private String type;//课程类别：通识教育
    private String courseID;//课程号
    private String courseName;//课程名
    private int credit;//学分
    private int hour;//周学时
    
    /*转为存储信息*/
    public String toStoreString() {
        StringBuffer sbf = new StringBuffer();
        sbf.append(institute+";"+term+";"+module+";"+property+";"+type+";"+courseID+";" +courseName+";"+credit+";" +hour);
        sbf.append("\r\n");
        return sbf.toString();
    }
    
    /*取PlanVO*/
    public PlanVO toVO() {
        return new PlanVO(institute,term,module,property,type,courseID,courseName,credit,hour);
    }
    
    /*getter 和 setter*/
    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
}
