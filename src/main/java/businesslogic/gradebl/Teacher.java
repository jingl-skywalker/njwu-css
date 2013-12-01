/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.gradebl;

import java.util.ArrayList;
import vo.gradevo.GradeVO;
import po.gradepo.Grade_TeacherPO;
import po.gradepo.GradePO;


/**
 *
 * @author sheyunfeng
 */
public class Teacher {
    private String id;
    private ArrayList<String> courselist;
    public Teacher(Grade_TeacherPO teacherpo){
        
        courselist = new ArrayList<String>();
    }
    
    public String getTeacherID(){
        return id;
    }
    
    private boolean hasCourse(String courseNum){
        return courselist.contains(courseNum);
    }
    
    public boolean recordScore(ArrayList<GradeVO> scores){
        if(scores.isEmpty())
            return false;
        
        String courseNum = scores.get(0).getCourseNum();
        if(!hasCourse(courseNum))
            return false;
        
        return true;    
        
    }
    
}
