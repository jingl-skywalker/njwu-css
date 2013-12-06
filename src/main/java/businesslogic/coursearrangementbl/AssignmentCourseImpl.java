/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursearrangementbl;

import businesslogicservice.coursearrangementblservice.AssignmentCourse;
import businesslogicservice.coursearrangementblservice.Priority;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class AssignmentCourseImpl implements AssignmentCourse {

    int bounds;
    ArrayList<Priority> priorities = new ArrayList<Priority>();
    ArrayList<String> result = new ArrayList<String>();
    String courseNum;

    public AssignmentCourseImpl(String courseNum, int bounds, int[] grade, String[] stuNum,
            int[] hasGottenCredit, int lowerBounds) {
        // TODO Auto-generated constructor stub
        this.courseNum=courseNum;
        this.bounds = bounds;
        System.out.println("grade.length" + grade.length + " " + stuNum[26]);
        for (int i = 0; i < grade.length; i++) {
            priorities.add(new PriorityImplment1(grade[i], hasGottenCredit[i],
                    lowerBounds, stuNum[i]));
            System.out.println(stuNum[i]);
            //	System.out.println(i);
        }
        this.addKey();
        this.sort();
        this.fillter();
    }

    private void addKey() {
        Random random = new Random();
        for (Priority priority : priorities) {

            priority.addPriority(Math.abs(random.nextInt() % 100));
            //	System.out.println(priority.getPriority()+"v"+priority.getNum());
        }
    }

    private void sort() {
        Collections.sort(priorities);
    }

    private void fillter() {
        System.out.println(bounds);
        for (int i = 0; i < bounds && !priorities.isEmpty(); i++) {
            System.out.println(i);
            result.add(priorities.get(priorities.size() - 1).getNum());
            //	result.add(priorities.get(0).getNum());
            priorities.remove(priorities.get(priorities.size() - 1));
        }
    }

    @Override
    public ArrangementResult getSelectionResult() {
        // TODO Auto-generated method stub
        return new ArrangementResult(result, courseNum);
    }
}
