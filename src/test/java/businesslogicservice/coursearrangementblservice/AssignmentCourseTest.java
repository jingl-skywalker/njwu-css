/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.coursearrangementblservice;

import businesslogic.coursearrangementbl.ArrangementResult;
import businesslogic.coursearrangementbl.AssignmentCourseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.TestCase;

/**
 *
 * @author Administrator
 */
public class AssignmentCourseTest extends TestCase {

    AssignmentCourse assignmentCourse;
    int bounds;

    protected void setUp() throws Exception {
        super.setUp();
        bounds = 10;
        int grade[] = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3,
            4, 4, 4, 4, 4, 4, 3, 2, 1};
        String stuNum[] = {"001", "002", "003", "004", "005", "006", "007",
            "008", "009", "010", "011", "012", "013", "014", "015", "016",
            "017", "018", "019", "020", "021", "022", "023", "024", "025",
            "026", "027"};
        int hasGottenCredit[] = {0, 0, 0, 4, 3, 5, 6, 7, 8, 8, 5, 2, 9, 9, 10,
            13, 16, 3, 15, 12, 5, 3, 6, 4, 2, 4, 1};
        int lowerBounds = 14;
        assignmentCourse = new AssignmentCourseImpl("00001",bounds, grade, stuNum,
                hasGottenCredit, lowerBounds);
    }

    public void testGetSelectionResult() {
        ArrangementResult result = assignmentCourse.getSelectionResult();
        Iterator<String> itr=result.getIterator();
        int count=0;
        while(itr.hasNext()){
            System.out.println(itr.next());
            count++;
        }
        System.out.println("test end");
        assertTrue(count==bounds);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
