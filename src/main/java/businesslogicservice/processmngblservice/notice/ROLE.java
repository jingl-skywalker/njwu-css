/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.notice;

/**
 *
 * @author Administrator
 */
public enum ROLE {

    TEACHER, STUDENT, INSJW, BEGINNER, ALL;
    public static ROLE getRole(String s)
    {
        if(s.equals("TEACHER")){
            return ROLE.TEACHER;
        }else if(s.equals("STUDENT")){
            return ROLE.STUDENT;
        }else if(s.equals("INSJW")){
            return ROLE.INSJW;
        }else if(s.equals("BEGINNER")){
            return ROLE.BEGINNER;
        }else {
            return ROLE.ALL;
        }
    }
}
