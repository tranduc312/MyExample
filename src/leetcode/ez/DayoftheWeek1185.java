package leetcode.ez;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class DayoftheWeek1185 {

    private static final List<String> DAY_OF_WEEK = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");

    public static void main(String[] args) {
        /*Input: day = 31, month = 8, year = 2019
        Output: "Saturday"*/

        System.out.println(dayOfTheWeek(31,8,2019));
        System.out.println(dayOfTheWeek(18,7,1999));
        System.out.println(dayOfTheWeek(15,8,1993));
    }

    static String dayOfTheWeek(int day, int month, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day, 0, 0);

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return DAY_OF_WEEK.get(dayOfWeek - 1);
    }
}
