package leetcode.ez;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindifPathExistsinGraph1971 {

    public static void main(String[] args) {
        /*Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
        Output: true*/
//        System.out.println(validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
//        System.out.println(validPath(6, new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5));
//        System.out.println(validPath(6, new int[][]{{0,4}}, 0, 4));
        System.out.println(validPath(10, new int[][]{{2,9},{7,8},{5,9},{7,2},{3,8},{2,8},{1,6},{3,0},{7,0},{8,5}}, 1, 0));
    }

    static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length == 0 && source == 0 && destination == 0) {
            return true;
        }
        else if (edges.length == 1) {
            if (edges[0][0] <= source && edges[0][1] >= destination)
                return true;
            else
                return false;
        }
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = null;
        for (int i = 0; i < edges.length - 1; i++) {
            set = new TreeSet<>();
            for (int j = 0; j < 2; j++) {
                set.add(edges[i][0]);
                set.add(edges[i][1]);
                set.add(edges[i + 1][0]);
                set.add(edges[i + 1][1]);
            }
            if (set.size() == 3) list.add(new ArrayList<>(set));
        }
        for (List<Integer> integers : list) {
            if (integers.get(0) <= source && integers.get(integers.size() - 1) >= destination)
                return true;
        }
        return false;
    }
}
