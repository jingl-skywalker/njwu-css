/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package businesslogic.gradebl;

import businesslogicservice.gradeblservice.GradeBLService;
import java.util.ArrayList;
import vo.gradevo.GradeVO;

/**
 *
 * @author sheyunfeng
 */
public class GradeBLServiceStub implements GradeBLService{
    ArrayList<GradeVO> gradelist;
    GradeVO grade1 = new GradeVO("CS601", "1212", "2103-2", 90);
    GradeVO grade2 = new GradeVO("CS602", "1212", "2103-2", 90);
    GradeVO grade3 = new GradeVO("CS603", "1212", "2103-2", 90);
    GradeVO grade4 = new GradeVO("CS604", "1212", "2103-2", 90);
    GradeVO grade5 = new GradeVO("CS605", "1212", "2103-2", 90);
    
    public GradeBLServiceStub(){
        gradelist = new ArrayList<GradeVO>();
        gradelist.add(grade1);
        gradelist.add(grade2);
        gradelist.add(grade3);
        gradelist.add(grade4);
        gradelist.add(grade5);
    }
    @Override
    public ArrayList<GradeVO> getCourseScore(String ID, String range) {
        return gradelist;
    }

    @Override
    public double getGPA(String ID, String range) {
        return 4.0;
    }

    @Override
    public int getGradeSum(String ID, String range) {
        return 20;
    }

    @Override
    public boolean recordScore(String courseNum, ArrayList<GradeVO> scores) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
