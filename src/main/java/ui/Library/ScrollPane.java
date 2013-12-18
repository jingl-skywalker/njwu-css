/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import javax.swing.JScrollPane;

/**
 *
 * @author zili Chen
 */
public class ScrollPane {/*包装JScrollPane*/
    
    private JScrollPane scroll;
    private MyFont font;
    
    public ScrollPane(int x,int  y,int w,int h) {
        scroll = new JScrollPane();
        font = new MyFont();
        scroll.setBounds(x,y,w,h);
        
    }
    
    public JScrollPane getScrollPane() {
        return scroll;
    }
}
