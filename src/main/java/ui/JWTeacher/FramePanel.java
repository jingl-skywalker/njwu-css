/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.JWTeacher;

import ui.Library.MyFont;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import ui.Admin.LoginFrame;
import ui.Library.ImageIconFactory;
import ui.Library.LogoButton;
import ui.Library.Navigation;
import ui.Library.SList;
import ui.Library.TextArea;
import ui.Library.TextField;
import ui.Library.TextLabel;

/**
 *
 * @author zili Chen
 */
public class FramePanel extends javax.swing.JPanel {

    /**
     * Creates new form FramePanel
     */
    public FramePanel() {
        initComponents();
        /*GUI-主panel*/
        setOpaque(false);
        navPanel.setOpaque(false);
        font = new MyFont();
        /*GUI-导航*/
        navigation = new Navigation(navPanel,JWMain.card,JWMain.contain,"mainP");
        /*GUI-左侧按钮*/
        image = new ImageIconFactory();
        createButton = new LogoButton(30,90).getLDiaplusButton();
        publishButton = new LogoButton(30,190).getLShareButton();
        checkButton = new LogoButton(30,290).getLSearchButton();
        createLabel = new TextLabel("创建",45,140,50,30).getLabel();
        publishLabel = new TextLabel("发布",45,235,50,30).getLabel();
        checkLabel = new TextLabel("查看",45,332,50,30).getLabel();
        createButton.addMouseListener(new CreateListener());//创建按钮
        add(createButton);
        add(createLabel);
        publishButton.addMouseListener(new PublishListener());//发布按钮
        add(publishButton);
        add(publishLabel);
        checkButton.addMouseListener(new CheckListener());//查看按钮
        add(checkButton);
        add(checkLabel);
        /*GUI-描述框架*/
        leftPanel.setOpaque(false);
        creditLabel = new TextLabel("总体学分",10,30,90,30).getLabel();
        describeLabel = new TextLabel("框架描述",10,90,90,30).getLabel();
        sureButton = new LogoButton(272,280).getLYesButton();
        sureLabel = new TextLabel("确定",332,290,50,30).getLabel();
        creditTextField = new TextField(90,30,280,30).getTextField();
        describeTextArea = new TextArea(90,90,280,180).getTextArea();
        leftPanel.add(creditLabel);
        leftPanel.add(describeLabel);
        leftPanel.add(creditTextField);
        leftPanel.add(describeTextArea);
        leftPanel.add(sureButton);
        leftPanel.add(sureLabel);
        sureButton.addMouseListener(new SureListener());//确定按钮
        /*GUI-创建模块*/
        rightPanel.setOpaque(false);
        newMButton = new LogoButton(120,275).getLPlusButton();
        cancelButton = new LogoButton(230,280).getLCancelButton();
        newMLabel = new TextLabel("添加",180,290,50,30).getLabel();
        cancelLabel = new TextLabel("取消",290,290,50,30).getLabel();
        ArrayList<String> list = new ArrayList<String>();
        list.add("模块一");
        moduleList = new SList(list,20,32,300,235).getList();
        rightPanel.add(newMButton);
        rightPanel.add(cancelButton);
        rightPanel.add(newMLabel);
        rightPanel.add(cancelLabel);
        rightPanel.add(moduleList);
        newMButton.addMouseListener(new NewMListener());//新建模块按钮
        cancelButton.addMouseListener(new CancelListener());//取消按钮
    }

    /*事件-创建框架*/
    class CreateListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
            createButton.setContentAreaFilled(true);
            createButton.setOpaque(false);
            createButton.setBackground(Color.black);
        }

        public void mouseReleased(MouseEvent e) {
            createButton.setContentAreaFilled(false);
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-发布框架*/
    class PublishListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
            publishButton.setContentAreaFilled(true);
            publishButton.setOpaque(false);
            publishButton.setBackground(Color.black);
        }

        public void mouseReleased(MouseEvent e) {
            publishButton.setContentAreaFilled(false);
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-查看框架*/
    class CheckListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
            checkButton.setContentAreaFilled(true);
            checkButton.setOpaque(false);
            checkButton.setBackground(Color.black);
        }

        public void mouseReleased(MouseEvent e) {
            checkButton.setContentAreaFilled(false);
        }

        public void mouseEntered(MouseEvent e) {
        }

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
    
    /*事件-新建模块*/
    class NewMListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            newMFrame = new NewMFrame();
            newMFrame.setVisible(true);
        }

        public void mousePressed(MouseEvent e) {
            newMButton.setContentAreaFilled(true);
            newMButton.setOpaque(false);
            newMButton.setBackground(Color.black);
        }

        public void mouseReleased(MouseEvent e) {
            newMButton.setContentAreaFilled(false);
        }

        public void mouseEntered(MouseEvent e) {
        }

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navPanelLayout.setVerticalGroup(
            navPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        leftPanel.setBackground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        rightPanel.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    /*GUI-左侧按钮*/
    private ImageIconFactory image;
    private JButton createButton;
    private JButton publishButton;
    private JButton checkButton;
    private JLabel createLabel;
    private JLabel publishLabel;
    private JLabel checkLabel;
    /*GUI-描述框架*/
    private MyFont font;
    private JLabel creditLabel;
    private JLabel describeLabel;
    private JTextField creditTextField;
    private JTextArea describeTextArea;
    private JButton sureButton;
    private JLabel sureLabel;
    /*GUI-创建模块*/
    private JList moduleList;
    private JButton newMButton;
    private JButton cancelButton;
    private JLabel newMLabel;
    private JLabel cancelLabel;
    /*逻辑*/
    private DefaultListModel listModel;
    private NewMFrame newMFrame;
}
