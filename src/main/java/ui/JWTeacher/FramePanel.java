/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import businesslogicservice.frameblservice.FrameBLService;
import businesslogicservice.frameblservice.FrameOperationFactory;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import ui.Library.PictureGetter;
import vo.framevo.BlockVO;
import vo.framevo.FrameVO;
import vo.processmngvo.NoticeVO;

/**
 *
 * @author zili chen
 */
public class FramePanel extends javax.swing.JPanel {

    FrameBLService frameBLService;
    FrameOperationFactory factory;
    ModuleFrame mf1;
    FrameVO frameVO;

    /**
     * Creates new form FramePanel
     */
    public FramePanel() {
        initComponents();
        factory = new FrameOperationFactory();
        frameBLService = factory.createFrameBL();
        frameVO = frameBLService.look();
        refreshFrameMsgPanel(frameVO);
        setFrameMsgVisible(false);
        mf1 = new ModuleFrame(this);
    }

    public FrameBLService getFrameBLService() {
        return this.frameBLService;
    }

    private void clearFrameMsgPanel() {
        creditTextField.setText("");
        descriTextArea.setText("");
    }

    public void setFrameMsgPanelEditable(boolean b) {
        creditTextField.setEditable(b);
        descriTextArea.setEditable(b);
    }

    public void setFrameMsgVisible(boolean v) {
        descriPanel.setVisible(v);
        modulePanel1.setVisible(v);
    }

    void refreshFrameMsgPanel(FrameVO fvo) {
        DefaultListModel listModel = new DefaultListModel();
        if (fvo != null) {
            this.creditTextField.setText("" + fvo.getTotal());
            this.descriTextArea.setText(fvo.getDescription());
            Iterator<BlockVO> blocks = fvo.getBlockIterator();
            while (blocks.hasNext()) {
                BlockVO bvo = blocks.next();
                listModel.addElement(bvo.getName());
            }
        } else {
            listModel.clear();
            listModel.addElement("");
        }
        moduleList.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        launchButton = new javax.swing.JButton();
        descriPanel = new javax.swing.JPanel();
        creditLabel = new javax.swing.JLabel();
        descriLabel = new javax.swing.JLabel();
        borderPanel = new javax.swing.JPanel();
        creditTextField = new javax.swing.JTextField();
        emptyLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriTextArea = new javax.swing.JTextArea();
        ensurecreateButton = new javax.swing.JButton();
        modulePanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        moduleList = new javax.swing.JList();
        deleteModuleButton = new javax.swing.JButton();
        addModuleButton1 = new javax.swing.JButton();
        lookButton = new javax.swing.JButton();
        createButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(889, 394));

        launchButton.setBackground(new java.awt.Color(0, 0, 0));
        launchButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        launchButton.setForeground(new java.awt.Color(204, 204, 204));
        launchButton.setText("发布");
        launchButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true)));
        launchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchButtonActionPerformed(evt);
            }
        });

        descriPanel.setBackground(new java.awt.Color(0, 0, 0));
        descriPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "描述框架", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        creditLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(204, 204, 204));
        creditLabel.setText("总体学分");

        descriLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        descriLabel.setForeground(new java.awt.Color(204, 204, 204));
        descriLabel.setText("框架描述");

        borderPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        creditTextField.setBackground(new java.awt.Color(240, 240, 240));
        creditTextField.setBorder(null);

        emptyLabel.setFont(new java.awt.Font("微软雅黑", 1, 12)); // NOI18N
        emptyLabel.setText("X");

        javax.swing.GroupLayout borderPanelLayout = new javax.swing.GroupLayout(borderPanel);
        borderPanel.setLayout(borderPanelLayout);
        borderPanelLayout.setHorizontalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanelLayout.createSequentialGroup()
                .addComponent(creditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emptyLabel)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        borderPanelLayout.setVerticalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(creditTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(emptyLabel))
        );

        descriTextArea.setBackground(new java.awt.Color(240, 240, 240));
        descriTextArea.setColumns(20);
        descriTextArea.setRows(5);
        descriTextArea.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(descriTextArea);

        ensurecreateButton.setBackground(new java.awt.Color(0, 0, 0));
        ensurecreateButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        ensurecreateButton.setForeground(new java.awt.Color(204, 204, 204));
        ensurecreateButton.setText("确定");
        ensurecreateButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true)));
        ensurecreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensurecreateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout descriPanelLayout = new javax.swing.GroupLayout(descriPanel);
        descriPanel.setLayout(descriPanelLayout);
        descriPanelLayout.setHorizontalGroup(
            descriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(descriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(descriPanelLayout.createSequentialGroup()
                        .addComponent(creditLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(descriPanelLayout.createSequentialGroup()
                        .addComponent(descriLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(descriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(ensurecreateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        descriPanelLayout.setVerticalGroup(
            descriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descriPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(descriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creditLabel)
                    .addComponent(borderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(descriPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ensurecreateButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        modulePanel1.setBackground(new java.awt.Color(0, 0, 0));
        modulePanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "创建模块", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("微软雅黑", 0, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        moduleList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        moduleList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moduleListMouseClicked(evt);
            }
        });
        moduleList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                moduleListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(moduleList);

        deleteModuleButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteModuleButton.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        deleteModuleButton.setText("×");
        deleteModuleButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        deleteModuleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteModuleButtonMouseClicked(evt);
            }
        });
        deleteModuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteModuleButtonActionPerformed(evt);
            }
        });

        addModuleButton1.setBackground(new java.awt.Color(0, 0, 0));
        addModuleButton1.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        addModuleButton1.setText("+");
        addModuleButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true)));
        addModuleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addModuleButton1MouseClicked(evt);
            }
        });
        addModuleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addModuleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modulePanel1Layout = new javax.swing.GroupLayout(modulePanel1);
        modulePanel1.setLayout(modulePanel1Layout);
        modulePanel1Layout.setHorizontalGroup(
            modulePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulePanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(modulePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteModuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addModuleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        modulePanel1Layout.setVerticalGroup(
            modulePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulePanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(addModuleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteModuleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(modulePanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        lookButton.setBackground(new java.awt.Color(0, 0, 0));
        lookButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        lookButton.setForeground(new java.awt.Color(204, 204, 204));
        lookButton.setText("查看");
        lookButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true)));
        lookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lookButtonActionPerformed(evt);
            }
        });

        createButton1.setBackground(new java.awt.Color(0, 0, 0));
        createButton1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        createButton1.setForeground(new java.awt.Color(204, 204, 204));
        createButton1.setText("创建");
        createButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true)));
        createButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(launchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(descriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(modulePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(createButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(launchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(modulePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descriPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_launchButtonActionPerformed
        // TODO add your handling code here:
        boolean success = frameBLService.release();
        if (success) {
            JOptionPane.showMessageDialog(this, "修改成功！", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_launchButtonActionPerformed

    private void ensurecreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensurecreateButtonActionPerformed
        // TODO add your handling code here:
        String totalString = creditTextField.getText();
        int total = 0;
        try {
            total = Integer.parseInt(totalString);
        } catch (Exception e) {
        }
        String description = descriTextArea.getText();
        frameBLService.createFrame(total, description);
    }//GEN-LAST:event_ensurecreateButtonActionPerformed

    private void lookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lookButtonActionPerformed
        // TODO add your handling code here:
        frameVO = frameBLService.look();
        refreshFrameMsgPanel(frameVO);
        setFrameMsgPanelEditable(false);
        setFrameMsgVisible(true);
    }//GEN-LAST:event_lookButtonActionPerformed

    private void deleteModuleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteModuleButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteModuleButtonMouseClicked

    private void deleteModuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteModuleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteModuleButtonActionPerformed

    private void createButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton1ActionPerformed
        // TODO add your handling code here:
        refreshFrameMsgPanel(null);
        clearFrameMsgPanel();
        setFrameMsgVisible(true);
        setFrameMsgPanelEditable(true);
    }//GEN-LAST:event_createButton1ActionPerformed

    private void addModuleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addModuleButton1MouseClicked
        // TODO add your handling code her

        mf1.setVisible(true);
        //mf1.main(null, frameBLService);
        this.disable();
    }//GEN-LAST:event_addModuleButton1MouseClicked

    private void addModuleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addModuleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addModuleButton1ActionPerformed

    private void moduleListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_moduleListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_moduleListValueChanged

    private void moduleListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moduleListMouseClicked
        // TODO add your handling code here:

        System.out.println("module value changed");
        int index = moduleList.getSelectedIndex();
        System.out.println("@framepanel.java index of selected" + index);
        FrameVO currentfvo = frameBLService.look(true);
        BlockVO bvo = currentfvo.getBlock(index);
        ImageIcon icon = new ImageIcon(PictureGetter.getInfo1Path());
        String info = " 模块名：  " + bvo.getName() + "\n模块概述" + bvo.getDescription() + "\n模块学分范围"
                + bvo.getLower() + bvo.getUpper();
        JOptionPane.showMessageDialog(null, info, "info", JOptionPane.INFORMATION_MESSAGE, icon);
    }//GEN-LAST:event_moduleListMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addModuleButton1;
    private javax.swing.JPanel borderPanel;
    private javax.swing.JButton createButton1;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JTextField creditTextField;
    private javax.swing.JButton deleteModuleButton;
    private javax.swing.JLabel descriLabel;
    private javax.swing.JPanel descriPanel;
    private javax.swing.JTextArea descriTextArea;
    private javax.swing.JLabel emptyLabel;
    private javax.swing.JButton ensurecreateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton launchButton;
    private javax.swing.JButton lookButton;
    private javax.swing.JList moduleList;
    private javax.swing.JPanel modulePanel1;
    // End of variables declaration//GEN-END:variables
}
