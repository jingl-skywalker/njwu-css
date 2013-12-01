/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.selectiondata;

import dataservice.selectiondataservice.SelectionDataService;
import dataservice.gradedataservice.GradeDataService;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.selectionpo.SelectionPO;
import po.selectionpo.Selection_StudentPO;
import po.selectionpo.Selection_CoursePO;
import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import java.util.Iterator;
import po.gradepo.GradePO;
import po.gradepo.Grade_CoursePO;
import po.gradepo.Grade_StudentPO;
import po.gradepo.Grade_TeacherPO;
/**
 *
 * @author sheyunfeng
 */
public class SelectionData extends UnicastRemoteObject implements SelectionDataService ,GradeDataService{
    private final String filename = "selection&grade.txt";
    private FileUtility fileutility;
    private static ArrayList<SelectionDataItem> selectionDataList;
            
    public SelectionData() throws RemoteException{
        fileutility = new FileutilityImpl(filename);
        selectionDataList = new ArrayList<SelectionDataItem>();
        ArrayList<String> stringdata = fileutility.find();
        Iterator<String> iterator = stringdata.iterator();
        while(iterator.hasNext()){
            selectionDataList.add(new SelectionDataItem(iterator.next()));
        }
    }
    
    @Override
    public void insertSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException {
        Iterator<SelectionPO> iterator = selectionlist.iterator();
        while(iterator.hasNext()){
            selectionDataList.add(new SelectionDataItem(iterator.next()));
        }
    }

    @Override
    public void deleteSelection(ArrayList<SelectionPO> selectionlist) throws RemoteException {
        Iterator<SelectionPO> iteratorpo;
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            if(selectionlist.isEmpty()){
                break;
            }
            iteratorpo = selectionlist.iterator();            
            while(iteratorpo.hasNext()){
                if(iterator.next().equalsPO(iteratorpo.next())){
                    iterator.remove();
                    iteratorpo.remove();
                    break;
                }                
            }
        }
    }

    @Override
    public Selection_StudentPO findStudent_Selection(String ID) throws RemoteException {
        ArrayList<Selection_CoursePO> courselist = new ArrayList<Selection_CoursePO>();
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            SelectionDataItem selectionitem = iterator.next();
            if(selectionitem.getStuID().equals(ID)){
                Selection_CoursePO coursePO = new Selection_CoursePO(selectionitem.getCourseNum(), selectionitem.getTerm());
                courselist.add(coursePO);
            }
        }
        
        return new Selection_StudentPO(ID, courselist);
    }
    
        @Override
    public void updateGrade(ArrayList<GradePO> gradelist) throws RemoteException {
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            SelectionDataItem selectionitem = iterator.next();
            if(gradelist.isEmpty()){
                break;
            }
            Iterator<GradePO> gradeiterator = gradelist.iterator();
            while(gradeiterator.hasNext()){
                if(selectionitem.updateGrade(gradeiterator.next())){
                    gradeiterator.remove();
                    break;
                }
            }
        }
        
    }

    @Override
    public Grade_StudentPO findStudent_Grade(String ID) throws RemoteException {
        ArrayList<GradePO> gradelist = new ArrayList<GradePO>();
        Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
        while(iterator.hasNext()){
            SelectionDataItem selectionitem = iterator.next();
            if(ID.equals(selectionitem.getStuID())){
                gradelist.add(selectionitem.getGradePO());
            }
        }
        
        return new Grade_StudentPO(ID, gradelist);
    }

    @Override
    public Grade_TeacherPO findTeacher_Grade(String ID) throws RemoteException {
       ArrayList<GradePO> gradelist = new ArrayList<GradePO>();
       Iterator<SelectionDataItem> iterator = selectionDataList.iterator();
       while(iterator.hasNext()){
           SelectionDataItem selection = iterator.next();
           if(selection.containsTeacher(ID)){
               gradelist.add(selection.getGradePO());
           }
       }
       
       ArrayList<Grade_CoursePO> courselist = new ArrayList<Grade_CoursePO>();
       Iterator<GradePO> gradeiterator = gradelist.iterator();
       while(gradeiterator.hasNext()){
           GradePO grade = gradeiterator.next();
           Iterator<Grade_CoursePO> courseiterator = courselist.iterator();
           
           boolean gradeInCourse = false;
           while(courseiterator.hasNext()){
               Grade_CoursePO course = courseiterator.next();
               if(course.getCourseNum().equals(grade.getCourseID())
                       && course.getTerm().equals(grade.getTerm())){
                   course.addGradePO(grade);
                   gradeInCourse = true;
                   break;
               }                   
           }
           if(!gradeInCourse){
               Grade_CoursePO newCourse = new Grade_CoursePO(grade.getCourseID(), grade.getTerm());
               newCourse.addGradePO(grade);
               courselist.add(newCourse);
           }
       }
       
       return new Grade_TeacherPO(ID, courselist);
       
       
    }
    
    /*public static void main(String args[]){
        try{
            LocateRegistry.createRegistry(1499);
            SelectionDataService selectiondata = new SelectionData();
            Naming.rebind("//localhost:1499/SelectionDataService", selectiondata);
            
            System.out.println("SelectionDataService is ready");         
        }catch(Exception e){
            System.out.println("SelectioinDataService is failed " + e);
        }
    }*/


}
