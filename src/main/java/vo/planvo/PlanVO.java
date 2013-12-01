/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.planvo;

import java.util.ArrayList;

import vo.coursevo.CourseVO;

/**
 *
 * @author Administrator
 */
public class PlanVO {
    
    private String institute;//院系
    private String term;//学期：2012-1,2012-2
    private String module;//课程模块：通识通修
    private String property;//课程性质：指选、必修、选修
    private String type;//课程类别：通识教育
    private String courseID;//课程号
    private String courseName;//课程名
    private int credit;//学分
    private int hour;//周学时
    
    public PlanVO(String institute,String term,String module,String property,String type,String courseID,
            String courseName,int credit,int hour) {
        this.institute  = institute;
        this.term  = term;
        this.module = module;
        this.property = property;
        this.type = type;
        this.courseID  = courseID;
        this.courseName = courseName;
        this.credit  = credit;
        this.hour  = hour;
    }
    
    /*getter*/
    public String getInstitute() {
        return institute;
    }

    public String getTerm() {
        return term;
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

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public int getHour() {
        return hour;
    }
    
}
