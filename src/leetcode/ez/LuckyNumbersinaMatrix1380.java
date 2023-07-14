package leetcode.ez;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNumbersinaMatrix1380 {

    public static void main(String[] args) {
        System.out.println(luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
        System.out.println(luckyNumbers(new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}}));
        System.out.println(luckyNumbers(new int[][]{{7,8},{1,2}}));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> rs = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        // find minRow
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min)
                    min = matrix[i][j];
            }
            set.add(min);
        }
        // find maxCol
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max)
                    max = matrix[j][i];
            }
            if (set.contains(max)) rs.add(max);
            set.add(max);
        }
        return rs;
    }
}
