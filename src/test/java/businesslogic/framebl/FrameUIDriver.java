/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.framebl;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import businesslogicservice.frameblservice.FrameBLService;
import vo.framevo.FrameVO;

/**
 *
 * @author Administrator
 */
public class FrameUIDriver {

    JButton newFbt;
    JButton newBbt;
    JButton releaseBt;
    JButton finishBbt;
    JTextField totalField;
    JTextArea frameInfoArea;
    JTextField blockNameField;
    JTextArea blockInfoArea;
    String upper;
    String lower;
    FrameBLService fbls;
    FrameVO fvo;

    public FrameUIDriver() {

        newFbt = new JButton();
        newBbt = new JButton();
        releaseBt = new JButton();
        finishBbt = new JButton();
        totalField = new JTextField("150");
        upper = "50";
        lower = "33";
        frameInfoArea = new JTextArea("Information just for test.\r\n--njwu-css-client-by -aurora-njuse");
        blockNameField = new JTextField("block1");
        blockInfoArea = new JTextArea("block info just for test.\r\n njwu-css-client");

    }

    FrameUIDriver(FrameBLService fbls) {
        this();
        this.fbls = fbls;
    }

    public void createFPressed() {
        String totelString = totalField.getText();
        int total = 0;
        try {
            total = Integer.parseInt(totelString);
        } catch (Exception e) {
            System.out.println("test/frameui/parsetotal error");
        }
        String frameinfo = frameInfoArea.getText();
        fvo = fbls.createFrame(total, frameinfo);
    }

    public void createBlockPressed() {
        //nothing to test;
        //all action will take place in lelvel ui,without logic
    }

    public void finishBlockPressed() {
        String name = blockNameField.getText();
        String blockinfo = blockInfoArea.getText();
        int upper = 0;
        int lower = 0;
        try {
            upper = Integer.parseInt(this.upper);
            lower = Integer.parseInt(this.lower);
        } catch (Exception e) {
            System.out.println("/test/frameui/parse block info error");
        }
        fvo = fbls.createBlock(name, lower, upper, blockinfo);
    }

    public void releasePressed() {
        fbls.release();
    }

}
