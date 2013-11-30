/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.staticdataservice;

import po.staticpo.CourseStaticPO;
import po.staticpo.StudentStaticPO;
import po.staticpo.TeacherStaticPO;

/**
 *
 * @author zili chen
 */
public interface StaticDataService {
    
    public TeacherStaticPO find(TeacherStaticPO tpo);
    
    public StudentStaticPO find(StudentStaticPO spo);
    
    public CourseStaticPO find(CourseStaticPO cpo);
}
