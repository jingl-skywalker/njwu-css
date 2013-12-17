/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogicservice.gradeblservice;

import businesslogic.gradebl.GradeController;
import businesslogicservice.gradeblservice.GradeBLService;

/**
 *
 * @author sheyunfeng
 */
public class GradeFactory {
    
    public GradeBLService getGradeController(){
        GradeBLService grade = new GradeController();
        return grade;
    }
}
