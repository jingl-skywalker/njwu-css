/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

/**
 *
 * @author zili chen
 */
public class PlanPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlanPanel
     */
    public PlanPanel() {
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

        titelPanel = new javax.swing.JPanel();
        peopleLogo = new javax.swing.JLabel();
        nameLogo = new javax.swing.JLabel();
        arrowLogo = new javax.swing.JLabel();
        currentLogo = new javax.swing.JLabel();
        backLogo = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        homeLogo = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        exitLogo = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        insPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        insList = new javax.swing.JList();
        planInfoPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        planTable = new javax.swing.JTable();

        titelPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titelPanel.setPreferredSize(new java.awt.Dimension(365, 37));

        peopleLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        peopleLogo.setText("Logo");

        nameLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLogo.setText("name");

        arrowLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo.setText("->");

        currentLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        currentLogo.setText("current");

        backLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLogo.setText("Logo");

        backLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLabel.setText("back");

        homeLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLogo.setText("Logo");

        homeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLabel.setText("home");

        exitLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLogo.setText("Logo");

        exitLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLabel.setText("exit");

        javax.swing.GroupLayout titelPanelLayout = new javax.swing.GroupLayout(titelPanel);
        titelPanel.setLayout(titelPanelLayout);
        titelPanelLayout.setHorizontalGroup(
            titelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peopleLogo)
                .addGap(18, 18, 18)
                .addComponent(nameLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrowLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 443, Short.MAX_VALUE)
                .addComponent(backLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backLabel)
                .addGap(18, 18, 18)
                .addComponent(homeLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(exitLogo)
                .addGap(5, 5, 5)
                .addComponent(exitLabel)
                .addContainerGap())
        );
        titelPanelLayout.setVerticalGroup(
            titelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peopleLogo)
                    .addComponent(nameLogo)
                    .addComponent(arrowLogo)
                    .addComponent(currentLogo)
                    .addComponent(backLogo)
                    .addComponent(backLabel)
                    .addComponent(homeLogo)
                    .addComponent(homeLabel)
                    .addComponent(exitLogo)
                    .addComponent(exitLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(0, 0, 0));

        insPanel.setBackground(new java.awt.Color(0, 0, 0));
        insPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "院系", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        insList.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        insList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(insList);

        javax.swing.GroupLayout insPanelLayout = new javax.swing.GroupLayout(insPanel);
        insPanel.setLayout(insPanelLayout);
        insPanelLayout.setHorizontalGroup(
            insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        insPanelLayout.setVerticalGroup(
            insPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );

        planInfoPanel.setBackground(new java.awt.Color(0, 0, 0));
        planInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "教学计划", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        planTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        planTable.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        planTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "所属模块", "课程名", "课程号", "学分", "周学时"
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
        planTable.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(planTable);

        javax.swing.GroupLayout planInfoPanelLayout = new javax.swing.GroupLayout(planInfoPanel);
        planInfoPanel.setLayout(planInfoPanelLayout);
        planInfoPanelLayout.setHorizontalGroup(
            planInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        planInfoPanelLayout.setVerticalGroup(
            planInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(insPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(planInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(planInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowLogo;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel backLogo;
    private javax.swing.JLabel currentLogo;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel exitLogo;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JList insList;
    private javax.swing.JPanel insPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLogo;
    private javax.swing.JLabel peopleLogo;
    private javax.swing.JPanel planInfoPanel;
    private javax.swing.JTable planTable;
    private javax.swing.JPanel titelPanel;
    // End of variables declaration//GEN-END:variables
}
