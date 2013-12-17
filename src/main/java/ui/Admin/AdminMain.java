/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Admin;

import businesslogicservice.userblservice.UserBLService;
import businesslogicservice.userblservice.UserInfoFactory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import ui.Library.ImageIconFactory;
import ui.Library.LogoButton;
import ui.Library.Navigation;
import ui.Library.TextLabel;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili Chen
 */
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form AdminMain
     */
    public AdminMain(UserInfoVO v,String ip,int port) {
        initComponents();
        image = new ImageIconFactory ();
        /*逻辑-任天*/
        UserInfoFactory factory = new UserInfoFactory();
        userBL = factory.getUserBLService(ip, port);
        userInfoVO = v;
        /*GUI-frame背景*/
        backLabel = new JLabel(image.getBbackroundIcon());
        backLabel.setBounds(0, 0, 1024, 625);
        getLayeredPane().add(backLabel,new Integer(Integer.MIN_VALUE));
        backPanel = (JPanel)getContentPane();
        backPanel.setOpaque(false);//设置透明
        exitButton = new LogoButton(965,7).getLCloseButton();
        exitButton.addMouseListener(new ExitListener());
        add(exitButton);
        /*GUI-主界面*/
        card = new CardLayout();
        contain.setLayout(card);
        contain.add(mainPanel,"mainP");
        contain.setOpaque(false);
        mainPanel.setOpaque(false);
        navPanel.setOpaque(false);
        /*GUI-导航*/
        navigation = new Navigation(navPanel,card,contain,"mainP");
        /*GUI-菜单面板*/
        menuPanel.setOpaque(false);
        viewInfoButton = new LogoButton(115,32).getJManyPerButton();//查看用户信息
        viewInfoButton.addMouseListener(new ViewInfoListener());
        viewInfoLabel = new TextLabel(image.getPViewInfoIcon(),100,100).getLabel();
        menuPanel.add(viewInfoButton);
        menuPanel.add(viewInfoLabel);
        modifyInfoButton = new LogoButton(220,32).getJTwoPenButton();//修改用户信息
        modifyInfoButton.addMouseListener(new ModifyInfoListener());
        modifyInfoLabel = new TextLabel(image.getPModifyInfoIcon(),210,100).getLabel();
        menuPanel.add(modifyInfoButton);
        menuPanel.add(modifyInfoLabel);
        addUserButton = new LogoButton(330,32).getJRecycleButton();//增添用户
        addUserButton.addMouseListener(new AddUserListener());
        addUserLabel = new TextLabel(image.getPAddUserIcon(),330,100).getLabel();
        menuPanel.add(addUserButton);
        menuPanel.add(addUserLabel);
        deleteUserButton = new LogoButton(115,154).getJRecycleButton();//删除用户
        deleteUserButton.addMouseListener(new DeleteUserListener());
        deleteUserLabel = new TextLabel(image.getPDeleteUserIcon(),115,223).getLabel();
        menuPanel.add(deleteUserButton);
        menuPanel.add(deleteUserLabel);
        keyButton = new LogoButton(220,154).getJSettingButton();//重置密码
        keyButton.addMouseListener(new KeyListener());
        keyLabel = new TextLabel(image.getPKeyIcon(),220,223).getLabel();
        menuPanel.add(keyButton);
        menuPanel.add(keyLabel);
        modifyNoteButton = new LogoButton(340,154).getJModifyrButton();//公告修改
        modifyNoteButton.addMouseListener(new ModifyNoteListener());
        modifyNoteLabel = new TextLabel(image.getPModifyNoteIcon(),320,223).getLabel();
        menuPanel.add(modifyNoteButton);
        menuPanel.add(modifyNoteLabel);
        perInfoButton = new LogoButton(115,266).getJPersonButton();//个人信息
        perInfoButton.addMouseListener(new PerInfoListener());
        perInfoLabel = new TextLabel(image.getPPerInfoIcon(),115,332).getLabel();
        menuPanel.add(perInfoButton);
        menuPanel.add(perInfoLabel);
        /*GUI-通知面板*/
        notePanel.setOpaque(false);
        noteButton = new LogoButton(30,20).getLNoteButton();
        noteLabel = new TextLabel(image.getPNoteIcon(),90,30).getLabel();
        notePanel.add(noteButton);
        notePanel.add(noteLabel);
        info1 = new JLabel("> 2013-2014选课通知");
        notePanel.add(info1,0,0);
        info1.setBounds(95,80,350, 30);
        info1.setFont(new Font("迷你简少儿",0,18));
        info1.setForeground(Color.white);
        /*逻辑-切换面板*/
        viewInfoPanel = new ViewInfoPanel(v.getName(),this,userBL);
        modifyInfoPanel = new ModifyInfoPanel(v.getName(),this,userBL);
        addUserPanel = new AddUserPanel(v.getName(),this,userBL);
        deleteUserPanel = new DeleteUserPanel(v.getName(),this,userBL);
        keyPanel = new KeyPanel(v.getName(),this,userBL);
        modifyNotePanel = new ModifyNotePanel(v.getName(),this,userBL);
        perInfoPanel = new PerInfoPanel(v.getName(),this,userBL);
        contain.add(viewInfoPanel,"viewP");
        contain.add(modifyInfoPanel,"modifyInfoP");
        contain.add(addUserPanel,"addP");
        contain.add(deleteUserPanel,"deleteP");
        contain.add(keyPanel,"keyP");
        contain.add(modifyNotePanel,"modifyNoteP");
        contain.add(perInfoPanel,"perInfoP");
       
    }
    
    /*事件-exit*/
    class ExitListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            //System.exit(1);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            exitButton.setContentAreaFilled(true);
            exitButton.setOpaque(false);
            exitButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            exitButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }

    /*事件-查看用户信息*/
    class ViewInfoListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"viewP");
            viewInfoPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            viewInfoButton.setContentAreaFilled(true);
            viewInfoButton.setOpaque(false);
            viewInfoButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            viewInfoButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-修改用户信息*/
    class ModifyInfoListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"modifyInfoP");
            modifyInfoPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            modifyInfoButton.setContentAreaFilled(true);
            modifyInfoButton.setOpaque(false);
            modifyInfoButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            modifyInfoButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-增添用户*/
    class AddUserListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"addP");
            addUserPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            addUserButton.setContentAreaFilled(true);
            addUserButton.setOpaque(false);
            addUserButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            addUserButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-删除用户*/
    class DeleteUserListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"deleteP");
            deleteUserPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            deleteUserButton.setContentAreaFilled(true);
            deleteUserButton.setOpaque(false);
            deleteUserButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            deleteUserButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-重置密码*/
    class KeyListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"keyP");
            keyPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            keyButton.setContentAreaFilled(true);
            keyButton.setOpaque(false);
            keyButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            keyButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-公告修改*/
    class ModifyNoteListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"modifyNoteP");
            modifyNotePanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            modifyNoteButton.setContentAreaFilled(true);
            modifyNoteButton.setOpaque(false);
            modifyNoteButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            modifyNoteButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-个人信息*/
    class PerInfoListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"perInfoP");
            perInfoPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            perInfoButton.setContentAreaFilled(true);
            perInfoButton.setOpaque(false);
            perInfoButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            perInfoButton.setContentAreaFilled(false);
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

        contain = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        navPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        notePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navPanel.setBackground(new java.awt.Color(51, 255, 102));

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        menuPanel.setBackground(new java.awt.Color(153, 204, 0));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        notePanel.setBackground(new java.awt.Color(204, 0, 153));

        javax.swing.GroupLayout notePanelLayout = new javax.swing.GroupLayout(notePanel);
        notePanel.setLayout(notePanelLayout);
        notePanelLayout.setHorizontalGroup(
            notePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );
        notePanelLayout.setVerticalGroup(
            notePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout containLayout = new javax.swing.GroupLayout(contain);
        contain.setLayout(containLayout);
        containLayout.setHorizontalGroup(
            containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containLayout.setVerticalGroup(
            containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(contain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(final UserInfoVO v,final String ip,final int port) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain(v,ip,port).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JPanel contain;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPanel notePanel;
    // End of variables declaration//GEN-END:variables
    /*GUI-frame背景*/
    private ImageIconFactory image;
    private JLabel backLabel;//背景label
    private JPanel backPanel;//frame最上层面板
    private JButton exitButton;//退出系统
    /*GUI-主面板（含导航）*/
    static CardLayout card;//卡片式布局
    /*GUI-导航*/
    private Navigation navigation;
    /*GUI-菜单面板*/
    private JButton viewInfoButton;//查看用户信息
    private JButton modifyInfoButton;//修改用户信息
    private JButton addUserButton;//增添用户
    private JButton deleteUserButton;//删除用户
    private JButton keyButton;//重置密码
    private JButton modifyNoteButton;//公告修改
    private JButton perInfoButton;//个人信息
    private JLabel viewInfoLabel;
    private JLabel modifyInfoLabel;
    private JLabel addUserLabel;
    private JLabel deleteUserLabel;
    private JLabel keyLabel;
    private JLabel modifyNoteLabel;
    private JLabel perInfoLabel;
    /*GUI-通知面板*/
    private JButton noteButton;
    private JLabel noteLabel;
    private JLabel info1;//具体消息
    /*逻辑-切换面板*/
    private ViewInfoPanel viewInfoPanel;
    private ModifyInfoPanel modifyInfoPanel;
    private AddUserPanel addUserPanel;
    private DeleteUserPanel deleteUserPanel;
    private KeyPanel keyPanel;
    private ModifyNotePanel modifyNotePanel;
    private PerInfoPanel perInfoPanel;
    /*逻辑-任天*/
    private UserBLService userBL;
    private UserInfoVO userInfoVO;
    
}
