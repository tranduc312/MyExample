package leetcode.ez;

public class NumberofValidClockTimes2437 {

    public static void main(String[] args) {
        System.out.println(countTime("?5:00"));
        System.out.println(countTime("0?:0?"));
        System.out.println(countTime("??:??"));
    }

    static int countTime(String time) {
        char hoursFirst = time.charAt(0);
        char hoursSecond = time.charAt(1);
        char minutesFirst = time.charAt(3);
        char minutesSecond = time.charAt(4);
        int minutesChoices = (minutesFirst == '?' ? 6 : 1) * (minutesSecond == '?' ? 10 : 1);
        int hoursChoices = 1;

        if (hoursFirst == '?')
            hoursChoices = hoursSecond == '?' ? 24 : (hoursSecond - '0' >= 4) ? 2 : 3;
        else if (hoursSecond == '?')
            hoursChoices = (hoursFirst - '0' == 2) ? 4 : 10;

        return hoursChoices * minutesChoices;
    }
}
