/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.planbl;

import po.planpo.PlanPO;
import vo.planvo.PlanVO;


/**
 *
 * @author zili chen
 */
public class Plan {/*教学计划类:具体的教学计划对象*/
    
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
	
	public Plan(PlanVO pvo) {
		this.courseID = pvo.getCourseID();
    	this.courseName = pvo.getCourseName();
    	this.term = pvo.getTerm();
    	this.period = pvo.getPeriod();
    	this.module = pvo.getModule();
    	this.property = pvo.getProperty();
    	this.type  = pvo.getType();
    	this.credit  = pvo.getCredit();
    	this.hour = pvo.getHour();
    	this.learnIns  = pvo.getLearnIns();
	}
	/*转为PlanPO*/
	public PlanPO toPO() {
		return new PlanPO(courseID,courseName,term,period,module,property,type,credit,hour,learnIns);
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
	public String getLearnIns() {
		return learnIns;
	}
	public void setLearnIns(String learnIns) {
		this.learnIns = learnIns;
	}
	
}
