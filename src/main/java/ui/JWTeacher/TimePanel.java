/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import ui.Library.ComboBox;
import ui.Library.LogoButton;
import ui.Library.Navigation;
import ui.Library.TextLabel;

/**
 *
 * @author zili Chen
 */
public class TimePanel extends javax.swing.JPanel {

    /**
     * Creates new form TimePanel
     */
    public TimePanel() {
        initComponents();
        /*GUI-主panel*/
        setOpaque(false);
        navPanel.setOpaque(false);
        /*GUI-导航*/
        navigation = new Navigation(navPanel,JWMain.card,JWMain.contain,"mainP");
        navigation.setTOP("processP");
        /*GUI-左侧面板*/
        leftPanel.setOpaque(false);
        int x = 50;
        int h = 90;
        termLabel = new TextLabel("学期",x,10,100,h).getLabel();
        frameLabel = new TextLabel("教学框架制定",x,40,100,h).getLabel();
        planLabel = new TextLabel("教学计划制定",x,70,100,h).getLabel();
        courseLabel = new TextLabel("课程发布",x,100,100,h).getLabel();
        selectLabel = new TextLabel("选课",x,130,100,h).getLabel();
        reSelectLabel = new TextLabel("补选",x,160,100,h).getLabel();
        drawlLabel = new TextLabel("退选",x,190,100,h).getLabel();
        gradeLabel = new TextLabel("成绩录入",x,220,100,h).getLabel();
        leftPanel.add(termLabel);
        leftPanel.add(frameLabel);
        leftPanel.add(planLabel);
        leftPanel.add(courseLabel);
        leftPanel.add(selectLabel);
        leftPanel.add(reSelectLabel);
        leftPanel.add(drawlLabel);
        leftPanel.add(gradeLabel);
        /*GUI-右侧面板*/
        rightPanel.setOpaque(false);
        ArrayList<String> year = new ArrayList<String>();//年
        year.add("2014");year.add("2015");year.add("2016");
        ArrayList<String> mon = new ArrayList<String>();//月
        String s = "0";
        for(int i=1;i<13;i++) {
            s = s+i;
            mon.add(s);
            s = "0";
            if(i>8) {
                s = "";
            }
        }
        ArrayList<String> day = new ArrayList<String>();//日
        s = "0";
        for(int i=1;i<32;i++) {
            s = s+i;
            day.add(s);
            s = "0";
            if(i>8) {
                s = "";
            }
        }
        ArrayList<String> hour = new ArrayList<String>();//时
        s = "0";
        for(int i=0;i<24;i++) {
            s = s+i;
            hour.add(s);
            s = "0";
            if(i>8) {
                s = "";
            }
        }
        ArrayList<String> min = new ArrayList<String>();//分
        s = "0";
        for(int i=0;i<60;i++) {
            s = s+i;
            min.add(s);
            s = "0";
            if(i>8) {
                s = "";
            }
        }
        int x1 = 70;//年
        int x2 = 230;//月
        int x3 = 390;//日
        int x4 = 230;//时
        int x5 = 280;//分
        int y1 = 80;//开始年月日
        int y3 = 130;//开始时分
        int y2 = 230;//截止年月日
        int y4 = 270;//截止时分
        int w1 = 100;//年月日宽度
        int w2 = 50;//时分宽度
        int xl1 = x1+110;//年标签
        int xl2 = x2+110;//月标签
        int xl3 = x3+110;//日标签
        startLabel = new TextLabel("开始时间",80,10,100,90).getLabel();
        endLabel = new TextLabel("截止时间",80,y2-70,100,90).getLabel();
        yearLabel = new TextLabel("年",xl1,50,100,90).getLabel();
        monLabel = new TextLabel("月",xl2,50,100,90).getLabel();
        dayLabel = new TextLabel("日",xl3,50,100,90).getLabel();
        year2Label = new TextLabel("年",xl1,200,100,90).getLabel();
        mon2Label = new TextLabel("月",xl2,200,100,90).getLabel();
        day2Label = new TextLabel("日",xl3,200,100,90).getLabel();
        sureButton = new LogoButton(600,100).getLYesButton();
        cancelButton = new LogoButton(600,200).getLCancelButton();
        sureButton.addMouseListener(new SureListener());
        cancelButton.addMouseListener(new CancelListener());
        yearComboBox = new ComboBox(year,x1,y1,w1,30).getComboBox();
        monComboBox = new ComboBox(mon,x2,y1,w1,30).getComboBox();
        dayComboBox = new ComboBox(day,x3,y1,w1,30).getComboBox();
        year2ComboBox = new ComboBox(year,x1,y2,w1,30).getComboBox();
        mon2ComboBox = new ComboBox(mon,x2,y2,w1,30).getComboBox();
        day2ComboBox = new ComboBox(day,x3,y2,w1,30).getComboBox();
        hourComboBox = new ComboBox(hour,x4,y3,w2,30).getComboBox();
        minComboBox = new ComboBox(min,x5,y3,w2,30).getComboBox();
        hour2ComboBox = new ComboBox(hour,x4,y4,w2,30).getComboBox();
        min2ComboBox = new ComboBox(min,x5,y4,w2,30).getComboBox();
        rightPanel.add(startLabel);
        rightPanel.add(endLabel);
        rightPanel.add(yearLabel);
        rightPanel.add(monLabel);
        rightPanel.add(dayLabel);
        rightPanel.add(year2Label);
        rightPanel.add(mon2Label);
        rightPanel.add(day2Label);
        rightPanel.add(sureButton);
        rightPanel.add(cancelButton);
        rightPanel.add(yearComboBox);
        rightPanel.add(monComboBox);
        rightPanel.add(dayComboBox);
        rightPanel.add(hourComboBox);
        rightPanel.add(minComboBox);
        rightPanel.add(year2ComboBox);
        rightPanel.add(mon2ComboBox);
        rightPanel.add(day2ComboBox);
        rightPanel.add(hour2ComboBox);
        rightPanel.add(min2ComboBox);
    }
    
    /*事件-sure按钮*/
    class SureListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            
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

    public void update() {
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();

        navPanel.setBackground(new java.awt.Color(51, 255, 102));

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanel.setLayout(navPanelLayout);
        navPanelLayout.setHorizontalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        leftPanel.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        rightPanel.setBackground(new java.awt.Color(51, 0, 204));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
    /*GUI-导航*/
    private Navigation navigation;
    /*GUI-左侧面板*/
    private JLabel termLabel;
    private JLabel frameLabel;
    private JLabel planLabel;
    private JLabel courseLabel;
    private JLabel selectLabel;
    private JLabel reSelectLabel;
    private JLabel drawlLabel;
    private JLabel gradeLabel;
    /*GUI-右侧面板*/
    private JLabel startLabel;
    private JLabel endLabel;
    private JLabel yearLabel;
    private JLabel monLabel;
    private JLabel dayLabel;
    private JLabel year2Label;
    private JLabel mon2Label;
    private JLabel day2Label;
    private JButton sureButton;
    private JButton cancelButton;
    private JComboBox yearComboBox;
    private JComboBox monComboBox;
    private JComboBox dayComboBox;
    private JComboBox year2ComboBox;
    private JComboBox mon2ComboBox;
    private JComboBox day2ComboBox;
    private JComboBox hourComboBox;
    private JComboBox minComboBox;
    private JComboBox hour2ComboBox;
    private JComboBox min2ComboBox;
    
}
