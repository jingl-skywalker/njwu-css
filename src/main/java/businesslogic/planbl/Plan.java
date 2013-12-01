/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.planbl;

import java.util.ArrayList;
import vo.planvo.PlanVO;

/**
 *
 * @author zili chen
 */
public class Plan {/*教学计划类:具体的教学计划对象*/
    
    private String institute;//院系
    private String term;//学期：2012-1,2012-2
    private int creditM1;//模块1的总学分
    private int creditM2;//模块2的总学分
    private int creditM3;//模块3的总学分
    private int creditM4;//模块4的总学分
    private ArrayList<PlanVO> planList;//具体计划信息
    
    public Plan(String ins,String term) {
        institute = ins;
        this.term = term;
        planList = new ArrayList<PlanVO>();
    }
    
    /*添加教学计划信息*/
    public void add(PlanVO pvo) {
        planList.add(pvo);
    }
    
    /*各模块学分统计*/
    public void statics() {
        int credit =  0;
        creditM1 = 0;
        creditM2 = 0;
        creditM3 = 0;
        creditM4 = 0;
        for(PlanVO pvo:planList) {
            credit = pvo.getCredit();
            if(pvo.getModule().equals("通识通修")) {
                creditM1 = creditM1 +credit;
            }else if(pvo.getModule().equals("学科专业")) {
                creditM2 = creditM2 +credit;
            }else if(pvo.getModule().equals("开放选修")) {
                creditM3 = creditM3 +credit;
            }else if(pvo.getModule().equals("毕业论文/设计")) {
                creditM3 = creditM3 +credit;
            }
        }
    }
    
    /*getter 和 setter*/
    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public ArrayList<PlanVO> getPlanList() {
        return planList;
    }

    public void setPlanList(ArrayList<PlanVO> planList) {
        this.planList = planList;
    }

    public int getCreditM1() {
        return creditM1;
    }

    public void setCreditM1(int creditM1) {
        this.creditM1 = creditM1;
    }

    public int getCreditM2() {
        return creditM2;
    }

    public void setCreditM2(int creditM2) {
        this.creditM2 = creditM2;
    }

    public int getCreditM3() {
        return creditM3;
    }

    public void setCreditM3(int creditM3) {
        this.creditM3 = creditM3;
    }

    public int getCreditM4() {
        return creditM4;
    }

    public void setCreditM4(int creditM4) {
        this.creditM4 = creditM4;
    }
    
}
