/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;

import javax.swing.table.AbstractTableModel;  
/**   
 *     注意：一般使用AbstractTableModel创建TableModel的实现，只有少量数据时使用DefaultTableModel， 
 */  
public class TableValues extends AbstractTableModel{  
        
         public final static int NAME = 0;  
         public final static int GENDER = 1;  
         public final static String[] columnNames = {"姓名", "性别"};  
         public Object[][] values = {  
                            {"Cannel_2020",true},  
                            {"Lucy",false},  
                            {"韩梅",false},  
                            {"李雷",true},  
                            {"Jim",true}  
         };  
         public int getColumnCount() {  
                   return values[0].length;  
         }  
         public int getRowCount() {  
                   return values.length;  
         }  
         public Object getValueAt(int rowIndex, int columnIndex) {  
                   return values[rowIndex][columnIndex];  
         }  
         /** 
          * 设置列名 
          */  
         public String getColumnName(int column){  
                   return columnNames[column];  
         }  
         /** 
 * 设置单元格可以编辑 
 */  
public boolean isCellEditable(int row, int column){  
   return true;  
}  
/** 
   * 单元格被编辑完后，调用此方法更新值 
   */  
  public void setValueAt(Object value, int row, int column){  
            values[row][column]= value; 
            System.out.println("setValueAT");
  }  
}  