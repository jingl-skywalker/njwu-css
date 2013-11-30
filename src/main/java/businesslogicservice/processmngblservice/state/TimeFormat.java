/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogicservice.processmngblservice.state;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public interface TimeFormat {

    public DateFormat getTimeFormat();
    public  Date getTime(String formattedString);
    public  String getFormattedTimeString(Date date);
    public Date getTime(String year,String month,String day,String hour,String min,String second);
}
