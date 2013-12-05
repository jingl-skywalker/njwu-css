/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.fileutility;

import enumeration.ResultMessage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
import po.coursepo.CoursePO;
import po.planpo.PlanPO;

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
    /**
     * 
     * @return  bufferedReader using UTF-8
     */
    private BufferedReader createReader() {
        //FileReader fr = new FileReader(this.fileName);

        // FileReader fr=ne w FileReader
        // FileInputStream fr=new FileInputStream(new InputStreamReader(this.fileName,"UTF-8"));
        FileInputStream fs = null;
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
    /**
     * 
     * @return PrintWriter to file using UTF-8
     * @throws FileNotFoundException 
     */

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
        System.out.println("@Fileurilityimpl.java" + content);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8")));
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
            while ((info = bf.readLine()) != null) {
                infos = info.split(":");
                if (infos[0].equals(id)) {
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
        String s = null;
        try {
            while ((s = bf.readLine()) != null) {
                info.append(s);
                info.append("\r\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (info == null) {
            return null;
        }
        return info.toString();
    }

    @Override
    public ResultMessage changeUser(String id, String info) {
        BufferedReader br = createReader();
        StringBuilder content = new StringBuilder();
        String rin = null;
        String[] rins = null;
        try {
            while ((rin = br.readLine()) != null) {
                rins = rin.split(":");
                if (rins[0].equals(id)) {
                    content.append(info);
                    content.append("\r\n");
                    continue;
                }
                content.append(rin);
                content.append("\r\n");


            }
            br.close();
            writeToFile(fileName, content.toString());
            return ResultMessage.SUCCESS;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }

    public ArrayList<CoursePO> readCourseInfo() {
        ArrayList<CoursePO> clist = new ArrayList<CoursePO>();
        try {
            BufferedReader bf = createReader();
            CoursePO cpo = new CoursePO();
            String s = null;
            while ((s = bf.readLine()) != null) {
                String list[] = s.split(";");
                cpo.setCourseID(list[0]);
                cpo.setCourseName(list[1]);
                cpo.setModule(list[2]);
                cpo.setProperty(list[3]);
                cpo.setType(list[4]);
                cpo.setOrder(list[5].charAt(0));
                cpo.setTerm(list[6]);
                cpo.setCredit(Integer.parseInt(list[7]));
                cpo.setHour(Integer.parseInt(list[8]));
                cpo.setTeaName(list[9]);
                cpo.setTime(list[10]);
                cpo.setInstitute(list[11]);
                cpo.setLearnIns(list[12]);
                cpo.setSummary(list[13]);
                cpo.setMaterial(list[14]);
                cpo.setReference(list[15]);
                clist.add(cpo);
            }
            bf.close();
            return clist;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return clist;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return clist;
        }
    }

    public ArrayList<PlanPO> readPlanInfo() {
        ArrayList<PlanPO> plist = new ArrayList<PlanPO>();
        try {
            BufferedReader bf = createReader();
            PlanPO ppo = new PlanPO();
            String s = null;
            while ((s = bf.readLine()) != null) {
                String list[] = s.split(";");
                ppo.setInstitute(list[0]);
                ppo.setTerm(list[1]);
                ppo.setModule(list[2]);
                ppo.setProperty(list[3]);
                ppo.setType(list[4]);
                ppo.setCourseID(list[5]);
                ppo.setCourseName(list[6]);
                ppo.setCredit(Integer.parseInt(list[7]));
                ppo.setHour(Integer.parseInt(list[8]));
            }
            bf.close();
            return plist;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return plist;
        } catch (IOException ex) {
            Logger.getLogger(FileutilityImpl.class.getName()).log(Level.SEVERE, null, ex);
            return plist;
        }
    }
}
