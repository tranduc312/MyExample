package leetcode.ez;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

public class NumberOfRectanglesThatCanFormTheLargestSquare1725 {

    public static void main(String[] args) {
        /*Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
        Output: 3*/
        InputStream inputStream = null;
        System.out.println(countGoodRectangles(new int[][]{{5,8},{3,9},{5,12},{16,5}}));
        System.out.println(countGoodRectangles(new int[][]{{5,8},{3,9},{5,12},{16,5}}));
        System.out.println(countGoodRectangles(new int[][]{{5,8},{3,9},{3,12}}));
        try (
                BufferedReader bufferedReader = new BufferedReader(
                        new FileReader("zoo-data.txt"))) {
            System.out.println(bufferedReader.readLine());
        } catch (Exception e) {

        }
    }

    static int countGoodRectangles(int[][] rectangles) {
        int rs = 0;
        int max = 0;
        for (int[] s : rectangles) {
            int value = Math.min(s[0], s[1]);
            if (value > max) {
                rs = 1;
                max = value;
            } else if (value == max) {
                ++rs;
            }
        }
        return rs;
    }
}
