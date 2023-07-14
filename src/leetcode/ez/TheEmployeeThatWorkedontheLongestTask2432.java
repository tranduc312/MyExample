package leetcode.ez;

public class TheEmployeeThatWorkedontheLongestTask2432 {

    public static void main(String[] args) {
//        System.out.println(hardestWorker(10, new int[][]{{0,3},{2,5},{0,9},{1,15}}));
//        System.out.println(hardestWorker(26, new int[][]{{1,1},{3,7},{2,12},{7,17}}));
//        System.out.println(hardestWorker(2, new int[][]{{0,10},{1,20}}));
        System.out.println(hardestWorker(70, new int[][]{{36,3},{1,5},{12,8},{25,9},{53,11},{29,12},{52,14}}));
    }

    static int hardestWorker(int n, int[][] logs) {
        int id = 0;
        int max = 0;
        for (int i = 0; i < logs.length; i++) {
            int pre = i != 0 ? logs[i - 1][1] : 0;
            if (logs[i][1] - pre > max) {
                max = logs[i][1] - pre;
                id = logs[i][0];
            } else if (logs[i][1] - pre == max && logs[i][0] < id) {
                id = logs[i][0];
            }
        }
        return id;
    }
}
