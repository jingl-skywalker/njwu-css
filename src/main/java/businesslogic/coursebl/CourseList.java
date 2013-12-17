/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursebl;

import dataservice.coursedataservice.CourseDataService;
import dataservice.datafactory.DataFactory;
import enumeration.ResultMessage;
import java.io.*;

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
     ArrayList<CourseVO> cv = new ArrayList<CourseVO>();
    
    public CourseList() {//将course里面的数据全部读到cList中
        try{
            dataFactory = (DataFactory)Naming.lookup("dataFactory");
            System.out.println(dataFactory == null);
            cds = dataFactory.getCourseData();
        }catch(NotBoundException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE,null,ex);
        }catch (MalformedURLException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public CourseList(String term){
         try{
            dataFactory = (DataFactory)Naming.lookup("dataFactory");
            System.out.println(dataFactory == null);
            cds = dataFactory.getCourseData(term);
        }catch(NotBoundException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE,null,ex);
        }catch (MalformedURLException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*添加课程*/
    public ResultMessage addCourse(CourseVO c) {
    	try{
          //  System.out.println(c.toStoreString());
            ResultMessage r = cds.insert(new CoursePO(c.toStoreString()));
           if(r==ResultMessage.SUCCESS){
               cv.add(c);
           }
           return r;
    	}catch(RemoteException ex) {
    		Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
    	}
        
        return ResultMessage.FAIL;
    }
    
    /*修改课程信息：仅可修改教师、授课时间、课程大纲、教材、参考文献*/
     public ResultMessage modifyCourse(CourseVO c) {
         try {
        	return  cds.update(c.toPO());
         }catch(RemoteException ex) {
     		Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
     	}
         return ResultMessage.FAIL;
     }
     
     /*查看课程列表*/
     public ArrayList<CourseVO> observeList(String field,String value) {
    	 try {
        	 ArrayList<CoursePO> cp = cds.finds(field,value);
        	 for(CoursePO c:cp) {
        		 cv.add(c.toVO());
        	 }
         }catch(RemoteException ex) {
     		Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
     	}
         return cv;
     }
     
     /**
      *根据courseID货期一部分查找符合的课程
      * @param courseID
      * @return 
      */
     public ArrayList<CourseVO> findCourseID(String courseID){
      ArrayList<CourseVO> tar=  new ArrayList<CourseVO>();
       if(courseID.equals("")||courseID==null){
          return cv;
      }
        for(CourseVO v:cv){
            if(v.getCourseID().contains(courseID)){
                 tar.add(v);
                
            }
        }  
        return tar;
     }
     
     /**
      * 根据courseName货期一部分查找符合的课程
      * @param courseName
      * @return 
      */
      public ArrayList<CourseVO> findCourseName(String courseName){
      ArrayList<CourseVO> tar=  new ArrayList<CourseVO>();
      if(courseName.equals("")||courseName==null){
          return cv;
      }
        for(CourseVO v:cv){
            if(v.getCourseName().contains(courseName)){
                 tar.add(v);
                 
            }
        }  
        return tar;
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
    public ResultMessage delete(String courseID) {
        try{
            return cds.delete(courseID);
        }catch(RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE,null,ex);
        }
        return ResultMessage.FAIL;
    }

    ArrayList<CourseVO> findTeaAllCour(String teaID) {
        try {
            ArrayList<CoursePO> pos = cds.getTeaAllCour(teaID);
            for(CoursePO p:pos){
                 
                cv.add(new CourseVO(p));
            }
           
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
         return cv;
    }

    /**
     * 查看本院系所有的课程
     * @param depart
     * @return 
     */
    ArrayList<CourseVO> findInsAllCour(String depart) {
         try {
            ArrayList<CoursePO> pos = cds.getInsAllCour(depart);
            for(CoursePO p:pos){
               
                cv.add(new CourseVO(p));
            }
           
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
         return cv;
    }

     public ArrayList<CourseVO> observeInsCreateCour(String depart){
         try {
            ArrayList<CoursePO> pos = cds.getInsCreateCour(depart);
            for(CoursePO p:pos){
               
                cv.add(new CourseVO(p));
            }
           
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
         return cv;

     }
    ArrayList<CourseVO> observeInsLeanCour(String depart) {
        try {
            ArrayList<CoursePO> pos = cds.getInsLeanCour(depart);
            for(CoursePO p:pos){
               
                cv.add(new CourseVO(p));
            }
           
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
         return cv;

    }

    /**
     * 返回所修的模块课程
     * @param modual
     * @return 
     */
    ArrayList<CourseVO> findModualCour(String modual) {
         ArrayList<CourseVO> tar=  new ArrayList<CourseVO>();
        for(CourseVO v:cv){
            if(v.getModule().equals(modual)){
                tar.add(v);
            }
        }
        return tar;
    }
/**
 * 返回所有的学期数或null
 * @return 
 */
    String[] getAllTerms(){
        try {
            return cds.getAllTerms();
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    CourseVO addCourses(ArrayList<CourseVO> vos) throws RemoteException {
       ArrayList<CoursePO> cp = new ArrayList<CoursePO>();
        for(CourseVO v:vos){
           cp.add(new CoursePO(v.toStoreString()));
       }
            CoursePO p=cds.addCourses(cp);
            if(p==null){
                return null;
            }
            else{
                return new CourseVO(p);
            }
    }

    CourseVO addCourses(String file) throws RemoteException {
        ArrayList<CoursePO> cp = new ArrayList<CoursePO>();
        try {
            BufferedReader br= new BufferedReader(new FileReader(file));
            String s;
            while((s=br.readLine())!=null){
                cp.add(new CoursePO(s));
            }
        } catch (IOException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
                    CoursePO p=cds.addCourses(cp);
            if(p==null){
                return null;
            }
            else{
                return new CourseVO(p);
            }
    }

    /**
     * 取得教务员发布的所有的课
     * @param term
     * @return 
     */
    ArrayList<CourseVO> jobserveAllCour() {
        try {
            ArrayList<CoursePO> cp = new ArrayList<CoursePO>();
           cp = cds.jgetTermCourses();
             for(CoursePO p:cp){
               
                cv.add(new CourseVO(p));
            }
           
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cv;
    }

    void jcreateTerm(String newTerm) {
        try {
            cds.jcreateTerm(newTerm);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String[] jgetAllTerms() {
        try {
            return cds.jgetAllTerms();
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new String[0];
    }

    ResultMessage jupdateCourse(CourseVO v) {
        CoursePO p = new CoursePO(v.toStoreString());
        try {
            return cds.jupdateCourse(p);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }

    ResultMessage jcreateCourse(CourseVO course) {
        CoursePO p = new CoursePO(course.toStoreString());
        try {
            return cds.jAddCourse(p);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }

    ResultMessage jdelete(CourseVO v) {
        CoursePO p = new CoursePO(v.toStoreString());
        try {
            return cds.jdelete(p);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }

    void createTerm(String newTerm) {
        try {
            cds.createTerm(newTerm);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    CourseVO jaddCourses(ArrayList<CourseVO> vos) {
         ArrayList<CoursePO> cp = new ArrayList<CoursePO>();
        for(CourseVO v:vos){
           cp.add(new CoursePO(v.toStoreString()));
       }
            CoursePO p=null;
        try {
            p = cds.jAddCourses(cp);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(p==null){
                return null;
            }
            else{
                return new CourseVO(p);
            }
    }

    CourseVO jaddCourses(String text) {
        ArrayList<CoursePO> cp = new ArrayList<CoursePO>();
        try {
            BufferedReader br= new BufferedReader(new FileReader(text));
            String s;
            while((s=br.readLine())!=null){
                cp.add(new CoursePO(s));
            }
        } catch (IOException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
                    CoursePO p=null;
        try {
            p = cds.jAddCourses(cp);
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(p==null){
                return null;
            }
            else{
                return new CourseVO(p);
            }
    }

    /**
     * 为学生返回新学期所有的选修课
     * @return 
     */
    ArrayList<CourseVO> getAllSelectedCour() {
       try {
            ArrayList<CoursePO> cp = new ArrayList<CoursePO>();
           cp = cds.getAllSelectedCour();
             for(CoursePO p:cp){
               
                cv.add(new CourseVO(p));
            }
           
        } catch (RemoteException ex) {
            Logger.getLogger(CourseList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cv;
    }
    
   
}
