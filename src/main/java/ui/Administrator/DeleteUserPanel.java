/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Administrator;

import enumeration.ResultMessage;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import businesslogicservice.userblservice.UserBLService;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili chen
 */
public class DeleteUserPanel extends javax.swing.JPanel {
   AdminMain frame;
   UserBLService userBL;
   ArrayList<UserInfoVO> vos;
    /**
     * Creates new form DeleteUserPanel
     */
    public DeleteUserPanel(String name,AdminMain frame,UserBLService userBL) {
        initComponents();
        this.frame= frame;
        this.userBL = userBL;
        nameLogo2.setText(name);
        deleteButton.setEnabled(false);
         vos = userBL.getUser();
        String[][] content = new String[vos.size()][4];
        for(int i=0;i<vos.size();i++){

        //初始化table
        
            content[i] = vos.get(i).getModifyInfo();
        }
        String[] head = UserInfoVO.getModifyHeader();
        DefaultTableModel model = new DefaultTableModel(content, head) {
            public boolean isCellEditable(int row, int column) {
             return false;
            }
        };
        userListTable.setModel(model);
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
        toTextField = new javax.swing.JTextField();
        fromTextField = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        fromeLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        userListPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();
        IDTextField = new javax.swing.JTextField();
        yearComboBox = new javax.swing.JComboBox();
        typeComboBox = new javax.swing.JComboBox();
        insComboBox = new javax.swing.JComboBox();
        beginIDTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteAllButton = new javax.swing.JButton();
        allButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

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
        currentLogo3.setText("delete");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrowLogo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentLogo3)
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

        toTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        toTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        toTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toTextFieldActionPerformed(evt);
            }
        });

        fromTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        fromTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fromTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTextFieldActionPerformed(evt);
            }
        });

        toLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        toLabel.setForeground(new java.awt.Color(204, 204, 204));
        toLabel.setText("to");

        fromeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        fromeLabel.setForeground(new java.awt.Color(204, 204, 204));
        fromeLabel.setText("from");

        idLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(204, 204, 204));
        idLabel.setText("ID：");

        userListPanel.setBackground(new java.awt.Color(0, 0, 0));
        userListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "用户列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        userListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        userListTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        userListTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                int s[] = userListTable.getSelectedRows();
                if(s.length<1)
                return;
                if(s[0]>=0){
                    TableValueChanged(s[0]);

                }
            }
        });
        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "入学年份", "类型", "院系"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        IDTextField.setText("请输入ID");
        IDTextField.setPreferredSize(new java.awt.Dimension(48, 15));
        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });
        IDTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDTextFieldFocusGained(evt);
            }
        });

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "2013", "2012", "2011", "2010" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "学生", "任课老师", "院教务员", "教务处老师" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        insComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "软件学院", "商学院", "政府管理学院", "法学院" }));
        insComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userListPanelLayout = new javax.swing.GroupLayout(userListPanel);
        userListPanel.setLayout(userListPanelLayout);
        userListPanelLayout.setHorizontalGroup(
            userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(userListPanelLayout.createSequentialGroup()
                        .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        userListPanelLayout.setVerticalGroup(
            userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userListPanelLayout.createSequentialGroup()
                .addGroup(userListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IDTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insComboBox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        beginIDTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        beginIDTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        beginIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginIDTextFieldActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        searchButton.setText("查找");
        searchButton.setToolTipText("Enter");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        deleteAllButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        deleteAllButton.setText("批量删除");
        deleteAllButton.setActionCommand("批量所有");
        deleteAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllButtonActionPerformed(evt);
            }
        });

        allButton.setText("AllDisplay");
        allButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allButtonActionPerformed(evt);
            }
        });

        jButton1.setText("开始ID");
        jButton1.setToolTipText("查找已输入ID开始的所有学号");
        jButton1.setEnabled(false);

        searchButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        searchButton1.setText("查找");
        searchButton1.setToolTipText("Enter");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        deleteButton.setText("删除");
        deleteButton.setActionCommand("批量所有");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(userListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(allButton)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(idLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(fromeLabel)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(toLabel)
                            .addGap(18, 18, 18)
                            .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(44, 44, 44)
                            .addComponent(beginIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(allButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(fromeLabel)
                            .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toLabel)
                            .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchButton1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(beginIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deleteButton)))
                        .addGap(18, 18, 18)
                        .addComponent(deleteAllButton)
                        .addGap(43, 43, 43))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void currentLogo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo2MouseClicked
        // TODO add your handling code here:
        frame.mainGUI();
    }//GEN-LAST:event_currentLogo2MouseClicked

    private void currentLogo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo2MouseEntered
        // TODO add your handling code here:
        currentLogo2.setForeground(Color.red);
    }//GEN-LAST:event_currentLogo2MouseEntered

    private void currentLogo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentLogo2MouseExited
        // TODO add your handling code here:
        currentLogo2.setForeground(Color.black);
    }//GEN-LAST:event_currentLogo2MouseExited

    private void IDTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDTextFieldFocusGained
        // TODO add your handling code here:
        IDTextField.setText("");
    }//GEN-LAST:event_IDTextFieldFocusGained

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed
        // TODO add your handling code here:
                 String ID = IDTextField.getText();
        if(ID.equals("")||ID.equals("请输入ID")){
            ID = null;
        }
        String year = (String) yearComboBox.getSelectedItem();
        String type = (String) typeComboBox.getSelectedItem();
        String ins = (String) insComboBox.getSelectedItem();
        vos = userBL.getUser(ID, year, type, ins);
         String[][] content = new String[vos.size()][7];
        for(int i=0;i<vos.size();i++){
            content[i] = vos.get(i).getModifyInfo();
        }
        String[] head = UserInfoVO.getModifyHeader();
        DefaultTableModel model = new DefaultTableModel(content, head) {
            public boolean isCellEditable(int row, int column) {
             return false;
            }
        };
        userListTable.setModel(model);

    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
        IDTextFieldActionPerformed(evt);
    }//GEN-LAST:event_yearComboBoxActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
        IDTextFieldActionPerformed(evt);
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void insComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insComboBoxActionPerformed
        // TODO add your handling code here:
        IDTextFieldActionPerformed(evt);
    }//GEN-LAST:event_insComboBoxActionPerformed

    private void fromTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTextFieldActionPerformed
        // TODO add your handling code here:
        searchButton1ActionPerformed(evt);
    }//GEN-LAST:event_fromTextFieldActionPerformed

    private void allButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allButtonActionPerformed
        // TODO add your handling code here:
         vos = userBL.getUser();
        String[][] content = new String[vos.size()][4];
        for(int i=0;i<vos.size();i++){

        //初始化table
        
            content[i] = vos.get(i).getModifyInfo();
        }
        String[] head = UserInfoVO.getModifyHeader();
        DefaultTableModel model = new DefaultTableModel(content, head) {
            public boolean isCellEditable(int row, int column) {
             return false;
            }
        };
        userListTable.setModel(model);
        IDTextField.setText("请输入ID");
        yearComboBox.setSelectedIndex(0);
        typeComboBox.setSelectedIndex(0);
        insComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_allButtonActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
                String fromID = fromTextField.getText();
        String toID = toTextField.getText();
        vos = userBL.getUser(fromID,toID);
        String[][] content = new String[vos.size()][4];
        for(int i=0;i<vos.size();i++){
            content[i] = vos.get(i).getModifyInfo();
        }
        String[] head = UserInfoVO.getModifyHeader();
        DefaultTableModel model = new DefaultTableModel(content, head) {
            public boolean isCellEditable(int row, int column) {
             return false;
            }
        };
        userListTable.setModel(model);

    }//GEN-LAST:event_searchButton1ActionPerformed

    private void toTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toTextFieldActionPerformed
        // TODO add your handling code here:
        searchButton1ActionPerformed(evt);
    }//GEN-LAST:event_toTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String beginID = beginIDTextField.getText();
        vos = userBL.getUser(beginID);
        //更新table
        String[][] content = new String[vos.size()][4];
        for(int i=0;i<vos.size();i++){
            content[i] = vos.get(i).getModifyInfo();
        }
        String[] head = UserInfoVO.getModifyHeader();
        DefaultTableModel model = new DefaultTableModel(content, head) {
            public boolean isCellEditable(int row, int column) {
             return false;
            }
        };
        userListTable.setModel(model);

    }//GEN-LAST:event_searchButtonActionPerformed

    private void beginIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginIDTextFieldActionPerformed
        // TODO add your handling code here:
        searchButtonActionPerformed(evt);
    }//GEN-LAST:event_beginIDTextFieldActionPerformed

    public void TableValueChanged(int s){
        final UserInfoVO       delete = vos.get(s);
        deleteButton.setEnabled(true);
        deleteButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(!vos.contains(delete)){
                    return;
                }
             if(userBL.delete(delete)==ResultMessage.SUCCESS){
         deleteButton.setEnabled(false);
 JOptionPane.showConfirmDialog(frame, "删除成功！", null, JOptionPane.OK_OPTION);
 
vos.remove(delete);
  String[][] content = new String[vos.size()][4];
        for(int i=0;i<vos.size();i++){

        //初始化table
        
            content[i] = vos.get(i).getModifyInfo();
        }
        String[] head = UserInfoVO.getModifyHeader();
        DefaultTableModel model = new DefaultTableModel(content, head) {
            public boolean isCellEditable(int row, int column) {
             return false;
            }
        };
        userListTable.setModel(model);
         userListTable.invalidate();
        }
        else{
            JOptionPane.showConfirmDialog(frame, "删除失败", null, JOptionPane.OK_OPTION);
        }
}
}); 
    }
    private void deleteAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllButtonActionPerformed
        // TODO add your handling code here:
        
        if(userBL.deletUser(vos)==ResultMessage.SUCCESS){
            vos.clear();
            JOptionPane.showConfirmDialog(this, "删除成功！", null, JOptionPane.OK_OPTION);
         String[] head = UserInfoVO.getModifyHeader();
        DefaultTableModel model = new DefaultTableModel(null, head);
        userListTable.setModel(model);
        }
        else{
            JOptionPane.showConfirmDialog(this, "删除失败", null, JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_deleteAllButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDTextField;
    private javax.swing.JButton allButton;
    private javax.swing.JLabel arrowLogo2;
    private javax.swing.JLabel arrowLogo3;
    private javax.swing.JLabel backLabel2;
    private javax.swing.JLabel backLogo2;
    private javax.swing.JTextField beginIDTextField;
    private javax.swing.JLabel currentLogo2;
    private javax.swing.JLabel currentLogo3;
    private javax.swing.JButton deleteAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel exitLabel2;
    private javax.swing.JLabel exitLogo2;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JLabel fromeLabel;
    private javax.swing.JLabel homeLabel2;
    private javax.swing.JLabel homeLogo2;
    private javax.swing.JLabel idLabel;
    private javax.swing.JComboBox insComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLogo2;
    private javax.swing.JLabel peopleLogo2;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton1;
    private javax.swing.JPanel titelPanel2;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toTextField;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JPanel userListPanel;
    private javax.swing.JTable userListTable;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables
}
