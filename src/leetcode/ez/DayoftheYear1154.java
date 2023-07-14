package leetcode.ez;

import java.util.Arrays;
import java.util.List;

public class DayoftheYear1154 {

    private static final List<Integer> MONTH_31 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

    private static final List<Integer> MONTH_30 = Arrays.asList(4, 6, 9, 11);

    private static final List<Integer> LEAP_YEAR = Arrays.asList(1500, 1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600, 2700, 2900, 3000);

    public static void main(String[] args) {
        /*Input: date = "2019-01-09"
        Output: 9*/
//        System.out.println(dayOfYear("2019-01-09"));
        /*Input: date = "2019-02-10"
        Output: 41*/
//        System.out.println(dayOfYear("2019-02-10"));
//        "1900-05-02"
        System.out.println(dayOfYear("1900-05-02"));


        /*System.out.println(2016%4 == 0);
        System.out.println(2017%4 == 0);
        System.out.println(2018%4 == 0);
        System.out.println(2019%4 == 0);
        System.out.println(2020%4 == 0);
        System.out.println(2021%4 == 0);*/
    }

    static int dayOfYear(String date) {
        String[] s = date.split("-");
        int month2 = Integer.valueOf(s[0]) % 4 == 0 ? 29 : 28;
        if (month2 == 29 & LEAP_YEAR.contains(Integer.valueOf(s[0]))) {
            month2 = 28;
        }
        int month = Integer.valueOf(s[1]);
        int rs = Integer.valueOf(s[2]);
        for (int i = month - 1; i > 0; i--) {
            if (MONTH_31.contains(i)) {
                rs += 31;
            } else if (MONTH_30.contains(i)) {
                rs += 30;
            } else {
                rs += month2;
            }
        }
        return rs;
    }
}
