/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.courseblservice;

import java.util.ArrayList;

import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public interface CourseBLService {
    
    public CourseVO createCourse(String courseName, String courseID,String courseProperity,ArrayList<String> teachers,int courseTimePerWeek,int credit,String department,String learnIns);
    
    public void release();
    
    public void delete(String courseID);
    
    //修改：含括课程所有信息
    public CourseVO modify(String oldCourseID,String newCourseID,String newName,String newProperity,ArrayList<String> teachers,int newTimePerWeek,int newCredit,ArrayList<String> references,ArrayList<String> assistants,String newSummary,String newTime,String newDepartment);
    
    public CourseVO observe();
}
