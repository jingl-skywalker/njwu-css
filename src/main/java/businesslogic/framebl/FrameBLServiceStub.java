/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.framebl;

import java.util.ArrayList;

import businesslogicservice.frameblservice.FrameBLService;
import vo.framevo.BlockVO;
import vo.framevo.FrameVO;

/**
 *
 * @author Administrator
 */
public class FrameBLServiceStub implements FrameBLService {

    int total;
    String base;
    ArrayList<BlockVO> blocks = new ArrayList<BlockVO>();
    boolean isPublic = false;

    public FrameBLServiceStub() {
    }

    public FrameBLServiceStub(int total, String base) {
        this.total = total;
        this.base = base;
    }

    public FrameVO createFrame(int total, String description) {
        this.total = total;
        this.base = base;
        System.out.println("The frame is stored in the database");
        return null;
        // return new FrameVO(total, description);
    }

    public FrameVO createBlock(String name, int lower, int upper, String description) {
        //     BlockVO blockVO = new BlockVO(name, description, upper, lower);
        //   blocks.add(blockVO);
        // System.out.println("The new block is stored in the database");
        return null;
        //return null;
    }

    public boolean release() {
        this.isPublic = true;
        System.out.println("The frame can be observed by every cunstomer");
        return true;
    }

    public FrameVO modifyBase(int total, String description) {
        this.base = description;
        this.total = total;
        System.out.println("Successfully modify the base");
        return null;
        // return new FrameVO(this.total, this.base);
        //int the real program will store the changes to file
    }

    public FrameVO modifyBlock(int ID, String name, int lower, int upper, String description) {
        //   BlockVO bvo = new BlockVO(name, description, upper, lower);
        // blocks.set(ID, bvo);
        System.out.println("successfuly modify the block");
        return null;
    }

    public FrameVO look() {
        // return new FrameVO(200, "Just for testing!");
        return null;
    }

    public BlockVO createBlock(String name, String description, int lower,
            int upper) {
        // TODO Auto-generated method stub
        return null;
    }
}
