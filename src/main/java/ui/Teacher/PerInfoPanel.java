/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Teacher;

import businesslogicservice.userblservice.UserBLService;
import businesslogicservice.userblservice.UserInfoFactory;
import enumeration.ResultMessage;
import javax.swing.JOptionPane;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili chen
 */
public class PerInfoPanel extends javax.swing.JPanel {
    UserInfoVO userInfo;
    String ip;
    int port;
    TEAmain frame;
    /**
     * Creates new form PerInfoPanel
     */
    public PerInfoPanel(UserInfoVO v,TEAmain t,String ip,int port) {
        this.ip = ip;
        this.port =port;
        userInfo = v;
        frame = t;
        initComponents();
        idTextField.setText(v.getID());
        insTextField.setText(v.getDepart());
        nameTextField.setText(v.getName());
        identityTextField.setText(v.getIdentification());
        sexTextField.setText(v.getSex());
        birthTextField.setText(v.getGrade());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        identityLabel = new javax.swing.JLabel();
        modifyButton = new javax.swing.JButton();
        identityTextField = new javax.swing.JTextField();
        birthLabel = new javax.swing.JLabel();
        birthTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        insTextField = new javax.swing.JTextField();
        sexTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        insLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        insLabel.setForeground(new java.awt.Color(204, 204, 204));
        insLabel.setText("学院");

        idTextField.setEditable(false);
        idTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        nameLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(204, 204, 204));
        nameLabel.setText("姓名");

        sexLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        sexLabel.setForeground(new java.awt.Color(204, 204, 204));
        sexLabel.setText("性别");

        editButton.setBackground(new java.awt.Color(0, 0, 0));
        editButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(204, 204, 204));
        editButton.setText("编辑");
        editButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        identityLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        identityLabel.setForeground(new java.awt.Color(204, 204, 204));
        identityLabel.setText("身份证号");

        modifyButton.setBackground(new java.awt.Color(0, 0, 0));
        modifyButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        modifyButton.setForeground(new java.awt.Color(204, 204, 204));
        modifyButton.setText("修改密码");
        modifyButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        identityTextField.setEditable(false);
        identityTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        identityTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        birthLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        birthLabel.setForeground(new java.awt.Color(204, 204, 204));
        birthLabel.setText("出生年月");

        birthTextField.setEditable(false);
        birthTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        birthTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        idLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(204, 204, 204));
        idLabel.setText("工号");

        insTextField.setEditable(false);
        insTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        insTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        sexTextField.setEditable(false);
        sexTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        sexTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        nameTextField.setEditable(false);
        nameTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        saveButton.setBackground(new java.awt.Color(0, 0, 0));
        saveButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(204, 204, 204));
        saveButton.setText("保存");
        saveButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sexLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(sexTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nameLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(nameTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(idLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(identityLabel)
                                    .addComponent(insLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(insTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(identityTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(birthLabel)
                                .addGap(18, 18, 18)
                                .addComponent(birthTextField))
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insLabel)
                    .addComponent(insTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identityLabel)
                    .addComponent(identityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexLabel)
                    .addComponent(sexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthLabel)
                    .addComponent(birthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        nameTextField.setEditable(true);
        identityTextField.setEditable(true);
        birthTextField.setEditable(true);
        sexTextField.setEditable(true);
        saveButton.setEnabled(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        frame.modifyKeyGUI();
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        userInfo.setName(nameTextField.getText());
        userInfo.setIdentification(identityTextField.getText());
        userInfo.setSex(sexTextField.getText());
        userInfo.setGrade(birthTextField.getText());
          UserInfoFactory factory = new UserInfoFactory();
        UserBLService userBL = factory.getUserBLService(ip, port);
        if(userBL.changeUserInfo(userInfo)==ResultMessage.SUCCESS){
           JOptionPane.showConfirmDialog(this, "修改成功！", null, JOptionPane.OK_OPTION);
            nameTextField.setEditable(false);
        identityTextField.setEditable(false);
        birthTextField.setEditable(false);
        sexTextField.setEditable(false);
        saveButton.setEnabled(false);
        }
        else{
             JOptionPane.showConfirmDialog(this, "修改失败！", null, JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthLabel;
    private javax.swing.JTextField birthTextField;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel identityLabel;
    private javax.swing.JTextField identityTextField;
    private javax.swing.JLabel insLabel;
    private javax.swing.JTextField insTextField;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField sexTextField;
    // End of variables declaration//GEN-END:variables
 
    /**
     *设置界面为初始情况
     */
    public void update(){
              nameTextField.setEditable(false);
        identityTextField.setEditable(false);
        birthTextField.setEditable(false);
        sexTextField.setEditable(false);
        saveButton.setEnabled(false);
  }
}
