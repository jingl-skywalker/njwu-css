/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.userblservice;
import java.util.ArrayList;

import enumeration.ResultMessage;
import vo.uservo.UserInfoVO;

/**
 *
 * @author Administrator
 */
public interface UserBLService {
    /**
     * 添加用户
     * @param file用户信息所在的文件
     * @return 所添加的用户
     */
    public ArrayList<UserInfoVO> addUser(String file);
    public ResultMessage changeUserInfo();
    /**
     * 删除用户
     * @param vos要删除的用户
     * @return 
     */
    public ResultMessage deletUser(ArrayList<UserInfoVO> vos);
  
    
    /**
     *
     * @return 返回所有的用户
     */
    public ArrayList<UserInfoVO> getUser();
    
    /**
     *通过3个属性查找用户
     * @param year 入学年份
     * @param type 用户类型
     * @param institute 院系
     * @return 符合条件的用户 
     */
    public ArrayList<UserInfoVO> getUser(String ID,String year,String type,String institute);
    
    /**
     * 
     * @param fromID
     * @param toID
     * @return fromID到toId 的用户
     */
    public ArrayList<UserInfoVO> getUser(String fromID,String toID);
    
    /**
     * 查找ID以beginID开头的所有用户
     * @param beginID
     * @return 
     */
    public ArrayList<UserInfoVO> getUser(String beginID);

    /**
     * 删除该用户
     * @param delete 
     */
    public ResultMessage delete(UserInfoVO delete);

    public String readeMessage();
    public ResultMessage changeMessage(String message);
    public ResultMessage changeAdminInfo(UserInfoVO v);

    
    
}
