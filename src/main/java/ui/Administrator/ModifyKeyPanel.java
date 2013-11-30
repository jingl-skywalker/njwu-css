/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;

import enumeration.ResultMessage;
import java.awt.Color;
import javax.swing.JOptionPane;
import businesslogicservice.userblservice.UserBLService;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili chen
 */
public class ModifyKeyPanel extends javax.swing.JPanel {
UserInfoVO v;
AdminMain frame;
UserBLService userBL;
    /**
     * Creates new form ModifyKeyPanel
     */
    public ModifyKeyPanel(UserInfoVO v,AdminMain frame,UserBLService userBL) {
        initComponents();
        this.v =v;
        this.frame =frame;
        this.userBL =userBL;
        nameLogo2.setText(v.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titelPanel2 = new javax.swing.JPanel();
        peopleLogo2 = new javax.swing.JLabel();
        nameLogo2 = new javax.swing.JLabel();
        arrowLogo2 = new javax.swing.JLabel();
        currentLogo2 = new javax.swing.JLabel();
        backLogo2 = new javax.swing.JLabel();
        backLabel2 = new javax.swing.JLabel();
        homeLogo2 = new javax.swing.JLabel();
        homeLabel2 = new javax.swing.JLabel();
        exitLogo2 = new javax.swing.JLabel();
        exitLabel2 = new javax.swing.JLabel();
        arrowLogo3 = new javax.swing.JLabel();
        currentLogo3 = new javax.swing.JLabel();
        arrowLogo4 = new javax.swing.JLabel();
        nameLogo3 = new javax.swing.JLabel();
        modifyPanel = new javax.swing.JPanel();
        newKeyLabel = new javax.swing.JLabel();
        newKeyLabel2 = new javax.swing.JLabel();
        setKeyButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        newPasswordField1 = new javax.swing.JPasswordField();
        newPasswordField2 = new javax.swing.JPasswordField();
        oldPasswordField = new javax.swing.JPasswordField();
        newKeyLabel1 = new javax.swing.JLabel();
        tipLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        titelPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titelPanel2.setPreferredSize(new java.awt.Dimension(365, 37));

        peopleLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        peopleLogo2.setText("Logo");

        nameLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLogo2.setText("name");

        arrowLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo2.setText("->");

        currentLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        currentLogo2.setText("首页");
        currentLogo2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currentLogo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentLogo2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentLogo2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentLogo2MouseExited(evt);
            }
        });

        backLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLogo2.setText("Logo");

        backLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLabel2.setText("back");

        homeLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLogo2.setText("Logo");

        homeLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLabel2.setText("home");

        exitLogo2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLogo2.setText("Logo");

        exitLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLabel2.setText("exit");

        arrowLogo3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo3.setText("->");

        currentLogo3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        currentLogo3.setText("personInfo");
        currentLogo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        currentLogo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentLogo3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentLogo3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentLogo3MouseExited(evt);
            }
        });

        arrowLogo4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo4.setText("->");

        nameLogo3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLogo3.setText("modifyPsw");

        javax.swing.GroupLayout titelPanel2Layout = new javax.swing.GroupLayout(titelPanel2);
        titelPanel2.setLayout(titelPanel2Layout);
        titelPanel2Layout.setHorizontalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peopleLogo2)
                .addGap(18, 18, 18)
                .addComponent(nameLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrowLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrowLogo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentLogo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrowLogo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLogo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backLabel2)
                .addGap(18, 18, 18)
                .addComponent(homeLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLabel2)
                .addGap(18, 18, 18)
                .addComponent(exitLogo2)
                .addGap(5, 5, 5)
                .addComponent(exitLabel2)
                .addContainerGap())
        );
        titelPanel2Layout.setVerticalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peopleLogo2)
                    .addComponent(nameLogo2)
                    .addComponent(arrowLogo2)
                    .addComponent(currentLogo2)
                    .addComponent(backLogo2)
                    .addComponent(backLabel2)
                    .addComponent(homeLogo2)
                    .addComponent(homeLabel2)
                    .addComponent(exitLogo2)
                    .addComponent(exitLabel2)
                    .addComponent(arrowLogo3)
                    .addComponent(currentLogo3)
                    .addComponent(arrowLogo4)
                    .addComponent(nameLogo3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        modifyPanel.setBackground(new java.awt.Color(0, 0, 0));

        newKeyLabel.setBackground(new java.awt.Color(0, 0, 0));
        newKeyLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        newKeyLabel.setForeground(new java.awt.Color(204, 204, 204));
        newKeyLabel.setText("新密码");

        newKeyLabel2.setBackground(new java.awt.Color(0, 0, 0));
        newKeyLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        newKeyLabel2.setForeground(new java.awt.Color(204, 204, 204));
        newKeyLabel2.setText("新密码确认");

        setKeyButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        setKeyButton.setText("确认");
        setKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setKeyButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        cancelButton.setText("取消");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        newPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordField1ActionPerformed(evt);
            }
        });

        newPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordField2ActionPerformed(evt);
            }
        });

        oldPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPasswordFieldActionPerformed(evt);
            }
        });

        newKeyLabel1.setBackground(new java.awt.Color(0, 0, 0));
        newKeyLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        newKeyLabel1.setForeground(new java.awt.Color(204, 204, 204));
        newKeyLabel1.setText("原密码");

        tipLabel.setForeground(new java.awt.Color(255, 0, 51));
        tipLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout modifyPanelLayout = new javax.swing.GroupLayout(modifyPanel);
        modifyPanel.setLayout(modifyPanelLayout);
        modifyPanelLayout.setHorizontalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newKeyLabel)
                            .addComponent(newKeyLabel2)
                            .addComponent(newKeyLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPasswordField1)
                            .addComponent(newPasswordField2)
                            .addComponent(oldPasswordField)))
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(setKeyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addGap(25, 25, 25)))
                .addGap(103, 103, 103))
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(tipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        modifyPanelLayout.setVerticalGroup(
            modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modifyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modifyPanelLayout.createSequentialGroup()
                        .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newKeyLabel1))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modifyPanelLayout.createSequentialGroup()
                        .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newKeyLabel)
                            .addComponent(newPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newKeyLabel2)
                    .addComponent(newPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tipLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(modifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(setKeyButton))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(modifyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(modifyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void currentLogo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo2MouseEntered
        // TODO add your handling code here:
        currentLogo2.setForeground(Color.red);
    }//GEN-LAST:event_currentLogo2MouseEntered

    private void currentLogo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo2MouseExited
        // TODO add your handling code here:
        currentLogo2.setForeground(Color.black);
    }//GEN-LAST:event_currentLogo2MouseExited

    private void currentLogo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_currentLogo3MouseEntered

    private void currentLogo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_currentLogo3MouseExited

    private void currentLogo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo2MouseClicked
        // TODO add your handling code here:
        frame.mainGUI();
    }//GEN-LAST:event_currentLogo2MouseClicked

    private void currentLogo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo3MouseClicked
        // TODO add your handling code here:
        frame.personInfoGUI();
    }//GEN-LAST:event_currentLogo3MouseClicked

    private void newPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordField1ActionPerformed
        // TODO add your handling code here:
         setKeyButtonActionPerformed(evt);
    }//GEN-LAST:event_newPasswordField1ActionPerformed

    private void newPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordField2ActionPerformed
        // TODO add your handling code here:
         setKeyButtonActionPerformed(evt);
    }//GEN-LAST:event_newPasswordField2ActionPerformed

    private void oldPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldPasswordFieldActionPerformed
        // TODO add your handling code here:
        setKeyButtonActionPerformed(evt);
    }//GEN-LAST:event_oldPasswordFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        oldPasswordField.setText("");
        newPasswordField2.setText("");
        newPasswordField1.setText("");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void setKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setKeyButtonActionPerformed
        // TODO add your handling code here:
        String s1 = new String(oldPasswordField.getPassword());
        if(!v.getPsw().equals(s1)){
            tipLabel.setText("原密码不对");
            return;
        }
        String s2 = new String(newPasswordField1.getPassword());
        String s3 = new String(newPasswordField2.getPassword());
        if(!s2.equals(s3)){
            tipLabel.setText("两次密码不一致");
            return;
        }
        v.setPsw(s3);
         if(userBL.changeAdminInfo(v)==ResultMessage.SUCCESS){
            JOptionPane.showConfirmDialog(this, "修改成功！", null, JOptionPane.OK_OPTION);
         }
        else{
            JOptionPane.showConfirmDialog(this, "修改失败", null, JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_setKeyButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowLogo2;
    private javax.swing.JLabel arrowLogo3;
    private javax.swing.JLabel arrowLogo4;
    private javax.swing.JLabel backLabel2;
    private javax.swing.JLabel backLogo2;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel currentLogo2;
    private javax.swing.JLabel currentLogo3;
    private javax.swing.JLabel exitLabel2;
    private javax.swing.JLabel exitLogo2;
    private javax.swing.JLabel homeLabel2;
    private javax.swing.JLabel homeLogo2;
    private javax.swing.JPanel modifyPanel;
    private javax.swing.JLabel nameLogo2;
    private javax.swing.JLabel nameLogo3;
    private javax.swing.JLabel newKeyLabel;
    private javax.swing.JLabel newKeyLabel1;
    private javax.swing.JLabel newKeyLabel2;
    private javax.swing.JPasswordField newPasswordField1;
    private javax.swing.JPasswordField newPasswordField2;
    private javax.swing.JPasswordField oldPasswordField;
    private javax.swing.JLabel peopleLogo2;
    private javax.swing.JButton setKeyButton;
    private javax.swing.JLabel tipLabel;
    private javax.swing.JPanel titelPanel2;
    // End of variables declaration//GEN-END:variables
}
