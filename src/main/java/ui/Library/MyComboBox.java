/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package  ui.Library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *
 * @author zili chen
 */
public class MyComboBox extends JComboBox implements ActionListener {/*多选下拉框*/
    
    public MyComboBox() {
        addItem(new CheckValue(false,"Select All"));
        this.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                itemSelected();
            }
        }) ;
    }
    
    private void itemSelected() {
        if(getSelectedItem() instanceof CheckValue) {
            if(getSelectedIndex() == 0) {
                selectedAllItem();
            }
            else{
                CheckValue jcb = (CheckValue)getSelectedItem();
                jcb.bolValue = (!jcb.bolValue);
                setSelectedIndex(getSelectedIndex());
            }
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {/*选中后保持弹出状态*/
                    showPopup();
                }
            });
        }
    }
    
    private void selectedAllItem() {
        boolean bl = false;
        for(int i = 0;i < getItemCount();i++) {
            CheckValue jcb = (CheckValue)getItemAt(i);
            if(i == 0) {
                bl = !jcb.bolValue;
            }
            jcb.bolValue = (bl);
        }
        setSelectedIndex(0);
       }
    
    public Vector getComboVc() {/*获取选取对象*/
        Vector vc = new Vector();
        for (int i = 1; i < getItemCount(); i++) {  
            CheckValue jcb = (CheckValue) getItemAt(i);  
            if (jcb.bolValue) {  
                vc.add(jcb.value);  
            }  
        }  
        return vc;  
    }
}





