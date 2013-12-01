/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.selectionbl;

import java.util.ArrayList;

/**
 *
 * @author sheyunfeng
 */
public class CourseList {
    ArrayList<String> courselist;
    
    public CourseList(ArrayList<String> courselist){
        this.courselist = courselist;
    }
    
    public int getCourseNum(){
        return courselist.size();
    }
    
    public boolean add(String course){
        if(courselist.contains(course))
            return false;
        else
            courselist.add(course);
        
        return true;
    }
    
    public boolean delete(String course){
        return courselist.remove(course);
    }
    
    public boolean contain(String course){
        return courselist.contains(course);
    }
    
    public ArrayList<String> getList(){
        return courselist;
    }
    
}
