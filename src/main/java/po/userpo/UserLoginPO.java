/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.userpo;

/**
 *
 * @author Administrator
 */
public class UserLoginPO {
    private String ID;
    private String psw;

    public UserLoginPO(String ID, String psw) {
        this.ID = ID;
        this.psw = psw;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    
}
