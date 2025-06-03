package application;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarZZ {
    public static void main(String[] args) {
        Calendar date = new GregorianCalendar();
        Date date1 = date.getTime();
        int month = date.get(Calendar.MONTH);
        System.out.println(date1 + "\n" + month);


    }


}
