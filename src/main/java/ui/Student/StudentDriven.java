/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.Student;

import vo.uservo.UserInfoVO;

/**
 *
 * @author sheyunfeng
 */
public class StudentDriven {
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new STUmain().setVisible(true);
                UserInfoVO ivo = new UserInfoVO("1212", "1212", "syf", "student", "software", 
                        "graedeOne", "2012", "男", "32010519940326");
                STUmain sTUmain = new STUmain();
                sTUmain.setVisible(true);
                sTUmain.setStudentVO(ivo);
                sTUmain.initMyConpontent();
            }
        });
    }
}
