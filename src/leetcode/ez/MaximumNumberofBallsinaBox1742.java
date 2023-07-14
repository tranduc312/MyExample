package leetcode.ez;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberofBallsinaBox1742 {

    public static void main(String[] args) {
        System.out.println(countBalls(1,10));
        System.out.println(countBalls(5,15));
        System.out.println(countBalls(19,28));
    }

    static int countBalls(int lowLimit, int highLimit) {
        int rs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            if (i < 10) {
                map.put(i, map.getOrDefault(i,0) + 1);
            } else {
                int value = 0;
                int temp = i;
                while (temp != 0) {
                    value += temp%10;
                    temp /= 10;
                }
                map.put(value, map.getOrDefault(value,0) + 1);
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
    }
}
