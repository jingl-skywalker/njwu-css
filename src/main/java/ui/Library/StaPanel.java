/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import javax.swing.JPanel;

/**
 *
 * @author zili Chen
 */
public class StaPanel {/*统计信息面板*/

    private JPanel panel;
    private MyColor color;
    
    public StaPanel() {
        panel = new JPanel();
        color = new MyColor();
        panel.setOpaque(false);
        panel.setBounds(0,0,300,200);
    }
    
    public JPanel getPanel() {
        return panel;
    }
}
