/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author zili Chen
 */
public class TextLabel {/*带字的Label:设置大小*/
    
    private JLabel label;
    private MyFont font;
    
    public TextLabel(ImageIcon i,int x,int y) {
        label = new JLabel(i);
        label.setBounds(x,y,i.getIconWidth(),i.getIconHeight());
    }
    
    public TextLabel(String content,int x,int y,int w,int h) {
        label = new JLabel(content);
        font = new MyFont();
        label.setBounds(x,y,w,h);
        label.setFont(font.getFont());
        label.setForeground(Color.white);
    }
    
    public JLabel getLabel() {
        return label;
    }
    
}
