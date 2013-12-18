/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zili Chen
 */
public class Table {/*包装JTable*/
    
    private JTable table;
    private DefaultTableModel model;
    private String[][] content;
    private String[] head;
    
    public Table(ArrayList<String> c,ArrayList<String> h,String s) {//每行内容，表头，每行内容分隔符
        table = new JTable();
        content = new String[c.size()][h.size()];
        for(int i=0;i<c.size();i++) {
            content[i] = c.get(i).split(s);
        }
        head = new String[h.size()];
        for(int j=0;j<h.size();j++) {
            head[j] = h.get(j);
        }
        model = new DefaultTableModel(content,head);
        table.setModel(model);
    }
    
    public JTable getTable() {
        return table;
    }
    
}
