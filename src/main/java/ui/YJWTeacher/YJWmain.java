/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.YJWTeacher;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili Chen
 */
public class YJWMain extends javax.swing.JFrame {

    /**
     * Creates new form YJWMain
     */
    public YJWMain(UserInfoVO v,String ip,int port) {
        initComponents();
        /*GUI-frame背景*/
        backP = new ImageIcon("src/Picture/backround.gif");
        backLabel = new JLabel(backP);
        backLabel.setBounds(0, 0, 1024, 625);
        getLayeredPane().add(backLabel,new Integer(Integer.MIN_VALUE));
        backPanel = (JPanel)getContentPane();
        backPanel.setOpaque(false);//设置透明
        exitP = new ImageIcon("src/Picture/close.gif");//退出系统按钮
        exitButton = new JButton(exitP);
        exitButton.addMouseListener(new ExitListener());
        add(exitButton,0,0);
        exitButton.setBounds(965,7,exitP.getIconWidth(),exitP.getIconHeight());
        exitButton.setContentAreaFilled(false);
        /*GUI-主界面*/
        card = new CardLayout();
        contain.setLayout(card);
        contain.add(mainPanel,"mainP");
        contain.setOpaque(false);
        mainPanel.setOpaque(false);
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
        /*GUI-通知面板*/
        notePanel.setOpaque(false);
        noteP = new ImageIcon("src/Picture/note.gif");
        noteTP = new ImageIcon("src/Picture/noteT.gif");
        noteButton = new JButton(noteP);
        noteLabel = new JLabel(noteTP);
        notePanel.add(noteButton,0,0);
        notePanel.add(noteLabel,0,0);
        noteButton.setBounds(30,20,noteP.getIconWidth(),noteP.getIconHeight());
        noteButton.setContentAreaFilled(false);
        noteLabel.setBounds(90,30,noteTP.getIconWidth(),noteTP.getIconHeight());
        info1 = new JLabel("> 2013-2014选课通知");
        notePanel.add(info1,0,0);
        info1.setBounds(95,80,350, 30);
        info1.setFont(new Font("迷你简少儿",0,18));
        info1.setForeground(Color.white);
        /*GUI-菜单面板*/
        menuPanel.setOpaque(false);
        planP = new ImageIcon("src/Picture/electivegym.png");
        viewCourseP = new ImageIcon("src/Picture/guiderplan.png");
        courseInfoP = new ImageIcon("src/Picture/executeplan.png");
        newTermP = new ImageIcon("src/Picture/elective.png");
        perInfoP = new ImageIcon("src/Picture/personal.png");
        planTP = new ImageIcon("src/Picture/plan.gif");
        viewCourseTP = new ImageIcon("src/Picture/viewCourse.gif");
        courseInfoTP = new ImageIcon("src/Picture/courseInfo.gif");
        newTermTP = new ImageIcon("src/Picture/newTerm.gif");
        perInfoTP = new ImageIcon("src/Picture/perInfo.gif");
        planButton = new JButton(planP);
        viewCourseButton = new JButton(viewCourseP);
        courseInfoButton = new JButton(courseInfoP);
        newTermButton = new JButton(newTermP);
        perInfoButton = new JButton(perInfoP);
        planLabel = new JLabel(planTP);
        viewCourseLabel = new JLabel(viewCourseTP);
        courseInfoLabel = new JLabel(courseInfoTP);
        newTermLabel = new JLabel(newTermTP);
        perInfoLabel = new JLabel(perInfoTP);
        planButton.addMouseListener(new PlanListener());//录入教学计划
        menuPanel.add(planButton,0,0);
        menuPanel.add(planLabel,0,0);
        planButton.setBounds(114,44,planP.getIconWidth(),planP.getIconHeight());
        planButton.setContentAreaFilled(false);
        planLabel.setBounds(110,110,planTP.getIconWidth(),planTP.getIconHeight());
        viewCourseButton.addMouseListener(new ViewCourseListener());//查看课程
        menuPanel.add(viewCourseButton,0,0);
        menuPanel.add(viewCourseLabel,0,0);
        viewCourseButton.setBounds(220,45,viewCourseP.getIconWidth(),viewCourseP.getIconHeight());
        viewCourseButton.setContentAreaFilled(false);
        viewCourseLabel.setBounds(220,110,viewCourseTP.getIconWidth(),viewCourseTP.getIconHeight());
        courseInfoButton.addMouseListener(new CourseInfoListener());//完善课程信息
        menuPanel.add(courseInfoButton,0,0);
        menuPanel.add(courseInfoLabel,0,0);
        courseInfoButton.setBounds(331,39,courseInfoP.getIconWidth(),courseInfoP.getIconHeight());
        courseInfoButton.setContentAreaFilled(false);
        courseInfoLabel.setBounds(326,106,courseInfoTP.getIconWidth(),courseInfoTP.getIconHeight());
        newTermButton.addMouseListener(new NewTermListener());//开设新学期
        menuPanel.add(newTermButton,0,0);
        menuPanel.add(newTermLabel,0,0);
        newTermButton.setBounds(112,170,newTermP.getIconWidth(),newTermP.getIconHeight());
        newTermButton.setContentAreaFilled(false);
        newTermLabel.setBounds(105,238,newTermTP.getIconWidth(),newTermTP.getIconHeight());
        perInfoButton.addMouseListener(new PerInfoListener());//个人信息
        menuPanel.add(perInfoButton,0,0);
        menuPanel.add(perInfoLabel,0,0);
        perInfoButton.setBounds(220,172,perInfoP.getIconWidth(),perInfoP.getIconHeight());
        perInfoButton.setContentAreaFilled(false);
        perInfoLabel.setBounds(220,238,perInfoTP.getIconWidth(),perInfoTP.getIconHeight());
        /*逻辑-切换面板*/
        planPanel = new PlanPanel(v,ip,port);
        viewCoursePanel = new ViewCoursePanel(v,ip,port);
        courseInfoPanel = new CourseInfoPanel(v,ip,port);
        newTermPanel = new NewTermPanel(v,ip,port);
        perInfoPanel = new PerInfoPanel(v,ip,port);
        contain.add(planPanel,"planP");
        contain.add(viewCoursePanel,"viewCourseP");
        contain.add(courseInfoPanel,"courseInfoP");
        contain.add(newTermPanel,"newTermP");
        contain.add(perInfoPanel,"perInfoP");
        /*逻辑-任天*/
        userInfo = v;
        this.ip = ip;
        this.port = port;
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
    
    /*事件-back*/
    class BackListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
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

    /*事件-录入教学计划*/
    class PlanListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"planP");
            planPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            planButton.setContentAreaFilled(true);
            planButton.setOpaque(false);
            planButton.setBackground(Color.black);
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
    
    /*事件-查看课程*/
    class ViewCourseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"viewCourseP");
            viewCoursePanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            viewCourseButton.setContentAreaFilled(true);
            viewCourseButton.setOpaque(false);
            viewCourseButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            viewCourseButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-完善课程信息*/
    class CourseInfoListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"courseInfoP");
            courseInfoPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            courseInfoButton.setContentAreaFilled(true);
            courseInfoButton.setOpaque(false);
            courseInfoButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            courseInfoButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-开设新学期*/
    class NewTermListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(contain,"newTermP");
            newTermPanel.update();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            newTermButton.setContentAreaFilled(true);
            newTermButton.setOpaque(false);
            newTermButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            newTermButton.setContentAreaFilled(false);
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
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGap(0, 356, Short.MAX_VALUE)
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
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(notePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout containLayout = new javax.swing.GroupLayout(contain);
        contain.setLayout(containLayout);
        containLayout.setHorizontalGroup(
            containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containLayout.setVerticalGroup(
            containLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containLayout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(contain, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(YJWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YJWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YJWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YJWMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YJWMain(v,ip,port).setVisible(true);
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
    private ImageIcon backP;//背景图片
    private JLabel backLabel;//背景label
    private JPanel backPanel;//frame最上层面板
    private JButton exitButton;//退出系统
    private ImageIcon exitP;
    /*GUI-主面板（含导航）*/
    static CardLayout card;//卡片式布局
    /*GUI-导航*/
    private ImageIcon backtoP;
    private ImageIcon homeP;
    private ImageIcon closeP;
    private JButton backButton;
    private JButton homeButton;
    private JButton closeButton;
    /*GUI-通知面板*/
    private ImageIcon noteP;
    private ImageIcon noteTP;
    private JButton noteButton;
    private JLabel noteLabel;
    private JLabel info1;//具体消息
    private JLabel info2;
    /*GUI-菜单面板*/
    private ImageIcon planP;
    private ImageIcon viewCourseP;
    private ImageIcon courseInfoP;
    private ImageIcon newTermP;
    private ImageIcon perInfoP;
    private ImageIcon planTP;
    private ImageIcon viewCourseTP;
    private ImageIcon courseInfoTP;
    private ImageIcon newTermTP;
    private ImageIcon perInfoTP;
    private JButton planButton;
    private JButton viewCourseButton;
    private JButton courseInfoButton;
    private JButton newTermButton;
    private JButton perInfoButton;
    private JLabel planLabel;
    private JLabel viewCourseLabel;
    private JLabel courseInfoLabel;
    private JLabel newTermLabel;
    private JLabel perInfoLabel;
    /*逻辑-切换面板*/
    private PlanPanel planPanel;
    private ViewCoursePanel viewCoursePanel;
    private CourseInfoPanel courseInfoPanel;
    private NewTermPanel newTermPanel;
    private PerInfoPanel perInfoPanel;
    /*逻辑-任天*/
    String ip;
    int port;
    private UserInfoVO userInfo;
}
