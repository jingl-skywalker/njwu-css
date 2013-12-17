/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author zili Chen
 */
public class TextField {/*输入文本字段*/
    
    private JTextField textField;
    private MyFont font;
    private MyColor color;
    
    public TextField(int x,int y,int w,int h) {
        textField = new JTextField();
        font = new MyFont();
        color = new MyColor();
        textField.setBounds(x,y,w,h);
        textField.setFont(font.getFont());
        textField.setBackground(color.getColor());
        textField.setBorder(new LineBorder(color.getColor(),2));
    }
    
    public JTextField getTextField() {
        return textField;
    }
}
