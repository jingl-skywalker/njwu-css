/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package  ui.Library;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author zili chen
 */
public class MyTitledBorder {/*设置panel带标题的边框*/
    
    private Color color;
    private Font font;
    private LineBorder lineBorder;
    private TitledBorder titledBorder;

    public TitledBorder getTitledBorder() {
        return titledBorder;
    }
    
    public MyTitledBorder(String title) {
        color = new Color(204,204,204);
        lineBorder = new LineBorder(color,1,true);
        font = new Font("微软雅黑",Font.BOLD,14);
        titledBorder = new TitledBorder(lineBorder,title,TitledBorder.LEFT,TitledBorder.TOP,font,color);
    }
}
