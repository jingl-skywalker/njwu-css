/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author zili chen
 */
public class StaticsPanel extends javax.swing.JPanel {

    CardLayout card = new CardLayout();
    TeacherStaticPanel teacherPanel;
    CourseStaticPanel coursePanel;
    StudentStaticPanel studentPanel;
    int type=1;//当前查看的选项 1代表学生2教师3课程
    String[] ins = { "软件学院", "商学院", "政府管理学院", "法学院" };
    /**
     * Creates new form StaticsPanel
     */
    public StaticsPanel() {
        initComponents();
        
        teacherPanel = new TeacherStaticPanel("localhost",1099);
        coursePanel = new CourseStaticPanel("localhost",1099);
        studentPanel = new StudentStaticPanel("locaohost",1099);
        containerPanel.setLayout(card);
        containerPanel.add("student", studentPanel);
        containerPanel.add("teacher",teacherPanel);
        containerPanel.add("course",coursePanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chartLabel3 = new javax.swing.JLabel();
        chartLabel5 = new javax.swing.JLabel();
        objectPanel = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        teacherLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        sarrowLabel = new javax.swing.JButton();
        tarrowLabel = new javax.swing.JButton();
        carrowLabel = new javax.swing.JButton();
        rangePanel = new javax.swing.JPanel();
        schoolLabel = new javax.swing.JLabel();
        instituteLabel = new javax.swing.JLabel();
        scharrowLabel = new javax.swing.JButton();
        insarrowLabel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        containerPanel = new javax.swing.JPanel();

        chartLabel3.setText("jLabel2");
        chartLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        chartLabel5.setText("jLabel2");
        chartLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        setBackground(new java.awt.Color(0, 0, 0));

        objectPanel.setBackground(new java.awt.Color(0, 0, 0));
        objectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "对象", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        studentLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        studentLabel.setForeground(new java.awt.Color(204, 204, 204));
        studentLabel.setText("学生");

        teacherLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        teacherLabel.setForeground(new java.awt.Color(204, 204, 204));
        teacherLabel.setText("教师");

        courseLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(204, 204, 204));
        courseLabel.setText("课程");

        sarrowLabel.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        sarrowLabel.setText(">");
        sarrowLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sarrowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sarrowLabelMouseClicked(evt);
            }
        });

        tarrowLabel.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        tarrowLabel.setText(">");
        tarrowLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tarrowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarrowLabelMouseClicked(evt);
            }
        });

        carrowLabel.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        carrowLabel.setText(">");
        carrowLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        carrowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrowLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout objectPanelLayout = new javax.swing.GroupLayout(objectPanel);
        objectPanel.setLayout(objectPanelLayout);
        objectPanelLayout.setHorizontalGroup(
            objectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(objectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherLabel)
                    .addComponent(courseLabel)
                    .addComponent(studentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(objectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sarrowLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tarrowLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carrowLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        objectPanelLayout.setVerticalGroup(
            objectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(objectPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(objectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentLabel)
                    .addComponent(sarrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(objectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherLabel)
                    .addComponent(tarrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(objectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel)
                    .addComponent(carrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rangePanel.setBackground(new java.awt.Color(0, 0, 0));
        rangePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "范围", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        schoolLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        schoolLabel.setForeground(new java.awt.Color(204, 204, 204));
        schoolLabel.setText("全校");

        instituteLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        instituteLabel.setForeground(new java.awt.Color(204, 204, 204));
        instituteLabel.setText("院系");

        scharrowLabel.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        scharrowLabel.setText(">");
        scharrowLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scharrowLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scharrowLabelActionPerformed(evt);
            }
        });

        insarrowLabel.setFont(new java.awt.Font("微软雅黑", 1, 14)); // NOI18N
        insarrowLabel.setText("\\");

            jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
            jList1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
            jList1.setModel(new javax.swing.AbstractListModel() {

                public int getSize() { return ins.length; }
                public Object getElementAt(int i) { return ins[i]; }
            });
            jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    jList1ValueChanged(evt);
                }
            });
            jScrollPane1.setViewportView(jList1);

            javax.swing.GroupLayout rangePanelLayout = new javax.swing.GroupLayout(rangePanel);
            rangePanel.setLayout(rangePanelLayout);
            rangePanelLayout.setHorizontalGroup(
                rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rangePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rangePanelLayout.createSequentialGroup()
                            .addGroup(rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(schoolLabel)
                                .addComponent(instituteLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                            .addGroup(rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(insarrowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scharrowLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addContainerGap())
            );
            rangePanelLayout.setVerticalGroup(
                rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rangePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(schoolLabel)
                        .addComponent(scharrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(instituteLabel)
                        .addComponent(insarrowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addContainerGap())
            );

            containerPanel.setBackground(new java.awt.Color(0, 0, 0));
            containerPanel.setPreferredSize(new java.awt.Dimension(722, 292));

            javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
            containerPanel.setLayout(containerPanelLayout);
            containerPanelLayout.setHorizontalGroup(
                containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 794, Short.MAX_VALUE)
            );
            containerPanelLayout.setVerticalGroup(
                containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 334, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(objectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, 0)
                            .addComponent(objectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25))
            );
        }// </editor-fold>//GEN-END:initComponents

    private void sarrowLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sarrowLabelMouseClicked
        // TODO add your handling code here:
        type =1;
        card.show(containerPanel,"student");
        studentPanel.update();
        jList1.clearSelection();
        jList1.repaint();
    }//GEN-LAST:event_sarrowLabelMouseClicked

    private void tarrowLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarrowLabelMouseClicked
        // TODO add your handling code here:
        type =2;
        card.show(containerPanel,"teacher");
        teacherPanel.update();
        //int i = jList1.getSelectedIndex();
        jList1.clearSelection();
        jList1.repaint();
    }//GEN-LAST:event_tarrowLabelMouseClicked

    private void carrowLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrowLabelMouseClicked
        // TODO add your handling code here:
        type =3;
        card.show(containerPanel,"course");
        coursePanel.update();
        jList1.clearSelection();
        jList1.repaint();
    }//GEN-LAST:event_carrowLabelMouseClicked

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        if(jList1.isSelectionEmpty()){
            return;
        }
        int idx = jList1.getSelectedIndex();
        if(type==1){
            
        }
        else if(type==2){
            teacherPanel.showTeaStatic(ins[idx]);
        }
        else{
            coursePanel.showStuInfo(ins[idx]);
        }
        
    }//GEN-LAST:event_jList1ValueChanged

    private void scharrowLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scharrowLabelActionPerformed
        // TODO add your handling code here:
        if(type==1){
           
        }
        else if(type==2){
            teacherPanel.showTeaStatic("All");
        }
        else{
            coursePanel.showStuInfo("All");
        }
    }//GEN-LAST:event_scharrowLabelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrowLabel;
    private javax.swing.JLabel chartLabel3;
    private javax.swing.JLabel chartLabel5;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JButton insarrowLabel;
    private javax.swing.JLabel instituteLabel;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel objectPanel;
    private javax.swing.JPanel rangePanel;
    private javax.swing.JButton sarrowLabel;
    private javax.swing.JButton scharrowLabel;
    private javax.swing.JLabel schoolLabel;
    private javax.swing.JLabel studentLabel;
    private javax.swing.JButton tarrowLabel;
    private javax.swing.JLabel teacherLabel;
    // End of variables declaration//GEN-END:variables
}
