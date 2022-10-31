
package poly.edu.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateHelper {
    static SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    public static Date toDate(String date) {
        try {
            return formater.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String toString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    
    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}
