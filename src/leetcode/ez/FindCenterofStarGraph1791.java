package leetcode.ez;

public class FindCenterofStarGraph1791 {

    public static void main(String[] args) {
        System.out.println(findCenter(new int[][]{{1, 2}, {2, 3}, {4, 2}}));
        System.out.println(findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}}));
    }

    static int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
