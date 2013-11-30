/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.fileutility;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface FileUtility {

    public boolean append(String oneline);

    public boolean append(ArrayList<String> lines);

    public boolean append(int field, String oneTerm);

    public String find(int lineNum);

    public String find(String ID);

    public String find(int field, String key);

    public ArrayList<String> find();

    public ArrayList<String> find(int[] fields, ArrayList<String> keys);

    public boolean clear();

    public String[] getInfo(String id);    //获取每一行，让后解析

    /**
     * 获取文件所有内容
     */
    public String getAll();

    /**
     * 返回所有用户信息
     *
     * @return 如果无用户则返回null
     */
    public ArrayList<String[]> getAllUser();
}
