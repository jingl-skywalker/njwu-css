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

    /**
     * 得到某院系的所有教师
     * @param ins 所要的院系，All代表全校
     * @return 返回所有买足的PO
     * @throws RemoteException 
     */
    public ArrayList<UserInfoPO> getTea(String ins) throws RemoteException;
    
    /**
     * 得到某院系的所有教师
     * @param ins所要求的院系，All代表全校
     * @return
     * @throws RemoteException 
     */
    public ArrayList<UserInfoPO> getStu(String ins) throws RemoteException;
    
    /**
     * 返回符合院系和入学年份的所用学生po
     * @param ins
     * @param year
     * @return
     * @throws RemoteException 
     */
    public ArrayList<UserInfoPO> getStu(String ins,String year) throws RemoteException;
    
    public UserInfoPO getStudent(String id) throws RemoteException;
}
