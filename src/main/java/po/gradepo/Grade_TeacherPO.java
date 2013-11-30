/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package po.gradepo;

import java.util.ArrayList;

/**
 *
 * @author sheyunfeng
 */
public class Grade_TeacherPO {
    private String id;
    private ArrayList<Grade_CoursePO> courselist;
    
    public Grade_TeacherPO(String id, ArrayList<Grade_CoursePO> courselist){
        this.id = id;
        this.courselist = courselist;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public ArrayList<Grade_CoursePO> getCourselist(){
        return courselist;
    }
    
}
