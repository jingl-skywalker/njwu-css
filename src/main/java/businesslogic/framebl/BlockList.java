package businesslogic.framebl;

import java.util.ArrayList;

public class BlockList {

    private ArrayList<Block> blist;

    public BlockList() {
        blist = new ArrayList<Block>();
    }
    
    public boolean add(Block b) {
        return blist.add(b);
    }

    public int getSum() {
        return blist.size();
    }

    public boolean remove(Block b) {
        return blist.remove(b);
    }

    public boolean modify() {
        return false;
    }

    public Block[] toBlockArray() {
        int size = blist.size();
        Block[] blocks = null;
        for (int i = 0; i < size; i++) {
            blocks[i] = blist.get(i);
        }
        return blocks;
    }

    public Block getBlock(int i) {
        return blist.get(i);
    }
}
