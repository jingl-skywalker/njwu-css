package data.framedata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.framepo.FramePO;

import dataservice.framedataservice.FrameDataService;
import java.util.ArrayList;
import po.framepo.BlockPO;

public class FrameData extends UnicastRemoteObject implements FrameDataService {
    
    FileUtility utility = new FileutilityImpl("src/main/resources/frame.txt");

    public FrameData() throws RemoteException {
        System.out.println("frame data constructor");
    }

    @Override
    public void insert(FramePO fpo) throws RemoteException {
        // TODO Auto-generated method stub
        utility.clear();
        utility.append(fpo.toStoreString());
    }

    @Override
    public void update(FramePO fpo) throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println(" frame data update");
        utility.clear();
        utility.append(fpo.toStoreString());
    }

    @Override
    public FramePO find() throws RemoteException {
        // TODO Auto-generated method stub
               ArrayList<String> infos = utility.find();
        if (infos.get(0).equals("N")) {
            return null;
        }
        String[] frameInfos = infos.get(1).split(":");
        ArrayList<BlockPO> pos = new ArrayList<BlockPO>();
        for (int i = 2; i < infos.size(); i++) {
            String[] binfos = infos.get(i).split(":");
            pos.add(new BlockPO(binfos[0], binfos[1], Integer.parseInt(binfos[2]), Integer.parseInt(binfos[3])));
        }
        FramePO fpo;
        fpo = new FramePO(Integer.parseInt(frameInfos[1]), frameInfos[0], pos);
        return fpo;
    
    }
}
