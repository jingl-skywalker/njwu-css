/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.courseblservice;

import enumeration.ResultMessage;
import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public interface CourseBLService {
    
    //创建课程
    public ResultMessage createCourse(CourseVO cvo);
    
    //修改课程信息
    public ResultMessage modifyCourse(CourseVO cvo);
    
    //查看课程列表field：property -“指选”“必修”“选修”;institute-“商学院”“All”
    public ArrayList<CourseVO> observeList(String field,String value);
    
    //查看课程信息
    public CourseVO observeInfo(String courseID);
    
    //删除课程
    public ResultMessage delete(String courseID);

    

    public ArrayList<CourseVO> findCourseID(String text);

    public ArrayList<CourseVO> findCourseName(String text);

    public ArrayList<CourseVO> observeTeaAllCour(String teaID);

    public ArrayList<CourseVO> observeInsAllCour(String depart);

    public ArrayList<CourseVO> observeInsLeanCour(String depart);

     public ArrayList<CourseVO> observeInsCreateCour(String depart);
    public ArrayList<CourseVO> findModualCour(String 通修);
    
     /**
      * 返回所有的学期数或null
      @return 
      */
    public String[] getAllTerms();

    public CourseVO addCourses(ArrayList<CourseVO> vos) throws RemoteException;

    public CourseVO addCourses(String text) throws RemoteException;

    public String[] jgetAllTerms();


    public CourseVO jaddCourses(ArrayList<CourseVO> vos) throws RemoteException;

    public CourseVO jaddCourses(String text) throws RemoteException;

    public ArrayList<CourseVO> jobserveAllCour();

    public void createTerm(String newTerm);

    public ResultMessage jdelete(CourseVO v);

    public ResultMessage jcreateCourse(CourseVO course);

    public ResultMessage jupdateCourse(CourseVO v);

    public void jcreateTerm(String newTerm);
    
    /**
     * 得到新学期所有选修课
     */
    public ArrayList<CourseVO> getAllSelectedCour();
    
}
