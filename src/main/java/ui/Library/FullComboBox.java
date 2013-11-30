/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package  ui.Library;

import java.awt.Font;

/**
 *
 * @author zili chen
 */
public class FullComboBox {/*对多选下拉框的封装*/
    private MyComboBox comboBox;
    
    public FullComboBox() {
        comboBox = new MyComboBox();
        comboBox.setRenderer(new CheckListCellRenderer());
        comboBox.setFont(new Font("微软雅黑",Font.PLAIN,14));
    }
    public void add(String text) {
        CheckValue cValue = new CheckValue();
        cValue.value = text;
        comboBox.addItem(cValue);
    }
    
    public MyComboBox getComboBox() {
        return comboBox;
    }
}
