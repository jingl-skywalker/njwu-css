/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

/**
 *
 * @author 天
 */
public class TeacherStatic {
    private int young=0;
    private int youngOld=0;
    private int old=0;

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getYoung() {
        return young;
    }

    public void setYoung(int young) {
        this.young = young;
    }

    public int getYoungOld() {
        return youngOld;
    }

    public void setYoungOld(int youngOld) {
        this.youngOld = youngOld;
    }
    public void addYoung(){
        young++;
    }
    public void addYoungOld(){
        youngOld++;
    }
     public void addOld(){
        old++;
    }
}
