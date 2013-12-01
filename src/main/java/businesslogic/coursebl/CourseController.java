/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursebl;

import businesslogicservice.courseblservice.CourseBLService;
import java.util.ArrayList;
import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public class CourseController implements CourseBLService {

    private CourseList courseList;
    private Course course;
    
    @Override/*创建课程*/
    public void createCourse(CourseVO cvo) {
        course = new Course(cvo);
        courseList.addCourse(course);
    }

    @Override/*修改课程信息*/
    public void modifyCourse(CourseVO cvo) {
        course = new Course(cvo);
        courseList.modifyCourse(course);
    }

    @Override/*查看课程列表*/
    public ArrayList<CourseVO> observeList(int field, String value) {
        return courseList.observeList(field, value);
    }

    @Override/*查看课程信息*/
    public CourseVO observeInfo(String courseID) {
        return courseList.observeInfo(courseID);
    }

    @Override/*删除课程*/
    public void delete(String courseID) {
        courseList.delete(courseID);
    }
    
}
