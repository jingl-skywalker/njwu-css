/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.planblservice;

import java.util.ArrayList;
import vo.coursevo.CourseVO;
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
    public void delete(String institete,String courseID);
    
    //查看教学计划
    public ArrayList<PlanVO> observePlan(String institute,String module);
    
    //查看某模块的总学分
    public int observeCredit(String institute,String module);
    
}
