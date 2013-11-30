/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.selectionblservice;

import java.util.ArrayList;

import vo.selectionvo.SelectionVO;
import vo.coursevo.CourseVO;

/**
 *
 * @author Administrator
 */
public interface SelectionBLService {

    public boolean addCourse(SelectionVO selectionvo);

    public boolean deleteCourse(SelectionVO selectionvo);

    public boolean quitCourse(SelectionVO selectionvo);
    
    public ArrayList<CourseVO> getCourseList();
    
    public ArrayList<CourseVO> getMyCourseList(String stuID);

    public boolean verify();
}
