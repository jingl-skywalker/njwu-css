/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.staticpo;

/**
 *
 * @author zili chen
 */
public class StudentStaticPO {
    
    private String department;//院系
    private String term;//信息种类
    private String admitInfo;
    private String outInfo;//英文无能
    private String graduateInfo;
    private String dropInfo;
    
    public StudentStaticPO(String term,String department) {
        this.term = term;
        this.department = department;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAdmitInfo() {
        return admitInfo;
    }

    public void setAdmitInfo(String admitInfo) {
        this.admitInfo = admitInfo;
    }

    public String getOutInfo() {
        return outInfo;
    }

    public void setOutInfo(String outInfo) {
        this.outInfo = outInfo;
    }

    public String getGraduateInfo() {
        return graduateInfo;
    }

    public void setGraduateInfo(String graduateInfo) {
        this.graduateInfo = graduateInfo;
    }

    public String getDropInfo() {
        return dropInfo;
    }

    public void setDropInfo(String dropInfo) {
        this.dropInfo = dropInfo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
