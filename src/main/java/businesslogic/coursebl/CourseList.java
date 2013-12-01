/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursebl;

import businesslogic.framebl.EduFrame;
import dataservice.coursedataservice.CourseDataService;
import dataservice.datafactory.CourseDataFactory;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.coursepo.CoursePO;
import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public class CourseList {/*课程列表类：对课程的具体操作、链接数据层*/
    
    private CourseDataService cds;
    private CourseDataFactory cdf;
    private Course course;
    private ArrayList<Course> cList;
    
    public CourseList() {
        cList = new ArrayList<Course>();
        /*try{
            cdf = (CourseDataFactory)Naming.lookup("courseDataFactory");
            System.out.println(cdf == null);
            cds = cdf.getCourseData();
        }catch(NotBoundException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE,null,ex);
        }catch (MalformedURLException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    /*添加课程*/
    public void addCourse(Course c) {
        for(int i = 0;i<cList.size();i++) {//检查有无相同课程号
             if(cList.get(i).getCourseID() == c.getCourseID()) {
                 System.out.println("该课程号已存在");
             }
             else{
                 cList.add(c);
             }
         }
    }
    
    /*修改课程信息*/
     public void modifyCourse(Course c) {
         for(int i = 0;i<cList.size();i++) {//删除原课程
             if(cList.get(i).getCourseID() == c.getCourseID()) {
                 cList.remove(i);
             }
         }
         cList.add(c);
     }
     
     /*查看课程列表*/
     public ArrayList<CourseVO> observeList(int field,String value) {
         ArrayList<CourseVO> cv = new ArrayList<CourseVO>();
         try{
             ArrayList<CoursePO> cp = cds.finds(field,value);
             for(int i=0;i<cp.size();i++) {
              cv.add(cp.get(i).toVO());
              }
         }catch(RemoteException ex) {
             Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
         }
         return cv;
     }
     
     /*查看课程信息*/
    public CourseVO observeInfo(String courseID) {
        CourseVO cvo  = null ;
         try{
             CoursePO cpo = cds.find(courseID);
             cvo = cpo.toVO();
         }catch(RemoteException ex) {
             Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
         }
         return cvo;
    }
    
    /*删除课程*/
    public void delete(String courseID) {
        try{
            cds.delete(courseID);
        }catch(RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
