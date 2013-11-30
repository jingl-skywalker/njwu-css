/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package  ui.Library;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author zili chen
 */
public class Navigation {/*导航栏*/
    
    private JLabel arrow;
    private JLabel now;
    private Font font;
    
    public Navigation() {
        font = new Font("微软雅黑",Font.PLAIN,14);
        arrow = new JLabel("->");
        arrow.setFont(font);
        arrow.setBounds(175,7,16,19);
        arrow.setVisible(false);
        now = new JLabel();
        now.setFont(font);
        now.setBounds(201,7,84,19);
        now.setVisible(false);
    }
    
    public void setNowText(String text) {
        now.setText(text);
    }
    
    public void setArrowLocation(int x,int y) {
        arrow.setBounds(x,y,16,19);
    }
    
    public void setNowBounds(int x,int y,int w,int h) {
        now.setBounds(x,y,w,h);
    }

    public JLabel getArrow() {
        return arrow;
    }

    public JLabel getNow() {
        return now;
    }
    
    public void setVisible(boolean bool) {
        arrow.setVisible(bool);
        now.setVisible(bool);
    }
    
}
