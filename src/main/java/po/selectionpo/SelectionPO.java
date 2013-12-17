/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.selectionpo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SelectionPO implements Serializable{

    private String courseNum;
    private String stuID;
    private String term;
    private String teacher;

    public SelectionPO(String num, String id, String term){
        courseNum = num;
        stuID = id;
        this.term = term;
    }
    
    public SelectionPO(String num, String id, String term, String teacher) {
        courseNum = num;
        stuID = id;
        this.term = term;
        this.teacher = teacher;
    }

    public String getCouseNum() {
        return courseNum;
    }

    public String getStuID() {
        return stuID;
    }
    
    public void setTerm(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }
    
    public String getTeacher(){
        return teacher;
    }
    
    
}
