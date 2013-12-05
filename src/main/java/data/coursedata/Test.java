/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.coursedata;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.coursepo.CoursePO;

/**
 *
 * @author zili chen
 */
public class Test {
    public static void main(String args[]) throws RemoteException {
        CourseIOHelper c = new CourseIOHelper();
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        c.writeIn(list);
        list.add("4");
        c.writeIn(list);
        ArrayList<String> li = c.readOut();
        for(String s:li) {
        	System.out.println(s);
        }
    }
    
}
