/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Library;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author zili Chen
 */
public class LogoButton {/*各种按钮*/
    
    private ImageIconFactory icon;
    private ImageIcon image;
    private JButton button;
    private int x;
    private int y;
    
    public LogoButton(int x,int y) {
        this.x = x;
        this.y = y;
        icon = new ImageIconFactory();
    }
    
    void setButton() {
        button = new JButton(image);
        button.setBounds(x,y,image.getIconWidth(),image.getIconHeight());
        button.setContentAreaFilled(false);
    }
    
    /*教务系统图标*/
    public JButton getJTwoDocButton() {
        image = icon.getJTwoDocIcon();
        setButton();
        return button;
    }
    
    public JButton getJFileButton() {
        image = icon.getJFileIcon();
        setButton();
        return button;
    }
    
    public JButton getJListButton() {
        image = icon.getJListIcon();
        setButton();
        return button;
    }
    
    public JButton getJFileBookButton() {
        image = icon.getJFileBookIcon();
        setButton();
        return button;
    }
    
    public JButton getJRecycleButton() {
        image = icon.getJRecycleIcon();
        setButton();
        return button;
    }
    
    public JButton getJThreeBookButton() {
        image = icon.getJThreeBookIcon();
        setButton();
        return button;
    }
    
    public JButton getJOpenBookButton() {
        image = icon.getJOpenBookIcon();
        setButton();
        return button;
    }
    
    public JButton getJCheckButton() {
        image = icon.getJCheckIcon();
        setButton();
        return button;
    }
    
    public JButton getJPencilButton() {
        image = icon.getJPencilIcon();
        setButton();
        return button;
    }
    
    public JButton getJTwoPenButton() {
        image = icon.getJTwoPenIcon();
        setButton();
        return button;
    }
    
    public JButton getJPersonButton() {
        image = icon.getJPersonIcon();
        setButton();
        return button;
    }
    
    public JButton getJManyPerButton() {
        image = icon.getJManyPerIcon();
        setButton();
        return button;
    }
    
    public JButton getJModifyrButton() {
        image = icon.getJModifyIcon();
        setButton();
        return button;
    }
    
    public JButton getJBooksButton() {
        image = icon.getJBooksIcon();
        setButton();
        return button;
    }
    
    public JButton getJGlassButton() {
        image = icon.getJGlassIcon();
        setButton();
        return button;
    }
    
    public JButton getJCycleButton() {
        image = icon.getJCycleIcon();
        setButton();
        return button;
    }
    
    public JButton getJSettingButton() {
        image = icon.getJSettingIcon();
        setButton();
        return button;
    }
    
    public JButton getJPenButton() {
        image = icon.getJPenIcon();
        setButton();
        return button;
    }
    
    /*按钮图标*/
    public JButton getLLeftArrowButton() {
        image = icon.getLLeftArrowIcon();
        setButton();
        return button;
    }
    
    public JButton getLCancelButton() {
        image = icon.getLCancelIcon();
        setButton();
        return button;
    }
    
    public JButton getLCloseButton() {
        image = icon.getLCloseIcon();
        setButton();
        return button;
    }
    
    public JButton getLDiaplusButton() {
        image = icon.getLDiaplusIcon();
        setButton();
        return button;
    }
    
    public JButton getLExitButton() {
        image = icon.getLExitIcon();
        setButton();
        return button;
    }
    
    public JButton getLHomeButton() {
        image = icon.getLHomeIcon();
        setButton();
        return button;
    }
    
    public JButton getLHelpButton() {
        image = icon.getLHelpIcon();
        setButton();
        return button;
    }
    
    public JButton getLLoginButton() {
        image = icon.getLLoginIcon();
        setButton();
        return button;
    }
    
    public JButton getLPenMofityButton() {
        image = icon.getLPenMofityIcon();
        setButton();
        return button;
    }
    
    public JButton getLNextButton() {
        image = icon.getLNextIcon();
        setButton();
        return button;
    }
    
    public JButton getLNoteButton() {
        image = icon.getLNoteIcon();
        setButton();
        return button;
    }
    
    public JButton getLPlusButton() {
        image = icon.getLPlusIcon();
        setButton();
        return button;
    }
    
    public JButton getLReplaceButton() {
        image = icon.getLReplaceIcon();
        setButton();
        return button;
    }
    
    public JButton getLSearchButton() {
        image = icon.getLSearchIcon();
        setButton();
        return button;
    }
    
    public JButton getLSetButton() {
        image = icon.getLSetIcon();
        setButton();
        return button;
    }
    
    public JButton getLShareButton() {
        image = icon.getLShareIcon();
        setButton();
        return button;
    }
    
    public JButton getLYesButton() {
        image = icon.getLYesIcon();
        setButton();
        return button;
    }

    public JButton getLCreditButton() {
        image = icon.getLCreditIcon();
        setButton();
        return button;
    }
    
}
