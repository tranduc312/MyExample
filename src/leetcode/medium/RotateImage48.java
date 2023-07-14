package leetcode.medium;

import java.util.Arrays;

public class RotateImage48 {

    public static void main(String[] args) {
        /**
         * tmp
         * [n - 1 - j][i];
         * [n - 1- i][n - j - 1]
         * [j][n - 1- i]
         * [i][j]
         *
         * turn first
         * temp = [2][0] | temp = 7
         * [2][0] = [2][2] | 7 = 9
         * [2][2] = [0][2] | 9 = 3
         * [0][2] = [0][0] | 3 = 1
         * [0][0] = temp   | 1 = 7
         *
         * turn second
         *
         * temp = [1][0] | temp = 8
         * [2][1] = [1][2] | 8 = 6
         * [2][2] = [0][2] | 6 = 2
         * [0][2] = temp | 2 = 4
         * [0][2] = temp | 4 = 8
         */
        rotate(new int[][]{ {1,2,3},
                            {4,5,6},
                            {7,8,9}});
        rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }

    static void rotate(int[][] maxtrix) {
        int n = maxtrix.length;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = maxtrix[n - 1 - j][i]; //[2][0]
                maxtrix[n - 1 - j][i] = maxtrix[n - 1 - i][n - j - 1]; // [2][0]
                maxtrix[n - 1 - i][n - j - 1] = maxtrix[j][n - 1- i]; // [0][2]
                maxtrix[j][n - 1 - i] = maxtrix[i][j];
                maxtrix[i][j] = tmp;
            }
        }
        System.out.println(Arrays.deepToString(maxtrix));
    }
}
