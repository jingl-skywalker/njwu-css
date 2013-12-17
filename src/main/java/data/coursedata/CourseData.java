/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.coursedata;

import dataservice.coursedataservice.CourseDataService;
import enumeration.ResultMessage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeSet;

import po.coursepo.CoursePO;
import vo.coursevo.CourseVO;

/**
 *
 * @author zili chen
 */
public class CourseData extends UnicastRemoteObject implements CourseDataService {
    
    CourseIOHelper io;
    TreeSet<CoursePO> cList;
    //不用
    public CourseData() throws RemoteException {
        io = new CourseIOHelper();
        cList = new TreeSet<CoursePO>();  
        readData();
    }
    
     public CourseData(String file) throws RemoteException {
        io = new CourseIOHelper(file);
        cList = new TreeSet<CoursePO>();
           
        readData();
    }
    /*将course.txt中数据全部读入cList*/
    public void readData() {
    	cList.clear();
    	ArrayList<String> list = io.readOut();
    	for(String s:list) {
    		cList.add(new CoursePO(s));
    	}
        
    }
    
    /*将cList中的数据全部写入course.txt*/
    public void writeData() {
    	ArrayList<String> list = new ArrayList<String>();
    	for(CoursePO p:cList) {
            if(!(p.getModule().equals("通识")||p.getModule().equals("通修")))
    		list.add(p.toStoreString());
    	}
    	io.writeIn(list);
    }
    
    public void jwriteData(){
        ArrayList<String> list = new ArrayList<String>();
    	for(CoursePO p:cList) {
            if(p.getModule().equals("通识")||p.getModule().equals("通修"))
    		list.add(p.toStoreString());
    	}
    	io.jwriteIn(list);
    }
    
    @Override/*添加课程记录*/
    public ResultMessage insert(CoursePO cpo) throws RemoteException {
        if(cList.add(cpo)){
             writeData();
            return ResultMessage.SUCCESS;
        }
        return ResultMessage.EXIST;
       
    }

    @Override/*修改课程记录：仅可修改教师、授课时间、课程大纲、教材、参考文献*/
    public ResultMessage update(CoursePO cpo) throws RemoteException {
        cList.remove(cpo);
    	cList.add(cpo);
        writeData();
        jwriteData();
        return ResultMessage.SUCCESS;
    }

    @Override/*删除课程记录*/
    public ResultMessage delete(String courseID) throws RemoteException {
        cList.remove(new CoursePO(courseID,0));
        writeData();
        return ResultMessage.SUCCESS;
    }

    @Override/*根据课程号查找某个课程*/
    public CoursePO find(String courseID) throws RemoteException {
        CoursePO c= new CoursePO(courseID,0);
        if(cList.contains(c)){
            return cList.floor(c);
        }
        
        return null;
    }
    
    @Override/*根据某一属性返回对应值的课程记录列表：module，institute*/
    public ArrayList<CoursePO> finds(String field,String value) throws RemoteException{
        
        ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
        if(field.equals("module")) {//根据模块属性查找记录
        	for(CoursePO c:cList) {
        		if(c.getModule().equals(value)) {
        			cpolist.add(c);
        		}
        	}
        }
        else if(field.equals("institute")) {//根据院系属性查找记录
           
        	for(CoursePO c:cList) {
        		if(c.getInstitute().equals(value)||value.equals("All")) {
        			cpolist.add(c);
        		}
        	}
        }
        
        else if(field.equals("teaName")){ //根据老师姓名查找老师所教授的课
            for(CoursePO c:cList) {
        		if(c.getTeaName().contains(value)) {
        			cpolist.add(c);
        		}
        	}
        }
         else if(field.equals("teaID")){ //根据老师ID查找老师所教授的课
            for(CoursePO c:cList) {
        		if(c.getTeaID().contains(value)) {
        			cpolist.add(c);
        		}
        	}
        }
        return cpolist;
    }
   
    /**
     * 返回学院所有的必修课（包括通修)
     * @param ins
     * @return 
     */
    public ArrayList<CoursePO> getInsLeanCour(String ins) throws RemoteException{
         ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
       
        	for(CoursePO c:cList) {
        		if((c.getInstitute().contains(ins)&&(!c.getModule().equals("通识"))) ||(c.getLearnIns().contains(ins)&&c.getModule().equals("通修"))) {
        			cpolist.add(c);
        		}
        	}
        return cpolist;
    }
    
    public ArrayList<CoursePO> getInsCreateCour(String depart) throws RemoteException{
         ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
       
        	for(CoursePO c:cList) {
        		if(c.getInstitute().contains(depart)&&(!c.getModule().equals("通修"))&&(!c.getModule().equals("通识"))) {
        			cpolist.add(c);
        		}
        	}
        return cpolist;
    }
    
    public ArrayList<CoursePO> getTeaAllCour(String teaID) throws RemoteException{
        ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
        ArrayList<String> list = io.readAll();
    	for(String s:list) {
    		CoursePO c = new CoursePO(s);
                if(c.getTeaID().contains(teaID)){
                    cpolist.add(c);
                }
    	}
        return cpolist;
    }

    public static void main(String arg[]) throws RemoteException{
        new CourseData().readData();
        System.out.print(1);
    }

    /**
     * 查看本院系所有的课程
     * @param depart
     * @return
     * @throws RemoteException 
     */
    @Override
    public ArrayList<CoursePO> getInsAllCour(String depart) throws RemoteException {
        ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
        ArrayList<String> list = io.readAll();
    	for(String s:list) {
    		CoursePO c = new CoursePO(s);
                if(c.getInstitute().contains(depart)){
                    cpolist.add(c);
                }
    	}
        return cpolist;
    }
    
    public String[] getAllTerms() throws RemoteException{
        return io.getAllTerms();
    }

    public String[] jgetAllTerms() throws RemoteException{
        return io.jgetAllTerms();
    }
    
    public ArrayList<CoursePO> jgetTermCourses() throws RemoteException{
          ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
       
        	for(CoursePO c:cList) {
        		if(c.getModule().equals("通识")||c.getModule().equals("通修")) {
        			cpolist.add(c);
        		}
        	}
        return cpolist;
    }
    
    public  ResultMessage jAddCourse(CoursePO p) throws RemoteException{
        if(cList.add(p)){
            jwriteData();
            return ResultMessage.SUCCESS;
        }
        return ResultMessage.EXIST;
    }
    
    public ResultMessage jupdateCourse(CoursePO p) throws RemoteException{
        cList.remove(p);
        cList.add(p);
        jwriteData();
        return ResultMessage.SUCCESS;
    }
    public CoursePO jAddCourses(ArrayList<CoursePO> pos) throws RemoteException{
         for(CoursePO p:pos){
         if(!cList.add(p)){
            return p;
         }
         }
        jwriteData();
         return null;
    }
    @Override
    public CoursePO addCourses(ArrayList<CoursePO> pos) throws RemoteException {
        for(CoursePO p:pos){
         if(!cList.add(p)){
            return p;
         }
         }
        writeData();
         return null;
    }

    @Override
    public void jcreateTerm(String newTerm) throws RemoteException {
        io.jcreateTerm(newTerm);
    }

    @Override
    public void createTerm(String newTerm) throws RemoteException {
        io.createTerm(newTerm);
    }

    @Override
    public ResultMessage jdelete(CoursePO p) throws RemoteException {
        cList.remove(p);
        jwriteData();
        return ResultMessage.SUCCESS;
    }

    /**
     * 为学生返回所有新学期通识课
     * @return
     * @throws RemoteException 
     */
    @Override
    public ArrayList<CoursePO> getAllSelectedCour() throws RemoteException {
          ArrayList<CoursePO> cpolist = new ArrayList<CoursePO>();
       
        	for(CoursePO c:cList) {
        		if(c.getModule().equals("通识")) {
        			cpolist.add(c);
        		}
        	}
        return cpolist;
    }

   
}
