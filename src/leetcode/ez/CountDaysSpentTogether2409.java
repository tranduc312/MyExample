package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class CountDaysSpentTogether2409 {

    private static Map<Integer, Integer> month = new HashMap<>();
    static {
        month.put(1,31);
        month.put(2,28);
        month.put(3,31);
        month.put(4,30);
        month.put(5,31);
        month.put(6,30);
        month.put(7,31);
        month.put(8,31);
        month.put(9,30);
        month.put(10,31);
        month.put(11,30);
        month.put(12,31);
    }

    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
        System.out.println(countDaysTogether("10-01", "10-31", "11-01", "12-31"));
        System.out.println(countDaysTogether("10-20", "12-22", "06-21", "07-05"));
        System.out.println(countDaysTogether("09-01", "10-19", "06-19", "10-20"));
        System.out.println(countDaysTogether("08-06", "12-08", "02-04", "09-01"));
    }

    static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int rs = 0;
        int[] day = new int[4];
        // caclu day of Alice
        day[0] = calculateDay(arriveAlice);
        day[1] = calculateDay(leaveAlice);
        day[2] = calculateDay(arriveBob);
        day[3] = calculateDay(leaveBob);
        if (day[1] < day[2])
            return 0;
        else if (day[0] < day[2] && day[2] < day[1] && day[1] < day[3])
            return day[1] - day[2];
        else if (day[2] < day[0] && day[0] < day[1] && day[1] < day[3])
            return day[1] - day[0];
        else if (day[2] < day[0] && day[0] < day[3] && day[3] < day[1])
            return day[3] - day[0];
        else if (day[2] < day[3] && day[3] < day[0] && day[0] < day[1])
            return 0;
        else if (day[0] < day[2] && day[2] < day[3] && day[3] < day[1])
            return day[3] - day[2];
        return rs;
    }

    private static int calculateDay(String s) {
        int i = Integer.parseInt(s.substring(0, 2));
        int day = Integer.parseInt(s.substring(3));
        for (;i > 0; i--) {
            day += month.get(i);
        }
        return day;
    }
}
