/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.selectionbl;

import java.util.ArrayList;
import po.selectionpo.Selection_StudentPO;
import java.util.Iterator;
import po.selectionpo.Selection_CoursePO;
/**
 *
 * @author sheyunfeng
 */
public class Student {
    private String stuID;
    private ArrayList<String> courseList;
    
    public Student(Selection_StudentPO studentpo){
        this.stuID = studentpo.getID();
        courseList = new ArrayList<String>();
        ArrayList<Selection_CoursePO> list = studentpo.getCourseList();        
        Iterator<Selection_CoursePO> iterator = list.iterator();
        while(iterator.hasNext()){
            String courseNum = iterator.next().getCourseNum();
            if(true){               /////////////isPublicCourse(courseNum);
                courseList.add(courseNum);
            }
        }
    }
    
    public String getID(){
        return stuID;
    }
    
    public ArrayList<String> getCourseList(){
        return courseList;
    }
    
    
}
