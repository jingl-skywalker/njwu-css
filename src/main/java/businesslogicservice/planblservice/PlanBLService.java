/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.planblservice;

import java.util.ArrayList;
import vo.planvo.PlanVO;

/**
 *
 * @author Administrator
 */
public interface PlanBLService {
    
    //添加课程
    public void add(PlanVO pvo);
    
    //修改课程
    public void modify(PlanVO pvo);
    
    //删除课程
    public void delete(String courseID,String institute);
    
    //查看教学计划
    public ArrayList<PlanVO> observePlan(String field,String value);
    
    //查看某模块或者某院系的总学分
    public int observeCredit(String field,String value);
    
}
