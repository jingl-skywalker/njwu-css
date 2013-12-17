/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Teacher;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author 天
 */
public class MyHeaderComboxRenderer extends JComboBox implements TableCellRenderer{

    int i=0;
    public MyHeaderComboxRenderer(String[] items) {

       for (int i = 0; i < items.length; i++) {

           addItem(items[i]);

       }

    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         if(isSelected){  
                            setForeground(table.getForeground());  
                            super.setBackground(table.getBackground());  
                   }else{  
                            setForeground(table.getForeground());  
                            setBackground(table.getBackground());  
                   }  
                   int selec = Integer .parseInt((String) (value));  
                   setSelectedIndex(selec);  
        return this;
    }

    
}
