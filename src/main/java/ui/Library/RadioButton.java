/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;
import javax.swing.JRadioButton;

/**
 *
 * @author zili Chen
 */
public class RadioButton {/*单选按钮*/
    
    private JRadioButton button;
    private MyFont font;
    
    public RadioButton(String content,int x,int y,int w,int h) {
        button = new JRadioButton(content);
        font = new MyFont();
        button.setBounds(x,y,w,h);
        button.setFont(font.getFont());
        button.setForeground(Color.white);
    }
    
    public JRadioButton getButton() {
        return button;
    }
    
}
