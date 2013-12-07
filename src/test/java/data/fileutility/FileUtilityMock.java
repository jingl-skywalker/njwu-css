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
public class FileUtilityMock implements FileUtility {

    public FileUtilityMock() {
        System.out.println("constructor of fileutilitymock");
    }
    

    @Override
    public boolean append(String oneline) {
        return true;
    }

    @Override
    public boolean append(ArrayList<String> lines) {
        return true;
    }

    @Override
    public boolean append(int field, String oneTerm) {
        return true;
    }

    @Override
    public String find(int lineNum) {
        return "returning of   find(int lineNum)";
    }

    @Override
    public String find(String ID) {
        return "returning of find by ID";
    }

    @Override
    public String find(int field, String key) {
        return "returning of find by int,String";
    }

    @Override
    public ArrayList<String> find() {
        return new ArrayList<String>();
    }

    @Override
    public ArrayList<String> find(int[] fields, ArrayList<String> keys) {
        return new ArrayList<String>();
    }

    @Override
    public boolean clear() {
        return true;
    }

    @Override
    public String[] getInfo(String id) {
        String[] strings = "helloworld-id".split("-");
        return strings;
    }

    @Override
    public String getAll() {
        return "getALL";
    }

    @Override
    public ArrayList<String[]> getAllUser() {
        return new ArrayList<String[]>();
    }

    @Override
    public ResultMessage changeUser(String id, String info) {
        return ResultMessage.SUCCESS;

    }

    @Override
    public ArrayList<CoursePO> readCourseInfo() {
        return new ArrayList<CoursePO>();
    }

    @Override
    public ArrayList<PlanPO> readPlanInfo() {
        return new ArrayList<PlanPO>();
    }
}
