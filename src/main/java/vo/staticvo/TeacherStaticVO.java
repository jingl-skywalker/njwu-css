/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.staticvo;

import java.util.ArrayList;

/**
 *
 * @author zili chen
 */
public class TeacherStaticVO {
    
    String department;//院系
    ArrayList<Integer> educations = new ArrayList<Integer>();
    ArrayList<Integer> positions = new ArrayList<Integer>();
    ArrayList<Integer> ages = new ArrayList<Integer>();
    
    public TeacherStaticVO(String department) {
        this.department = department; 
    }
    
    public TeacherStaticVO() {
        
    }

    public ArrayList<Integer> getEducations() {
        return educations;
    }

    public ArrayList<Integer> getPositions() {
        return positions;
    }

    public ArrayList<Integer> getAges() {
        return ages;
    }

    public String getDepartment() {
        return department;
    }
    
}
