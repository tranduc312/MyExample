package leetcode.ez;

import java.util.Arrays;

public class MinimumNumberofMovestoSeatEveryone2037 {

    public static void main(String[] args) {

    }

    static int minMovesToSeat(int[] seats, int[] students) {
        int rs = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {
            rs += Math.abs(seats[i] - students[i]);
        }

        return rs;
    }
}
