/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;

import enumeration.ResultMessage;
import java.awt.Color;
import java.awt.FileDialog;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import businesslogicservice.userblservice.UserBLService;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili chen
 */
public class AddUserPanel extends javax.swing.JPanel {
    AdminMain frame;
    UserBLService userBL;
    /**
     * Creates new form AddUserPanel
     */
    public AddUserPanel(String name,AdminMain frame,UserBLService userBL) {
        initComponents();
        this.frame = frame;
        this.userBL = userBL;
        currentLogo2.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filePathLabel = new javax.swing.JLabel();
        filePathTextField = new javax.swing.JTextField();
        openButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
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
        filePathLabel1 = new javax.swing.JLabel();
        filePathTextField1 = new javax.swing.JTextField();
        openButton1 = new javax.swing.JButton();
        submitButton1 = new javax.swing.JButton();
        userListPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();

        filePathLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        filePathLabel.setForeground(new java.awt.Color(204, 204, 204));
        filePathLabel.setText("文件路径");

        filePathTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        filePathTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        openButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        openButton.setText("打开");

        submitButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        submitButton.setText("提交");

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
        currentLogo2.setText("add");
        currentLogo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        currentLogo3.setText("首页");
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
                .addComponent(currentLogo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arrowLogo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentLogo2)
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
                    .addComponent(currentLogo3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filePathLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        filePathLabel1.setForeground(new java.awt.Color(204, 204, 204));
        filePathLabel1.setText("文件路径");

        filePathTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        filePathTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        filePathTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathTextField1ActionPerformed(evt);
            }
        });

        openButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        openButton1.setText("打开");
        openButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButton1ActionPerformed(evt);
            }
        });

        submitButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        submitButton1.setText("提交");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        userListPanel.setBackground(new java.awt.Color(0, 0, 0));
        userListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "用户列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        userListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        userListTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "入学年份", "类型", "院系", "姓名", "性别", "身份证"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userListTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(userListTable);

        javax.swing.GroupLayout userListPanelLayout = new javax.swing.GroupLayout(userListPanel);
        userListPanel.setLayout(userListPanelLayout);
        userListPanelLayout.setHorizontalGroup(
            userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
        );
        userListPanelLayout.setVerticalGroup(
            userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(filePathLabel1)
                .addGap(26, 26, 26)
                .addComponent(filePathTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(openButton1)
                .addGap(36, 36, 36)
                .addComponent(submitButton1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(userListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filePathLabel1)
                    .addComponent(filePathTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openButton1)
                    .addComponent(submitButton1))
                .addGap(18, 18, 18)
                .addComponent(userListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void currentLogo3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo3MouseEntered
        // TODO add your handling code here:
        currentLogo3.setForeground(Color.red);
    }//GEN-LAST:event_currentLogo3MouseEntered

    private void currentLogo3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo3MouseExited
        // TODO add your handling code here:
        currentLogo3.setForeground(Color.black);
    }//GEN-LAST:event_currentLogo3MouseExited

    private void openButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButton1ActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(frame,"请选择文件：",FileDialog.LOAD);
        fileDialog.setVisible(true);
        String directory = fileDialog.getDirectory();
        String file  = fileDialog.getFile();
        filePathTextField1.setText(directory+"\\"+file);
      
    }//GEN-LAST:event_openButton1ActionPerformed

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        // TODO add your handling code here:
        String file = filePathTextField1.getText();
         if(file==null||file.equals("")){
             JOptionPane.showConfirmDialog(frame, "找不到文件", null, JOptionPane.OK_CANCEL_OPTION); 
             return;
        }
        else{
             ArrayList<UserInfoVO> vos;
             if ((vos = userBL.addUser(file)) != null) {
                 JOptionPane.showConfirmDialog(frame, "添加成功", null, JOptionPane.OK_CANCEL_OPTION);

                 //跟新table
                 String[][] content = new String[vos.size()][7];
                 for (int i = 0; i < vos.size(); i++) {
                     content[i] = vos.get(i).getViewInfor();
                 }
                 String[] head = UserInfoVO.getViewHeader();
                 DefaultTableModel model = new DefaultTableModel(content, head) {

                     public boolean isCellEditable(int row, int column) {
                         return false;
                     }
                 };
            userListTable.setModel(model);

            }
            else{
                JOptionPane.showConfirmDialog(frame, "添加失败");   
            }
        }
    }//GEN-LAST:event_submitButton1ActionPerformed

    private void filePathTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathTextField1ActionPerformed
        // TODO add your handling code here:
        submitButton1ActionPerformed(evt);
    }//GEN-LAST:event_filePathTextField1ActionPerformed

    private void currentLogo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo3MouseClicked
        // TODO add your handling code here:
        frame.mainGUI();
    }//GEN-LAST:event_currentLogo3MouseClicked

     /**
     * 跟新此界面
     */
    public void update(){
        filePathTextField1.setText("");
        userListTable.removeAll();
    }
    public void updateName(String name){
         nameLogo2.setText(name);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowLogo2;
    private javax.swing.JLabel arrowLogo3;
    private javax.swing.JLabel backLabel2;
    private javax.swing.JLabel backLogo2;
    private javax.swing.JLabel currentLogo2;
    private javax.swing.JLabel currentLogo3;
    private javax.swing.JLabel exitLabel2;
    private javax.swing.JLabel exitLogo2;
    private javax.swing.JLabel filePathLabel;
    private javax.swing.JLabel filePathLabel1;
    private javax.swing.JTextField filePathTextField;
    private javax.swing.JTextField filePathTextField1;
    private javax.swing.JLabel homeLabel2;
    private javax.swing.JLabel homeLogo2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLogo2;
    private javax.swing.JButton openButton;
    private javax.swing.JButton openButton1;
    private javax.swing.JLabel peopleLogo2;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitButton1;
    private javax.swing.JPanel titelPanel2;
    private javax.swing.JPanel userListPanel;
    private javax.swing.JTable userListTable;
    // End of variables declaration//GEN-END:variables
}