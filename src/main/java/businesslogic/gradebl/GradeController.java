/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.gradebl;

import java.util.ArrayList;
import businesslogicservice.gradeblservice.GradeBLService;
import vo.gradevo.GradeVO;

/**
 *
 * @author sheyunfeng
 */
public class GradeController implements GradeBLService{
    Grade grade = new Grade();
    @Override
    public ArrayList<GradeVO> getCourseScore(String ID, String term) {
        return grade.getCourseScore(ID, term);
    }

    @Override
    public double getGPA(String ID, String term) {
        return grade.getGPA(ID, term);
    }

    @Override
    public int getGradeSum(String ID, String term) {
        return grade.getGradeSum(ID, term);
    }

    @Override
    public boolean recordScore(String teacherID, ArrayList<GradeVO> scores) {
        return grade.recordScore(teacherID, scores);
    }
    
}
