/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.fileutility;

import enumeration.ResultMessage;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author Administrator
 */
public class FileutilityImplTest extends TestCase {

    public FileutilityImplTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of append method, of class FileutilityImpl.
     */
    public void testAppend_String() {
        System.out.println("append");
        String oneline = "";
        FileutilityImpl instance = new FileutilityImpl();
        boolean expResult = false;
    }

    /**
     * Test of append method, of class FileutilityImpl.
     */
    public void testAppend_ArrayList() {
        System.out.println("append");
        ArrayList<String> lines = null;
        FileutilityImpl instance = new FileutilityImpl();
        boolean expResult = false;
    }

    /**
     * Test of append method, of class FileutilityImpl.
     */
    public void testAppend_int_String() {
        System.out.println("append");
        int field = 0;
        String oneTerm = "";
        FileutilityImpl instance = new FileutilityImpl();
        boolean expResult = false;
    }

    /**
     * Test of find method, of class FileutilityImpl.
     */
    public void testFind_String() {
        System.out.println("find");
        String ID = "";
        FileutilityImpl instance = new FileutilityImpl();
        String expResult = "";
    }

    /**
     * Test of find method, of class FileutilityImpl.
     */
    public void testFind_int_String() {
        System.out.println("find");
        int field = 0;
        String key = "";
        FileutilityImpl instance = new FileutilityImpl();
        String expResult = "";
    }

    /**
     * Test of find method, of class FileutilityImpl.
     */
    public void testFind_0args() {
        System.out.println("find");
        FileutilityImpl instance = new FileutilityImpl();
        ArrayList expResult = null;
    }

    /**
     * Test of find method, of class FileutilityImpl.
     */
    public void testFind_intArr_ArrayList() {
        System.out.println("find");
        int[] fields = null;
        ArrayList<String> keys = null;
        FileutilityImpl instance = new FileutilityImpl();
        ArrayList expResult = null;
    }

    /**
     * Test of clear method, of class FileutilityImpl.
     */
    public void testClear() {
        System.out.println("clear");
        FileutilityImpl instance = new FileutilityImpl();
        boolean expResult = false;
    }

    /**
     * Test of find method, of class FileutilityImpl.
     */
    public void testFind_int() {
        System.out.println("find");
        int lineNum = 0;
        FileutilityImpl instance = new FileutilityImpl();
        String expResult = "";
    }

    /**
     * Test of writeToFile method, of class FileutilityImpl.
     */
    public void testWriteToFile() {
        System.out.println("writeToFile");
        String file = "";
        String content = "";
    }

    /**
     * Test of appendToFile method, of class FileutilityImpl.
     */
    public void testAppendToFile() {
        System.out.println("appendToFile");
        String file = "";
        String content = "";
    }

    /**
     * Test of getAllUser method, of class FileutilityImpl.
     */
    public void testGetAllUser() {
        System.out.println("getAllUser");
        FileutilityImpl instance = new FileutilityImpl();
        ArrayList expResult = null;
    }

    /**
     * Test of getInfo method, of class FileutilityImpl.
     */
    public void testGetInfo() {
        System.out.println("getInfo");
        String id = "";
        FileutilityImpl instance = new FileutilityImpl();
        String[] expResult = null;
    }

    /**
     * Test of getAll method, of class FileutilityImpl.
     */
    public void testGetAll() {
        System.out.println("getAll");
        FileutilityImpl instance = new FileutilityImpl();
        String expResult = "";
    }

    /**
     * Test of changeUser method, of class FileutilityImpl.
     */
    public void testChangeUser() {
        System.out.println("changeUser");
        String id = "";
        String info = "";
        FileutilityImpl instance = new FileutilityImpl();
    }

    /**
     * Test of readCourseInfo method, of class FileutilityImpl.
     */
    public void testReadCourseInfo() {
        System.out.println("readCourseInfo");
        FileutilityImpl instance = new FileutilityImpl();
        ArrayList expResult = null;
    }

    /**
     * Test of readPlanInfo method, of class FileutilityImpl.
     */
    public void testReadPlanInfo() {
        System.out.println("readPlanInfo");
        FileutilityImpl instance = new FileutilityImpl();
        ArrayList expResult = null;
    }
}
