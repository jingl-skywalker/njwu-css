/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.staticpo;

import java.util.ArrayList;

/**
 *
 * @author zili chen
 */
public class TeacherStaticPO {
    
    private String department;//院系
    private ArrayList<Integer> educations = new ArrayList<Integer>();
    private ArrayList<Integer> positions = new ArrayList<Integer>();
    private ArrayList<Integer> ages = new ArrayList<Integer>();
    
    public TeacherStaticPO(String department) {
        this.department = department; 
    }

    public ArrayList<Integer> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Integer> educations) {
        this.educations = educations;
    }

    public ArrayList<Integer> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Integer> positions) {
        this.positions = positions;
    }

    public ArrayList<Integer> getAges() {
        return ages;
    }

    public void setAges(ArrayList<Integer> ages) {
        this.ages = ages;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
