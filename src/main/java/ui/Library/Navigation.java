/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import ui.Admin.LoginFrame;

/**
 *
 * @author zili Chen
 */
public class Navigation {/*导航类*/
    
    /*GUI-导航*/
    private JPanel navPanel;
    private JButton backButton;
    private JButton homeButton;
    private JButton closeButton;
    
    private CardLayout card;
    private JPanel contain;
    private String toP1;
    private String toP2;
    
    public Navigation(JPanel navPanel,CardLayout card,JPanel contain,String toP) {
        this.card = card;
        this.contain = contain;
        this.navPanel = navPanel;
        this.toP1 = toP;
        this.toP2 = toP;
        backButton = new LogoButton(718,10).getLLeftArrowButton();//返回按钮
        backButton.addMouseListener(new BackListener());
        navPanel.add(backButton);
        homeButton = new LogoButton(826,9).getLHomeButton();//主页按钮
        homeButton.addMouseListener(new HomeListener());
        navPanel.add(homeButton);
        closeButton = new LogoButton(930,7).getLExitButton();//退出按钮
        closeButton.addMouseListener(new CloseListener());
        navPanel.add(closeButton);
    }
    
    public JPanel getPanel() {
        return navPanel;
    }
    
    public void setTOP(String toP) {
        this.toP1 = toP;
    }
    
    /*事件-back*/
    class BackListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,toP1);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            backButton.setContentAreaFilled(true);
            backButton.setOpaque(false);
            backButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            backButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-home*/
    class HomeListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,toP2);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            homeButton.setContentAreaFilled(true);
            homeButton.setOpaque(false);
            homeButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            homeButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-close*/
    class CloseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            closeButton.setContentAreaFilled(true);
            closeButton.setOpaque(false);
            closeButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            closeButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    public JButton getCloseButton() {
        return closeButton;
    }
    
}
