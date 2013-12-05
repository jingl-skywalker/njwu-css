/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursebl;

import dataservice.coursedataservice.CourseDataService;
import dataservice.datafactory.DataFactory;

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
    private DataFactory dataFactory;

    public CourseList() {//将course里面的数据全部读到cList中
        try {
            dataFactory = (DataFactory) Naming.lookup("dataFactory");
            System.out.println(dataFactory == null);
            cds = dataFactory.getCourseData();
        } catch (NotBoundException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*添加课程*/
    public void addCourse(Course c) {
        try {
            cds.insert(c.toCPO());
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*修改课程信息：仅可修改教师、授课时间、课程大纲、教材、参考文献*/
    public void modifyCourse(Course c) {
        try {
            cds.update(c.toCPO());
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*查看课程列表*/
    public ArrayList<CourseVO> observeList(String field, String value) {
        ArrayList<CourseVO> cv = new ArrayList<CourseVO>();
        try {
            ArrayList<CoursePO> cp = cds.finds(field, value);
            for (CoursePO c : cp) {
                cv.add(c.toVO());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cv;
    }

    /*查看课程信息*/
    public CourseVO observeInfo(String courseID) {
        CourseVO cvo = null;
        try {
            CoursePO cpo = cds.find(courseID);
            cvo = cpo.toVO();
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cvo;
    }

    /*删除课程*/
    public void delete(String courseID) {
        try {
            cds.delete(courseID);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
