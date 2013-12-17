/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.framedataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;
import po.framepo.BlockPO;
import po.framepo.FramePO;

/**
 *
 * @author Administrator
 */
public class FrameDataServiceStub implements FrameDataService {

    FramePO framePO = new FramePO(100, "testFrame");
    BlockPO blockPO = new BlockPO("b1", "test1", 3, 5);
    BlockPO blockPO1 = new BlockPO("b2", "test2", 3, 6);
    ArrayList<BlockPO> blockPOs = new ArrayList<BlockPO>();

    @Override
    public void insert(FramePO fpo) throws RemoteException {
        System.out.println("@FrameDataServiceStub.java: insertSuccessfully");
    }

    @Override
    public void update(FramePO fpo) throws RemoteException {
        System.out.println("@FrameDataServiceStub.java:updateSuccessfully");
    }

    @Override
    public FramePO find() throws RemoteException {
        blockPOs.add(blockPO);
        blockPOs.add(blockPO1);
        framePO.setBlocks(blockPOs);
        return framePO;
    }
}
