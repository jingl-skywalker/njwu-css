/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.plandata;
import dataservice.plandataservice.PlanDataService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.planpo.PlanPO;

/**
 *
 * @author zili chen
 */
public class PlanData extends UnicastRemoteObject implements PlanDataService{

    PlanIOHelper io;
    static ArrayList<PlanPO> pList;
    
    public PlanData() throws RemoteException{
        io = new PlanIOHelper();
        pList = new ArrayList<PlanPO>();
        readData();
    }
    
    public void readData() {
    	pList.clear();
    	ArrayList<String> list = io.readOut();
    	String str[] = null;
    	for(String s:list) {
    		str = s.split(";");
    		pList.add(new PlanPO(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],str[8],str[9]));
    	}
    }
    
    public void writeData() {
    	ArrayList<String> list = new ArrayList<String>();
    	for(PlanPO p:pList) {
    		list.add(p.toStoreString());
    	}
    	io.writeIn(list);
    }
    
    @Override/*添加教学计划*/
    public void insert(PlanPO ppo) throws RemoteException {
        for(int i = 0;i<pList.size();i++) {
        	 if(pList.get(i).equal(ppo)) {//确保不存在同课程号且同院系的计划
        		 System.out.println("该课程号已存在");
        	 }
        	 else {
        		 pList.add(ppo);
        	 }
        }
        writeData();
    }

    @Override/*修改教学计划*/
    public void update(PlanPO ppo) throws RemoteException {
        for(int i = 0;i<pList.size();i++) {
        	if(pList.get(i).equal(ppo)) {
        		pList.remove(i);
        	}
        }
        pList.add(ppo);
        writeData();
    }

    @Override/*删除教学计划*/
    public void delete(String courseID,String institute) throws RemoteException {
        for(int i=0;i<pList.size();i++) {
            if(pList.get(i).getCourseID().equals(courseID)&&pList.get(i).getLearnIns().equals(institute)) {
                pList.remove(i);
            }
        }
        writeData();
    }
    
    @Override/*根据某属性查找对应的教学计划记录*/
    public ArrayList<PlanPO> finds(String field,String value) throws RemoteException {
    	readData();
        ArrayList<PlanPO> ppolist = new ArrayList<PlanPO>();
        if(field.equals("institute")) {//根据院系属性查找记录
        	for(PlanPO p:pList) {
        		if(p.getLearnIns().equals(value)) {
        			ppolist.add(p);
        		}
        	}
        }
        else if(field.equals("module")) {//根据模块属性查找记录
        	for(PlanPO p:pList) {
        		if(p.getModule().equals(value)) {
        			ppolist.add(p);
        		}
        	}
        }
        else if(field.equals("All")) {//返回全部记录
        	ppolist = pList;
        }
        return ppolist;
    }

}
