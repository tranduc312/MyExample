package leetcode.medium;


import java.util.HashMap;
import java.util.Map;

public class FirstCompletelyPaintedRowOrColumn2661 {

    public static void main(String[] args) {
        System.out.println(firstCompleteIndex(new int[]{1,4,5,2,6,3}, new int[][]{{4,3,5},{1,2,6}}));
//        System.out.println(firstCompleteIndex(new int[]{1,3,4,2}, new int[][]{{1,4},{2,3}}));
//        System.out.println(firstCompleteIndex(new int[]{2,8,7,4,1,3,5,6,9}
//                , new int[][]{{3,2,5},{1,4,6},{8,7,9}}));
    }

    static int firstCompleteIndex(int[] arr, int[][] mat) {
        int numRows = mat.length;
        int numCol = mat[0].length;
        Map<Integer, Pair<Integer, Integer>> numToPos = new HashMap<>();
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCol; col++) {
                int value = mat[row][col];
                numToPos.put(value, new Pair(row, col));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            Pair<Integer, Integer> pos = numToPos.get(num);
            int row = pos.getKey();
            int col = pos.getValue();
            mat[row][col] = -mat[row][col];

            if (checkColumn(col, mat) || checkRow(row, mat)) {
                return i;
            }
        }
        return -1;
    }

    static boolean checkColumn(int col, int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            if (mat[row][col] > 0) {
                return false;
            }
        }
        return true;
    }

    static boolean checkRow(int row, int[][] mat) {
        for (int col = 0; col < mat[0].length; col++) {
            if (mat[row][col] > 0) {
                return false;
            }
        }
        return true;
    }

    static class Pair<T, U> {
        int key;
        int value;

        public Pair(int row, int col) {
            this.key = row;
            this.value = col;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
