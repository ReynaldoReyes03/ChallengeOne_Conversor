package com.rmr.converter.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Reynaldo Martínez Reyes
 */
public class DateFormatter {
    
    public static String millisecondsTimeStampToHumanDate(Long milliseconds) {
        Date date = new Date(milliseconds);
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy HH:mm");
        
        String humanDate = simpleDateFormat.format(date);
        
        String[] dateSplit = humanDate.split(" ");
        
        for (int i = 0; i < dateSplit.length; i++) {
            String string = dateSplit[i];
            
            dateSplit[i] = string.toUpperCase().charAt(0) + string.toLowerCase().substring(1, string.length());
        }
        
        String formatedHumanDate = String.join(" ", dateSplit) + " GMT" + new SimpleDateFormat("X").format(date);
        
        return formatedHumanDate;
    }
    
    public static String millisecondsTimeStampToHumanDate(String milliseconds) {
        return millisecondsTimeStampToHumanDate(Long.parseLong(milliseconds) * 1000L);
    }
    
    public static String secondsTimeStampToHumanDate(Long seconds) {
        return millisecondsTimeStampToHumanDate(seconds * 1000L);
    }
    
    public static String secondsTimeStampToHumanDate(String seconds) {
        return millisecondsTimeStampToHumanDate(seconds + "000");
    }
            
}
