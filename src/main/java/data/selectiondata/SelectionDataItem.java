/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.selectiondata;

import java.util.ArrayList;
import po.selectionpo.SelectionPO;
import po.gradepo.GradePO;
/**
 *
 * @author sheyunfeng
 */
public class SelectionDataItem {
    private String courseNum;
    private String stuID;
    private String term;
    private String teacher;
    private double grade;
    
    public SelectionDataItem(String dataString){
        String[] s = dataString.split(";");
        int n = s.length;
        courseNum = s[0];
        stuID = s[1];
        term = s[2];
        grade = Double.parseDouble(s[3]);
        teacher = s[4];
    }
    
    public SelectionDataItem(SelectionPO selectionpo){
        courseNum = selectionpo.getCouseNum();
        stuID = selectionpo.getStuID();
        term = selectionpo.getTerm();
        teacher = selectionpo.getTeacher();
        grade = -1;
        
    }
    
    public boolean equalsPO(SelectionPO po){
        
        return true;
    }
    
    public String getCourseNum(){
        return courseNum;
    }
    
    public String getStuID(){
        return stuID;
    }
    
    public String getTerm(){
        return term;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public SelectionPO getSelectionPO(){
        
        
        return null;        
    }
    
    public boolean updateGrade(GradePO gradepo){
        if(gradepo.getCourseID().equals(courseNum)
                && gradepo.getStuID().equals(stuID)
                && gradepo.getTerm().equals(term)){
            this.grade = gradepo.getGrade();
            return true;
        }
        else
            return false;
    }
    
    public GradePO getGradePO(){
        
        return null;
    }
    
    public boolean containsTeacher(String id){
        return teacher.equals(id);
    }
}
