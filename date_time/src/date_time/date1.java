package date_time;
import java.text.DateFormat;
import java.util.*;

public class date1 {
    public static void main(String[] args) throws Exception
    {
        Date d1 = new Date();
  
        // creating a new locale for India Format
        Locale locIndia = new Locale("in", "ch");
        DateFormat de = DateFormat.getDateInstance( DateFormat.FULL, locIndia);
        System.out.println("India Format: "+ de.format(d1));
        Locale locCanada = new Locale("ca", "ch");
        DateFormat di = DateFormat.getDateInstance(DateFormat.FULL, locCanada);
        System.out.println("Canada Format: " + di.format(d1));
        Locale locRussian = new Locale("ru", "ch");
        DateFormat dr = DateFormat.getDateInstance(DateFormat.FULL, locRussian);
        System.out.println("Russian Format: "+ dr.format(d1));
        Locale locFrench = new Locale("fr", "ch");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locFrench);
        System.out.println("French Format: " + df.format(d1));
        Locale locSpanish = new Locale("es", "ch"); 
        DateFormat ds = DateFormat.getDateInstance(DateFormat.FULL, locSpanish);
        System.out.println("Spanish Format: "+ ds.format(d1));
        Locale locChinese = new Locale("cn", "ch");
        DateFormat dc = DateFormat.getDateInstance(DateFormat.FULL, locChinese);
        System.out.println("Chinese Format: "+ dc.format(d1));
    }
}
