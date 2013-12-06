/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.coursearrangementbl;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ljing12 obey the rule of information hiding to encapsulate the
 * structure of result of the arragement
 */
public class ArrangementResult {

    private ArrayList<String> stunums;
    private String courseNum;

    public ArrangementResult(ArrayList<String> stunums, String courseNum) {
        this.stunums = stunums;
        this.courseNum = courseNum;
    }

    /*getters*/
    public String getCourseNum() {
        return this.courseNum;
    }

    public Iterator<String> getIterator() {
        return stunums.iterator();

    }
}
