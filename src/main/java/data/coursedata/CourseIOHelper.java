/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.coursedata;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zili chen
 */
public class CourseIOHelper {/*CourseData的辅助类--已测试*/
    
    File path = new File("src/main/resources/course");
    File jpath = new File("src/main/resources/jcourse");
File file;
File jfile;

    public CourseIOHelper() {
        String[] s = path.list();
        TreeSet<String> name = new TreeSet<String>();
        for(String ss:s){
            name.add(ss);
        }
         file = new File(path,name.last());
         
         s = jpath.list();
        name.clear();
        for(String ss:s){
            name.add(ss);
        }
        jfile = new File(jpath,name.last());
    }

    public CourseIOHelper(String name) {
        file = new File(path,name+"-"+"course.txt");
        jfile = new File(jpath,name+"-"+"course.txt");
    }
    
    public ArrayList<String> readAll(){
        //读院系的的课程
          ArrayList<String> list = new ArrayList<String>();
        String files[] =path.list();
        for(String s:files){
             
         try{
            FileInputStream file  = new FileInputStream(path+"/"+s);
            BufferedReader br = new BufferedReader(new InputStreamReader(file,"UTF-8"));
            String line = null;
            while((line = br.readLine())!=null) {
                list.add(line);
            }
            br.close();
            file.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        }
        //读教务处的
        files =jpath.list();
        for(String s:files){
             
         try{
            FileInputStream file  = new FileInputStream(jpath+"/"+s);
            BufferedReader br = new BufferedReader(new InputStreamReader(file,"UTF-8"));
            String line = null;
            while((line = br.readLine())!=null) {
                list.add(line);
            }
            br.close();
            file.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        }
        return list;
    }
    
    public ArrayList<String> wreadAll(){
         ArrayList<String> list = new ArrayList<String>();
        String files[] =path.list();
        for(String s:files){
             
         try{
            FileInputStream file  = new FileInputStream(path+"/"+s);
            BufferedReader br = new BufferedReader(new InputStreamReader(file,"UTF-8"));
            String line = null;
            while((line = br.readLine())!=null) {
                list.add(line);
            }
            br.close();
            file.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        }
        return list;
    }
    
     public ArrayList<String> jreadAll(){
         ArrayList<String> list = new ArrayList<String>();
        String files[] =path.list();
        for(String s:files){
             
         try{
            FileInputStream file  = new FileInputStream(path+"/"+s);
            BufferedReader br = new BufferedReader(new InputStreamReader(file,"UTF-8"));
            String line = null;
            while((line = br.readLine())!=null) {
                list.add(line);
            }
            br.close();
            file.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        }
        return list;
    }
     
    public void writeIn(ArrayList<String> list) {
        try{
            FileOutputStream file1 = new FileOutputStream(file);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(file1,"UTF-8"));
            for(String s:list) {
                bw.write(s+"\r\n");
            }
            bw.close();
            file1.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
     void jwriteIn(ArrayList<String> list) {
        try{
            FileOutputStream file1 = new FileOutputStream(jfile);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(file1,"UTF-8"));
            for(String s:list) {
                bw.write(s+"\r\n");
            }
            bw.close();
            file1.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }
     
    public ArrayList<String> readOut() {
        ArrayList<String> list = new ArrayList<String>();
        //读院教务员的
        try{
            FileInputStream file1  = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(file1,"UTF-8"));
            String line = null;
            while((line = br.readLine())!=null) {
                list.add(line);
            }
            br.close();
            //file1.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        
        //读教务处的
         try{
            FileInputStream file1  = new FileInputStream(jfile);
            BufferedReader br = new BufferedReader(new InputStreamReader(file1,"UTF-8"));
            String line = null;
            while((line = br.readLine())!=null) {
                list.add(line);
            }
            br.close();
           // file1.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
        return list;
    }
     String[] getAllTerms(){
         String[] s = path.list();
         for(int i=0;i<s.length;i++){
             String[] ts = s[i].split("-");
             s[i] = ts[0]+"-"+ts[1];
         }
         return s;
     }
     String[] jgetAllTerms(){
          String[] s = jpath.list();
         for(int i=0;i<s.length;i++){
             String[] ts = s[i].split("-");
             s[i] = ts[0]+"-"+ts[1];
         }
         return s;
     }
   
     /**
      * 创建新学期文件
      */
     void createTerm(String newTerm){
        try {
            File f = new File(path,newTerm+"-course.txt");
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(CourseIOHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
      void jcreateTerm(String newTerm){
        try {
            File f = new File(jpath,newTerm+"-course.txt");
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(CourseIOHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
