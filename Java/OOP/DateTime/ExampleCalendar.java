package OOP.DateTime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
    }
}
