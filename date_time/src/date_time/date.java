package date_time;
import java.util.Date;
import java.text.SimpleDateFormat;

public class date 
 {
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("Current Time is : " + date);
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        // hh = hours in 12hr format
        // mm = minutes
        // aa = am/pm
 
        String time = formatTime.format( date); // changing the format of 'date'
 
        // display time as per format
        System.out.println("Current Time in AM/PM Format is : " + time);
    }
}