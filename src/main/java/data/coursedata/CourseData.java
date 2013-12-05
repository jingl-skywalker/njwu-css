/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.coursedata;

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

    CourseIOHelper io;
    static ArrayList<CoursePO> cList;

    public CourseData() throws RemoteException {
        io = new CourseIOHelper();
        cList = new ArrayList<CoursePO>();
        readData();
    }

    /*将course.txt中数据全部读入cList*/
    public void readData() {
        cList.clear();
        ArrayList<String> list = io.readOut();
        String str[] = null;
        for (String s : list) {
            str = s.split(";");
            cList.add(new CoursePO(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8], str[9], str[10], str[11], str[12], str[13], str[14], str[15]));
        }
    }

    /*将cList中的数据全部写入course.txt*/
    public void writeData() {
        ArrayList<String> list = new ArrayList<String>();
        for (CoursePO p : cList) {
            list.add(p.toStoreString());
        }
        io.writeIn(list);
    }

    @Override/*添加课程记录*/

    public void insert(CoursePO cpo) throws RemoteException {
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).equal(cpo)) {
                System.out.println("该课程记录已存在");
            } else {
                cList.add(cpo);
            }
        }
        writeData();
    }

    @Override/*修改课程记录：仅可修改教师、授课时间、课程大纲、教材、参考文献*/

    public void update(CoursePO cpo) throws RemoteException {
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).equalA(cpo)) {
                cList.get(i).setPO(cpo);
                break;
            }
        }
        //cList.add(cpo);
        writeData();
    }

    @Override/*删除课程记录*/

    public void delete(String courseID) throws RemoteException {
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getCourseID().equals(courseID)) {
                cList.remove(i);
            }
        }
        writeData();
    }

    @Override/*根据课程号查找某个课程*/

    public CoursePO find(String courseID) throws RemoteException {
        readData();
        for (int i = 0; i < cList.size(); i++) {
            if (cList.get(i).getCourseID().equals(courseID)) {
                return cList.get(i);
            }
        }
        return null;
    }

    @Override/*根据某一属性返回对应值的课程记录列表：module，institute*/

    public ArrayList<CoursePO> finds(String field, String value) throws RemoteException {
        readData();
        ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
        if (field.equals("module")) {//根据模块属性查找记录
            for (CoursePO c : cList) {
                if (c.getModule().equals(value)) {
                    cpolist.add(c);
                }
            }
        } else if (field.equals("institute")) {//根据院系属性查找记录
            if (value.equals("All")) {//返回所有课程记录
                return cList;
            }
            for (CoursePO c : cList) {
                if (c.getInstitute().equals(value)) {
                    cpolist.add(c);
                }
            }
        } else if (field.equals("teaName")) { //根据老师姓名查找老师所教授的课
            for (CoursePO c : cList) {
                if (c.getTeaName().equals(value)) {
                    cpolist.add(c);
                }
            }
        }
        return cpolist;
    }
}
