/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursebl;

import po.coursepo.CoursePO;
import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public class Course {/*课程类：课程对象*/
    
    private String courseID;//课程号
    private String courseName;//课程名
    private String module;//课程模块：通识通修、学科专业、开放选修、毕业论文/设计
    private String property;//课程性质：必修、指选、选修
    private String type;//课程类别：
    private String term;//开设学期:1,8
    private String period;//修读年届：2012-2013
    private String credit;//学分
    private String hour;//周学时
    private String teaName;//授课教师姓名
    private String time;//授课时间
    private String institute;//开设院系
    private String learnIns;//修读院系
    private String summary;//课程大纲
    private String material;//教材
    private String reference;//参考文献

    /*construct*/
    public Course(CourseVO cvo) {//不包含课程大纲、教材、参考文献
        this.courseID = cvo.getCourseID();
        this.courseName = cvo.getCourseName();
        this.module = cvo.getModule();
        this.property = cvo.getProperty();
        this.type = cvo.getType();
        this.term = cvo.getTerm(); 
        this.period =cvo.getPeriod();
        this.credit =cvo.getCredit();
        this.hour = cvo.getHour();
        this.teaName = cvo.getTeaName();
        this.time = cvo.getTime();
        this.institute  = cvo.getInstitute();
        this.learnIns  =cvo.getLearnIns();
    }
    
    /*取CoursePO*/
    public CoursePO toCPO() {
    	return new CoursePO(courseID,courseName,module,property,type,term,period,credit,hour,teaName,time,
    			institute,learnIns,summary,material,reference);
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

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
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
