/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.coursedataservice;

import enumeration.ResultMessage;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import po.coursepo.CoursePO;
import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public interface CourseDataService extends Remote{
    
    public ResultMessage insert(CoursePO cpo) throws RemoteException;
    
    public ResultMessage update(CoursePO cpo) throws RemoteException;
    
    public ResultMessage delete(String courseID) throws RemoteException;
    
    public CoursePO find(String courseID) throws RemoteException;
    
    public ArrayList<CoursePO> finds(String field,String value) throws RemoteException;
    
    public void readData() throws RemoteException;
    
    public void writeData() throws RemoteException;
    
     public ArrayList<CoursePO> getTeaAllCour(String teaID) throws RemoteException;

    public ArrayList<CoursePO> getInsAllCour(String depart) throws RemoteException;
    
     public ArrayList<CoursePO> getInsLeanCour(String ins) throws RemoteException;
    
     /**
      * 得到所有的学期数
      * @return
      * @throws RemoteException 
      */
      public String[] getAllTerms() throws RemoteException;

    public CoursePO addCourses(ArrayList<CoursePO> pos) throws RemoteException;
    
    public String[] jgetAllTerms() throws RemoteException;
    
    public ArrayList<CoursePO> jgetTermCourses() throws RemoteException;
    
     public  ResultMessage jAddCourse(CoursePO p) throws RemoteException;
      public ResultMessage jupdateCourse(CoursePO p) throws RemoteException;
      
       public CoursePO jAddCourses(ArrayList<CoursePO> pos) throws RemoteException;
       
       public void jcreateTerm(String newTerm) throws RemoteException;
       
       public void createTerm(String newTerm) throws RemoteException;

    public ResultMessage jdelete(CoursePO p) throws RemoteException;

    public ArrayList<CoursePO> getInsCreateCour(String depart) throws RemoteException;

    /**
     * 为学生返回所有选修课
     * @return
     * @throws RemoteException 
     */
    public ArrayList<CoursePO> getAllSelectedCour() throws RemoteException;
}
