/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Student;

/**
 *
 * @author zili chen
 */
public class PerCoursePanel extends javax.swing.JPanel {

    /**
     * Creates new form PerCoursePanel
     */
    public PerCoursePanel() {
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
        coursePanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        courseListTable = new javax.swing.JTable();
        dropButton = new javax.swing.JButton();

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

        termList.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        termList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "2013年第一学期", "2012年第二学期", "2012年第一学期", "2011年第二学期", "2011年第一学期" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(termList);

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
        );
        siftPanelLayout.setVerticalGroup(
            siftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(termLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

        coursePanel.setBackground(new java.awt.Color(0, 0, 0));
        coursePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "课程列表", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        courseListTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        courseListTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "课程名称", "学分", "授课老师", "上课时间", "选课类型"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        courseListTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(courseListTable);

        javax.swing.GroupLayout coursePanelLayout = new javax.swing.GroupLayout(coursePanel);
        coursePanel.setLayout(coursePanelLayout);
        coursePanelLayout.setHorizontalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        coursePanelLayout.setVerticalGroup(
            coursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );

        dropButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        dropButton.setText("退选");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titelPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(siftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dropButton)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coursePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(dropButton)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowLogo2;
    private javax.swing.JLabel backLabel2;
    private javax.swing.JLabel backLogo2;
    private javax.swing.JTable courseListTable;
    private javax.swing.JPanel coursePanel;
    private javax.swing.JLabel currentLogo2;
    private javax.swing.JButton dropButton;
    private javax.swing.JLabel exitLabel2;
    private javax.swing.JLabel exitLogo2;
    private javax.swing.JLabel homeLabel2;
    private javax.swing.JLabel homeLogo2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLogo2;
    private javax.swing.JLabel peopleLogo2;
    private javax.swing.JPanel siftPanel;
    private javax.swing.JLabel termLabel;
    private javax.swing.JList termList;
    private javax.swing.JPanel titelPanel2;
    // End of variables declaration//GEN-END:variables
}
