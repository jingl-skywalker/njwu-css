/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author zili Chen
 */
public class SList {/*包装JList*/
    
    private JList list;
    private MyFont font;
    private MyColor color;
    private DefaultListModel model;
    
    public SList(ArrayList<String> content,int x,int y,int w,int h) {
        list = new JList();
        font = new MyFont();
        color = new MyColor();
        model = new DefaultListModel();
        list.setBounds(x,y,w,h);
        list.setBackground(color.getColor());
        list.setFont(font.getFont());
        for(String s:content) {
            model.addElement(s);
        }
        list.setModel(model);
    }
    
    public JList getList() {
        return list;
    }
}
