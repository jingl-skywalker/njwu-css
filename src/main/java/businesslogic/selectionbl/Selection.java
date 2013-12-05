/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.selectionbl;

import businesslogicservice.courseblservice.CourseBLService;
import businesslogicservice.courseblservice.CourseOperationFactory;
import java.rmi.Naming;
import po.selectionpo.Selection_StudentPO;
import po.selectionpo.SelectionPO;
import dataservice.selectiondataservice.SelectionDataService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.selectionpo.Selection_CoursePO;
import vo.coursevo.CourseVO;

/**
 *
 * @author sheyunfeng
 */
public class Selection {

    private final int maxCourseNum = 4;
    private Student student = null;
    private CourseList courselist = null;
    private final String term = "2013-1";
    private SelectionDataService selectiondataservice;

    public Selection() {
        selectiondataservice = null;
        try {
            selectiondataservice = (SelectionDataService) Naming.lookup("SelectionDataService");
        } catch (Exception e) {
            System.out.println("SelectionDataService exception:" + e);
        }
    }

    private boolean addStudent(String stuID) {


        Selection_StudentPO studentpo = null;
        try {
            studentpo = selectiondataservice.findStudent_Selection(stuID);
        } catch (RemoteException ex) {
            System.out.println(ex);
        }

        if (!(studentpo == null)) {
            student = new Student(studentpo);
            courselist = new CourseList(student.getCourseList());
            return true;
        } else {
            return false;
        }
    }

    private boolean checkStudent(String stuID) {
        if (student == null) {
            return addStudent(stuID);
        } else {
            return student.getID().equals(stuID);
        }
    }

    public boolean addCourse(String stuID, String courseNum) {
        if (!checkStudent(stuID)) {
            return false;
        }

        if (courselist.getCourseNum() < maxCourseNum) {
            return courselist.add(courseNum);
        }

        return false;
    }

    public boolean deleteCourse(String stuID, String coruseNum) {
        if (!checkStudent(stuID)) {
            return false;
        }

        return courselist.delete(coruseNum);

    }

    public boolean quitCoruse(String stuID, String courseNum) {
        if (!checkStudent(stuID)) {
            return false;
        }

        if (!courselist.contain(courseNum)) {
            return false;
        }

        if (true) {    //permitted
            courselist.delete(courseNum);
            return verify();
        } else {
            return false;
        }

    }

    public boolean verify() {
        try {
            ArrayList<String> newCourseList = courselist.getList();
            ArrayList<String> oldCourseList = student.getCourseList();

            Iterator<String> iterator = newCourseList.iterator();
            ArrayList<SelectionPO> selectionlist = new ArrayList<SelectionPO>();
            while (iterator.hasNext()) {
                String courseNum = iterator.next();
                if (!oldCourseList.contains(courseNum)) {
                    SelectionPO selectionpo = new SelectionPO(courseNum, student.getID(), term, null);
                    selectionlist.add(selectionpo);
                }
            }
            selectiondataservice.insertSelection(selectionlist);

            iterator = oldCourseList.iterator();
            selectionlist = new ArrayList<SelectionPO>();
            while (iterator.hasNext()) {
                String courseNum = iterator.next();
                if (!newCourseList.contains(courseNum)) {
                    SelectionPO selectionpo = new SelectionPO(courseNum, student.getID(), term, null);
                    selectionlist.add(selectionpo);
                }
            }
            selectiondataservice.deleteSelection(selectionlist);

            return true;
        } catch (Exception e) {
            System.out.println("Exception:" + e);
            return false;
        }
    }

    public ArrayList<CourseVO> getCourseList() {
        CourseOperationFactory courseFactory = new CourseOperationFactory();
        CourseBLService coursebl = courseFactory.createCourseBL();

        return coursebl.observeList("", "");
    }

    public ArrayList<CourseVO> getCourseList(String stuID) {
        CourseOperationFactory courseFactory = new CourseOperationFactory();
        CourseBLService coursebl = courseFactory.createCourseBL();

        Selection_StudentPO studentpo = null;
        try {
            studentpo = selectiondataservice.findStudent_Selection(stuID);
        } catch (RemoteException ex) {
            Logger.getLogger(Selection.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (studentpo == null) {
            return null;
        }

        ArrayList<CourseVO> mycourselist = new ArrayList<CourseVO>();
        ArrayList<Selection_CoursePO> coursepolist = studentpo.getCourseList();
        Iterator<Selection_CoursePO> iterator = coursepolist.iterator();
        while (iterator.hasNext()) {
            Selection_CoursePO coursepo = iterator.next();
            CourseVO course = coursebl.observeInfo(coursepo.getCourseNum());
            course.setTerm(coursepo.getTerm());
            mycourselist.add(course);
        }
        return mycourselist;
    }
}
