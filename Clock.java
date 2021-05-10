import java.util.*;
public class Clock {
    public static void main(String args[])
    {
        Calendar cal = Calendar.getInstance();
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("HOur: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + cal.get(Calendar.MINUTE));
        System.out.println(": " + cal.get(Calendar.MILLISECOND));





    }
}