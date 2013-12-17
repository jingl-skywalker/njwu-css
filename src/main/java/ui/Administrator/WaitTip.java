/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author 天
 */
public class WaitTip implements Runnable{
     Thread t;
    ImageIcon image;
      Container cp;
       JLabel imgLabel;
       JFrame frame;
    /**
     * Creates new form WaitPanelj
     */
    public WaitTip(JFrame frame) {
        image = new ImageIcon("C:\\Users\\Administrator\\Desktop\\images\\1.gif");
        imgLabel = new JLabel(image);
        imgLabel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        frame.getLayeredPane().add(imgLabel,new Integer(Integer.MIN_VALUE));
         cp = frame.getContentPane();
        cp.setLayout(new BorderLayout());
        JButton but = new JButton("hui");
        cp.add(but,"North");
        ((JPanel)cp).setOpaque(false);
        frame.repaint();
        this.frame = frame;
        t = new Thread(this);
        t.start();
        t.setPriority(8);
        
    }

    public void run() {
        int i=1;
        while(true){
            try {
                Thread.sleep(50);
                i++;
                image = new ImageIcon("F:\\picture\\苏州\\WP_20130701_00"+i+".jpg");
                imgLabel.setIcon(image);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitPanelj.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    }


