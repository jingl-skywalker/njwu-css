/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.coursepo;

import java.util.ArrayList;
import vo.coursevo.CourseVO;

/**
 *
 * @author Administrator
 */
public class CoursePO {
     
    private String courseID;//课程号
    private String courseName;//课程名
    private String module;//课程模块：通识通修、学科专业、开放选修、毕业论文/设计
    private String property;//课程性质：必修、指选、选修
    private String type;//课程类别：
    private char order;//序列：A,B,C,D,E,F,G,H,I,J,L
    private String term;//开设学期:2012-1,2012-2,
    private int credit;//学分
    private int hour;//周学时
    private String teaName;//授课教师姓名：刘钦，丁二玉
    private String time;//授课时间
    private String institute;//开设院系
    private String learnIns;//修读院系:软件学院，商学院
    private String summary;//课程大纲——不可以出现分号
    private String material;//教材
    private String reference;//参考文献
    
    /*转为存储信息*/
    public String toStoreString() {
        StringBuffer sbf = new StringBuffer();
        sbf.append(courseID+";"+courseName+";"+module+";"+property+";"+type+";"+order+";" +term+";"+credit+";"
                +hour+";"+teaName+";"+time+";"+institute+";"+learnIns+";"+summary+";"+material+";"+reference);
        sbf.append("\r\n");
        return sbf.toString();
    }
    
    /*取CourseVO*/
    public CourseVO toVO() {
       return  new CourseVO(courseID,courseName,module,property,type,order,term,credit,hour,teaName,
                time,institute,learnIns);
    }
    
    /*getter 和 setter*/
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

    public char getOrder() {
        return order;
    }

    public void setOrder(char order) {
        this.order = order;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
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

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getLearnIns() {
        return learnIns;
    }

    public void setLearnIns(String learnIns) {
        this.learnIns = learnIns;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    
}
