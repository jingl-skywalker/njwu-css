/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.framepo;

import businesslogic.framebl.Block;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class BlockPO implements  Serializable{

    private String name;
    private String description;
    private int upper;
    private int lower;

    public BlockPO(String name, String description, int upper, int lower) {
        this.name = name;
        this.description = description;
        this.upper = upper;
        this.lower = lower;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getLower() {
        return this.lower;
    }

    public int getUpper() {
        return this.lower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String des) {
        this.description = des;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }

    public String toStoreString() {
        return "" + this.name + ":" + this.description + ":" + this.lower + ":" + this.upper;
    }
}
