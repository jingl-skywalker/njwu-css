/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.YJWTeacher;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili Chen
 */
public class NewTermPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewTermPanel
     */
    public NewTermPanel(UserInfoVO v,String ip,int port) {
        initComponents();
        /*GUI-主panel*/
        setOpaque(false);
        navPanel.setOpaque(false);
        /*GUI-导航*/
        backtoP = new ImageIcon("src/Picture/backto.gif");
        homeP = new ImageIcon("src/Picture/home.gif");
        closeP = new ImageIcon("src/Picture/exit.gif");
        backButton = new JButton(backtoP);//返回按钮
        backButton.addMouseListener(new BackListener());
        navPanel.add(backButton,0,0);
        backButton.setBounds(718,10,backtoP.getIconWidth(),backtoP.getIconHeight());
        backButton.setContentAreaFilled(false);
        homeButton = new JButton(homeP);//主页按钮
        homeButton.addMouseListener(new HomeListener());
        navPanel.add(homeButton,0,0);
        homeButton.setBounds(826,9,homeP.getIconWidth(),homeP.getIconHeight());
        homeButton.setContentAreaFilled(false);
        closeButton = new JButton(closeP);//退出按钮
        closeButton.addMouseListener(new CloseListener());
        navPanel.add(closeButton,0,0);
        closeButton.setBounds(930,7,closeP.getIconWidth(),closeP.getIconHeight());
        closeButton.setContentAreaFilled(false);
        /*逻辑-任天*/
        userInfo = v;
        this.ip = ip;
        this.port = port;
    }
    
    /*事件-back*/
    class BackListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            YJWMain.card.show(YJWMain.contain,"mainP");
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
            YJWMain.card.show(YJWMain.contain,"mainP");
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
    
    public void update() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();

        navPanel.setBackground(new java.awt.Color(51, 255, 102));

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 363, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel navPanel;
    // End of variables declaration//GEN-END:variables
    /*GUI-导航*/
    private ImageIcon backtoP;
    private ImageIcon homeP;
    private ImageIcon closeP;
    private JButton backButton;
    private JButton homeButton;
    private JButton closeButton;
    /*逻辑-任天*/
    String ip;
    int port;
    private UserInfoVO userInfo;
}
