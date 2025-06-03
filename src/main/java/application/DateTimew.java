package application;

import java.util.Date;

public class DateTimew {
    public static Date birthDate = new Date(124, 6,9);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    public static String getDayOfWeek(Date date) {
        String [] days = {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
        int day = date.getDay();
        if (day >= 0 && day < days.length) {
            return days[day];
        }
        return null;
    }
}
