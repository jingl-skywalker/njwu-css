/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.YJWTeacher;


import java.awt.Font;
import java.awt.GridBagConstraints;
import  ui.Library.CheckListCellRenderer;
import  ui.Library.CheckValue;
import  ui.Library.FullComboBox;
import  ui.Library.MyComboBox;
import  ui.Library.MyTitledBorder;


/**
 *
 * @author zili chen
 */
public class CoursePanel extends javax.swing.JPanel {

    /**
     * Creates new form CoursePanel
     */
    public CoursePanel() {
        initComponents();
        insFull = new FullComboBox();
        coursePanel.setBorder(new MyTitledBorder("可开设课程列表").getTitledBorder());
        courseInfoPanel.setBorder(new MyTitledBorder("课程信息").getTitledBorder());
        /*多选下拉框——修读院系*/
        learnInsComboBox = insFull.getComboBox();
        insFull.add("法学院");
        insFull.add("软件学院");
        insFull.add("商学院");
        insFull.add("医学院");
        insFull.add("政府管理学院");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 40;
        //insComboBox.setBounds(0, 0, 72, 25);
        courseInfoPanel.add(learnInsComboBox, gridBagConstraints);
        learnInsComboBox.setVisible(true);
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

        createButton5 = new javax.swing.JButton();
        creditComboBox2 = new javax.swing.JComboBox();
        coursePanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        teacherLabel = new javax.swing.JLabel();
        teaTextField = new javax.swing.JTextField();
        timeLabel = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        insLabel = new javax.swing.JLabel();
        learnInsLabel = new javax.swing.JLabel();
        idTextField1 = new javax.swing.JTextField();
        nameTextField1 = new javax.swing.JTextField();
        insComboBox = new javax.swing.JComboBox();
        createButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        sureButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        addStuButton = new javax.swing.JButton();
        cancelAddButton = new javax.swing.JButton();

        createButton5.setBackground(new java.awt.Color(0, 0, 0));
        createButton5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        createButton5.setText("开设课程");
        createButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        createButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton5ActionPerformed(evt);
            }
        });

        creditComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(0, 0, 0));

        coursePanel.setBackground(new java.awt.Color(0, 0, 0));
        coursePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "可开设课程列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        idLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(240, 240, 240));
        idLabel.setText("课程号");

        nameLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(240, 240, 240));
        nameLabel.setText("课程名");

        jTable1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        idTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

        nameTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N

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
        courseInfoPanelLayout.columnWidths = new int[] {0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 0};
        courseInfoPanelLayout.rowHeights = new int[] {0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0, 3, 0};
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
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 13;
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
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 13;
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
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(hourComboBox, gridBagConstraints);

        teacherLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(240, 240, 240));
        teacherLabel.setText("授课老师");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(teacherLabel, gridBagConstraints);

        teaTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(teaTextField, gridBagConstraints);

        timeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(240, 240, 240));
        timeLabel.setText("授课时间");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(timeLabel, gridBagConstraints);

        timeTextField.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(timeTextField, gridBagConstraints);

        insLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        insLabel.setForeground(new java.awt.Color(240, 240, 240));
        insLabel.setText("开课院系");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(insLabel, gridBagConstraints);

        learnInsLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        learnInsLabel.setForeground(new java.awt.Color(240, 240, 240));
        learnInsLabel.setText("修读院系");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(learnInsLabel, gridBagConstraints);

        idTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(idTextField1, gridBagConstraints);

        nameTextField1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(nameTextField1, gridBagConstraints);

        insComboBox.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        insComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "法学院", "软件学院", "商学院", "医学院", "政府管理学院" }));
        insComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        insComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        courseInfoPanel.add(insComboBox, gridBagConstraints);

        createButton.setBackground(new java.awt.Color(0, 0, 0));
        createButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        createButton.setForeground(new java.awt.Color(204, 204, 204));
        createButton.setText("开设课程");
        createButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        modifyButton.setBackground(new java.awt.Color(0, 0, 0));
        modifyButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        modifyButton.setForeground(new java.awt.Color(204, 204, 204));
        modifyButton.setText("编辑课程");
        modifyButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        sureButton.setBackground(new java.awt.Color(0, 0, 0));
        sureButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        sureButton.setForeground(new java.awt.Color(204, 204, 204));
        sureButton.setText("确认");
        sureButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        sureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sureButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(204, 204, 204));
        cancelButton.setText("取消");
        cancelButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addStuButton.setBackground(new java.awt.Color(0, 0, 0));
        addStuButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        addStuButton.setForeground(new java.awt.Color(204, 204, 204));
        addStuButton.setText("添加学生名单");
        addStuButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        addStuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStuButtonActionPerformed(evt);
            }
        });

        cancelAddButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelAddButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        cancelAddButton.setForeground(new java.awt.Color(204, 204, 204));
        cancelAddButton.setText("撤销名单添加");
        cancelAddButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        cancelAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addStuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(courseInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void sureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sureButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sureButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addStuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addStuButtonActionPerformed

    private void createButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createButton5ActionPerformed

    private void cancelAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelAddButtonActionPerformed

    private void insComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStuButton;
    private javax.swing.JButton cancelAddButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel courseInfoPanel;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JButton createButton;
    private javax.swing.JButton createButton5;
    private javax.swing.JComboBox creditComboBox;
    private javax.swing.JComboBox creditComboBox2;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JComboBox hourComboBox;
    private javax.swing.JLabel hourLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField idTextField1;
    private javax.swing.JComboBox insComboBox;
    private javax.swing.JLabel insLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel learnInsLabel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JButton sureButton;
    private javax.swing.JTextField teaTextField;
    private javax.swing.JLabel teacherLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
    private FullComboBox insFull;
    private MyComboBox learnInsComboBox;
    private GridBagConstraints gridBagConstraints;

    public FullComboBox getInsFull() {
        return insFull;
    }

    /**
     * Set the value of insFull
     *
     * @param insFull new value of insFull
     */
    public void setInsFull(FullComboBox insFull) {
        this.insFull = insFull;
    }

}
