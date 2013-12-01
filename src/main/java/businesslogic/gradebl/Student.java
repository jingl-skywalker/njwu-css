/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.gradebl;

import vo.gradevo.GradeVO;
import po.gradepo.Grade_StudentPO;
import po.gradepo.GradePO;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sheyunfeng
 */
public class Student {
    private String id;
    private ArrayList<GradeVO> scorelist = null;
    
    public Student(Grade_StudentPO studentpo){
        this.id = studentpo.getID();
        ArrayList<GradePO> list = studentpo.getScoreList();
        Iterator<GradePO> iterator = list.iterator();
        while(iterator.hasNext()){
            GradePO gradepo = iterator.next();
            String courseNum = gradepo.getCourseID();
            String stuID = gradepo.getStuID();
            String term = gradepo.getTerm();
            double score = gradepo.getGrade();
            
            GradeVO gradevo = new GradeVO(courseNum, stuID, term, score);
            
            gradevo.setCourseName("courseName");    //coursepo
            gradevo.setCredit(0);                   //coursepo
            gradevo.setTeacherID("teacherID");      //coursepo
            gradevo.setTeacherName("teacherNmae");  //coursepo
            gradevo.setcourseProperity("coursePropertity"); //coursepo
        }
        
    }
    
    public String getStuID(){
        return id;
    }
    
    public ArrayList<GradeVO> getCourseScore(String term){
        ArrayList<GradeVO> score = new ArrayList<GradeVO>();
        Iterator<GradeVO> iterator = score.iterator();
        while(iterator.hasNext()){
            GradeVO gradevo = iterator.next();
            if(gradevo.getTerm().equals(term)){
                score.add(gradevo);
            }
        }
        return score;
    }
    
    public double getGPA(String term){
        ArrayList<GradeVO> score = getCourseScore(term);
        
        if(score.isEmpty()){
            return -1;
        }
        
        Iterator<GradeVO> iterator = score.iterator();
        double totalCredit = 0;
        double totalScore = 0;
        while(iterator.hasNext()){
            GradeVO gradevo = iterator.next();
            if(gradevo.getCourseProperity().equals("compulsory")){
                totalCredit += gradevo.getCredit();
                totalScore += gradevo.getCredit() * gradevo.getGrade();
            }
        }
        
        return totalScore / (totalCredit * 20);
    } 
    
    public int getGradeSum(String term){
        ArrayList<GradeVO> score = getCourseScore(term);
        
        if(score.isEmpty()){
            return -1;
        }
        
        Iterator<GradeVO> iterator = score.iterator();
        int totalCredit = 0;
        while(iterator.hasNext()){
            GradeVO gradevo = iterator.next();
            if(gradevo.getGrade() >= 60){
                totalCredit += gradevo.getGrade();
            }
        }
        
        return totalCredit;
    }
    
}
