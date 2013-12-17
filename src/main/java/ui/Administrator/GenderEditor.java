/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;

import com.sun.nio.sctp.PeerAddressChangeNotification;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.EventObject;
import javax.swing.CellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.event.AncestorListener;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.EventListenerList;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author 天
 */
public class GenderEditor extends JComboBox implements TableCellEditor{  
           

    @Override
    public void addItemListener(ItemListener aListener) {
        super.addItemListener(aListener);
        System.out.printf("action");
    }

   

   
         //EventListenerList:保存EventListener 列表的类。  
         private EventListenerList listenerList = new EventListenerList();  
         //ChangeEvent用于通知感兴趣的参与者事件源中的状态已发生更改。  
         private ChangeEvent changeEvent = new ChangeEvent(this);  
         public GenderEditor(){  
                   super();  
                   addItem("男");  
                   addItem("女");  
                   //请求终止编辑操作可以包含单元格的JTable收到，也可以从编辑器组件本身（如这里的JComboBox）获得  
                   addActionListener(new ActionListener(){ 
                            public void actionPerformed(ActionEvent e) { 
                                
                                     System.out.println("ActionListener"); 
                                     //如同stopCellEditing，都是调用fireEditingStopped()方法 
                                     fireEditingStopped(); 
                            } 
                            
                   });  
         }  
         public void addCellEditorListener(CellEditorListener l) {  
                   listenerList.add(CellEditorListener.class,l);  
         }  
         public void removeCellEditorListener(CellEditorListener l) {  
                   listenerList.remove(CellEditorListener.class,l);  
         }  
         private void fireEditingStopped(){  
                   CellEditorListener listener;  
                   Object[]listeners = listenerList.getListenerList();  
                   String s = (String)this.getSelectedItem();
                   System.out.println(s);
                   for(int i = 0; i < listeners.length; i++){  
                            if(listeners[i]== CellEditorListener.class){  
                                     //之所以是i+1，是因为一个为CellEditorListener.class（Class对象），  
                                     //接着的是一个CellEditorListener的实例  
                                     listener= (CellEditorListener)listeners[i+1];  
                                     //让changeEvent去通知编辑器已经结束编辑  
                        //   <span style="white-space:pre">   </span>     //在editingStopped方法中，JTable调用getCellEditorValue()取回单元格的值，  
                                     //并且把这个值传递给TableValues(TableModel)的setValueAt()  
                                     listener.editingStopped(changeEvent);  
                            }  
                   }  
         }  
         public void cancelCellEditing() {           
         }  
         /** 
          * 编辑其中一个单元格，再点击另一个单元格时，调用。-------------！！！！！ 
          */  
         public boolean stopCellEditing() {  
                   //可以注释掉下面的fireEditingStopped();，然后在GenderEditor的构造函数中把  
                   //addActionListener()的注释去掉（这时请求终止编辑操作从JComboBox获得），  
                   System.out.println("编辑其中一个单元格，再点击另一个单元格时，调用。");  
                   fireEditingStopped();//请求终止编辑操作从JTable获得  
                   return true;  
         }  
         /** 
          * 为一个单元格初始化编辑时，getTableCellEditorComponent被调用 
          */  
         public Component getTableCellEditorComponent(JTable table, Object value,  
                            boolean isSelected, int row, int column) {  
                   boolean isMale = ((Boolean)value).booleanValue();  
                   setSelectedIndex(isMale? 0 : 1);  
                   System.out.println("getTablecell");
                   return this;  
         }  
         /** 
          * 询问编辑器它是否可以使用 anEvent 开始进行编辑。 
          */  
         public boolean isCellEditable(EventObject anEvent) {  
                   return true;  
         }  
         /** 
          * 如果应该选择正编辑的单元格，则返回true，否则返回 false。 
          */  
         public boolean shouldSelectCell(EventObject anEvent) {  
             System.out.println("should");
                   return true;  
         }  
   
         /** 
          * 返回值传递给TableValue（TableModel）中的setValueAt()方法 
          */  
         public Object getCellEditorValue() {  
             System.out.println("get cell");
                   return new Boolean(getSelectedIndex() == 0 ? true : false);  
         }  
}  