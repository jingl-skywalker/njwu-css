/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import junit.framework.TestCase;
import vo.coursevo.CourseVO;

/**
 *
 * @author Administrator
 */
public class CourseStaticControllerTest extends TestCase {
    CourseStaticController instance;
    public CourseStaticControllerTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance=new CourseStaticController("localhost", 1099);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of find method, of class CourseStaticController.
     */
    public void testFind() {
        System.out.println("find");
        String id = "软件学院";
        CourseVO result = instance.find(id);
        assertTrue(result==null);
    }

    /**
     * Test of show method, of class CourseStaticController.
     */
    public void testShow() {
        System.out.println("show");
        String department = "软件学院";
        CourseStatic result = instance.show(department);
        assertTrue(result!=null);
    }
}
