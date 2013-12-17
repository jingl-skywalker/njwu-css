/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Admin;

import businesslogicservice.userblservice.UserLoginBLService;
import businesslogicservice.userblservice.UserLoginFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import ui.JWTeacher.JWMain;
import ui.Library.ImageIconFactory;
import ui.Library.LogoButton;
import ui.Library.MyFont;
import ui.Library.PicturePath;
import ui.Library.TextLabel;
import ui.Student.StuMain;
import ui.Teacher.TeaMain;
import ui.YJWTeacher.YJWMain;
import vo.uservo.UserInfoVO;

/**
 *
 * @author zili Chen
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        /*GUI-frame背景*/
        image = new ImageIconFactory();
        backLabel = new JLabel(image.getBloginbackIcon());
        backLabel.setBounds(0, 0, 1024, 625);
        getLayeredPane().add(backLabel,new Integer(Integer.MIN_VALUE));
        backPanel = (JPanel)getContentPane();
        backPanel.setOpaque(false);//设置透明
        /*GUI-id/密码输入*/
        font = new MyFont();
        leftPanel.setOpaque(false);
        idTextField = new JTextField(20);
        leftPanel.add(idTextField,0,0);
        idTextField.setBounds(174,380,196,26);
        idTextField.setBorder(null);
        idTextField.setFont(font.getFont());
        idTextField.addActionListener(new TextFieldListener());//注册事件
        password = new JPasswordField(20);
        leftPanel.add(password,0,0);
        password.setBounds(174, 435, 196, 26);
        password.setBorder(null);
        password.setFont(font.getFont());
        password.setEchoChar('*');
        password.addActionListener(new PasswordFieldListener());//注册事件
        /*GUI-登陆图标按钮组*/
        leftDownPanel.setOpaque(false);
        loginButton = new LogoButton(100,15).getLLoginButton();//登录按钮
        leftDownPanel.add(loginButton);
        loginButton.addMouseListener(new LoginListener());
        cancelButton = new LogoButton(203,16).getLExitButton();//取消登录按钮
        leftDownPanel.add(cancelButton);
        cancelButton.addMouseListener(new CancelListener());
        helpButton = new LogoButton(299,15).getLHelpButton();//帮助按钮
        leftDownPanel.add(helpButton);
        helpButton.addMouseListener(new HelpListener());
        /*GUI-身份选择*/
        rightPanel.setOpaque(false);
        stuLabel = new TextLabel(image.getTstu2Icon(),39,276).getLabel();//学生
        rightPanel.add(stuLabel);
        stuLabel.addMouseListener(new StuListener());//注册事件
        teaLabel = new TextLabel(image.getTteaIcon(),180,369).getLabel();//任课老师
        rightPanel.add(teaLabel);
        teaLabel.addMouseListener(new TeaListener());//注册事件
        jwLabel = new TextLabel(image.getTjwIcon(),302,291).getLabel();//教务老师
        rightPanel.add(jwLabel,0,0);
        jwLabel.addMouseListener(new JWListener());//注册事件
        yjwLabel = new TextLabel(image.getTyjwIcon(),304,470).getLabel();//院教务员
        rightPanel.add(yjwLabel,0,0);
        yjwLabel.addMouseListener(new YJWListener());//注册事件
        admLabel = new TextLabel(image.getTadmIcon(),416,388).getLabel();//管理员
        rightPanel.add(admLabel,0,0);
        admLabel.addMouseListener(new AdmListener());//注册事件
        exitButton = new LogoButton(555,5).getLCloseButton();
        rightPanel.add(exitButton);
        exitButton.addMouseListener(new ExitListener());
        exitButton.setContentAreaFilled(false);
        /*逻辑-任天*/
        type = UserType.STUDENT;
        tip = new JLabel();
        leftPanel.add(tip,0,0);
        tip.setBounds(195,345,196,26);
        tip.setFont(new Font("微软雅黑",Font.BOLD,14));
        tip.setForeground(new Color(255,255,0));
        try {
            //rmi通信获取通知
            ip = "localhost";
            port = 1099;
            Registry registry = LocateRegistry.getRegistry(ip, port);
            UserLoginFactory ul = new UserLoginFactory();
            userLogin = ul.getUserLoginController(ip, port);
            String info = userLogin.getNotice();
            if (info != null) {
                informPanel = new InformPanel(info);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /*事件-学生*/
    class StuListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            type = UserType.STUDENT;
            t = "学生";
            stuLabel.setIcon(image.getTstu2Icon());
            teaLabel.setIcon(image.getTteaIcon());
            jwLabel.setIcon(image.getTjwIcon());
            yjwLabel.setIcon(image.getTyjwIcon());
            admLabel.setIcon(image.getTadmIcon());
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-任课老师*/
    class TeaListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            type = UserType.TEACHER;
            t = "任课老师";
            stuLabel.setIcon(image.getTstuIcon());
            teaLabel.setIcon(image.getTtea2Icon());
            jwLabel.setIcon(image.getTjwIcon());
            yjwLabel.setIcon(image.getTyjwIcon());
            admLabel.setIcon(image.getTadmIcon());
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-教务老师*/
    class JWListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            type = UserType.DEAN;
            t = "教务处老师";
            stuLabel.setIcon(image.getTstuIcon());
            teaLabel.setIcon(image.getTteaIcon());
            jwLabel.setIcon(image.getTjw2Icon());
            yjwLabel.setIcon(image.getTyjwIcon());
            admLabel.setIcon(image.getTadmIcon());
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-院教务员*/
    class YJWListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            type = UserType.INS_DEAN;
            t = "院教务员";
            stuLabel.setIcon(image.getTstuIcon());
            teaLabel.setIcon(image.getTteaIcon());
            jwLabel.setIcon(image.getTjwIcon());
            yjwLabel.setIcon(image.getTyjw2Icon());
            admLabel.setIcon(image.getTadmIcon());
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-管理员*/
    class AdmListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            type = UserType.ADMIN;
            t = "管理员";
            stuLabel.setIcon(image.getTstuIcon());
            teaLabel.setIcon(image.getTteaIcon());
            jwLabel.setIcon(image.getTjwIcon());
            yjwLabel.setIcon(image.getTyjwIcon());
            admLabel.setIcon(image.getTadm2Icon());
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-id输入框*/
    class TextFieldListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            id = idTextField.getText();
        }
        
    }
    
    /*事件-密码输入框*/
    class PasswordFieldListener  implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            key = String.valueOf(password.getPassword());
        }
        
    }
    
    /*事件-登陆按钮*/
    class LoginListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        tip.setText("");
        String ID = idTextField.getText();
        String psw = new String(password.getPassword());
        UserInfoVO userVO = userLogin.login(ID, psw);
        if (userVO == null || !userVO.getType().equals(t)) {
            tip.setText("用户名或密码错误");
            return;
        }
       // frame.remove(this);
       //new WaitTip(frame);
       dispose(); 
        switch (type) {
            case STUDENT: {
                StuMain.main(userVO,ip,port);
                break;
            }
            case TEACHER: {
               // WaitPanelj w = new WaitPanelj();
                TeaMain.main(userVO,ip,port);
                break;
            }
            case DEAN: {
                JWMain.main(userVO,ip,port);
                break;
            }
            case INS_DEAN: {
                YJWMain.main(userVO,ip,port);
                break;
            }
            case ADMIN: {
                new AdminMain(userVO, ip, port).setVisible(true);
                break;
            }
        }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            loginButton.setContentAreaFilled(true);
            loginButton.setOpaque(false);
            loginButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            loginButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-取消登陆按钮*/
    class CancelListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            idTextField.setText("");
            password.setText("");
            tip.setText("");
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
    
    /*事件-帮助按钮*/
    class HelpListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            helpButton.setContentAreaFilled(true);
            helpButton.setOpaque(false);
            helpButton.setBackground(Color.black);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            helpButton.setContentAreaFilled(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
        
    }
    
    /*事件-退出系统按钮*/
    class ExitListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
           System.exit(1);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //exitButton.setIcon(exitP1);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //exitButton.setIcon(exitP);
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

        leftPanel = new javax.swing.JPanel();
        leftDownPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout leftDownPanelLayout = new javax.swing.GroupLayout(leftDownPanel);
        leftDownPanel.setLayout(leftDownPanelLayout);
        leftDownPanelLayout.setHorizontalGroup(
            leftDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        leftDownPanelLayout.setVerticalGroup(
            leftDownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leftDownPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(leftDownPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel leftDownPanel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
    /*GUI-frame背景*/
    private ImageIconFactory image;
    private JLabel backLabel;//背景label
    private JPanel backPanel;//frame最上层面板
    private JButton exitButton;
    /*GUI-id/密码输入*/
    private JTextField idTextField;
    private JPasswordField password;
    private MyFont font;
    /*GUI-登陆按钮*/
    private JButton loginButton;
    private JButton cancelButton;
    private JButton helpButton;
    /*GUI-身份选择*/
    private JLabel stuLabel;
    private JLabel teaLabel;
    private JLabel jwLabel;
    private JLabel yjwLabel;
    private JLabel admLabel;
    
    /*逻辑-身份选择*/
    private UserType type;//标记身份：1-学生，2-任课老师，3-教务处老师，4-院教务员，5-管理员
    /*逻辑-输入框*/
    private String id;//账号
    private String key;//密码
    /*逻辑*/
    String t = "学生";
    String ip;//服务器的ip
    int port;//端口号
    UserLoginBLService userLogin;
    InformPanel informPanel;
    JLabel tip;
}
