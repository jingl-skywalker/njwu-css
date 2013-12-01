/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.userdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import enumeration.ResultMessage;
import po.userpo.UserInfoPO;

/**
 *
 * @author Administrator
 */
public interface UserInfoDataService extends Remote {

    public ResultMessage insert(ArrayList<UserInfoPO> pos) throws RemoteException;

    public ResultMessage update(ArrayList<UserInfoPO> pos) throws RemoteException;
    
    /**
     * 更新某一用户信息
     * @param p 要更新的用户信息
     * @return 更新成功则返回ResultMessage.SUccess 失败则返回ResultMessage。fail
     * @throws RemoteException 
     */
    public ResultMessage update(UserInfoPO p) throws RemoteException;
    /**
     * 跟新管理员信息
     * @param p跟新好的管理员po
     * @return
     * @throws RemoteException 
     */
    public ResultMessage updateAdmin(UserInfoPO p) throws RemoteException;

    /**
     * 删除用户
     * @param po删除之后的用户
     * @return
     * @throws RemoteException 
     */
    public ResultMessage delete(ArrayList<UserInfoPO> po) throws RemoteException;

    public ArrayList<UserInfoPO> find() throws RemoteException;
    //question here
    /**
     * 读取公告
     * @return 返回公告内容
     */
    public String readMessage() throws RemoteException;
    
    /**
     * 修改公告
     * @return 
     */
    public ResultMessage changeMessage(String message) throws RemoteException;
}
