/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.coursevo;

import java.io.Serializable;
import java.util.Comparator;
import po.coursepo.CoursePO;



/**
 *
 * @author Administrator
 */
public class CourseVO {
     
    private String courseID;//课程号
    private String courseName;//课程名
    private String module;//课程模块：通识通修、学科专业、开放选修、毕业论文/设计
    private String property;//课程性质：必修、指选、选修、All
    private String isOpen;//是否开放
    private String type;//课程类别：
    private String term;//开设学期:2012-1,2012-2,
    private String period;//修读年届：2012-2013
    private String credit;//学分
    private String hour;//周学时
    private String teaName;//授课教师姓名：刘钦，丁二玉(中间用逗号隔开）
    private String teaID;
    private String time;//授课时间：星期三1-2，星期四5-6
    private String institute;//开设院系：商学院，软件学院
    private String learnIns;//修读院系:软件学院，商学院
    private String peopleNum;//修读人数上限，0表示无限制
    private String summary;//课程大纲——不可以出现分号
    private String material;//教材
    private String reference;//参考文献
    
    public CourseVO(String id,String name,String module,String property,String isOpen,String type,String term,String period,
            String credit,String hour,String teacher,String teaID,String time,String institute,String learnIns,String poep,
            String sum,String mater,String refer) {
        this.courseID = id;
        this.courseName = name;
        this.module = module;
        this.property = property;
        this.isOpen = isOpen;
        this.type = type;
        this.term  = term;
        this.period  = period;
        this.credit = credit;
        this.hour = hour;
        this.teaName = teacher;
        this.teaID = teaID;
        this.time = time;
        this.institute = institute;
        this.learnIns = learnIns;
        this.peopleNum = poep;
        this.summary = sum;
        this.material  = mater;
        this.reference  = refer;
    }
    
    public CourseVO(CoursePO p) {
     
        this.courseID = p.getCourseID();
        this.courseName = p.getCourseName();
        this.module = p.getModule();
        this.property = p.getProperty();
        this.isOpen = p.getIsOpen();
        this.type = p.getType();
        this.term  = p.getTerm();
        this.period  = p.getPeriod();
        this.credit = p.getCredit();
        this.hour = p.getHour();
        this.teaName = p.getTeaName();
        this.teaID = p.getTeaID();
        this.time = p.getTime();
        this.institute = p.getInstitute();
        this.learnIns = p.getLearnIns();
        this.peopleNum = p.getPeopleNum();
        this.summary = p.getSummary();
        this.material  = p.getMaterial();
       this.reference  = p.getReference();
        
    }
      public CourseVO() {
      
     }
    
  
    public void setVO(CoursePO c){
        this.courseID = c.getCourseID();
        this.courseName = c.getCourseName();
        this.module = c.getModule();
        this.property = c.getProperty();
        this.isOpen = c.getIsOpen();
        this.type = c.getType();
        this.term  = c.getTerm();
        this.period  = c.getPeriod();
        this.credit = c.getCredit();
        this.hour = c.getHour();
        this.teaName = c.getTeaName();
        this.teaID = c.getTeaID();
        this.time = c.getTime();
        this.institute = c.getInstitute();
        this.learnIns = c.getLearnIns();
        this.peopleNum = c.getPeopleNum();
        this.summary = c.getSummary();
        this.material  = c.getMaterial();
        this.reference  = c.getReference();
    }
    
    /*转为存储信息*/
    public String toStoreString() {
        StringBuffer sbf = new StringBuffer();
        sbf.append(courseID+";"+courseName+";"+module+";"+property+";"+isOpen+";"+type+";" +term+";"+period+";"+credit+";"+hour+";"+teaName+";"+teaID+";"+time+";"+institute+";"+learnIns+";"+peopleNum+";"+summary+";"+material+";"+reference);
       
        return sbf.toString();
    }
    
    /*比较两个course信息是否完全相等*/
    public boolean equal(CoursePO c) {
      if(c.getCourseID().equals(courseID)&&c.getCourseName().equals(courseName)&&c.getModule().equals(module)&&
         c.getProperty().equals(property)&&c.getIsOpen().equals(isOpen) &&c.getType().equals(type)&&c.getTerm().equals(term)&&c.getPeriod().equals(period)&&
         c.getCredit().equals(credit)&&c.getHour().equals(hour)&&c.getTeaName().equals(teaName)&&c.getTeaID().equals(teaID)&&c.getTime().equals(time)&&
         c.getInstitute().equals(institute)&&c.getLearnIns().equals(learnIns)&&c.getPeopleNum().equals(peopleNum) &&c.getSummary().equals(summary)&&c.getMaterial().equals(material)&&
         c.getReference().equals(reference)){
    	  return true;
      }
      else {
    	  return false;
      }
    }
    
    /*比较两个course信息：课程号,开设学期,修读年届,修读院系*/
    public boolean equalA(CoursePO c) {
    	if(c.getCourseID().equals(courseID)&&c.getTerm().equals(term)&&c.getPeriod().equals(period)&&c.getLearnIns().equals(learnIns)){
    	    return true;
    	 }
        else {
    	   return false;
        }
    }
    
    /*取CourseVO*/
    public CoursePO toPO() {
       return  new CoursePO(toStoreString());
    }

    public String getTeaID() {
        return teaID;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
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

    public void setTeaID(String string) {
        this.teaID = string;
    }

   
  
    
}
