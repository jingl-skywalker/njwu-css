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
    private String institute;//开课院系
    private boolean isPublic = false;//new
    private String learnIns;//修读院系

    //可以兼容所有的课程发布需求
    public CourseVO(String courseName, String courseID, String courseProperity, ArrayList<String> teachers, int courseTimePerWeek, int credit, String department, String learnIns) {//new 
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseProperity = courseProperity;
        this.teachers = teachers;
        this.courseTimePerWeek = courseTimePerWeek;
        this.credit = credit;
        this.institute = department;//new
        this.learnIns = learnIns;
    }

    public CourseVO(String courseName, String courseID, String courseProperity, ArrayList<String> teachers, int courseTimePerWeek,
            int credit, ArrayList<String> references, ArrayList<String> assistants, String courseSummary, String time, String department) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseProperity = courseProperity;
        this.teachers = teachers;
        this.courseTimePerWeek = courseTimePerWeek;
        this.credit = credit;
        this.references = references;
        this.assistants = assistants;
        this.courseSummary = courseSummary;
        this.time = time;
        this.institute = department;
    }

    public CourseVO(String courseName, String courseNum) {
        this.courseID = courseNum;
        this.courseName = courseName;
    }

    public void addTeacher(String teacher) {
        getTeachers().add(teacher);
    }

    public void addAssistant(String assis) {
        getAssistants().add(assis);
    }

    public void addReferences(String ref) {
        getReferences().add(ref);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseProperity() {
        return courseProperity;
    }

    public ArrayList<String> getTeachers() {
        return teachers;
    }

    public int getCourseTimePerWeek() {
        return courseTimePerWeek;
    }

    public int getCredit() {
        return credit;
    }

    public ArrayList<String> getReferences() {
        return references;
    }

    public ArrayList<String> getAssistants() {
        return assistants;
    }

    public String getCourseSummary() {
        return courseSummary;
    }

    public String getTime() {
        return time;
    }

    public String getInstitute() {
        return institute;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public String getLearnIns() {
        return learnIns;
    }

    public boolean isISPublic() {//new
        return isPublic;
    }
}
