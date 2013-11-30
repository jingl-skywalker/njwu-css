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
public class Grade_CoursePO {
    private String courseNum;
    private String term;
    private ArrayList<GradePO> gradelist;
    
    public Grade_CoursePO(String courseNum, String term){
        this.courseNum = courseNum;
        this.term = term;
        this.gradelist = new ArrayList<GradePO>();
    }
    
    public Grade_CoursePO(String courseNum, String term, ArrayList<GradePO> gradelist){
        this.courseNum = courseNum;
        this.term = term;
        this.gradelist = gradelist;           
    }
    
    public String getCourseNum(){
        return courseNum;
    }
    
    public void setCourseNum(String courseNum){
        this.courseNum = courseNum;
    }
    
    public void setTerm(String term){
        this.term = term;              
    }
    
    public String getTerm(){
        return term;
    }
    
    public ArrayList<GradePO> getGradeList(){
        return gradelist;
    }
    
    public void setGradeList(ArrayList<GradePO> gradelist){
        this.gradelist = gradelist;
    }
    
    public void addGradePO(GradePO grade){
        gradelist.add(grade);
    }
    
}
