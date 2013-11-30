package businesslogic.framebl;

import po.framepo.BlockPO;
import vo.framevo.BlockVO;

public class Block {

    private static int index = 0;
    private String name;
    private int num;
    private String description;
    private int lower;
    private int upper;

    public Block() {
        index++;
    }

    public Block(String name, String description, int lower, int upper) {
        this();
        this.num = index;
        this.name = name;
        this.description = description;
        this.lower = lower;
        this.upper = upper;
    }

    public Block(BlockVO bvo) {
        this(bvo.getName(), bvo.getDescription(), bvo.getLower(), bvo.getUpper());
        index--;
    }

    public Block(BlockPO bpo) {
        this(bpo.getName(), bpo.getDescription(), bpo.getLower(), bpo.getUpper());
        index--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLower() {
        return lower;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }

    public int getUpper() {
        return upper;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }
}
