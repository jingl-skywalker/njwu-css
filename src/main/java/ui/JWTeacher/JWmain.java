/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import businesslogicservice.userblservice.UserBLService;
import businesslogicservice.userblservice.UserInfoFactory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ui.Admin.LoginFrame;
import ui.Library.ImageIconFactory;
import ui.Library.LogoButton;
import ui.Library.Navigation;
import ui.Library.TextLabel;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili Chen
 */
public class JWMain extends javax.swing.JFrame {

    /**
     * Creates new form JWMain
     */
    public JWMain(UserInfoVO v,String ip,int port) {
        initComponents();
        //com.sun.awt.AWTUtilities.setWindowOpaque(this,false);
         /*逻辑-任天*/
        UserInfoFactory factory = new UserInfoFactory();
        userBL = factory.getUserBLService(ip, port);
        userInfoVO = v;
        /*GUI-frame背景*/
        image = new ImageIconFactory();
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
        exit = navigation.getCloseButton();
        exit.addActionListener(new CloseListener());
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
        /*GUI-菜单面板*/
        menuPanel.setOpaque(false);
        frameButton = new LogoButton(114,44).getJBooksButton();
        planButton = new LogoButton(220,40).getJTwoPenButton();
        staticsButton = new LogoButton(330,40).getJRecycleButton();
        processButton = new LogoButton(115,170).getJPencilButton();
        courseButton = new LogoButton(220,172).getJPenButton();
        perInfoButton = new LogoButton(330,172).getJPersonButton();
        frameLabel = new TextLabel(image.getPFrameIcon(),110,110).getLabel();
        planLabel = new TextLabel(image.getPPlanIcon(),220,108).getLabel();
        staticsLabel = new TextLabel(image.getPStaticsIcon(),330,108).getLabel();
        processLabel = new TextLabel(image.getPProcessIcon(),110,238).getLabel();
        courseLabel = new TextLabel(image.getPTongshiIcon(),220,240).getLabel();
        perInfoLabel = new TextLabel(image.getPPerInfoIcon(),330,238).getLabel();
        frameButton.addMouseListener(new FrameListener());//教学框架
        menuPanel.add(frameButton);
        menuPanel.add(frameLabel);
        planButton.addMouseListener(new PlanListener());//教学计划
        menuPanel.add(planButton);
        menuPanel.add(planLabel);
        staticsButton.addMouseListener(new StaticsListener());//统计信息
        menuPanel.add(staticsButton);
        menuPanel.add(staticsLabel);
        processButton.addMouseListener(new ProcessListener());//进程管理
        menuPanel.add(processButton);
        menuPanel.add(processLabel);
        courseButton.addMouseListener(new CourseListener());//通识通修
        menuPanel.add(courseButton);
        menuPanel.add(courseLabel);
        perInfoButton.addMouseListener(new PerInfoListener());//个人信息
        menuPanel.add(perInfoButton);
        menuPanel.add(perInfoLabel);
        /*逻辑-切换面板*/
        framePanel = new FramePanel();
        planPanel = new PlanPanel();
        staticsPanel = new StaticsPanel();
        processPanel = new ProcessPanel();
        coursePanel = new CoursePanel();
        perInfoPanel = new PerInfoPanel();
        timePanel = new TimePanel();
        noticePanel = new NoticePanel();
        contain.add(framePanel,"frameP");
        contain.add(planPanel,"planP");
        contain.add(staticsPanel,"staticsP");
        contain.add(processPanel,"processP");
        contain.add(perInfoPanel,"perInfoP");
        contain.add(timePanel,"timeP");
        contain.add(coursePanel,"courseP");
        contain.add(noticePanel,"noticeP");
    }
    
    /*事件-close*/
    class CloseListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            login = new LoginFrame();
            login.setVisible(true);
            dispose();
        }
        
    }
    
    /*事件-exit*/
    class ExitListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.exit(1);
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

    /*事件-教学框架*/
    class FrameListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"frameP");
            framePanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            frameButton.setContentAreaFilled(true);
            frameButton.setBackground(Color.black);
            frameButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            frameButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-教学计划*/
    class PlanListener  implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"planP");
            planPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            planButton.setContentAreaFilled(true);
            planButton.setBackground(Color.black);
            planButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            planButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-统计信息*/
    class StaticsListener  implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"staticsP");
            staticsPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            staticsButton.setContentAreaFilled(true);
            staticsButton.setBackground(Color.black);
            staticsButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            staticsButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-进程管理*/
    class ProcessListener  implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"processP");
            processPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            processButton.setContentAreaFilled(true);
            processButton.setBackground(Color.black);
            processButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            processButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-通识通修*/
    class CourseListener  implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"courseP");
            coursePanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            courseButton.setContentAreaFilled(true);
            courseButton.setBackground(Color.black);
            courseButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            courseButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-个人信息*/
    class PerInfoListener  implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"perInfoP");
            perInfoPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            perInfoButton.setContentAreaFilled(true);
            perInfoButton.setBackground(Color.black);
            perInfoButton.setOpaque(false);
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
        setUndecorated(true);

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
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(contain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JWMain(v,ip,port).setVisible(true);
            }
        });
    }
    
    public static void main(String arg[]) {//-----------------------------
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
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JWMain(null,null,0).setVisible(true);
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
    private LoginFrame login;
    private JButton exit;
    /*GUI-通知面板*/
    private JButton noteButton;
    private JLabel noteLabel;
    private JLabel info1;//具体消息
    /*GUI-菜单面板*/
    private JButton frameButton;
    private JButton planButton;
    private JButton staticsButton;
    private JButton processButton;
    private JButton courseButton;
    private JButton perInfoButton;
    private JLabel frameLabel;
    private JLabel planLabel;
    private JLabel staticsLabel;
    private JLabel processLabel;
    private JLabel courseLabel;
    private JLabel perInfoLabel;
    /*逻辑-切换面板*/
    private FramePanel framePanel;
    private PlanPanel planPanel;
    private StaticsPanel staticsPanel;
    private ProcessPanel processPanel;
    private PerInfoPanel perInfoPanel;
    private TimePanel timePanel;
    private NoticePanel noticePanel;
    private CoursePanel coursePanel;
    /*逻辑-任天*/
    private UserBLService userBL;
    private UserInfoVO userInfoVO;
}
