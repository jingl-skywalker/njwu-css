/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import ui.Library.LogoButton;
import ui.Library.MyFont;
import ui.Library.TextLabel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ui.Library.ImageIconFactory;
import ui.Library.Navigation;
import ui.Library.RadioButton;
import ui.Library.SList;
import ui.Library.TextArea;
import ui.Library.TextField;

/**
 *
 * @author zili Chen
 */
public class NoticePanel extends javax.swing.JPanel {

    /**
     * Creates new form NoticePanel
     */
    public NoticePanel() {
        initComponents();
        /*GUI-主panel*/
        setOpaque(false);
        navPanel.setOpaque(false);
        /*GUI-导航*/
        navigation = new Navigation(navPanel,JWMain.card,JWMain.contain,"mainP");
        navigation.setTOP("processP");
        /*GUI-左侧面板*/
        image = new ImageIconFactory();
        leftPanel.setOpaque(false);
        font = new MyFont();
        addButton = new LogoButton(70,300).getLPlusButton();
        addLabel = new JLabel();//?
        ArrayList<String> list = new ArrayList<String>();
        list.add("不要迟到");
        noticeList = new SList(list,10,10,180,280).getList();//通知列表
        leftPanel.add(noticeList,0,0);
        addButton.addMouseListener(new AddListener());//添加通知按钮
        leftPanel.add(addButton);
        leftPanel.add(addLabel);
        /*GUI-右侧面板*/
        rightPanel.setOpaque(false);
        titleLabel = new TextLabel("主题",40,10,50,30).getLabel();
        contentLabel = new TextLabel("内容",40,60,50,30).getLabel();
        objectLabel = new TextLabel("通知对象",40,268,90,30).getLabel();
        sureButton = new LogoButton(170,305).getLYesButton();
        cancelButton = new LogoButton(300,305).getLCancelButton();
        sureButton.addMouseListener(new SureListener());
        cancelButton.addMouseListener(new CancelListener());
        rightPanel.add(titleLabel);
        rightPanel.add(contentLabel);
        rightPanel.add(objectLabel);
        rightPanel.add(sureButton);
        rightPanel.add(cancelButton);
        titleTextField = new TextField(120,10,550,30).getTextField();
        contentTextArea = new TextArea(120,60,550,200).getTextArea();
        rightPanel.add(titleTextField);
        rightPanel.add(contentTextArea);
        /*GUI-按钮组*/
        buttonGroup = new ButtonGroup();
        yjwButton = new RadioButton("院系教务员",120,270,100,26).getButton();
        teaButton = new RadioButton("任课老师",250,270,100,26).getButton();
        stuButton = new RadioButton("学生",380,270,100,26).getButton();
        allButton = new RadioButton("所有用户",490,270,100,26).getButton();
        buttonGroup.add(yjwButton);
        buttonGroup.add(teaButton);
        buttonGroup.add(stuButton);
        buttonGroup.add(allButton);
        yjwButton.setSelected(true);
        rightPanel.add(yjwButton);
        rightPanel.add(teaButton);
        rightPanel.add(stuButton);
        rightPanel.add(allButton);
    }

    /*事件-添加新信息*/
    class AddListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            addButton.setContentAreaFilled(true);
            addButton.setOpaque(false);
            addButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            addButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
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

        leftPanel.setBackground(new java.awt.Color(255, 51, 204));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        rightPanel.setBackground(new java.awt.Color(153, 0, 153));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
    private ImageIconFactory image;
    private MyFont font;
    private JButton addButton;
    private JLabel addLabel;
    private JList noticeList;
    private DefaultListModel listModel;
    /*GUI-右侧面板*/
    private JLabel titleLabel;
    private JLabel contentLabel;
    private JLabel objectLabel;
    private JLabel sureLabel;
    private JLabel cancelLabel;
    private JButton sureButton;
    private JButton cancelButton;
    private JTextField titleTextField;
    private JTextArea contentTextArea;
    /*GUI-按钮组*/
    private ButtonGroup buttonGroup;
    private JRadioButton yjwButton;
    private JRadioButton teaButton;
    private JRadioButton stuButton;
    private JRadioButton allButton;
}
