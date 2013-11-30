/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vo.framevo;

import businesslogic.framebl.Block;
import po.framepo.BlockPO;


/**
 *
 * @author Administrator
 */
public class BlockVO {
    private String name;
    private int lower;
    private int upper;
    private String description;

    public BlockVO() {
    }

    public BlockVO(String name, int lower, int upper, String description) {
        this.name = name;
        this.lower = lower;
        this.upper = upper;
        this.description = description;
    }
    public BlockVO(Block block)
    {
        this(block.getName(), block.getLower(), block.getUpper(), block.getDescription());
    }
    public BlockVO(BlockPO block)
    {
        this(block.getName(), block.getLower(), block.getUpper(), block.getDescription());
    }

    public String getName() {
        return name;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    public String getDescription() {
        return description;
    }
}
