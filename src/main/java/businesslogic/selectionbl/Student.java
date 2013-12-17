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
    private ArrayList<String> courseList;       //所有选课
    private ArrayList<String> tempCourseList;   //所有当前未确认的选修课选课
    
    public Student(Selection_StudentPO studentpo){
        this.stuID = studentpo.getID();
        courseList = new ArrayList<String>();
        ArrayList<Selection_CoursePO> list = studentpo.getCourseList();        
        Iterator<Selection_CoursePO> iterator = list.iterator();
        while(iterator.hasNext()){
            String courseNum = iterator.next().getCourseNum();
            courseList.add(courseNum);
            
        }
        
        tempCourseList = new ArrayList<String>();
        ArrayList<Selection_CoursePO> templist = studentpo.getTempCourseList();
        Iterator<Selection_CoursePO> iterator2 = templist.iterator();
        while(iterator.hasNext()){
            String courseNum = iterator.next().getCourseNum();
            tempCourseList.add(courseNum);
        }
        
    }
    
    public String getID(){
        return stuID;
    }
    
    public ArrayList<String> getCourseList(){
        return courseList;
    }
    
    public ArrayList<String> getTempCourseList(){
        return tempCourseList;
    }
}
