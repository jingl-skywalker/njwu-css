/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Student;

import businesslogicservice.gradeblservice.GradeBLService;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vo.gradevo.GradeVO;

/**
 *
 * @author zili chen
 */
public class ViewGradePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewGradePanel
     */
    
    private String stuID;
    private GradeBLService gradebl;
    
    public ViewGradePanel(String stuID, GradeBLService gradebl) {
        initComponents();
        this.stuID = stuID;
        this.gradebl = gradebl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        siftPanel = new javax.swing.JPanel();
        termLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        termList = new javax.swing.JList();
        creditButton = new javax.swing.JButton();
        gradePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gradeListTable = new javax.swing.JTable();
        creditLabel = new javax.swing.JLabel();
        creditLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(889, 368));

        siftPanel.setBackground(new java.awt.Color(0, 0, 0));
        siftPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "筛选课程", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        termLabel.setBackground(new java.awt.Color(0, 0, 0));
        termLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        termLabel.setForeground(new java.awt.Color(204, 204, 204));
        termLabel.setText("学期");

        termList.setBackground(new java.awt.Color(240, 240, 240));
        termList.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        termList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "2013年第一学期", "2012年第二学期", "2012年第一学期", "2011年第二学期", "2011年第一学期" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        termList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                termListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(termList);

        creditButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditButton.setText("查看总学分绩");
        creditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout siftPanelLayout = new javax.swing.GroupLayout(siftPanel);
        siftPanel.setLayout(siftPanelLayout);
        siftPanelLayout.setHorizontalGroup(
            siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, siftPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(creditButton)
                .addGap(43, 43, 43))
        );
        siftPanelLayout.setVerticalGroup(
            siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(termLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(creditButton)
                .addContainerGap())
        );

        gradePanel.setBackground(new java.awt.Color(0, 0, 0));
        gradePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "成绩列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        gradeListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gradeListTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gradeListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "课程号", "课程名称", "成绩"
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
        gradeListTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(gradeListTable);

        creditLabel.setBackground(new java.awt.Color(0, 0, 0));
        creditLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(204, 204, 204));
        creditLabel.setText("本学期的学分绩：");

        creditLabel2.setBackground(new java.awt.Color(0, 0, 0));
        creditLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditLabel2.setForeground(new java.awt.Color(204, 204, 204));
        creditLabel2.setText("XX");

        javax.swing.GroupLayout gradePanelLayout = new javax.swing.GroupLayout(gradePanel);
        gradePanel.setLayout(gradePanelLayout);
        gradePanelLayout.setHorizontalGroup(
            gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(gradePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(creditLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(creditLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradePanelLayout.setVerticalGroup(
            gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(gradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditLabel)
                    .addComponent(creditLabel2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(siftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showGradeList(ArrayList<GradeVO> gradelist){
        Iterator<GradeVO> iterator = gradelist.iterator();
        DefaultTableModel tableModel = (DefaultTableModel)gradeListTable.getModel();
        while(iterator.hasNext()){
            GradeVO grade = iterator.next();
            String score;
            if(grade.getGrade() < 0){
                score = "";
            }
            else{
                score = "" + grade.getGrade();
            }
            tableModel.addRow(new Object[]{grade.getCourseNum(), grade.getCouseName(), score});
        }
    }
    
    private void clearAll(){
        gradeListTable.removeAll();
        creditLabel.setText("");
    }
    
    private void termListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_termListMouseClicked
        String term_ch = (String)termList.getSelectedValue();
        String term = term_ch.substring(0, 4);
        if(term_ch.charAt(5) == '一'){
            term += "-1";
        }
        else{
            term += "-2";
        }
        
        ArrayList<GradeVO> gradelist = gradebl.getCourseScore(stuID, term);
        
        clearAll();
        if(gradelist != null){
            showGradeList(gradelist);
            creditLabel.setText("" + gradebl.getGPA(stuID, term));
        }
        
    }//GEN-LAST:event_termListMouseClicked

    private void creditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditButtonActionPerformed
        String totalCredit = "总学分: " + gradebl.getGradeSum(stuID, "");
        JOptionPane.showMessageDialog(null, totalCredit);
    }//GEN-LAST:event_creditButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditButton;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JLabel creditLabel2;
    private javax.swing.JTable gradeListTable;
    private javax.swing.JPanel gradePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel siftPanel;
    private javax.swing.JLabel termLabel;
    private javax.swing.JList termList;
    // End of variables declaration//GEN-END:variables
}
