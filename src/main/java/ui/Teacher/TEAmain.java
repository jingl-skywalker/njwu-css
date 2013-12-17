/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.Teacher;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import ui.Administrator.WaitPanelj;
import ui.Library.Navigation;
import vo.uservo.UserInfoVO;


/**
 *
 * @author zili chen
 */
public class TEAmain extends javax.swing.JFrame {

    UserInfoVO userInfo;
    /**
     * Creates new form TEAmain
     */
    public TEAmain(UserInfoVO v,String ip,int port) {
        userInfo = v;
        initComponents();
         nameLogo.setText(v.getName());
         
        gradePanel = new GradePanel(v,ip,port);
        courseInfoPanel = new CourseInfoPanel (v,ip,port);
        perInfoPanel = new PerInfoPanel(v,this,ip,port);
        modifyKeyPanel = new ModifyKeyPanel(v,ip,port);
        courseListPanel = new CourseListPanel(v,ip,port);
        cardLayout = new CardLayout();
        backLabel.setForeground(Color.BLUE);
        homeLabel.setForeground(Color.BLUE);
        exitLabel.setForeground(Color.BLUE);
        containPanel.setLayout(cardLayout);//----------------------------卡片面板
        containPanel.add(teaMainPanel,"teaMainP");
        containPanel.add(gradePanel,"gradeP");
        containPanel.add(courseInfoPanel,"courseInfoP");
        containPanel.add(perInfoPanel,"perInfoP");
        containPanel.add(modifyKeyPanel,"modifyKeyP");
        containPanel.add(courseListPanel,"courseListP");
        navigation = new Navigation();//-------------------------------导航栏标签
        titelPanel2.add(navigation.getArrow(),0,0);
        titelPanel2.add(navigation.getNow(),0,0);
        navigation.setNowBounds(201, 7, 84, 19);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanel = new javax.swing.JPanel();
        CSSLabel = new javax.swing.JLabel();
        NJWUPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        containPanel = new javax.swing.JPanel();
        teaMainPanel = new javax.swing.JPanel();
        stuListButton = new javax.swing.JButton();
        stuListLabel = new javax.swing.JLabel();
        courseInfoButton = new javax.swing.JButton();
        courseInfoLabel = new javax.swing.JLabel();
        gradeButton = new javax.swing.JButton();
        gradeLabel = new javax.swing.JLabel();
        perInfoButton = new javax.swing.JButton();
        perInfoLabel = new javax.swing.JLabel();
        notePanel = new javax.swing.JPanel();
        titelPanel2 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backPanel.setBackground(new java.awt.Color(0, 0, 0));

        CSSLabel.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        CSSLabel.setForeground(new java.awt.Color(255, 255, 255));
        CSSLabel.setText("CSS");

        NJWUPanel.setBackground(new java.awt.Color(233, 233, 237));
        NJWUPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 48)); // NOI18N
        jLabel1.setText("NJWU选课系统");

        javax.swing.GroupLayout NJWUPanelLayout = new javax.swing.GroupLayout(NJWUPanel);
        NJWUPanel.setLayout(NJWUPanelLayout);
        NJWUPanelLayout.setHorizontalGroup(
            NJWUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NJWUPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NJWUPanelLayout.setVerticalGroup(
            NJWUPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NJWUPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("微软雅黑", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        containPanel.setBackground(new java.awt.Color(0, 0, 0));

        teaMainPanel.setBackground(new java.awt.Color(0, 0, 0));

        stuListButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        stuListButton.setText("stuList");
        stuListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuListButtonActionPerformed(evt);
            }
        });

        stuListLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        stuListLabel.setForeground(new java.awt.Color(240, 240, 240));
        stuListLabel.setText("查看学生列表");

        courseInfoButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseInfoButton.setText("courseInfo");
        courseInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseInfoButtonActionPerformed(evt);
            }
        });

        courseInfoLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        courseInfoLabel.setForeground(new java.awt.Color(240, 240, 240));
        courseInfoLabel.setText("补充课程信息");

        gradeButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gradeButton.setText("grade");
        gradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeButtonActionPerformed(evt);
            }
        });

        gradeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        gradeLabel.setForeground(new java.awt.Color(240, 240, 240));
        gradeLabel.setText("查看课程");

        perInfoButton.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        perInfoButton.setText("perInfo");
        perInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perInfoButtonActionPerformed(evt);
            }
        });

        perInfoLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        perInfoLabel.setForeground(new java.awt.Color(240, 240, 240));
        perInfoLabel.setText("个人信息");

        notePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        notePanel.setToolTipText("");

        javax.swing.GroupLayout notePanelLayout = new javax.swing.GroupLayout(notePanel);
        notePanel.setLayout(notePanelLayout);
        notePanelLayout.setHorizontalGroup(
            notePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        notePanelLayout.setVerticalGroup(
            notePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout teaMainPanelLayout = new javax.swing.GroupLayout(teaMainPanel);
        teaMainPanel.setLayout(teaMainPanelLayout);
        teaMainPanelLayout.setHorizontalGroup(
            teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teaMainPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teaMainPanelLayout.createSequentialGroup()
                        .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stuListLabel)
                            .addComponent(stuListButton))
                        .addGap(55, 55, 55)
                        .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseInfoLabel))
                        .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teaMainPanelLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(gradeLabel))
                            .addGroup(teaMainPanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(gradeButton)))
                        .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teaMainPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(perInfoLabel))
                            .addGroup(teaMainPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(perInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(notePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teaMainPanelLayout.setVerticalGroup(
            teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teaMainPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teaMainPanelLayout.createSequentialGroup()
                        .addComponent(perInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perInfoLabel))
                    .addGroup(teaMainPanelLayout.createSequentialGroup()
                        .addComponent(gradeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradeLabel))
                    .addGroup(teaMainPanelLayout.createSequentialGroup()
                        .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stuListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(teaMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseInfoLabel)
                            .addComponent(stuListLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(notePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout containPanelLayout = new javax.swing.GroupLayout(containPanel);
        containPanel.setLayout(containPanelLayout);
        containPanelLayout.setHorizontalGroup(
            containPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teaMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containPanelLayout.setVerticalGroup(
            containPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teaMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        titelPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        titelPanel2.setPreferredSize(new java.awt.Dimension(365, 37));

        peopleLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        peopleLogo.setText("Logo");

        nameLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        nameLogo.setText("name");

        arrowLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        arrowLogo.setText("->");

        currentLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        currentLogo.setText("首页");

        backLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLogo.setText("Logo");

        backLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        backLabel.setText("back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabelMouseExited(evt);
            }
        });
        backLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backLabelMouseMoved(evt);
            }
        });

        homeLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLogo.setText("Logo");

        homeLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        homeLabel.setText("home");
        homeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeLabelMouseExited(evt);
            }
        });
        homeLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homeLabelMouseMoved(evt);
            }
        });

        exitLogo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLogo.setText("Logo");

        exitLabel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        exitLabel.setText("exit");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });
        exitLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitLabelMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout titelPanel2Layout = new javax.swing.GroupLayout(titelPanel2);
        titelPanel2.setLayout(titelPanel2Layout);
        titelPanel2Layout.setHorizontalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(peopleLogo)
                .addGap(18, 18, 18)
                .addComponent(nameLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arrowLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currentLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 463, Short.MAX_VALUE)
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
        titelPanel2Layout.setVerticalGroup(
            titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CSSLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitButton)
                .addGap(21, 21, 21))
            .addComponent(NJWUPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(containPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backPanelLayout.createSequentialGroup()
                .addGroup(backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CSSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(NJWUPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        // TODO add your handling code here:
        if(navigation2==null){
        cardLayout.show(containPanel,"teaMainP");
        navigation.setVisible(false);
        }
        else{
            titelPanel2.remove(navigation2.getArrow());
            titelPanel2.remove(navigation2.getNow());
            navigation2=null;
            cardLayout.show(containPanel,"perInfoP");
            perInfoPanel.update();
        }
    }//GEN-LAST:event_backLabelMouseClicked

    private void backLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseExited
        // TODO add your handling code here:
        backLabel.setForeground(Color.BLUE);
    }//GEN-LAST:event_backLabelMouseExited

    private void backLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseMoved
        // TODO add your handling code here:
        backLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_backLabelMouseMoved

    private void homeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseClicked
        // TODO add your handling code here:
        if(navigation2!=null){
            titelPanel2.remove(navigation2.getArrow());
            titelPanel2.remove(navigation2.getNow());
            navigation=null;
            cardLayout.show(containPanel,"perInfoP");
            perInfoPanel.update();
        }
        cardLayout.show(containPanel,"teaMainP");
        navigation.setVisible(false);
    }//GEN-LAST:event_homeLabelMouseClicked

    private void homeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseExited
        // TODO add your handling code here:
        homeLabel.setForeground(Color.BLUE);
    }//GEN-LAST:event_homeLabelMouseExited

    private void homeLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeLabelMouseMoved
        // TODO add your handling code here:
        homeLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_homeLabelMouseMoved

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        // TODO add your handling code here:
        exitLabel.setForeground(Color.BLUE);
    }//GEN-LAST:event_exitLabelMouseExited

    private void exitLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseMoved
        // TODO add your handling code here:
        exitLabel.setForeground(Color.BLACK);
    }//GEN-LAST:event_exitLabelMouseMoved

    private void stuListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuListButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(containPanel,"gradeP");
        navigation.setNowText("查看学生列表");
        navigation.setVisible(true);
        gradePanel.update();
    }//GEN-LAST:event_stuListButtonActionPerformed

    private void courseInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseInfoButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(containPanel,"courseInfoP");
        navigation.setNowText("补充课程信息");
        navigation.setVisible(true);
        courseInfoPanel.update();
    }//GEN-LAST:event_courseInfoButtonActionPerformed

    private void gradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(containPanel,"courseListP");
        navigation.setNowText("查看课程");
        navigation.setVisible(true);
        courseListPanel.update();
        
    }//GEN-LAST:event_gradeButtonActionPerformed

    private void perInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perInfoButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(containPanel,"perInfoP");
        perInfoPanel.update();
        navigation.setNowText("个人信息");
        navigation.setVisible(true);
    }//GEN-LAST:event_perInfoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public  static void main(String args[],final UserInfoVO v,final String ip,final int port) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TEAmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEAmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEAmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEAmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TEAmain(v,ip,port).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CSSLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel NJWUPanel;
    private javax.swing.JLabel arrowLogo;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel backLogo;
    private javax.swing.JPanel backPanel;
    private javax.swing.JPanel containPanel;
    private javax.swing.JButton courseInfoButton;
    private javax.swing.JLabel courseInfoLabel;
    private javax.swing.JLabel currentLogo;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel exitLogo;
    private javax.swing.JButton gradeButton;
    private javax.swing.JLabel gradeLabel;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLogo;
    private javax.swing.JPanel notePanel;
    private javax.swing.JLabel peopleLogo;
    private javax.swing.JButton perInfoButton;
    private javax.swing.JLabel perInfoLabel;
    private javax.swing.JButton stuListButton;
    private javax.swing.JLabel stuListLabel;
    private javax.swing.JPanel teaMainPanel;
    private javax.swing.JPanel titelPanel2;
    // End of variables declaration//GEN-END:variables
   private GradePanel gradePanel;
   private CourseInfoPanel courseInfoPanel;
   private PerInfoPanel perInfoPanel;
   private CourseListPanel courseListPanel;
    private Navigation navigation;
   private CardLayout cardLayout;
   private ModifyKeyPanel modifyKeyPanel;
    private Navigation navigation2=null;

    void modifyKeyGUI() {
         cardLayout.show(containPanel,"modifyKeyP");
        modifyKeyPanel.update();
        navigation2 = new Navigation();//-------------------------------导航栏标签
        titelPanel2.add(navigation.getArrow(),0,0);
        titelPanel2.add(navigation.getNow(),0,0);
        navigation2.setArrowLocation(295, 7);
        navigation2.setNowBounds(321, 7, 84, 19);
         navigation2.setNowText("密码修改");
         navigation2.setVisible(true);
    }
}
