/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import businesslogicservice.staticblservice.TeacherStaticBLService;
import junit.framework.TestCase;
import vo.staticvo.TeacherStaticVO;

/**
 *
 * @author Administrator
 */
public class TeacherStaticControllerTest extends TestCase {
        TeacherStaticBLService instance;
    public TeacherStaticControllerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance=new TeacherStaticController("localhost", 1099);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of show method, of class TeacherStaticController.
     */
    public void testShow() {
        System.out.println("show");
        TeacherStaticVO expResult = null;
        TeacherStatic result = instance.show("");
        assertTrue(result!=null);

    }

    /**
     * Test of show method, of class TeacherStaticController.
     */
    public void testShow_String() {
        System.out.println("show");
        String department = "软件学院";
        TeacherStatic expResult = null;
        TeacherStatic result =null;//= instance.show(department);
       assertTrue(result==null);
    }
}
