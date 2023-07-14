package leetcode.ez;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberofDaysBetweenTwoDates1360 {

    public static void main(String[] args) throws ParseException {
        /*Input: date1 = "2019-06-29", date2 = "2019-06-30"
        Output: 1*/
        System.out.println(daysBetweenDates("2019-06-29", "2019-06-30"));
        System.out.println(daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    static int daysBetweenDates(String date1, String date2) throws ParseException {
        return (int) Math.abs(ChronoUnit.DAYS.between(LocalDate.parse(date1), LocalDate.parse(date2)));
    }
}
