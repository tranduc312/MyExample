package leetcode.ez;

public class FindtheTownJudge997 {
    public static void main(String[] args) {
//        n = 3, trust = [[1,3],[2,3],[3,1]]
//        System.out.println(findJudge(2, new int[][]{{1,2}}));
//        System.out.println(findJudge(3, new int[][]{{1,3},{2,3}}));
//        System.out.println(findJudge(3, new int[][]{{1,3},{2,3},{3,1}}));
        System.out.println(findJudge(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }

    static int findJudge(int n, int[][] trust) {
        int[] trusted = new int[n + 1];

        for (int[] i : trust) {
            trusted[i[0]]--;
            trusted[i[1]]++;
        }

        for (int i = 1; i < trusted.length; i++) {
            if (trusted[i] == n - 1) return i;
        }

        return -1;
    }
}
