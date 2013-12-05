/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.coursedata;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author zili chen
 */
public class CourseIOHelper {/*CourseData的辅助类--已测试*/
    
    File path = new File("src/main/resources/course.txt");
    
    public void writeIn(ArrayList<String> list) {
        try{
            FileOutputStream file  = new FileOutputStream(path);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(file,"UTF-8"));
            for(String s:list) {
                bw.write(s+"\r\n");
            }
            bw.close();
            file.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<String> readOut() {
        ArrayList<String> list = new ArrayList<String>();
        try{
            FileInputStream file  = new FileInputStream(path);
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
        return list;
    }
}
