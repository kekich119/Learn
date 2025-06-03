package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FixDates {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();
        dates.add(new Date(2020, 12, 1)); // Дата неправильно задана
        dates.add(new Date(2019, 11, 15)); // И здесь тоже
        dates.add(new Date(2022, 1, 30));

        fixDates(dates);

        for (Date date : dates) {
            System.out.println(date);
        }
    }

    public static void fixDates(List<Date> dates) {
        for (Date date : dates) {
            int realYear = date.getYear() - 1900;
            int realMonth = date.getMonth() - 1;

            date.setYear(realYear);
            date.setMonth(realMonth);
        }
    }
}
