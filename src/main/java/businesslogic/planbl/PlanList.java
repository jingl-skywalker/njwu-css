/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.planbl;

import dataservice.datafactory.PlanDataFactory;
import dataservice.plandataservice.PlanDataService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import po.planpo.PlanPO;
import vo.planvo.PlanVO;

/**
 *
 * @author zili chen
 */
public class PlanList {/*教学计划列表类：对计划的具体操作、链接数据层*/
    
    private PlanDataService pds;
    private PlanDataFactory pdf;
    private Plan plan;
    private ArrayList<Plan> pList;
    
    public PlanList() {
        pList  = new ArrayList<Plan>();
        try{
            pdf = (PlanDataFactory)Naming.lookup("courseDataFactory");
            System.out.println(pdf == null);
            pds = pdf.getPlanData();
        }catch(NotBoundException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE,null,ex);
        }catch (MalformedURLException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*添加教学计划*/
    public void addPlan(Plan p) {
        for(int i = 0;i<pList.size();i++) {//检查有无相同课程号
             if(pList.get(i).getInstitute().equals(p.getInstitute())) {
                 System.out.println("该院教学计划已存在");
             }
             else{
                 pList.add(p);
             }
         }
    }
    
    /*修改教学计划*/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    public void modifyPlan(Plan p) {
        for(int i = 0;i<pList.size();i++) {//删除原计划
             if(pList.get(i).getInstitute() .equals(p.getInstitute())) {
                 pList.remove(i);
             }
         }
         pList.add(p);
    }
    
    /*删除教学计划*/
    public void deletePlan(String institute,String courseID) {
        try{
            pds.delete(institute,courseID);
        }catch(RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    /*查看教学计划*/
    public ArrayList<PlanVO> observePlan(String institute, String module) {
        ArrayList<PlanVO> pv = new ArrayList<PlanVO>();
        try{
            ArrayList<PlanPO> pp = pds.finds(institute, module);
            for(int i=0;i<pp.size();i++) {
                pv.add(pp.get(i).toVO());
            }
        }catch(RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE,null,ex);
        }
        return pv;
    }
    
    /*查看某模块教学计划总学分*/
    public int observeCredit(String institute, String module) {
        int c = 0;
        try{
           for(PlanPO p:pds.finds(institute,module)) {
               c = c+p.getCredit();
           }
        }catch(RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE,null,ex);
        }
        return c;
    }
}
