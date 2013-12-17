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
    
    public SelectionBLServiceStub(){
        
    }

    @Override
    public boolean addCourse(SelectionVO selectionvo) {
        return true;
    }

    @Override
    public boolean deleteCourse(SelectionVO selectionvo) {
        return true;
    }

    @Override
    public boolean quitCourse(SelectionVO selectionvo) {
        return true;
    }

    @Override
    public ArrayList<CourseVO> getCourseList() {
        
        return courseList;
    }
    @Override
    public ArrayList<CourseVO> getMyCourseList(String stuID) {
        ArrayList<CourseVO> mycourselist = new ArrayList<CourseVO>();
        
        return mycourselist;
    }

    @Override
    public boolean verify() {
        return true;
    }
    
   
        
        ArrayList<CourseVO> courseList = new ArrayList<CourseVO>();

    @Override
    public ArrayList<CourseVO> getTempCourseList(String stuID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addCompulsoryCourse(CourseVO course, String institute, String stuGrade, String term) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addDirectCourse(SelectionVO selectionvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseVO> getReSelCourseList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> getMySelectedCourseList(String stuID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseVO> getSelCourseList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
