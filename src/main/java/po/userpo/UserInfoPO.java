/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.userpo;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class UserInfoPO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String ID;
    private String name;
    private String psw;
    private String type;
    private String depart;
    private String grade;     //年纪or级别
    private String yearIn;   //入学年份
    private String sex;
    private String identification;

    public UserInfoPO(String ID, String psw, String name, String type,
            String depart, String grade, String yearIn, String sex,
            String identification) {
        this.ID = ID;
        this.name = name;
        this.psw = psw;
        this.type = type;
        this.depart = depart;
        this.grade = grade;
        this.yearIn = yearIn;
        this.sex = sex;
        this.identification = identification;
    }

    public UserInfoPO(String[] infos) {
        this(infos[0], infos[1], infos[2], infos[3], infos[4], infos[5], infos[6], infos[7],
                infos[8]);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getYearIn() {
        return yearIn;
    }

    public void setYearIn(String yearIn) {
        this.yearIn = yearIn;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ID + ":" + psw + ":" + name + ":" + type + ":" + depart + ":" + grade + ":" + yearIn + ":" + sex + ":" + identification;
    }
}
