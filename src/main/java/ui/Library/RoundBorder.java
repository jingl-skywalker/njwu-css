/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author zili chen
 */
public class RoundBorder implements Border{/*圆角矩形边框*/
    
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
    
    public boolean isBorderOpaque() {
        return false;
    }
    
    public void paintBorder(Component c,Graphics g,int x,int y,int width,int height) {
        //使用黑色在组建的外边缘绘制一个圆形矩阵
        g.setColor(Color.BLACK);
        g.drawRoundRect(0,0,c.getWidth()-1,c.getHeight()-1,5,5);
    }
}
/*Example：使按钮应用自定义Border
 * JButton close = new JButton("关闭");
 * close.setBorder(new RoundBorder());
 */
