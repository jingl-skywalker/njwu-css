/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import ui.Library.LogoButton;
import ui.Library.RadioButton;
import ui.Library.TextField;
import ui.Library.TextLabel;

/**
 *
 * @author zili Chen
 */
public class StaCoursePanel extends javax.swing.JPanel {

    /**
     * Creates new form StaCoursePanel
     */
    public StaCoursePanel() {
        initComponents();
        /*GUI*/
        int x1 = 10;//通识通修
        int x2 = x1+100;//总课程数
        int x3 = x2+100;//textField
        int x4 = x3+100;//图
        int x5 = x4+200;//课程ID
        int x6 = x5 +100;//总修读人数内容
        int y1 = 10;
        int y2 = y1+40;
        int y3 = y2+50;
        int y4 = y3+40;
        int y5 = y4+50;
        int y6 = y5+40;
        int y7 = y6+50;
        int y8 = y7+40;
        int w = 26;//textfield宽度
        tongshiLabel = new TextLabel("通识通修",x1,y1,80,30).getLabel();
        xuekeLabel = new TextLabel("学科专业",x1,y3,80,30).getLabel();
        kaifangLabel = new TextLabel("开放选修",x1,y5,80,30).getLabel();
        biyeLabel = new TextLabel("毕业设计",x1,y7,80,30).getLabel();
        course1Label = new TextLabel("总课程数",x2,y1,80,30).getLabel();
        credit1Label = new TextLabel("总学分数",x2,y2,80,30).getLabel();
        course2Label = new TextLabel("总课程数",x2,y3,80,30).getLabel();
        credit2Label = new TextLabel("总学分数",x2,y4,80,30).getLabel();
        course3Label = new TextLabel("总课程数",x2,y5,80,30).getLabel();
        credit3Label = new TextLabel("总学分数",x2,y6,80,30).getLabel();
        course4Label = new TextLabel("总课程数",x2,y7,80,30).getLabel();
        credit4Label = new TextLabel("总学分数",x2,y8,80,30).getLabel();
        course1TextField = new TextField(x3,y1,50,w).getTextField();
        credit1TextField = new TextField(x3,y2,50,w).getTextField();
        course2TextField = new TextField(x3,y3,50,w).getTextField();
        credit2TextField = new TextField(x3,y4,50,w).getTextField();
        course3TextField = new TextField(x3,y5,50,w).getTextField();
        credit3TextField = new TextField(x3,y6,50,w).getTextField();
        course4TextField = new TextField(x3,y7,50,w).getTextField();
        credit4TextField = new TextField(x3,y8,50,w).getTextField();
        
        idLabel = new TextLabel("课程号",x5,y2,80,30).getLabel();
        yearLabel = new TextLabel("年份",x5,y3,80,30).getLabel();
        idTextField = new TextField(x5+100,y2,100,w).getTextField();
        yearTextField = new TextField(x5+100,y3,100,w).getTextField();
        totalNumLabel = new TextLabel("总修读人数",x5,y5,80,30).getLabel();
        totalCreditLabel = new TextLabel("总学分",x5,y6,80,30).getLabel();
        passNumLabel = new TextLabel("及格人数",x5,y7,80,30).getLabel();
        percentLabel = new TextLabel("及格率",x5,y8,80,30).getLabel();
        totalNum1Label = new TextLabel("通识通修",x6,y5,80,30).getLabel();
        totalCredit1Label = new TextLabel("通识通修",x6,y6,80,30).getLabel();
        passNum1Label = new TextLabel("通识通修",x6,y7,80,30).getLabel();
        percent1Label = new TextLabel("通识通修",x6,y8,80,30).getLabel();
        
        upButton = new RadioButton("上学期",x5,y4,80,30).getButton();
        downButton = new RadioButton("下学期",x5+100,y4,80,30).getButton();
        upButton.addMouseListener(new UpListener());
        downButton.addMouseListener(new DownListener());
        upButton.setSelected(true);
        group = new ButtonGroup();
        group.add(upButton);
        group.add(downButton);
        searchButton = new LogoButton(x5+230,y4-70).getLSearchButton();
        searchButton.addMouseListener(new SearchListener());
        
        add(tongshiLabel);add(xuekeLabel);add(kaifangLabel);add(biyeLabel);
        add(course1Label);add(credit1Label);add(course2Label);add(credit2Label);add(course3Label);add(credit3Label);add(course4Label);add(credit4Label);
        add(course1TextField);add(credit1TextField);
        add(course2TextField);add(credit2TextField);
        add(course3TextField);add(credit3TextField);
        add(course4TextField);add(credit4TextField);
        add(idLabel);add(yearLabel);add(totalNumLabel);add(totalCreditLabel);add(passNumLabel);add(percentLabel);
        add(totalNum1Label);add(totalCredit1Label);add(passNum1Label);add(percent1Label);
        add(upButton);add(downButton);add(searchButton);
        add(idTextField);add(yearTextField);
    }
    
    /*事件-上学期*/
    class UpListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            upButton.setContentAreaFilled(true);
            upButton.setBackground(Color.black);
            upButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            upButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-下学期*/
    class DownListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            downButton.setContentAreaFilled(true);
            downButton.setBackground(Color.black);
            downButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            downButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-搜查按钮*/
    class SearchListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            searchButton.setContentAreaFilled(true);
            searchButton.setBackground(Color.black);
            searchButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            searchButton.setContentAreaFilled(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    /*GUI*/
    private JLabel tongshiLabel;
    private JLabel xuekeLabel;
    private JLabel kaifangLabel;
    private JLabel biyeLabel;
    private JLabel course1Label;
    private JLabel credit1Label;
    private JLabel course2Label;
    private JLabel credit2Label;
    private JLabel course3Label;
    private JLabel credit3Label;
    private JLabel course4Label;
    private JLabel credit4Label;
    private JTextField course1TextField;
    private JTextField credit1TextField;
    private JTextField course2TextField;
    private JTextField credit2TextField;
    private JTextField course3TextField;
    private JTextField credit3TextField;
    private JTextField course4TextField;
    private JTextField credit4TextField;
    
    private JLabel idLabel;
    private JLabel yearLabel;
    private JTextField idTextField;
    private JTextField yearTextField;
    private JLabel totalNumLabel;
    private JLabel totalCreditLabel;
    private JLabel passNumLabel;
    private JLabel percentLabel;
    private JLabel totalNum1Label;
    private JLabel totalCredit1Label;
    private JLabel passNum1Label;
    private JLabel percent1Label;
    private JButton searchButton;
    private JRadioButton upButton;
    private ButtonGroup group;
    private JRadioButton downButton;
    
}
