/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import javax.swing.JFrame;

/**
 *
 * @author 天
 */
public class TeacherStaticPanelDriver {
    public static void main(String[] arg){
        JFrame f = new JFrame();
        f.setSize(632, 336);
        f.add(new TeacherStaticPanel("localhost",1099));
        f.setVisible(true);
    }
}
