/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.planvo;

/**
 *
 * @author Administrator
 */
public class PlanVO {

    private String courseID;//课程号
    private String courseName;//课程名
    private String term;//学期：2012-1,2012-2
    private String period;//修读年届：2012
    private String module;//课程模块：通识通修
    private String property;//课程性质：指选、必修、选修
    private String type;//课程类别：通识教育
    private String credit;//学分
    private String hour;//周学时
    private String learnIns;//开设院系

    public PlanVO(String id, String name, String term, String period, String module, String property, String type, String credit, String hour, String learnIns) {
        this.courseID = id;
        this.courseName = name;
        this.term = term;
        this.period = period;
        this.module = module;
        this.property = property;
        this.type = type;
        this.credit = credit;
        this.hour = hour;
        this.learnIns = learnIns;
    }

    public PlanVO(String institute, String term, String module, String property, String type, String courseID, String courseName, int credit, int hour) {
        System.out.println("@PlanVO.java constructor unimplement");
    }

    /*getter*/
    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTerm() {
        return term;
    }

    public String getPeriod() {
        return period;
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

    public String getCredit() {
        return credit;
    }

    public String getHour() {
        return hour;
    }

    public String getLearnIns() {
        return learnIns;
    }
}
