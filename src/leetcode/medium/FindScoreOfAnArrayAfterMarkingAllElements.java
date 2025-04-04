package leetcode.medium;

import java.util.*;

public class FindScoreOfAnArrayAfterMarkingAllElements {

    public static void main(String[] args) {
//        System.out.println(findScore4(new int[]{2,1,3,4,5,2}));
        System.out.println(findScore4(new int[]{2,3,5,1,3,2}));
    }

    static long findScore4(int[] nums) {
        long res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int start = i;
            while (i + 1 < nums.length && nums[i + 1] < nums[i]) {
                i++;
            }
            for (int j = i; j >= start; j -= 2) {
                res += nums[j];
            }
        }
        return res;
    }

    static long findScore3(int[] nums) {
        int score = 0;
        int n = nums.length;
        int[][] sort = new int[n][2];
        boolean[] marked = new boolean[n];
        for (int i = 0; i < n; i++) {
            sort[i][0] = nums[i];
            sort[i][1] = i;
        }
        Arrays.sort(sort, (array1, array2) -> array1[0] - array2[0]);
        for (int i = 0; i < n; i++) {
            int value = sort[i][0];
            int index = sort[i][1];

            if (marked[index]) continue;

            score += value;
            marked[index] = true;
            if (index + 1 < n) marked[index + 1] = true;
            if (index - 1 >= 0) marked[index - 1] = true;
        }

        return score;
    }

    static long findScore2(int[] nums) {
        Queue<Pair> queue = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ? a.getIndex() - b.getIndex() : a.getValue() - b.getValue());
        for (int i = 0; i < nums.length; i++) {
            queue.add(new Pair(nums[i], i));
        }
        boolean[] visited = new boolean[nums.length];
        int score = 0;
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int value = pair.value;
            int index = pair.index;
            if (visited[index]) continue;

            visited[index] = true;
            score += value;
            if (index + 1 < nums.length)
                visited[index + 1] = true;
            if (index - 1 >= 0)
                visited[index - 1] = true;
        }

        return score;
    }

    public static class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    static long findScore(int[] nums) {
        int n = nums.length;
        int[][] marked = new int[2][n];
        int score = 0;
        int currentMinIndex = - 1;
        for (int i = 0; i < n; i++) {
            marked[0][i] = nums[i];
        }
        while (!isAllEqual(marked[1])) {
            int currentMinValue = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (currentMinValue > nums[j] && marked[1][j] != 1) {
                    currentMinValue = nums[j];
                    currentMinIndex = j;
                }
            }
            marked[1][currentMinIndex] = 1;
            if (currentMinIndex-1 >= 0)
                marked[1][currentMinIndex-1] = 1;
            if (currentMinIndex+1 < n)
                marked[1][currentMinIndex+1] = 1;
            score += currentMinValue;
        }
        return score;
    }

    static boolean isAllEqual(int[] a){
        for (int j : a) {
            if (j != 1) return false;
        }

        return true;
    }
}
