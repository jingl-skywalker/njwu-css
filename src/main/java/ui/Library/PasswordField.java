/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

/**
 *
 * @author zili Chen
 */
public class PasswordField {/*包装JPasswordField*/
    
    private JPasswordField password;
    private MyFont font;
    private MyColor color;
    
    public PasswordField(int x,int y,int w,int h) {
        password = new JPasswordField();
        font = new MyFont();
        color = new MyColor();
        password.setBounds(x,y,w,h);
        password.setFont(font.getFont());
        password.setBackground(color.getColor());
        password.setBorder(new LineBorder(color.getColor(),2));
    }
    public JPasswordField getPasswordField() {
        return password;
    }
    
}
