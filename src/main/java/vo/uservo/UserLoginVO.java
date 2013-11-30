/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.uservo;

/**
 *
 * @author Administrator
 */
public class UserLoginVO {
    private String ID;
    private String psw;

    public UserLoginVO(String ID, String psw) {
        this.ID = ID;
        this.psw = psw;
    }

    public String getID() {
        return ID;
    }

    public String getPsw() {
        return psw;
    }

}
