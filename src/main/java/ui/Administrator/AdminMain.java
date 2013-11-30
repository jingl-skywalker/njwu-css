/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;

import ui.Library.RoundBorder;
import java.awt.CardLayout;
import businesslogicservice.userblservice.UserBLService;
import businesslogicservice.userblservice.UserInfoFactory;
import ui.Administrator.adminMainPanel;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili chen
 */
public class AdminMain extends javax.swing.JFrame {

    CardLayout card = new CardLayout();
     UserInfoVO userInfo;
   UserBLService userBL;
   adminMainPanel adminMain;
    /**
     * Creates new form JWmain
     */
    public AdminMain(UserInfoVO v,String ip,int port) {
         super("南大教务系统");
         userInfo = v;
        initComponents();
        setLocationRelativeTo(this.getOwner());
         UserInfoFactory factory = new UserInfoFactory();
        userBL = factory.getUserBLService(ip, port);
        adminMainPanel.setLayout(card);
        adminMainPanel.add("main",new adminMainPanel(userInfo.getName(),this));
        adminMainPanel.add("view",new ViewUserInfoPanel(userInfo.getName(),this,userBL));
        adminMainPanel.add("modify",new ModifyUserInfoPanel(userInfo.getName(),this,userBL));
        adminMainPanel.add("add",new AddUserPanel(userInfo.getName(),this,userBL));
        adminMainPanel.add("delete",new DeleteUserPanel(userInfo.getName(),this,userBL));
        adminMainPanel.add("reset",new ResetKeyPanel(userInfo.getName(),this,userBL));
        adminMainPanel.add("perInfo",new PerInfoPanel(userInfo,this,userBL));
        adminMainPanel.add("change",new ModifyKeyPanel(userInfo,this,userBL));
        adminMainPanel.add("info",new InformMessagePanel(userInfo.getName(),this,userBL));
        
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        CSSLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        NJWUPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adminMainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        backPanel.setBackground(new java.awt.Color(0, 0, 0));
        backPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        backPanel.setPreferredSize(new java.awt.Dimension(900, 550));

        CSSLabel.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        CSSLabel.setForeground(new java.awt.Color(255, 255, 255));
        CSSLabel.setText("CSS");

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        NJWUPanel.setBackground(new java.awt.Color(233, 233, 237));
        NJWUPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        jLabel1.setText("NJWU选课系统");

        javax.swing.GroupLayout NJWUPanelLayout = new javax.swing.GroupLayout(NJWUPanel);
        NJWUPanel.setLayout(NJWUPanelLayout);
        NJWUPanelLayout.setHorizontalGroup(
            NJWUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NJWUPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(531, Short.MAX_VALUE))
        );
        NJWUPanelLayout.setVerticalGroup(
            NJWUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NJWUPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        adminMainPanel.setBackground(new java.awt.Color(0, 0, 0));
        adminMainPanel.setPreferredSize(new java.awt.Dimension(910, 410));

        javax.swing.GroupLayout adminMainPanelLayout = new javax.swing.GroupLayout(adminMainPanel);
        adminMainPanel.setLayout(adminMainPanelLayout);
        adminMainPanelLayout.setHorizontalGroup(
            adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        adminMainPanelLayout.setVerticalGroup(
            adminMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CSSLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addGap(21, 21, 21))
            .addComponent(NJWUPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(adminMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CSSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(NJWUPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
               // new AdminMain(UserInfoVO v,String ip,int port).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CSSLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel NJWUPanel;
    private javax.swing.JPanel adminMainPanel;
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    void viewGUI() {
        card.show(adminMainPanel, "view");
    }

    void mainGUI() {
        card.show(adminMainPanel, "main");
    }

    void addGUI() {
        card.show(adminMainPanel, "add");
    }

    void resetGUI() {
        card.show(adminMainPanel, "reset");
    }

    void ModifyGUI() {
        card.show(adminMainPanel, "modify");
    }

    void deleteGUI() {
        card.show(adminMainPanel, "delete");
    }

    void personInfoGUI() {
        card.show(adminMainPanel, "perInfo");
    }

    void InformMessageGUI() {
        card.show(adminMainPanel, "info");
    }

    void modifyKeyGUI() {
        card.show(adminMainPanel, "change");
    }
}
