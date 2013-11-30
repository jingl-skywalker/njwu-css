package vo.staticvo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zili chen
 */
public class StudentStaticVO {
    
    String department;//院系
    String term;
    String admitInfo;
    String outInfo;//英文无能
    String graduateInfo;
    String dropInfo;
    
    public StudentStaticVO(String term,String department) {
        this.term = term;
        this.department = department;
    }
    
   public StudentStaticVO() {
       
   }
    public String getTerm() {
        return term;
    }

    public String getAdmitInfo() {
        return admitInfo;
    }

    public String getOutInfo() {
        return outInfo;
    }

    public String getGraduateInfo() {
        return graduateInfo;
    }

    public String getDropInfo() {
        return dropInfo;
    }

    public String getDepartment() {
        return department;
    }
    
}
