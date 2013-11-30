/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.frameblservice;

import vo.framevo.FrameVO;


/**
 *
 * @author Administrator
 */
public interface FrameBLService {
	
    public FrameVO createFrame(int total, String description);

    public FrameVO createBlock(String name, int lower, int upper, String description);

    public boolean release();

    public FrameVO modifyBase(int total, String description);

    public FrameVO modifyBlock(int ID, String name, int lower, int upper, String description);

    public FrameVO look();
	
}
