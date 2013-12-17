/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import javax.swing.JTextField;

/**
 *
 * @author zili Chen
 */
public class TextField {/*输入文本字段*/
    
    private JTextField textField;
    private MyFont font;
    
    public TextField(int x,int y,int w,int h) {
        textField = new JTextField();
        font = new MyFont();
        textField.setBounds(x,y,w,h);
        textField.setFont(font.getFont());
    }
    
    public JTextField getTextField() {
        return textField;
    }
}
