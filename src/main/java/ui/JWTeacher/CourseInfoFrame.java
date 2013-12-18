/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ui.Library.ComboBox;
import ui.Library.ImageIconFactory;
import ui.Library.LogoButton;
import ui.Library.TextField;
import ui.Library.TextLabel;

/**
 *
 * @author zili Chen
 */
public class CourseInfoFrame extends javax.swing.JFrame {

    /**
     * Creates new form CourseInfoFrame
     */
    public CourseInfoFrame() {
        initComponents();
        /*GUI-frame背景*/
        image = new ImageIconFactory();
        backLabel = new JLabel(image.getBmodelbackIcon());
        backLabel.setBounds(0,0,543,272);
        getLayeredPane().add(backLabel,new Integer(Integer.MIN_VALUE));
        backPanel = (JPanel)getContentPane();
        backPanel.setOpaque(false);//设置透明
        /*GUI-组件*/
        int x1 = 10;//第一组
        int x2 = x1+65;//
        int x3 = x2+107;//第二组
        int x4 = x3+65;//
        int x5 = x4+107;//第三组
        int x6 = x5+79;//
        int y1 = 10;//
        int a = 38;
        int y2 = y1+a;//
        int y3 = y2+a;//
        int y4 = y3+a;//
        int y5 = y4+a;//
        int w1 = 80;
        int h1 = 26;
        int w2 = 100;
        int h2 = 26;
        moduleLabel = new TextLabel("课程模块",x1,y1,w1,h1).getLabel();//第一组
        propertyLabel = new TextLabel("课程性质",x1,y2,w1,h1).getLabel();
        typeLabel = new TextLabel("课程类别",x1,y3,w1,h1).getLabel();
        creditLabel = new TextLabel("学分",x1,y4,w1,h1).getLabel();
        hourLabel = new TextLabel("周学时",x1,y5,w1,h1).getLabel();
        ArrayList<String> module = new ArrayList<String>();
        module.add("通识");module.add("通修");
        moduleComboBox = new ComboBox(module,x2,y1,w2,h2).getComboBox();
        ArrayList<String> property = new ArrayList<String>();
        property.add("必修");property.add("指选");property.add("选修");
        propertyComboBox = new ComboBox(property,x2,y2,w2,h2).getComboBox();
        ArrayList<String> type = new ArrayList<String>();
        type.add("通识教育");type.add("思想政治");
        typeComboBox = new ComboBox(type,x2,y3,w2,h2).getComboBox();
        ArrayList<String> credit = new ArrayList<String>();
        credit.add("1");credit.add("2");credit.add("3");
        creditComboBox = new ComboBox(credit,x2,y4,w2,h2).getComboBox();
        ArrayList<String> hour = new ArrayList<String>();
        hour.add("1");hour.add("2");hour.add("3");
        hourComboBox = new ComboBox(hour,x2,y5,w2,h2).getComboBox();
        add(moduleLabel);add(propertyLabel);add(typeLabel);add(creditLabel);add(hourLabel);
        add(moduleComboBox);add(propertyComboBox);add(typeComboBox);add(creditComboBox);add(hourComboBox);
        
        courseIDLabel = new TextLabel("课程号",x3,y1,w1,h1).getLabel();//第二组
        courseNameLabel = new TextLabel("课程名",x3,y2,w1,h1).getLabel();
        isPublicLabel = new TextLabel("是否开放",x3,y3,w1,h1).getLabel();
        insLabel = new TextLabel("开设院系",x3,y4,w1,h1).getLabel();
        learnInsLabel = new TextLabel("修读院系",x3,y5,w1,h1).getLabel();
        courseIDTextField = new TextField(x4,y1,w2,h2).getTextField();
        courseNameTextField = new TextField(x4,y2,w2,h2).getTextField();
        ArrayList<String> isPublic = new ArrayList<String>();
        isPublic.add("是");isPublic.add("否");
        ArrayList<String> ins = new ArrayList<String>();
        ins.add("软件学院");ins.add("医学院");ins.add("商学院");
        ArrayList<String> learnIns = new ArrayList<String>();
        learnIns.add("软件学院");learnIns.add("医学院");learnIns.add("商学院");
        isPublicComboBox = new ComboBox(isPublic,x4,y3,w2,h2).getComboBox();
        insComboBox = new ComboBox(ins,x4,y4,w2,h2).getComboBox();
        learnInsComboBox = new ComboBox(learnIns,x4,y5,w2,h2).getComboBox();
        add(courseIDLabel);add(courseNameLabel);add(isPublicLabel);add(insLabel);add(learnInsLabel);
        add(courseIDTextField);add(courseNameTextField);
        add(isPublicComboBox);add(insComboBox);add(learnInsComboBox);
        
        teaIDLabel = new TextLabel("教师ID",x5,y1,w1,h1).getLabel();//第三组
        teaNameLabel = new TextLabel("教师姓名",x5,y2,w1,h1).getLabel();
        timeLabel = new TextLabel("上课时间",x5,y3,w1,h1).getLabel();
        limitLabel = new TextLabel("人数(0:不限)",x5,y4,w1,h1).getLabel();
        learnGradeLabel = new TextLabel("修读年级",x5,y5,w1,h1).getLabel();
        teaIDTextField = new TextField(x6,y1,w2,h2).getTextField();
        teaNameTextField = new TextField(x6,y2,w2,h2).getTextField();
        timeTextField = new TextField(x6,y3,w2,h2).getTextField();
        limitTextField = new TextField(x6,y4,w2,h2).getTextField();
        ArrayList<String> learnGrade = new ArrayList<String>();
        learnGrade.add("大一");learnGrade.add("大二");learnGrade.add("大三");learnGrade.add("大四");
        learnGradeComboBox = new ComboBox(learnGrade,x6,y5,w2,h2).getComboBox();
        add(teaIDLabel);add(teaNameLabel);add(timeLabel);add(limitLabel);add(learnGradeLabel);
        add(teaIDTextField);add(teaNameTextField);add(timeTextField);add(limitTextField);
        add(learnGradeComboBox);
        
        sureButton = new LogoButton(200,200).getLYesButton();
        cancelButton = new LogoButton(300,200).getLCancelButton();
        add(sureButton);add(cancelButton);
        sureButton.addMouseListener(new SureListener());
        cancelButton.addMouseListener(new CancelListener());
    }
    
    /*事件-sure按钮*/
    class SureListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            sureButton.setContentAreaFilled(true);
            sureButton.setOpaque(false);
            sureButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            sureButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-cancel按钮*/
    class CancelListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            cancelButton.setContentAreaFilled(true);
            cancelButton.setOpaque(false);
            cancelButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            cancelButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CourseInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseInfoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseInfoFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    /*GUI-frame背景*/
    private ImageIconFactory image;
    private JLabel backLabel;//背景label
    private JPanel backPanel;//frame最上层面板
    /*GUI-组件*/
    private JLabel moduleLabel;//第一组
    private JLabel propertyLabel;
    private JLabel typeLabel;
    private JLabel creditLabel;
    private JLabel hourLabel;
    private JComboBox moduleComboBox;
    private JComboBox propertyComboBox;
    private JComboBox typeComboBox;
    private JComboBox creditComboBox;
    private JComboBox hourComboBox;
    
    private JLabel courseIDLabel;//第二组
    private JLabel courseNameLabel;
    private JLabel isPublicLabel;
    private JLabel insLabel;
    private JLabel learnInsLabel;
    private JTextField courseIDTextField;
    private JTextField courseNameTextField;
    private JComboBox isPublicComboBox;
    private JComboBox insComboBox;
    private JComboBox learnInsComboBox;
    
    private JLabel teaIDLabel;//第三组
    private JLabel teaNameLabel;
    private JLabel timeLabel;
    private JLabel limitLabel;
    private JLabel learnGradeLabel;
    private JTextField teaIDTextField;
    private JTextField teaNameTextField;
    private JTextField timeTextField;
    private JTextField limitTextField;
    private JComboBox learnGradeComboBox;
    
    private JButton sureButton;
    private JButton cancelButton;
    
}
