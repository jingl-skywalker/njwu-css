package businesslogic.framebl;

//import dataservice.datafactory.DataFactory;
//import dataservice.framedataservice.FrameDataService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import dataservice.datafactory.DataFactory;
import dataservice.framedataservice.FrameDataService;
import po.framepo.BlockPO;
import po.framepo.FramePO;
import vo.framevo.FrameVO;

public class EduFrame {

    FrameDataService fds;
    DataFactory dataFactory;
    private String description;
    private BlockList bList;
    private int total;
    private boolean isPublic;

    public EduFrame() {
        System.out.println("edu frame constructor");
        bList = new BlockList();
        try {
            dataFactory = (DataFactory) Naming.lookup("dataFactory");
            System.out.println(dataFactory==null);
            fds = dataFactory.getFrameData();
        } catch (NotBoundException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public EduFrame(String description, int total) {
        this();
        this.description = description;
        this.total = total;
    }



    public BlockList getBlocks() {
        return bList;
    }

    public boolean addBlock(Block block) {
        this.bList.add(block);
        return true;
    }

    public boolean modifyBlock(int num, Block block) {
        return false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean setPublic() {
        this.isPublic = true;
        this.save();
        return true;
    }
    public boolean createFrame()
    {
        FramePO fpo=new FramePO(this);
        try {
            fds.insert(fpo);
        } catch (RemoteException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public FrameVO find() {
        FramePO fpo = null;
        try {
        //    fpo =new FramePO(fds.find());
            ///fpo=new FramePO(fds.find());
            fpo=fds.find();
        } catch (RemoteException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        FrameVO fvo = new FrameVO(fpo);
        return fvo;
    }

    private boolean save() {
        FramePO fpo = new FramePO(total, description);
        fpo.setPublic();
        int size = bList.getSum();
        for (int i = 0; i < size; i++) {
       //     fpo.addBlock(new BlockPO(bList.getBlock(i)));
        }
        try {
            fds.update(fpo);
        } catch (RemoteException ex) {
            Logger.getLogger(EduFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
