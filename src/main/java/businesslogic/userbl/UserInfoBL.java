/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import dataservice.datafactory.UserInfoDataFactory;
import dataservice.userdataservice.UserInfoDataService;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import enumeration.ResultMessage;
import java.io.*;
import po.userpo.UserInfoPO;
import vo.uservo.UserInfoVO;

/**
 *
 * @author 天
 */
public class UserInfoBL {
    Registry registry;
    ArrayList<UserInfoVO> vos = new ArrayList<UserInfoVO>(1000);
    UserInfoDataService userInfo;
    public UserInfoBL(String ip,int port) {
        try {
            registry = LocateRegistry.getRegistry(ip, port);
            UserInfoDataFactory factory = (UserInfoDataFactory) registry.lookup("UserInfoFactory");
            userInfo = factory.getUserDataService();
        } catch (NotBoundException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AccessException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  /**
   * 
   * @param ID查找用户的id
   * @param year入学或工作年份
   * @param type类型
   * @param ins院系
   * @return 
   */
    public ArrayList<UserInfoVO> find(String ID,String year,String type,String ins){
        ArrayList<UserInfoVO> targetUser = new ArrayList<UserInfoVO>();
        for(UserInfoVO vo: vos){
            if(ID !=null){
                if(!ID.equals(vo.getID())){
                    continue;
                }
            }
            if(!year.equals("All")){
                if(!year.equals(vo.getYearIn())){
                    continue;
                }
            }
            if(!type.equals("All")){
                if(!type.equals(vo.getType()))
                    continue;
            }
            if(!ins.equals("All")){
                if(!ins.equals(vo.getDepart()))
                    continue;
            }
            targetUser.add(vo);
        }
        return targetUser;
    }
    
    /**
     * 
     * @return 返回所有的用户
     */
    public ArrayList<UserInfoVO> find(){
        ArrayList<po.userpo.UserInfoPO> pos = new ArrayList<UserInfoPO>();
        try {
            pos = userInfo.find();
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!vos.isEmpty())
            vos.clear();
        for(po.userpo.UserInfoPO  po:pos){
            vos.add(new UserInfoVO(po));
        }
        return vos;
    }
    
    public ArrayList<UserInfoVO> find(String fromID,String toID){
        ArrayList<UserInfoVO> target = new ArrayList<UserInfoVO>();
        for(UserInfoVO vo:vos){
            if((fromID.compareTo(vo.getID())<=0&&toID.compareTo(vo.getID())>=0)||
                (fromID.compareTo(vo.getID())>=0&&toID.compareTo(vo.getID())<=0)){
                target.add(vo);
            }
        }
        return target;
    }
    /**
     * 查找ID以beginID开头的用户
     * @param beginID
     * @return 
     */
    public ArrayList<UserInfoVO> find(String beginID){
        ArrayList<UserInfoVO> target = new ArrayList<UserInfoVO>();
        for(UserInfoVO vo:vos){
            if(vo.getID().startsWith(beginID)) {
                target.add(vo);
            }
        }
        return target;
    }
    
    ResultMessage changeUserInfo() {
        ArrayList<UserInfoPO> pos = voToPo();
        
        try {
            return userInfo.update(pos);
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }

    public ArrayList<UserInfoVO> poToVo(ArrayList<UserInfoPO> p){
         ArrayList<UserInfoVO> vs = new ArrayList<UserInfoVO>(1000);
        for(UserInfoPO p1:p){
            vs.add(new UserInfoVO(p1));
        }
        return vs;
    }
    public ArrayList<UserInfoPO> voToPo(){
         ArrayList<UserInfoPO> pos = new ArrayList<UserInfoPO>(1000);
        for(UserInfoVO vo:vos){
            pos.add(new UserInfoPO(vo.getArri()));
        }
        return pos;
    }
    /**
     * 添加用户
     * @param file 用户信息所在的文件
     * @return 添加是否成功
     */
    ArrayList<UserInfoVO> addUser(String file) {
        ArrayList<UserInfoPO> addPo = new ArrayList<UserInfoPO>();
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader (new FileInputStream(file)));
            String[] info = new String[9];
            String s = null;
            while((s=read.readLine())!=null){
                String[] in = s.split(":");
                info[0] = in[0];
                for(int i = 1;i<9;i++){
                    info[i] =in[i-1];
                }
                addPo.add(new UserInfoPO(info));
            }
        } catch (IOException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(userInfo.insert(addPo)==ResultMessage.SUCCESS){
                return poToVo(addPo);
            }
            return null;
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    ResultMessage deleteUser(ArrayList<UserInfoVO> deleteVos) {
        vos.removeAll(deleteVos);
        ArrayList<UserInfoPO> pos=voToPo();
        try {
            return userInfo.delete(pos);
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }

    ResultMessage changeAdminInfo(UserInfoVO v) {
        try {
            return userInfo.updateAdmin(new UserInfoPO(v.getArri()));
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }

    String readMessage() {
        try {
            return userInfo.readMessage();
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    ResultMessage changeMessage(String message) {
        try {
            return userInfo.changeMessage(message);
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }
  /**
     * 
     * @param v
     * @return 
     */

    ResultMessage changeUserInfo(UserInfoVO v)  {
        try {
            return userInfo.update(new UserInfoPO(v.getArri()));
        } catch (RemoteException ex) {
            Logger.getLogger(UserInfoBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ResultMessage.FAIL;
    }
   
}
