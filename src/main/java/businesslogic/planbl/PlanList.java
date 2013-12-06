/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.planbl;

import dataservice.datafactory.DataFactory;
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
    private DataFactory dataFactory;
    private int sumOfCredit;

    public PlanList() {
        try {
            dataFactory = (DataFactory) Naming.lookup("courseDataFactory");
            System.out.println(dataFactory == null);
            pds = dataFactory.getPlanData();
        } catch (NotBoundException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*添加教学计划*/
    public void addPlan(Plan p) {
        try {
            pds.insert(p.toPO());
        } catch (RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*修改教学计划*/
    public void modifyPlan(Plan p) {
        try {
            pds.update(p.toPO());
        } catch (RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*删除教学计划*/
    public void deletePlan(String courseID, String institute) {
        try {
            pds.delete(courseID, institute);
        } catch (RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*查看教学计划*/
    public ArrayList<PlanVO> observePlan(String field, String value) {
        ArrayList<PlanVO> pv = new ArrayList<PlanVO>();
        try {
            ArrayList<PlanPO> pp = pds.finds(field, value);
            for (PlanPO p : pp) {
                pv.add(p.toVO());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pv;
    }

    /*查看某模块或者某院系教学计划总学分*/
    /*<Q>这里为什么要出现这样读不懂的。。。*/
    public int observeCredit(String field, String value) {
        int c = 0;
        try {
            for (PlanPO p : pds.finds(field, value)) {
                c = c + Integer.parseInt(p.getCredit());
            }
        } catch (RemoteException ex) {
            Logger.getLogger(PlanList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    /*getter 和 setter*/
    public int getSumOfCredit() {
        return sumOfCredit;
    }

    public void setSumOfCredit(int sumOfCredit) {
        this.sumOfCredit = sumOfCredit;
    }
}
