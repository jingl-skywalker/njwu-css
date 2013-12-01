/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.fileutility;

import enumeration.ResultMessage;
import java.util.ArrayList;
import po.coursepo.CoursePO;
import po.planpo.PlanPO;

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

    /**
     * 修改某一以用户的信息
     *
     * @param info 保存一个用户的所有信息
     * @param id 用户的ID
     * @return 保存成功返回ResultMessage。success 错误时返回ResultMessage。fail
     */
    public ResultMessage changeUser(String id, String info);

    public ArrayList<CoursePO> readCourseInfo();

    public ArrayList<PlanPO> readPlanInfo();
}
