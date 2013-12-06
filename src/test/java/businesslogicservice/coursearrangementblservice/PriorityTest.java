/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.coursearrangementblservice;

import businesslogic.coursearrangementbl.PriorityImplment1;
import junit.framework.TestCase;

/**
 *
 * @author Administrator
 */
public class PriorityTest extends TestCase {

    Priority p1;
    Priority p2;
    Priority p3;
    Priority p4;
    Priority p5;
    Priority p6;

    protected void setUp() throws Exception {
        super.setUp();
        p1 = new PriorityImplment1(4, 11, 14, "0001");
        p2 = new PriorityImplment1(3, 10, 14, "0002");
        p3 = new PriorityImplment1(2, 1, 14, "0003");
        p4 = new PriorityImplment1(2, 8, 14, "0004");
        p5 = new PriorityImplment1(1, 0, 14, "0005");
        p6 = new PriorityImplment1(1, 4, 14, "0006");
    }

    public void testGetPriority() {
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p3.getPriority());
        System.out.println(p4.getPriority());
        System.out.println(p5.getPriority());
        System.out.println(p6.getPriority());

        assertTrue(p1.getPriority() > p2.getPriority());
        //	assertTrue(p2.getPriority()>p3.getPriority());
        assertTrue(p3.getPriority() > p4.getPriority());
//		assertTrue(p4.getPriority()>p5.getPriority());
        assertTrue(p5.getPriority() > p6.getPriority());
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
