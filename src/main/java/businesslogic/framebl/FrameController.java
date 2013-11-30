package businesslogic.framebl;

import businesslogicservice.frameblservice.FrameBLService;
import vo.framevo.FrameVO;

public class FrameController implements FrameBLService {

    EduFrame frame;

    public FrameController() {
        initFrameMsg();
    }

    @Override
    public FrameVO createFrame(int total, String description) {
        // TODO Auto-generated method stub
        if(description==null){
            return null;
        }
        int i=0;
        this.frame = new EduFrame(description, total);
        this.frame.createFrame();
        return new FrameVO(frame);
    }

    @Override
    public FrameVO createBlock(String name, int lower, int upper,
            String description) {
        // TODO Auto-generated method stub
        if(name==null||description==null){
            return null;
        }
        Block block = new Block(name, description, lower, upper);
        frame.addBlock(block);
        return new FrameVO(frame);
    }

    @Override
    public boolean release() {
        // TODO Auto-generated method stub
        frame.setPublic();
        return true;
    }

    @Override
    public FrameVO modifyBase(int total, String description) {
        // TODO Auto-generated method stub
        frame.setDescription(description);
        frame.setTotal(total);
        frame.setPublic();
        return new FrameVO(frame);
    }

    public FrameVO modifyBlock(int ID, String name, int lower, int upper,
            String description) {
        // TODO Auto-generated method stub
        BlockList blist = frame.getBlocks();
        Block b = blist.getBlock(ID);
        b.setDescription(description);
        b.setLower(lower);
        b.setUpper(upper);
        b.setName(name);
        frame.setPublic();
        return new FrameVO(frame);
    }

    public FrameVO look() {
        // TODO Auto-generated method stub
        return frame.find();
    }

    @Override
    public void initFrameMsg() {
        this.frame=new EduFrame();
        FrameVO fvo=frame.find();
        System.out.println("@framecontroller:initFrameMsg:fvo is null?"+fvo==null);
    }

    @Override
    public FrameVO look(boolean isLocal) {
        return frame.getFrameVO();
    }
}
