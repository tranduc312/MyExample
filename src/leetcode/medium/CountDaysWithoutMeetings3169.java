package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class CountDaysWithoutMeetings3169 {

    public static void main(String[] args) {
        System.out.println(countDays(10, new int[][]{{5,7},{1,3},{9,10}}));
        System.out.println(countDays(5, new int[][]{{2,4},{1,3}}));
        System.out.println(countDays(6, new int[][]{{1,6}}));
    }

    static int countDays(int days, int[][] meetings) {
        int freeDays = 0;
        int latestEnd = 0;
        Arrays.sort(meetings, Comparator.comparing(a -> a[0]));

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            if (start > latestEnd + 1) {
                freeDays += start - latestEnd - 1;
            }

            latestEnd = Math.max(latestEnd, end);
        }
        freeDays += days - latestEnd;
        return freeDays;
    }
}
