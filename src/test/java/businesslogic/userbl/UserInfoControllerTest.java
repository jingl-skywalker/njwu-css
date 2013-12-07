/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import enumeration.ResultMessage;
import java.util.ArrayList;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import junit.framework.TestCase;
import vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public class UserInfoControllerTest extends TestCase {

    UserInfoController instance;

    public UserInfoControllerTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance = new UserInfoController("localhost", 1099);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of addUser method, of class UserInfoController.
     */
    public void testAddUser() {
        System.out.println("addUser");
        String file = "";
        ArrayList expResult = null;
       // ArrayList expresult = instance.addUser(file);
        assertTrue(expResult==null);
    }

    /**
     * Test of changeUserInfo method, of class UserInfoController.
     */
    public void testChangeUserInfo_0args() {
        System.out.println("changeUserInfo");
        ResultMessage expResult = null;
        //ResultMessage result = instance.changeUserInfo();
    }

    /**
     * Test of deletUser method, of class UserInfoController.
     */
    public void testDeletUser() {
        System.out.println("deletUser");
        ArrayList<UserInfoVO> deleteVos = null;
        ResultMessage expResult = null;
       // ResultMessage result = instance.deletUser(deleteVos);
    }

    /**
     * Test of delete method, of class UserInfoController.
     */
    public void testDelete() {
        System.out.println("delete");
        UserInfoVO delete = null;
        ResultMessage expResult = null;
       // ResultMessage result = instance.delete(delete);
    }

    /**
     * Test of getUser method, of class UserInfoController.
     */
    public void testGetUser_0args() {
        System.out.println("getUser");
        ArrayList expResult = null;
        ArrayList result = instance.getUser();
    }

    /**
     * Test of getUser method, of class UserInfoController.
     */
    public void testGetUser_4args() {
        System.out.println("getUser");
        String ID = "";
        String year = "";
        String type = "";
        String institute = "";
        ArrayList expResult = null;
        ArrayList result = instance.getUser(ID, year, type, institute);
    }

    /**
     * Test of getUser method, of class UserInfoController.
     */
    public void testGetUser_String_String() {
        System.out.println("getUser");
        String fromID = "";
        String toID = "";
        ArrayList expResult = null;
        ArrayList result = instance.getUser(fromID, toID);
    }

    /**
     * Test of getUser method, of class UserInfoController.
     */
    public void testGetUser_String() {
        System.out.println("getUser");
        String beginID = "";
        ArrayList expResult = null;
        ArrayList result = instance.getUser(beginID);
    }

    /**
     * Test of changeAdminInfo method, of class UserInfoController.
     */
    public void testChangeAdminInfo() {
        System.out.println("changeAdminInfo");
        UserInfoVO v = null;
        ResultMessage expResult = null;
   //     ResultMessage result = instance.changeAdminInfo(v);
    }

    /**
     * Test of readeMessage method, of class UserInfoController.
     */
    public void testReadeMessage() {
        System.out.println("readeMessage");
        String expResult = "";
        String result = instance.readeMessage();
    }

    /**
     * Test of changeMessage method, of class UserInfoController.
     */
    public void testChangeMessage() {
        System.out.println("changeMessage");
        String message = "";
        ResultMessage expResult = null;
        ResultMessage result = instance.changeMessage(message);
    }

    /**
     * Test of changeUserInfo method, of class UserInfoController.
     */
    public void testChangeUserInfo_UserInfoVO() {
        System.out.println("changeUserInfo");
        UserInfoVO v = new UserInfoVO("00001","00001", "任天", "学生", "软件学院", "n", "2012" ,"男", "");
        ResultMessage expResult = null;
       // ResultMessage result = instance.changeUserInfo(v);
    }

    /**
     * Test of getStu method, of class UserInfoController.
     */
    public void testGetStu() {
        System.out.println("getStu");
        String ins = "";
        String year = "";
        ArrayList expResult = null;
        ArrayList result = instance.getStu(ins, year);
    }
}
