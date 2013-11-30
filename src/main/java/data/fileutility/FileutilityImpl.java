/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.fileutility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.stream.FileImageOutputStream;
import sun.font.CreatedFontTracker;

/**
 *
 * @author Administrator
 */
public class FileutilityImpl implements FileUtility {

 String fileName;

    public FileutilityImpl() {
    }

    public FileutilityImpl(String fileName) {
        this.fileName = fileName;
    }

    private  BufferedReader createReader() {
        //FileReader fr = new FileReader(this.fileName);

        // FileReader fr=ne w FileReader
        // FileInputStream fr=new FileInputStream(new InputStreamReader(this.fileName,"UTF-8"));
        FileInputStream fs=null;
        BufferedReader bf = null;
        try {
            fs = new FileInputStream(this.fileName);
            InputStreamReader fr = new InputStreamReader(fs, "UTF-8");
            bf = new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bf;
    }

    private PrintWriter createPrintWriter() throws FileNotFoundException {
        FileOutputStream fout = new FileOutputStream(fileName);
        Writer writer = null;
        try {
            writer = new OutputStreamWriter(fout, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter pr = new PrintWriter(writer);
        // PrintWriter writer = new PrintWriter(fileName);
        return pr;
    }

    @Override
    public boolean append(String oneline) {
        try {
            BufferedReader bf = createReader();
            StringBuffer sbf = new StringBuffer();
            String s = null;
            while ((s = bf.readLine()) != null) {
                sbf.append(s);
                sbf.append("\r\n");
            }
            sbf.append(oneline);
            PrintWriter pw = createPrintWriter();
            pw.write(sbf.toString());
            pw.close();
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public boolean append(ArrayList<String> lines) {
        try {
            BufferedReader bf = createReader();
            StringBuffer sbf = new StringBuffer();
            String s = null;
            while ((s = bf.readLine()) != null) {
                sbf.append(s);
                sbf.append("\r\n");
            }
            for (String online : lines) {
                sbf.append(online);
                sbf.append("\r\n");
            }
            PrintWriter pw = createPrintWriter();
            pw.write(sbf.toString());
            pw.close();
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    @Override
    public boolean append(int field, String oneTerm) {
        return false;
    }

    @Override
    public String find(String ID) {
        return null;
    }

    @Override
    public String find(int field, String key) {


        return null;
    }

    /**
     *
     * @return all the content of a file
     */
    @Override
    public ArrayList<String> find() {
        ArrayList<String> result = new ArrayList<String>();
        try {
            BufferedReader fr = createReader();
            String s = null;
            while ((s = fr.readLine()) != null) {
                result.add(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public ArrayList<String> find(int[] fields, ArrayList<String> keys) {
        return null;
    }

    @Override
    public boolean clear() {
        try {
            PrintWriter pr = createPrintWriter();
            pr.write("");
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    @Override
    public String find(int lineNum) {
        String result = null;
        try {
            BufferedReader bf = createReader();
            int i = 1;
            while ((result = bf.readLine()) != null && i < lineNum) {
                i++;
            }
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    /**
     * public static void main(String[] args) { File file=new
     * File("src/main/resourcestest.txt"); try { file.createNewFile(); } catch
     * (IOException ex) {
     * Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null,
     * ex); } System.out.println("ok"); }*
     */
    public static void writeToFile(String file, String content) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),"UTF-8")));
            writer.print(content);
            writer.flush();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            writer.close();
        }
    }

    public static void appendToFile(String file, String content) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8")));
            writer.print(content);
            writer.flush();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            writer.close();
        }
    }

    @Override
    public ArrayList<String[]> getAllUser() {
        BufferedReader br = createReader();
        ArrayList<String[]> s = new ArrayList<String[]>(1000);
        String[] ins;
        String in = null;
        try {
            while ((in = br.readLine()) != null) {
                ins = in.split(":");
                s.add(ins);
            }
            return s;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     @Override
    public String[] getInfo(String id) {
	       BufferedReader bf = createReader();
        try {
            String info = null;
            String[] infos;
            while ((info = bf.readLine())!=null) {
            infos = info.split(":");
                if (infos[0].equals(id)){
                    return infos;
                }
            }
            return null;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 /*
  * 获取文件所有内容
 */
    @Override
    public String getAll() {
		BufferedReader bf = createReader();
        StringBuilder info = new StringBuilder();
        String s=null;
        try {
            while((s=bf.readLine())!=null){
                info.append(s);
                info.append("\r\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(info==null)
            return null;
        return info.toString();
    }
}
