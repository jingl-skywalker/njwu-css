/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.coursepo;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class CoursePO {

    private String courseName;
    private String courseID;
    private String courseProperity;
    private ArrayList<String> teachers = new ArrayList<String>();
    private int courseTimePerWeek;
    private int credit;
    private ArrayList<String> references = new ArrayList<String>();
    private ArrayList<String> assistants = new ArrayList<String>();
    private String courseSummary;
    private String time;
    private String institude;
    private boolean isPublic = false;
   private String learnIns;//修读院系
   
    public CoursePO(String courseName, String courseID, String courseProperity, int courseTimePerWeek, int credit, String courseSummary, String time) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseProperity = courseProperity;
        this.courseTimePerWeek = courseTimePerWeek;
        this.credit = credit;
        this.courseSummary = courseSummary;
        this.time = time;
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    public void addAssistant(String assis) {
        assistants.add(assis);
    }

    public void addReferences(String ref) {
        references.add(ref);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseProperity() {
        return courseProperity;
    }

    public void setCourseProperity(String courseProperity) {
        this.courseProperity = courseProperity;
    }

    public ArrayList<String> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<String> teachers) {
        this.teachers = teachers;
    }

    public int getCourseTimePerWeek() {
        return courseTimePerWeek;
    }

    public void setCourseTimePerWeek(int courseTimePerWeek) {
        this.courseTimePerWeek = courseTimePerWeek;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<String> getReferences() {
        return references;
    }

    public void setReferences(ArrayList<String> references) {
        this.references = references;
    }

    public ArrayList<String> getAssistants() {
        return assistants;
    }

    public void setAssistants(ArrayList<String> assistants) {
        this.assistants = assistants;
    }

    public String getCourseSummary() {
        return courseSummary;
    }

    public void setCourseSummary(String courseSummary) {
        this.courseSummary = courseSummary;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getInstitude() {
        return institude;
    }

    public void setInstitude(String institude) {
        this.institude = institude;
    }

    public String getLearnIns() {
        return learnIns;
    }

    public void setLearnIns(String learnIns) {
        this.learnIns = learnIns;
    }
    
}
