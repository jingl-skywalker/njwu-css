/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Component;
import java.io.Serializable;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author zili chen
 */
public class CheckListCellRenderer extends JCheckBox implements ListCellRenderer,  Serializable {  /*多选下拉框-辅助类*/
    protected static Border noFocusBorder;  
    public CheckListCellRenderer() {  
        super();  
        if (noFocusBorder == null) {  
            noFocusBorder = new EmptyBorder(1, 1, 1, 1);  
        }  
        setOpaque(true);  
        setBorder(noFocusBorder);  
    }  
    
    public Component getListCellRendererComponent(  
        JList list,  
        Object value,  
        int index,  
        boolean isSelected,  
        boolean cellHasFocus) {  
        setComponentOrientation(list.getComponentOrientation());  
        if (isSelected) {  
            setBackground(list.getSelectionBackground());  
            setForeground(list.getSelectionForeground());  
        } else {  
            setBackground(list.getBackground());  
            setForeground(list.getForeground());  
        }  
        if (value instanceof CheckValue) {  
            CheckValue ckValue = (CheckValue) value;  
            this.setText(ckValue.value == null ? "" : ckValue.value);  
            this.setSelected(ckValue.bolValue);  
        }  
        setEnabled(list.isEnabled());  
        setFont(list.getFont());  
        setBorder((cellHasFocus) ?  
                  UIManager.getBorder("List.focusCellHighlightBorder") :  
                  noFocusBorder);  
        return this;  
    }  
}  
