/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;
import javax.swing.JTextArea;

/**
 *
 * @author zili Chen
 */
public class TextArea {/*输入文本段落*/
    
    private JTextArea textArea;
    private MyFont font;
    
    public TextArea(int x,int y,int w,int h) {
        textArea = new JTextArea();
        font = new MyFont();
        textArea.setBounds(x,y,w,h);
        textArea.setBackground(new Color(102,102,205));
        textArea.setFont(font.getFont());
    }
    
    public JTextArea getTextArea() {
        return textArea;
    }
    
}
