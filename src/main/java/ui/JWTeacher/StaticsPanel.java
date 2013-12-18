/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import ui.Library.ComboBox;
import ui.Library.LogoButton;
import ui.Library.Navigation;
import ui.Library.SList;
import ui.Library.ScrollPane;
import ui.Library.StaPanel;
import ui.Library.Table;
import ui.Library.TextField;
import ui.Library.TextLabel;

/**
 *
 * @author zili Chen
 */
public class StaticsPanel extends javax.swing.JPanel {

    /**
     * Creates new form StaticsPanel
     */
    public StaticsPanel() {
        initComponents();
        /*GUI-主panel*/
        setOpaque(false);
        navPanel.setOpaque(false);
        /*GUI-导航*/
        navigation = new Navigation(navPanel,JWMain.card,JWMain.contain,"mainP");
        /*GUI-左上面板*/
        int x1 = 20;
        int x2 = 130;
        leftupPanel.setOpaque(false);
        stuLabel = new TextLabel("学生",x1,0,50,30).getLabel();
        teaLabel = new TextLabel("教师",x1,40,50,30).getLabel();
        courseLabel = new TextLabel("课程",x1,80,50,30).getLabel();
        stuButton = new LogoButton(x2,0).getLLoginButton();
        teaButton = new LogoButton(x2,40).getLLoginButton();
        courseButton = new LogoButton(x2,80).getLLoginButton();
        stuButton.addMouseListener(new StuListener());
        teaButton.addMouseListener(new TeaListener());
        courseButton.addMouseListener(new CourseListener());
        leftupPanel.add(stuLabel);leftupPanel.add(teaLabel);leftupPanel.add(courseLabel);
        leftupPanel.add(stuButton);leftupPanel.add(teaButton);leftupPanel.add(courseButton);
        /*GUI-左下面板*/
        leftdownPanel.setOpaque(false);
        allLabel = new TextLabel("全校",x1,0,50,30).getLabel();
        insLabel = new TextLabel("院系",x1,40,50,30).getLabel();
        allButton = new LogoButton(x2,0).getLLoginButton();
        insButton = new LogoButton(x2,40).getLLoginButton();
        allButton.addMouseListener(new AllListener());
        insButton.addMouseListener(new InsListener());
        leftdownPanel.add(allLabel);leftdownPanel.add(insLabel);
        leftdownPanel.add(allButton);leftdownPanel.add(insButton);
        ArrayList<String> ins = new ArrayList<String>();
        ins.add("软件学院");ins.add("商学院");ins.add("医学院");
        insList = new SList(ins,x1,80,140,170).getList();
        leftdownPanel.add(insList);
        /*GUI-右面板*/
        rightPanel.setOpaque(false);
        card = new CardLayout();
        rightPanel.setLayout(card);
        stuPanel = new StaStuPanel();
        stuPanel.setOpaque(false);
        teaPanel = new StaTeaPanel();
        teaPanel.setOpaque(false);
        coursePanel = new StaCoursePanel();
        coursePanel.setOpaque(false);
        rightPanel.add(stuPanel,"stuP");
        rightPanel.add(teaPanel,"teaP");
        rightPanel.add(coursePanel,"courseP");
    }
    
    /*事件-学生*/
    class StuListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(rightPanel,"stuP");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            stuButton.setContentAreaFilled(true);
            stuButton.setBackground(Color.black);
            stuButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            stuButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-教师*/
    class TeaListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(rightPanel,"teaP");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            teaButton.setContentAreaFilled(true);
            teaButton.setBackground(Color.black);
            teaButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            teaButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-课程*/
    class CourseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            card.show(rightPanel,"courseP");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            courseButton.setContentAreaFilled(true);
            courseButton.setBackground(Color.black);
            courseButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            courseButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-全校*/
    class AllListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            allButton.setContentAreaFilled(true);
            allButton.setBackground(Color.black);
            allButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            allButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-院系*/
    class InsListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            insButton.setContentAreaFilled(true);
            insButton.setBackground(Color.black);
            insButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            insButton.setContentAreaFilled(false);
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
        leftupPanel = new javax.swing.JPanel();
        leftdownPanel = new javax.swing.JPanel();
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

        leftupPanel.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout leftupPanelLayout = new javax.swing.GroupLayout(leftupPanel);
        leftupPanel.setLayout(leftupPanelLayout);
        leftupPanelLayout.setHorizontalGroup(
            leftupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        leftupPanelLayout.setVerticalGroup(
            leftupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        leftdownPanel.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout leftdownPanelLayout = new javax.swing.GroupLayout(leftdownPanel);
        leftdownPanel.setLayout(leftdownPanelLayout);
        leftdownPanelLayout.setHorizontalGroup(
            leftdownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        leftdownPanelLayout.setVerticalGroup(
            leftdownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        rightPanel.setBackground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leftdownPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leftdownPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel leftdownPanel;
    private javax.swing.JPanel leftupPanel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
    /*GUI-导航*/
    private Navigation navigation;
    /*GUI-左上面板*/
    private JLabel stuLabel;
    private JLabel teaLabel;
    private JLabel courseLabel;
    private JButton stuButton;
    private JButton teaButton;
    private JButton courseButton;
    /*GUI-左下面板*/
    private JLabel allLabel;
    private JLabel insLabel;
    private JButton allButton;
    private JButton insButton;
    private JList insList;
    /*GUI-右面板*/
    private CardLayout card;
    private StaStuPanel stuPanel;
    private StaTeaPanel teaPanel;
    private StaCoursePanel coursePanel;
    /*GUI-学生面板*/

            
    /*GUI-教师面板*/
        
    /*GUI-课程面板*/
    
}
