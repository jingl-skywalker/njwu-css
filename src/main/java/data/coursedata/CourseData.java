/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.coursedata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import dataservice.coursedataservice.CourseDataService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.coursepo.CoursePO;

/**
 *
 * @author zili chen
 */
public class CourseData extends UnicastRemoteObject implements CourseDataService {
    
/*三个与utility相关的方法没实现*/
    
    FileUtility utility;
    ArrayList<CoursePO> cList;
    
    public CourseData() throws RemoteException {
        utility = new FileutilityImpl("src/main/resources/course.txt");
        cList = new ArrayList<CoursePO>();
        cList = utility.readCourseInfo();
    }
    
    @Override
    public void insert(CoursePO cpo) throws RemoteException {
        cList.add(cpo);
    }

    @Override
    public void update(CoursePO cpo) throws RemoteException {
        for(int i=0;i<cList.size();i++) {
            if(cList.get(i).getCourseID().equals(cpo.getCourseID())) {
                cList.remove(i);
            }
        }
        cList.add(cpo);
    }

    @Override
    public void delete(String courseID) throws RemoteException {
        for(int i=0;i<cList.size();i++) {
            if(cList.get(i).getCourseID().equals(courseID)) {
                cList.remove(i);
            }
        }
    }

    @Override
    public CoursePO find(String courseID) throws RemoteException {
        for(int i=0;i<cList.size();i++) {
            if(cList.get(i).getCourseID().equals(courseID)) {
                return cList.get(i);
            }
        }
        return null;
    }
    
    @Override
    public ArrayList<CoursePO> finds(int field,String value) throws RemoteException{
        ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
        switch(field) {
             case 0:for(CoursePO c:cList) {
                 if(c.getModule().equals(value)){
                     cpolist.add(c);
                 }
             }
             break;//课程模块
             case 1:for(CoursePO c:cList) {
                 if(c.getProperty().equals(value)){
                     cpolist.add(c);
                 }
             }break;//课程性质
             case 2:for(CoursePO c:cList) {
                 if(c.getType().equals(value)){
                     cpolist.add(c);
                 }
             }break;//课程类别
             case 3:for(CoursePO c:cList) {
                 if(String.valueOf(c.getOrder()).equals(value)){
                     cpolist.add(c);
                 }
             }break;//序列
             case 4:for(CoursePO c:cList) {
                 if(c.getTerm().equals(value)){
                     cpolist.add(c);
                 }
             }break;//开设学期
             case 5:for(CoursePO c:cList) {
                 if(String.valueOf(c.getCredit()).equals(value)){
                     cpolist.add(c);
                 }
             }break;//学分
             case 6:for(CoursePO c:cList) {
                 if(String.valueOf(c.getHour()).equals(value)){
                     cpolist.add(c);
                 }
             }break;//周学时
             case 7:for(CoursePO c:cList) {
                 if(c.getTime().equals(value)){
                     cpolist.add(c);
                 }
             }break;//授课时间
             case 8:for(CoursePO c:cList) {
                 if(c.getLearnIns().equals(value)){
                     cpolist.add(c);
                 }
             }break;//修读院系
             case 9:cpolist = cList;break;//全校
         }
        return cpolist;
    }
    
    public void writeCourse(String file,String content) {
       FileutilityImpl.writeToFile(file, content);
    }

}
