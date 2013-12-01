/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Teacher;

import ui.Library.MyTitledBorder;

/**
 *
 * @author zili chen
 */
public class CourseInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseInfoPanel
     */
    public CourseInfoPanel() {
        initComponents();
        coursePanel.setBorder(new MyTitledBorder("授课列表").getTitledBorder());
        courseInfoPanel.setBorder(new MyTitledBorder("课程信息").getTitledBorder());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        coursePanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        idTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        courseInfoPanel = new javax.swing.JPanel();
        idLabel1 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        creditLabel = new javax.swing.JLabel();
        creditComboBox = new javax.swing.JComboBox();
        hourLabel = new javax.swing.JLabel();
        hourComboBox = new javax.swing.JComboBox();
        timeLabel = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        summaryLabel = new javax.swing.JLabel();
        materialLabel = new javax.swing.JLabel();
        idTextField1 = new javax.swing.JTextField();
        nameTextField1 = new javax.swing.JTextField();
        materialLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        referenceTextArea = new javax.swing.JTextArea();
        materialTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        summaryTextArea = new javax.swing.JTextArea();
        modifyButton = new javax.swing.JButton();
        sureButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        coursePanel.setBackground(new java.awt.Color(0, 0, 0));
        coursePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "授课列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        idLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(240, 240, 240));
        idLabel.setText("课程号");

        nameLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(240, 240, 240));
        nameLabel.setText("课程名");

        courseTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "课程号", "课程名", "学分"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(courseTable);

        idTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        nameTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coursePanelLayout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(nameLabel)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        courseInfoPanel.setBackground(new java.awt.Color(0, 0, 0));
        courseInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "课程信息", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N
        java.awt.GridBagLayout courseInfoPanelLayout = new java.awt.GridBagLayout();
        courseInfoPanelLayout.columnWidths = new int[] {0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0};
        courseInfoPanelLayout.rowHeights = new int[] {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        courseInfoPanel.setLayout(courseInfoPanelLayout);

        idLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idLabel1.setForeground(new java.awt.Color(240, 240, 240));
        idLabel1.setText("课程号");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(idLabel1, gridBagConstraints);

        nameLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(240, 240, 240));
        nameLabel1.setText("课程名");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(nameLabel1, gridBagConstraints);

        typeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(240, 240, 240));
        typeLabel.setText("类型");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(typeLabel, gridBagConstraints);

        typeComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 97;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(typeComboBox, gridBagConstraints);

        creditLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(240, 240, 240));
        creditLabel.setText("学分");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(creditLabel, gridBagConstraints);

        creditComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(creditComboBox, gridBagConstraints);

        hourLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        hourLabel.setForeground(new java.awt.Color(240, 240, 240));
        hourLabel.setText("周学时");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(hourLabel, gridBagConstraints);

        hourComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        hourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(hourComboBox, gridBagConstraints);

        timeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(240, 240, 240));
        timeLabel.setText("授课时间");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(timeLabel, gridBagConstraints);

        timeTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(timeTextField, gridBagConstraints);

        summaryLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        summaryLabel.setForeground(new java.awt.Color(240, 240, 240));
        summaryLabel.setText("课程大纲");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(summaryLabel, gridBagConstraints);

        materialLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        materialLabel.setForeground(new java.awt.Color(240, 240, 240));
        materialLabel.setText("参考文献");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(materialLabel, gridBagConstraints);

        idTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(idTextField1, gridBagConstraints);

        nameTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(nameTextField1, gridBagConstraints);

        materialLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        materialLabel1.setForeground(new java.awt.Color(240, 240, 240));
        materialLabel1.setText("教材");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(materialLabel1, gridBagConstraints);

        referenceTextArea.setColumns(20);
        referenceTextArea.setRows(5);
        jScrollPane2.setViewportView(referenceTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(jScrollPane2, gridBagConstraints);

        materialTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(materialTextField, gridBagConstraints);

        summaryTextArea.setColumns(20);
        summaryTextArea.setRows(5);
        jScrollPane3.setViewportView(summaryTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 140;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(jScrollPane3, gridBagConstraints);

        modifyButton.setBackground(new java.awt.Color(0, 0, 0));
        modifyButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        modifyButton.setForeground(new java.awt.Color(204, 204, 204));
        modifyButton.setText("编辑课程信息");
        modifyButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));

        sureButton.setBackground(new java.awt.Color(0, 0, 0));
        sureButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        sureButton.setForeground(new java.awt.Color(204, 204, 204));
        sureButton.setText("确认");
        sureButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(204, 204, 204));
        cancelButton.setText("取消");
        cancelButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courseInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(sureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel courseInfoPanel;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JTable courseTable;
    private javax.swing.JComboBox creditComboBox;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JComboBox hourComboBox;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField idTextField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel materialLabel;
    private javax.swing.JLabel materialLabel1;
    private javax.swing.JTextField materialTextField;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JTextArea referenceTextArea;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JTextArea summaryTextArea;
    private javax.swing.JButton sureButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}