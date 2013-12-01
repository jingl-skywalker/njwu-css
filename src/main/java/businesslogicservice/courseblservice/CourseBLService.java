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
    
    //创建课程
    public void createCourse(CourseVO cvo);
    
    //修改课程信息
    public void modifyCourse(CourseVO cvo);
    
    //查看课程列表
    public ArrayList<CourseVO> observeList(int field,String value);
    
    //查看课程信息
    public CourseVO observeInfo(String courseID);
    
    //删除课程
    public void delete(String courseID);
    
}
