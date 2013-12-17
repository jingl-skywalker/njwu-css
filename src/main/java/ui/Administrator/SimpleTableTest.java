/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;
import java.awt.BorderLayout;  
import java.awt.Container;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;  
import javax.swing.JTable;  
import javax.swing.table.TableColumn;  
import javax.swing.table.TableColumnModel;  
public class SimpleTableTest extends JFrame{  
          
        
         protected JTable table;  
        /* public SimpleTableTest(){  
                   Container pane = getContentPane();  
                   pane.setLayout(new BorderLayout());  
                   TableValues tv =  new TableValues();  
                   table= new JTable(tv);  
                   //设置行高  
                   table.setRowHeight(30);  
                   //必须把table放入JScrollPane才会有列名出现  
                   JScrollPane jsp = new JScrollPane(table);  
                   pane.add(jsp,BorderLayout.CENTER);  
         }*/
         
         public SimpleTableTest(){  
                   setTitle("FromCannel_2020's blog(CSDN)");  
                   setLayout(new BorderLayout());  
                   TableValues tv =  new TableValues();  
                  
                   table= new JTable(tv);  
                   //设置行宽  
                   table.setRowHeight(30);  
                    
                   TableColumnModel tcm= table.getColumnModel();  
                   TableColumn tc = tcm.getColumn(TableValues.GENDER);  
                   //设置“性别”列的单元格渲染器（renderer）  
                   tc.setCellRenderer(new GenderRenderer());  
                     tc.setCellEditor(new GenderEditor()); 
                   //必须把table放入JScrollPane才会有列名出现  
                   JScrollPane jsp = new JScrollPane(table);  
                   add(jsp,BorderLayout.CENTER);  
         }  
         public static void main(String[] args) {  
                   SimpleTableTest stt = new SimpleTableTest();  
                   stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                   stt.setSize(400,200);  
                   stt.setVisible(true);  
         }  
}  