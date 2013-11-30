/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.uservo;

import po.userpo.UserInfoPO;


/**
 *
 * @author Administrator
 */
public class UserInfoVO {

    private String ID;
    private String psw;
    private String name;
    private String type;
    private String depart;    //院系
    private String grade;     //年纪
    private String yearIn;   //入学年份
    private String sex;
    private String identification; //身份证
    
    public UserInfoVO(String ID,String psw,String name,String type,String depart,String grade,
            String yearIn,String sex,String identification){
        this.ID = ID;
        this.psw = psw;
        this.name = name;
        this.depart = depart;
        this.grade = grade;
        this.yearIn = yearIn;
        this.identification = identification;
        this.sex = sex;
        this.type = type;
    }

    public String getPsw() {
        return psw;
    }

    public UserInfoVO(UserInfoPO po) {
        ID = po.getID();
        psw = po.getPsw();
        name = po.getName();
        depart = po.getDepart();
        grade = po.getGrade();
        yearIn = po.getYearIn();
        sex = po.getSex();
        type = po.getType();
        identification = po.getIdentification();
    }
    
    public String[] getTableHeader(){
         String[] a = {"ID","name","type","depart","sex","identification"};
         return a;
    }
    
    public String[] getViewInfor(){
        String[] info = new String[7];
        info[0] = ID;
        info[1] = yearIn;
        info[2] = type;
        info[3] = depart;
        info[4] = name;
        info[5] = sex;
        info[6] = identification;
        return info;
    }
    public static String[] getViewHeader(){
        String[] info={"ID","入学年份","类型","院系","姓名","性别","身份证号"};
        return info;
    }
    
    public String getGrade() {
        return grade;
    }

    public String[] getModifyInfo(){
        String[] info = new String[4];
        info[0] = ID;
        info[1] = yearIn;
        info[2] = type;
        info[3] = depart;
        return info;
    }
    
     public static String[] getModifyHeader(){
        String[] info={"ID","入学年份","类型","院系"};
        return info;
    }
    public String getYearIn() {
        return yearIn;
    }

    public String getID() {
        return ID;
    }

    public String getDepart() {
        return depart;
    }

    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getType() {
        return type;
    }
     public String[] getArri(){
         String [] arris = {ID,psw,name,type,depart,grade,yearIn,sex,identification};
         return arris;
     }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearIn(String yearIn) {
        this.yearIn = yearIn;
    }
     
     
}
