/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Student;

import businesslogic.selectionbl.SelectionBLServiceStub;
import businesslogicservice.selectionblservice.SelectionBLService;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vo.coursevo.CourseVO;
import vo.selectionvo.SelectionVO;

/**
 *
 * @author zili chen
 */
public class ReSelectPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form SelectPanel
     */
    private final int maxCourseNum = 4;
    private int courseNumber;
    private String stuID;
    private SelectionBLService selectionbl;
    private ArrayList<CourseVO> totalCourseList;
    private ArrayList<String> selectedCourseList;
    
    
    public ReSelectPanel(String stuID, SelectionBLService selectionbl) {
        initComponents();
        this.stuID = stuID;
        this.selectionbl = selectionbl;
        
        
        totalCourseList = selectionbl.getReSelCourseList();
        selectedCourseList = selectionbl.getMySelectedCourseList(stuID);
        courseNumber = selectedCourseList.size();
        
        Iterator<CourseVO> iterator= totalCourseList.iterator();
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
        coursePanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        courseListTable = new javax.swing.JTable();
        selectButton = new javax.swing.JButton();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(889, 368));

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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectButton)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        if(courseNumber >= maxCourseNum){
            JOptionPane.showMessageDialog(null, "选课数目已达上限。。。");
            return;
        }
        
        
        int selectRows = courseListTable.getSelectedRows().length;
        DefaultTableModel tablemodel = (DefaultTableModel)courseListTable.getModel();
        
        if(selectRows == 1){
            int selectedRow = courseListTable.getSelectedRow();
            String courseNum = (String)tablemodel.getValueAt(selectedRow, 0);
            String courseName = (String)tablemodel.getValueAt(selectedRow, 1);
        
            if(selectedCourseList.contains(courseNum)){
                JOptionPane.showMessageDialog(null, "不能重复选课。。。");
                return;
            }
            
            SelectionVO selectionvo = new SelectionVO(courseNum, stuID);
            if(selectionbl.addDirectCourse(selectionvo)){
                courseNumber++;
                selectedCourseList.add(selectionvo.getCouseNum());
                JOptionPane.showMessageDialog(null, "选课成功！");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "选择失败。。。");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "请选择一门课程！");
        }
    }//GEN-LAST:event_selectButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable courseListTable;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables
}
