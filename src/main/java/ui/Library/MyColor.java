/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Color;

/**
 *
 * @author zili Chen
 */
public class MyColor {/*文本框的颜色*/
    
   private Color color;
   
   public MyColor() {
       color = new Color(102,102,205);
   }
   
   public MyColor(int r,int b,int g) {
       color = new Color(r,b,g);
   }
   
   public Color getColor() {
       return color;
   }
  
}
