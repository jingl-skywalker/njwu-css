/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package po.selectionpo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sheyunfeng
 */
public class Selection_StudentPO implements Serializable{
    private String id;
    private ArrayList<Selection_CoursePO> courselist;
    
    public Selection_StudentPO(String id, ArrayList<Selection_CoursePO> courselist){
        this.id = id;
        this.courselist = courselist;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public void setCourseList(ArrayList<Selection_CoursePO> courselist){
        this.courselist = courselist;
    }
    
    public ArrayList<Selection_CoursePO> getCourseList(){
        return courselist;
    }
}
