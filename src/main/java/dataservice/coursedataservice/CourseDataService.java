/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice.coursedataservice;

import po.coursepo.CoursePO;

/**
 *
 * @author zili chen
 */
public interface CourseDataService {
    
    public void insert(CoursePO cpo);
    
    public void update(CoursePO cpo);
    
    public void delete(CoursePO cpo);
    
    public CoursePO find();
    
}
