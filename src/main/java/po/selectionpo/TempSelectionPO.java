/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package po.selectionpo;

import java.io.Serializable;

/**
 *
 * @author sheyunfeng
 */
public class TempSelectionPO implements Serializable{
    private SelectionPO selection;
    private int grade;
    private int totalCredit;
    private int maxStuNum;

    public TempSelectionPO(SelectionPO selection, int grade, int totalCredit, int maxStuNum){
        this.selection = selection;
        this.grade = grade;
        this.totalCredit = totalCredit;
        this.maxStuNum = maxStuNum;
    }
    
    

    public String getCouseNum() {
        return selection.getCouseNum();
    }

    public String getStuID() {
        return selection.getStuID();
    }
    
    public int getGrade(){
        return grade;
    }
    
    public int getTotalCredit(){
        return totalCredit;
    }
    
    public int getMaxStuNum(){
        return maxStuNum;
    }
    
    public SelectionPO getSelectionPO(){
        return selection;
    }
}
