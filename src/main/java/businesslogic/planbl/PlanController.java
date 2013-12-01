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
    
    @Override
    public void add(PlanVO pvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modify(PlanVO pvo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String institute,String courseID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PlanVO> observePlan(String institute, String module) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int observeCredit(String institute, String module) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
