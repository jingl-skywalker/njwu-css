/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.staticbl;

import businesslogicservice.staticblservice.CourseStaticBLService;
import junit.framework.TestCase;

/**
 *
 * @author Administrator
 */
public class CourseStaticBLServiceTest extends TestCase {

    CourseStaticBLService instance;

    public CourseStaticBLServiceTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        instance = new CourseStaticController("localhost", 1099);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getCourse method, of class CourseStaticBL.
     */
    public void testGetCourse() {
        System.out.println("getCourse");
        CourseStatic expResult = instance.show("软件学院");
        System.out.println(expResult.toString());
        assertTrue(expResult!=null);
    }
}
