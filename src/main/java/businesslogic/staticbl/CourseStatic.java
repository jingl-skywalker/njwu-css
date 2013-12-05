/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

/**
 *
 * @author 天
 */
public class CourseStatic {
    private int journalNum=0;
    private int journalCredit=0;
    private int profNum=0;
    private int profCredit=0;
    private int selectNum=0;
    private int selectCredit=0;
    private int gradNum=0;
    private int gradCredit=0;

    public int getGradCredit() {
        return gradCredit;
    }

    public void setGradCredit(int gradCredit) {
        this.gradCredit = gradCredit;
    }

    public int getGradNum() {
        return gradNum;
    }

    public void setGradNum(int gradNum) {
        this.gradNum = gradNum;
    }

    public int getJournalCredit() {
        return journalCredit;
    }

    public void setJournalCredit(int journalCredit) {
        this.journalCredit = journalCredit;
    }

    public int getJournalNum() {
        return journalNum;
    }

    public void setJournalNum(int journalNum) {
        this.journalNum = journalNum;
    }

    public int getProfCredit() {
        return profCredit;
    }

    public void setProfCredit(int profCredit) {
        this.profCredit = profCredit;
    }

    public int getProfNum() {
        return profNum;
    }

    public void setProfNum(int profNum) {
        this.profNum = profNum;
    }

    public int getSelectCredit() {
        return selectCredit;
    }

    public void setSelectCredit(int selectCredit) {
        this.selectCredit = selectCredit;
    }

    public int getSelectNum() {
        return selectNum;
    }

    public void setSelectNum(int selectNum) {
        this.selectNum = selectNum;
    }
    
    public void addJournal(int credit){
        journalNum++;
        journalCredit+=credit;
    }
    
        public void addProf(int credit){
        profNum++;
        profCredit+=credit;
    }
    public void addSelect(int credit){
        selectNum++;
        selectCredit+=credit;
    }
    public void addGrad(int credit){
        gradNum++;
        gradCredit +=credit;
    }
}
