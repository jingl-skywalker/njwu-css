/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Student;

import businesslogic.selectionbl.SelectionBLServiceStub;
import businesslogicservice.selectionblservice.SelectionBLService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.Library.FullComboBox;
import ui.Library.MyComboBox;
import vo.coursevo.CourseVO;
import vo.selectionvo.SelectionVO;

/**
 *
 * @author zili chen
 */
public class SelectPanel extends javax.swing.JPanel {

    /**
     * Creates new form SelectPanel
     */
    private final int maxCourseNum = 4;
    private String stuID;
    private SelectionBLService selectionbl;
    private ArrayList<CourseVO> totalCourseList;
    private ArrayList<CourseVO> showCourseList;
    private ArrayList<CourseVO> myCourseList;
    
    private FullComboBox dayBox;
    private FullComboBox timeBox;
    private FullComboBox instituteBox;
    private FullComboBox creditBox;
   
    
    public SelectPanel(String stuID, SelectionBLService bl) {
        initComponents();
        this.stuID = stuID;
        this.selectionbl = bl;
        
        
        totalCourseList = selectionbl.getSelCourseList();
        myCourseList = selectionbl.getTempCourseList(stuID);
        
        Iterator<CourseVO> iterator= myCourseList.iterator();
        DefaultTableModel tableModel = (DefaultTableModel)selectedListTable.getModel();
        while(iterator.hasNext()){
            CourseVO course = iterator.next();
            tableModel.addRow(new Object[]{course.getCourseID(), course.getCourseName()});
        }
        
        iterator = totalCourseList.iterator();
        tableModel = (DefaultTableModel)courseListTable.getModel();
        while(iterator.hasNext()){
            CourseVO course = iterator.next();
            tableModel.addRow(new Object[]{course.getCourseID(), course.getCourseName(),
                   course.getCredit(), course.getTeaName(), course.getTime(), course.getInstitute()});
        }
        
        dayBox = new FullComboBox();
        timeBox = new FullComboBox();
        instituteBox = new FullComboBox();
        creditBox = new FullComboBox();
        
        String[] ss1 = {"星期一", "星期二", "星期三", "星期四", "星期五"};
        String[] ss2 = {"1-2节", "3-4节", "5-6节", "7-8节", "9-10节"};
        String[] ss3 = {"软件学院", "商学院", "文学院", "历史学院", "政府管理学院"};
        String[] ss4 = {"2", "3", "4"};
        
        for(int i = 0; i < ss1.length; i++){
            dayBox.add(ss1[i]);
        }
        for(int i = 0; i < ss2.length; i++){
            timeBox.add(ss2[i]);
        }
        for(int i = 0; i < ss3.length; i++){
            instituteBox.add(ss3[i]);
        }
        for(int i = 0; i < ss4.length; i++){
            creditBox.add(ss4[i]);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void showTotalCourse(){
        Vector dayVal = dayBox.getComboBox().getComboVc();
        Vector timeVal = timeBox.getComboBox().getComboVc();
        Vector instituteVal = instituteBox.getComboBox().getComboVc();
        Vector creditVal = creditBox.getComboBox().getComboVc();
    
        showCourseList = (ArrayList<CourseVO>)totalCourseList.clone();
        Iterator<CourseVO> iterator = showCourseList.iterator();
        
        iterator = showCourseList.iterator();
        for(int i = 0; i < dayVal.size(); i++){
            while(iterator.hasNext()){
                String day = iterator.next().getTime().substring(0, 3);
                if(! day.equals((String)dayVal.elementAt(i))){
                    iterator.remove();
                }
            }
        }
        
        iterator = showCourseList.iterator();
        for(int i = 0; i < timeVal.size(); i++){
            while(iterator.hasNext()){
                String time = iterator.next().getTime().substring(3);
                String time2 = ((String)timeVal.elementAt(i)).substring(0, 3);
                if(! time.equals(time2)){
                    iterator.remove();
                }
            }
        }
        
        iterator = showCourseList.iterator();
        for(int i = 0; i < instituteVal.size(); i++){
            while(iterator.hasNext()){
                if(! iterator.next().getInstitute().equals((String)instituteVal.elementAt(i))){
                    iterator.remove();
                }
            }
        }
        
        iterator = showCourseList.iterator();
        for(int i = 0; i < creditVal.size(); i++){
            while(iterator.hasNext()){
                if(! iterator.next().getCredit().equals((String)creditVal.elementAt(i))){
                    iterator.remove();
                }
            }
        }
        
        courseListTable.removeAll();
        iterator = showCourseList.iterator();
        DefaultTableModel tableModel = (DefaultTableModel)courseListTable.getModel();
        while(iterator.hasNext()){
            CourseVO course = iterator.next();
            tableModel.addRow(new Object[]{course.getCourseID(), course.getCourseName(),
                   course.getCredit(), course.getTeaName(), course.getTime(), course.getInstitute()});
        }
        
        
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox3 = new javax.swing.JComboBox();
        siftPanel = new javax.swing.JPanel();
        keywordLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        creditLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jComboBox1 = dayBox.getComboBox();
        jComboBox2 = timeBox.getComboBox();
        jComboBox4 = instituteBox.getComboBox();
        jComboBox5 = creditBox.getComboBox();
        coursePanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        courseListTable = new javax.swing.JTable();
        selectButton = new javax.swing.JButton();
        selectedPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        selectedListTable = new javax.swing.JTable();
        dropButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(889, 368));

        siftPanel.setBackground(new java.awt.Color(0, 0, 0));
        siftPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "筛选课程", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        keywordLabel.setBackground(new java.awt.Color(0, 0, 0));
        keywordLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        keywordLabel.setForeground(new java.awt.Color(204, 204, 204));
        keywordLabel.setText("学分");

        dayLabel.setBackground(new java.awt.Color(0, 0, 0));
        dayLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(204, 204, 204));
        dayLabel.setText("星期");

        creditLabel.setBackground(new java.awt.Color(0, 0, 0));
        creditLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(204, 204, 204));
        creditLabel.setText("节数");

        typeLabel.setBackground(new java.awt.Color(0, 0, 0));
        typeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(204, 204, 204));
        typeLabel.setText("开课院系");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout siftPanelLayout = new javax.swing.GroupLayout(siftPanel);
        siftPanel.setLayout(siftPanelLayout);
        siftPanelLayout.setHorizontalGroup(
            siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(siftPanelLayout.createSequentialGroup()
                        .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditLabel)
                            .addComponent(typeLabel)
                            .addComponent(keywordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(siftPanelLayout.createSequentialGroup()
                        .addComponent(dayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        siftPanelLayout.setVerticalGroup(
            siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keywordLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        coursePanel.setBackground(new java.awt.Color(0, 0, 0));
        coursePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "课程列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        courseListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        courseListTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "课程号", "课程名", "学分", "教师", "上课时间", "开课院系"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        courseListTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane6.setViewportView(courseListTable);

        selectButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        selectButton.setText("选择课程");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectButton)
                .addGap(13, 13, 13))
        );

        selectedPanel.setBackground(new java.awt.Color(0, 0, 0));
        selectedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "已选课程", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        selectedListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        selectedListTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        selectedListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "课程号", "课程名"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selectedListTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane7.setViewportView(selectedListTable);

        dropButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        dropButton.setText("退选");
        dropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        submitButton.setText("提交");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectedPanelLayout = new javax.swing.GroupLayout(selectedPanel);
        selectedPanel.setLayout(selectedPanelLayout);
        selectedPanelLayout.setHorizontalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        selectedPanelLayout.setVerticalGroup(
            selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selectedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(dropButton))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(siftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(siftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        DefaultTableModel mytablemodel = (DefaultTableModel)selectedListTable.getModel();
        if(mytablemodel.getRowCount() >= maxCourseNum){
            JOptionPane.showMessageDialog(null, "选课数已达上限！");
            return;
        }
        
        int selectRows = courseListTable.getSelectedRows().length;
        DefaultTableModel tablemodel = (DefaultTableModel)courseListTable.getModel();
        
        if(selectRows == 1){
            int selectedRow = courseListTable.getSelectedRow();
            String courseNum = (String)tablemodel.getValueAt(selectedRow, 0);
            String courseName = (String)tablemodel.getValueAt(selectedRow, 1);
            SelectionVO selectionvo = new SelectionVO(courseNum, stuID);
            if(selectionbl.addCourse(selectionvo)){
                
                mytablemodel.addRow(new Object[]{courseNum, courseName});
                
            }
            else{
                JOptionPane.showMessageDialog(null, "选择失败。。。");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "请选择一门课程！");
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void dropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropButtonActionPerformed
        int selectedRows = selectedListTable.getSelectedRows().length;
        DefaultTableModel tablemodel = (DefaultTableModel)selectedListTable.getModel();
        
        if(selectedRows == 1){
            int selectedRow = selectedListTable.getSelectedRow();
            String courseNum = (String)tablemodel.getValueAt(selectedRow, 0);
            SelectionVO selectionvo = new SelectionVO(courseNum, stuID);
            if(selectionbl.deleteCourse(selectionvo)){
                tablemodel.removeRow(selectedRow);
            }
            else{
                JOptionPane.showMessageDialog(null, "退选失败。。。");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "请选择一门课程！");
        }
    }//GEN-LAST:event_dropButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if(!selectionbl.verify()){
            JOptionPane.showMessageDialog(null, "提交失败！");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        showTotalCourse();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        showTotalCourse();
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        showTotalCourse();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        showTotalCourse();
    }//GEN-LAST:event_jComboBox4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable courseListTable;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JButton dropButton;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel keywordLabel;
    private javax.swing.JButton selectButton;
    private javax.swing.JTable selectedListTable;
    private javax.swing.JPanel selectedPanel;
    private javax.swing.JPanel siftPanel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
