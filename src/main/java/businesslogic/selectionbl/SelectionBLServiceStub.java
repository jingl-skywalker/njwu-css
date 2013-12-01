/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.selectionbl;

import java.util.ArrayList;

import businesslogicservice.selectionblservice.SelectionBLService;
import vo.coursevo.CourseVO;
import vo.selectionvo.SelectionVO;
import vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public class SelectionBLServiceStub implements SelectionBLService {

    final int maxSelectionNum = 4;
    String stuID;
    String stuName;
    String courseNum;
    String courseName;
    int selectedCourseNum;

    public SelectionBLServiceStub(String stuID, String stuName, String courseNum, String courseName, int selectedCourseNum) {
        this.stuID = stuID;
        this.courseNum = courseNum;
        this.selectedCourseNum = selectedCourseNum;
    }

    
    public ArrayList<CourseVO> getCourseList(String range) {
        ArrayList<CourseVO> courseList = new ArrayList<CourseVO>();
        //courseList.add(new CourseVO(courseNum, courseName));
        return courseList;
    }

    
    public UserInfoVO getStudent() {
        return null;
        
    }

    
    public void addCourse(String courseNum) {
        if (selectedCourseNum > maxSelectionNum) {
            System.out.println("已达选课数上限");
        } else {
            System.out.println("选课成功");
        }
    }

    
    public void deleteCourse(String courseNum) {
        System.out.println("删除选课成功");
    }

    
    public boolean quitCourse(String courssNum, String stuID) {
        System.out.println("退选成功");
        return true;
    }

    
    public ArrayList<CourseVO> observe() {
        return null;
    }

    @Override
    public boolean addCourse(SelectionVO selectionvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteCourse(SelectionVO selectionvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean quitCourse(SelectionVO selectionvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verify() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseVO> getCourseList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseVO> getMyCourseList(String stuID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
