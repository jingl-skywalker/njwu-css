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
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import ui.Library.LogoButton;
import ui.Library.Navigation;
import ui.Library.SList;
import ui.Library.ScrollPane;
import ui.Library.Table;
import ui.Library.TextField;
import ui.Library.TextLabel;

/**
 *
 * @author zili Chen
 */
public class CoursePanel extends javax.swing.JPanel {

    /**
     * Creates new form CoursePanel
     */
    public CoursePanel() {
        initComponents();
        /*GUI-主panel*/
        setOpaque(false);
        navPanel.setOpaque(false);
        /*GUI-导航*/
        navigation = new Navigation(navPanel,JWMain.card,JWMain.contain,"mainP");
        /*GUI-组件*/
        ArrayList<String> term = new ArrayList<String>();
        term.add("2011-1");term.add("2011-2");term.add("2012-1");term.add("2012-2");term.add("2013-1");term.add("2013-2");
        termList = new SList(term,50,120,120,190).getList();
        
        ArrayList<String> content = new ArrayList<String>();
        content.add("通修;必修;思想政治;1234;思想道德与法律基础;3;3;大一上");
        ArrayList<String> head = new ArrayList<String>();
        head.add("模块");head.add("性质");head.add("类型");head.add("课程号");head.add("课程名");head.add("学分");head.add("周学时");head.add("修读年级");
        String s = ";";
        scroll = new ScrollPane(200,120,750,190).getScrollPane();
        table = new Table(content,head,s).getTable();
        scroll.setViewportView(table);
        
        hintLabel = new TextLabel("从文件中添加",200,70,100,30).getLabel();
        pathTextField = new TextField(310,70,450,30).getTextField();
        openButton = new LogoButton(800,60).getLOpenButton();
        submitButton = new LogoButton(870,60).getLYesButton();
        openButton.addMouseListener(new OpenListener());
        submitButton.addMouseListener(new SubmitListener());
        
        int y1 = 330;//按钮
        int y2 = 380;//按钮标签
        int x1 = 250;//第一个按钮
        int a = 90;//间隙
        int x2 = x1+a+3;
        int x3 = x2+a;
        int x4 = x3+a;
        int x5 = x4+a;
        int x6 = x5+a;
        newTermButton = new LogoButton(x1,y1-5).getLPlusButton();
        importButton = new LogoButton(x2,y1).getLNextButton();
        deleteButton = new LogoButton(x3,y1).getLDeleteButton();
        modifyButton = new LogoButton(x4,y1).getLPenMofityButton();
        refreshButton = new LogoButton(x5,y1).getLRefreshButton();
        addButton = new LogoButton(x6,y1-3).getLDiaplusButton();
        newTermButton.addMouseListener(new NewTermListener());
        importButton.addMouseListener(new ImportListener());
        deleteButton.addMouseListener(new DeleteListener());
        modifyButton.addMouseListener(new ModifyListener());
        refreshButton.addMouseListener(new RefreshListener());
        addButton.addMouseListener(new AddListener());
        newTermLabel = new TextLabel("添加新学期",x1,y2,100,30).getLabel();
        importLabel = new TextLabel("导入新学期",x2-7,y2,100,30).getLabel();
        deleteLabel = new TextLabel("删除课程",x3-2,y2,100,30).getLabel();
        modifyLabel = new TextLabel("修改课程信息",x4-12,y2,100,30).getLabel();
        refreshLabel = new TextLabel("刷新",x5+12,y2,100,30).getLabel();
        addLabel = new TextLabel("添加课程",x6,y2-3,100,30).getLabel();
        
        add(termList);add(scroll);
        add(newTermButton);add(importButton);add(deleteButton);add(refreshButton);add(addButton);add(modifyButton);
        add(newTermLabel);add(importLabel);add(deleteLabel);add(refreshLabel);add(addLabel);add(modifyLabel);
        add(openButton);add(submitButton);
        add(hintLabel);add(pathTextField);
    }
    
    /*事件-添加新学期*/
    class NewTermListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            newTermButton.setContentAreaFilled(true);
            newTermButton.setBackground(Color.black);
            newTermButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            newTermButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-导入课程至新学期*/
    class ImportListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            importButton.setContentAreaFilled(true);
            importButton.setBackground(Color.black);
            importButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            importButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-删除*/
    class DeleteListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            deleteButton.setContentAreaFilled(true);
            deleteButton.setBackground(Color.black);
            deleteButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            deleteButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-修改*/
    class ModifyListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            modifyButton.setContentAreaFilled(true);
            modifyButton.setBackground(Color.black);
            modifyButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            modifyButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-刷新*/
    class RefreshListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            refreshButton.setContentAreaFilled(true);
            refreshButton.setBackground(Color.black);
            refreshButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            refreshButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-添加*/
    class AddListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            courseInfoFrame = new CourseInfoFrame();
            courseInfoFrame.setVisible(true);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            addButton.setContentAreaFilled(true);
            addButton.setBackground(Color.black);
            addButton.setOpaque(false);
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
    
    /*事件-打开*/
    class OpenListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            openButton.setContentAreaFilled(true);
            openButton.setBackground(Color.black);
            openButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            openButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-提交*/
    class SubmitListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            submitButton.setContentAreaFilled(true);
            submitButton.setBackground(Color.black);
            submitButton.setOpaque(false);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            submitButton.setContentAreaFilled(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel navPanel;
    // End of variables declaration//GEN-END:variables
    /*GUI-导航*/
    private Navigation navigation;
    /*GUI-组件*/
    private JList termList;
    private JScrollPane scroll;
    private JTable table;
    private JButton newTermButton;
    private JButton importButton;
    private JButton deleteButton;
    private JButton modifyButton;
    private JButton refreshButton;
    private JButton addButton;
    private JButton openButton;
    private JButton submitButton;
    private JLabel newTermLabel;
    private JLabel importLabel;
    private JLabel deleteLabel;
    private JLabel modifyLabel;
    private JLabel refreshLabel;
    private JLabel addLabel;
    private JLabel hintLabel;
    private JTextField pathTextField;
    
    private CourseInfoFrame courseInfoFrame;
           
}
