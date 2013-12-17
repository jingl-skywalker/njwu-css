/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author zili Chen
 */
public class ComboBox {/*单选下拉框*/
    
    private JComboBox box;
    private MyFont font;
    
    public ComboBox(ArrayList<String> content,int x,int y,int w,int h) {
        box = new JComboBox();
        font = new MyFont();
        box.setFont(font.getFont());
        box.setBounds(x,y,w,h);
        for(String s:content) {
            box.addItem(s);
        }
    }
    
    public JComboBox getComboBox() {
        return box;
    }
    
}
