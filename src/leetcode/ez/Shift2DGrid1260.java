package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid1260 {

    public static void main(String[] args) {
        System.out.println(shiftGrid(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 1));
    }

    static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                temp.add(grid[i][j]);
            }
        }
        for (int i = k; i < rs.size(); i++) {

        }
        return rs;
    }
}
