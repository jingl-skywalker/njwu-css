/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.planbl;

import businesslogicservice.planblservice.PlanBLService;

import java.util.ArrayList;

import vo.planvo.PlanVO;

/**
 *
 * @author zili chen
 */
public class PlanController implements PlanBLService {

    private PlanList planList;
    private Plan plan;
    
    @Override
    public void add(PlanVO pvo) {
    	plan = new Plan(pvo);
    	planList.addPlan(plan);
    }

    @Override
    public void modify(PlanVO pvo) {
    	plan = new Plan(pvo);
    	planList.modifyPlan(plan);
    }

    @Override
    public void delete(String courseID,String institute) {
        planList.deletePlan(courseID, institute);
    }

    @Override
    public ArrayList<PlanVO> observePlan(String field, String value) {
       return  planList.observePlan(field,value);
    }

    @Override
    public int observeCredit(String field,String value) {
        return planList.observeCredit(field,value);
    }
    
}
