/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.userbl;

import java.util.ArrayList;
import businesslogicservice.userblservice.UserBLService;
import enumeration.ResultMessage;
import vo.uservo.UserInfoVO;

/**
 *
 * @author 天
 */
public class UserInfoController implements UserBLService{
    String ip = null;
    int port ;
    UserInfoBL userInfo;
    
    public UserInfoController(String ip,int port) {
        this.ip = ip;
        this.port = port;
        userInfo = new UserInfoBL(ip,port);
    }

    public UserInfoController() {
         userInfo = new UserInfoBL("locakhost",1099);
    }

    @Override
    public ArrayList<UserInfoVO> addUser(String file) {
        return userInfo.addUser(file);
    }

    @Override
    public ResultMessage changeUserInfo() {
      return  userInfo.changeUserInfo();
    }

    @Override
    public ResultMessage deletUser(ArrayList<UserInfoVO> deleteVos) {
        return userInfo.deleteUser(deleteVos);
    }

    @Override
    public ResultMessage delete(UserInfoVO delete) {
        ArrayList<UserInfoVO> vs = new ArrayList<UserInfoVO>(1);
        vs.add(delete);
        return userInfo.deleteUser(vs);
    }

   

    @Override
    public ArrayList<UserInfoVO> getUser() {
        return userInfo.find();
    }

    @Override
    public ArrayList<UserInfoVO> getUser(String ID, String year, String type, String institute) {
        return userInfo.find(ID, year, type, institute);
    }

    @Override
    public ArrayList<UserInfoVO> getUser(String fromID, String toID) {
        return userInfo.find(fromID,toID);
    }
    @Override
    public ArrayList<UserInfoVO> getUser(String beginID){
        return userInfo.find(beginID);
    }

    @Override
    public ResultMessage changeAdminInfo(UserInfoVO v) {
        return userInfo.changeAdminInfo(v);
    }

    @Override
    public String readeMessage() {
        return userInfo.readMessage();
    }

    @Override
    public ResultMessage changeMessage(String message) {
        return userInfo.changeMessage(message);
    }
       @Override
    public ResultMessage changeUserInfo(UserInfoVO v) {
        return userInfo.changeUserInfo(v);
    }

    @Override
    public ArrayList<String> getStu(String ins, String year) {
        return userInfo.getStu(ins,year);
    }


}
