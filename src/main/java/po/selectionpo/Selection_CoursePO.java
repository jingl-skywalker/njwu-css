/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package po.selectionpo;

import java.util.ArrayList;

/**
 *
 * @author sheyunfeng
 */
public class Selection_CoursePO {
    private String courseNum;
    private String term;
    
    public Selection_CoursePO(String courseNum, String term){
        this.courseNum = courseNum;
        this.term = term;
    }
    
    public String getCourseNum(){
        return courseNum;
    }
    
    public String getTerm(){
        return term;
    }
    
}
