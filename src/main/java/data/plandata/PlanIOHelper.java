package data.plandata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PlanIOHelper {
	
	File path = new File("src/main/resources/plan.txt");
	
	public void writeIn(ArrayList<String> list) {
        try{
            FileWriter file = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(file);
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
            FileReader file = new FileReader(path);
            BufferedReader br = new BufferedReader(file);
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
