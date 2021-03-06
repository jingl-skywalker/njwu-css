/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Student;

/**
 *
 * @author zili chen
 */
public class ViewGradePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewGradePanel
     */
    public ViewGradePanel() {
        initComponents();
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
        siftPanel = new javax.swing.JPanel();
        termLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        termList = new javax.swing.JList();
        creditButton = new javax.swing.JButton();
        gradePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        gradeListTable = new javax.swing.JTable();
        creditLabel = new javax.swing.JLabel();
        placeLabel = new javax.swing.JLabel();
        creditLabel2 = new javax.swing.JLabel();
        placeLabel2 = new javax.swing.JLabel();

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
        currentLogo2.setText("current");

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
                .addComponent(currentLogo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
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
                    .addComponent(exitLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(termList);

        creditButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditButton.setText("查看总学分绩");

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

        placeLabel.setBackground(new java.awt.Color(0, 0, 0));
        placeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        placeLabel.setForeground(new java.awt.Color(204, 204, 204));
        placeLabel.setText("年级排名：");

        creditLabel2.setBackground(new java.awt.Color(0, 0, 0));
        creditLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditLabel2.setForeground(new java.awt.Color(204, 204, 204));
        creditLabel2.setText("XX");

        placeLabel2.setBackground(new java.awt.Color(0, 0, 0));
        placeLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        placeLabel2.setForeground(new java.awt.Color(204, 204, 204));
        placeLabel2.setText("XX");

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
                .addGap(76, 76, 76)
                .addComponent(placeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placeLabel2)
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
                    .addComponent(placeLabel)
                    .addComponent(creditLabel2)
                    .addComponent(placeLabel2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
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
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowLogo2;
    private javax.swing.JLabel backLabel2;
    private javax.swing.JLabel backLogo2;
    private javax.swing.JButton creditButton;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JLabel creditLabel2;
    private javax.swing.JLabel currentLogo2;
    private javax.swing.JLabel exitLabel2;
    private javax.swing.JLabel exitLogo2;
    private javax.swing.JTable gradeListTable;
    private javax.swing.JPanel gradePanel;
    private javax.swing.JLabel homeLabel2;
    private javax.swing.JLabel homeLogo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLogo2;
    private javax.swing.JLabel peopleLogo2;
    private javax.swing.JLabel placeLabel;
    private javax.swing.JLabel placeLabel2;
    private javax.swing.JPanel siftPanel;
    private javax.swing.JLabel termLabel;
    private javax.swing.JList termList;
    private javax.swing.JPanel titelPanel2;
    // End of variables declaration//GEN-END:variables
}
