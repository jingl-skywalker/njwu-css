/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

/**
 *
 * @author zili Chen
 */
public class TextArea {/*输入文本段落*/
    
    private JTextArea textArea;
    private MyFont font;
    private MyColor color;
    
    public TextArea(int x,int y,int w,int h) {
        textArea = new JTextArea();
        font = new MyFont();
        color = new MyColor();
        textArea.setBounds(x,y,w,h);
        textArea.setBackground(color.getColor());
        textArea.setFont(font.getFont());
        textArea.setBorder(new LineBorder(color.getColor(),2));
    }
    
    public JTextArea getTextArea() {
        return textArea;
    }
    
}
