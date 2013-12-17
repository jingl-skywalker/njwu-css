/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.userdata;

import data.fileutility.FileUtility;
import data.fileutility.FileutilityImpl;
import dataservice.userdataservice.UserInfoDataService;
import enumeration.ResultMessage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import po.userpo.UserInfoPO;

/**
 *
 * @author 天
 */
public class UserInfoData extends UnicastRemoteObject implements UserInfoDataService {

    public UserInfoData() throws RemoteException {
    }

    @Override
    public ResultMessage delete(ArrayList<UserInfoPO> pos) throws RemoteException {
        return update(pos);
    }

    @Override
    public ArrayList<UserInfoPO> find() throws RemoteException {
        FileUtility file = new FileutilityImpl("src//main//resources//user.txt");
        ArrayList<String[]> ins = file.getAllUser();
        ArrayList<UserInfoPO> pos = new ArrayList<UserInfoPO>(1000);
        for (String[] in : ins) {
            pos.add(new UserInfoPO(in));
        }
        return pos;
    }

    @Override
    public ResultMessage insert(ArrayList<UserInfoPO> pos) throws RemoteException {
        StringBuilder content = new StringBuilder();
        for (UserInfoPO po : pos) {
            content.append(po);
            content.append("\r\n");
        }
        FileutilityImpl.appendToFile("src\\main\\resources\\user.txt", content.toString());
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage update(ArrayList<UserInfoPO> pos) throws RemoteException {
        StringBuilder content = new StringBuilder();
        for (UserInfoPO po : pos) {
            content.append(po);
            content.append("\r\n");
        }
        FileutilityImpl.writeToFile("src\\main\\resources\\user.txt", content.toString());
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage updateAdmin(UserInfoPO p) throws RemoteException {
        String s = p.toString();
        FileutilityImpl.writeToFile("src\\main\\resources\\admin.txt", s);
        return ResultMessage.SUCCESS;
    }

    @Override
    public String readMessage() {
        FileUtility file = new FileutilityImpl("src\\main\\resources\\inform.txt");
        return file.getAll();
    }

    @Override
    public ResultMessage changeMessage(String message) {
        FileutilityImpl.writeToFile("src\\main\\resources\\inform.txt", message);
        return ResultMessage.SUCCESS;
    }

    @Override
    public ResultMessage update(UserInfoPO p) throws RemoteException {
        FileUtility file = new FileutilityImpl("src\\main\\resources\\user.txt");
        return file.changeUser(p.getID(), p.toString());
    }

    @Override
    public ArrayList<UserInfoPO> getTea(String ins) throws RemoteException {
        ArrayList<UserInfoPO> pos = find();
        ArrayList<UserInfoPO> target = new ArrayList<UserInfoPO>();
        if(!ins.equals("All")){
        for(UserInfoPO p:pos){
            if(p.getType().equals("任课老师")&&p.getDepart().equals(ins)){
                target.add(p);
            }
        }
        }
        else{
             for(UserInfoPO p:pos){
            if(p.getType().equals("任课老师")){
                target.add(p);
            }
        }
        }
        return target;
    }

    @Override
    public ArrayList<UserInfoPO> getStu(String ins) throws RemoteException {
        ArrayList<UserInfoPO> pos = find();
        ArrayList<UserInfoPO> target = new ArrayList<UserInfoPO>();
        if(!ins.equals("All")){
        for(UserInfoPO p:pos){
            if(p.getType().equals("学生")&&p.getDepart().equals(ins)){
                target.add(p);
            }
        }
        }
        else{
             for(UserInfoPO p:pos){
            if(p.getType().equals("学生")){
                target.add(p);
            }
        }
        }
        return target;
    }

    @Override
    public ArrayList<UserInfoPO> getStu(String ins, String year) throws RemoteException {
         ArrayList<UserInfoPO> pos = find();
        ArrayList<UserInfoPO> target = new ArrayList<UserInfoPO>();
        for(UserInfoPO p:pos){
            if(p.getDepart().equals(ins)&&p.getYearIn().equals(year)){
                target.add(p);
            }
        }
        return target;
    }

    @Override
    public UserInfoPO getStudent(String id) throws RemoteException {
        FileUtility file = new FileutilityImpl("src//main//resources//user.txt");
        ArrayList<String[]> ins = file.getAllUser();
        ArrayList<UserInfoPO> pos = new ArrayList<UserInfoPO>(1000);
        for (String[] in : ins) {
            UserInfoPO p=new UserInfoPO(in);
            if(p.getID().equals(id)){
                return p;
            }
        }
        return null;

    }
}
