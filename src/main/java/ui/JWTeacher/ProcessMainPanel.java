/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import java.awt.CardLayout;

/**
 *
 * @author zili chen
 */
public class ProcessMainPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessMainPanel
     */
    public ProcessMainPanel() {
        initComponents();
        cardLayout = new CardLayout();
        msgPanel = new SendMsgPanel();
        timePanel = new SetTimePanel();
        containPanel.setLayout(cardLayout);//----------------------------卡片面板
        containPanel. add(msgPanel,"msgP");
        containPanel. add(timePanel,"timeP");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameButton = new javax.swing.JButton();
        frameLabel = new javax.swing.JLabel();
        planButton = new javax.swing.JButton();
        planLabel = new javax.swing.JLabel();
        containPanel = new javax.swing.JPanel();
        processMainPanel = new javax.swing.JPanel();
        messageButton = new javax.swing.JButton();
        timeButton = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        frameButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        frameButton.setText("frame");

        frameLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        frameLabel.setForeground(new java.awt.Color(240, 240, 240));
        frameLabel.setText("教学框架");

        planButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        planButton.setText("plan");
        planButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planButtonActionPerformed(evt);
            }
        });

        planLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        planLabel.setForeground(new java.awt.Color(240, 240, 240));
        planLabel.setText("教学计划");

        setBackground(new java.awt.Color(0, 0, 0));

        containPanel.setBackground(new java.awt.Color(0, 0, 0));

        processMainPanel.setBackground(new java.awt.Color(0, 0, 0));

        messageButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        messageButton.setText("message");
        messageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageButtonActionPerformed(evt);
            }
        });

        timeButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        timeButton.setText("time");
        timeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeButtonActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(240, 240, 240));
        timeLabel.setText("时间安排");

        messageLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(240, 240, 240));
        messageLabel.setText("通知公告");

        javax.swing.GroupLayout processMainPanelLayout = new javax.swing.GroupLayout(processMainPanel);
        processMainPanel.setLayout(processMainPanelLayout);
        processMainPanelLayout.setHorizontalGroup(
            processMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processMainPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(processMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(processMainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(timeLabel)))
                .addGap(65, 65, 65)
                .addGroup(processMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(processMainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(messageLabel)))
                .addContainerGap(591, Short.MAX_VALUE))
        );
        processMainPanelLayout.setVerticalGroup(
            processMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(processMainPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(processMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(processMainPanelLayout.createSequentialGroup()
                        .addComponent(timeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timeLabel))
                    .addGroup(processMainPanelLayout.createSequentialGroup()
                        .addComponent(messageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messageLabel)))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containPanelLayout = new javax.swing.GroupLayout(containPanel);
        containPanel.setLayout(containPanelLayout);
        containPanelLayout.setHorizontalGroup(
            containPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(processMainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containPanelLayout.setVerticalGroup(
            containPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(processMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void planButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planButtonActionPerformed

    private void messageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(containPanel,"msgP");
        isProcess = true;
        msgPanel.refreshNoticelistUI();
   //     msgPanel.nbls.initNotices();
    }//GEN-LAST:event_messageButtonActionPerformed

    private void timeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(containPanel,"timeP");
        isProcess = true;
    }//GEN-LAST:event_timeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containPanel;
    private javax.swing.JButton frameButton;
    private javax.swing.JLabel frameLabel;
    private javax.swing.JButton messageButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton planButton;
    private javax.swing.JLabel planLabel;
    private javax.swing.JPanel processMainPanel;
    private javax.swing.JButton timeButton;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
    private boolean isProcess;//for “backLabel”：用来判断是否是process界面
    private CardLayout cardLayout;
    private SendMsgPanel msgPanel;
    private SetTimePanel timePanel;
    
    public boolean getProcess() {
        return isProcess;
    }

    public SendMsgPanel getMsgPanel() {
        return msgPanel;
    }

    public SetTimePanel getTimePanel() {
        return timePanel;
    }
    
}
