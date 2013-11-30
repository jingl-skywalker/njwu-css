/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.framevo;

import java.util.ArrayList;
import businesslogic.framebl.Block;
import businesslogic.framebl.BlockList;
import businesslogic.framebl.EduFrame;
import po.framepo.BlockPO;
import po.framepo.FramePO;

/**
 *
 * @author Administrator
 */
public class FrameVO {

    String description;
    ArrayList<BlockVO> blocks;
    int total;

    public FrameVO() {
        blocks = new ArrayList<BlockVO>();
    }

    public FrameVO(String description, int total) {
        this();
        this.description = description;
        this.total = total;
    }

    public FrameVO(String description, int total, BlockList blist) {
        this(description, total);
        for (int i = 0; i < blist.getSum(); i++) {
            blocks.add(new BlockVO(blist.getBlock(i)));
        }
    }

    public FrameVO(EduFrame frame) {
        this(frame.getDescription(), frame.getTotal());
        BlockList bl = frame.getBlocks();
        int size = bl.getSum();
        for (int i = 0; i < size; i++) {
            blocks.add(new BlockVO(bl.getBlock(i)));
        }
    }

    public FrameVO(FramePO fpo) {
        this(fpo.getBase(), fpo.getTotal());
        //BlockList bl = new BlockList();
        for (int i = 0; i < fpo.getBlockSum(); i++) {
            blocks.add(new BlockVO(fpo.getBlockPO(i)));
        }
    }
}
