/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.gradepo;

/**
 *
 * @author Administrator
 */
public class GradePO {

    private String courseID;
    private String stuID;
    private String term;
    private double grade;

    public GradePO() {
    }

    public GradePO(String courseID, String stuID, String term, double grade) {
        this.courseID = courseID;
        this.stuID = stuID;
        this.term = term;
        this.grade = grade;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }
    
    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
