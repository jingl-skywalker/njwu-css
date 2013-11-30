/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.framepo;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import businesslogic.framebl.Block;
import businesslogic.framebl.EduFrame;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class FramePO implements Serializable{

    private int total;
    private String base;
    private ArrayList<BlockPO> blocks = new ArrayList<BlockPO>();
    private Block[] blist;
    private boolean isPublic = false;

    public FramePO(int total, String base) {
        this.total = total;
        this.base = base;
    }

    public FramePO(EduFrame f) {
        this(f.getTotal(), f.getDescription());

    }
        public FramePO(int total, String base, ArrayList<BlockPO> blocks) {
        this(total, base);
        this.blocks = blocks;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void addBlock(BlockPO blockPO) {
        getBlocks().add(blockPO);
    }

    public void setPublic() {
        this.setIsPublic(true);
    }

    public ArrayList<BlockPO> getBlocks() {
        //   return blist.toBlockArray();
        return this.blocks;
    }

    public void setBlocks(ArrayList<BlockPO> blocks) {
        this.blocks = blocks;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public BlockPO getBlockPO(int i) {
        return this.blocks.get(i);
    }

    public int getBlockSum() {
        return this.blocks.size();
    }
        public String toStoreString() {
        StringBuffer sbf = new StringBuffer();
        sbf.append((isPublic) ? "P" : "N");
        sbf.append("\r\n");
        sbf.append("" + this.base.toString() + ":" + this.total);
        sbf.append("\r\n");
        for (BlockPO po : blocks) {
            sbf.append(po.toStoreString());
            sbf.append("\r\n");
        }
        return sbf.toString();

    }
}
