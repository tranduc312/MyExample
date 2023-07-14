package leetcode.medium;

public class ReorderRoutestoMakeAllPathsLeadtotheCityZero1466 {

    public static void main(String[] args) {

    }

    static int minReorder(int n, int[][] connections) {
        /**
         0-1 + 1
         1-3 + 1
         2-3
         4-0
         4-5
         ->>>> 1
         case has 0:
         if (0 side left) list.add(right) rs++;
         else continue;
         case no 0:
         list contain left list.add(right) rs++;
         */
        int rs = 0;

        return rs;
    }

}
