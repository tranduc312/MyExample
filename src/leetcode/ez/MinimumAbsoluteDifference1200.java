package leetcode.ez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference1200 {

    public static void main(String[] args) {
        /*Input: arr = [4,2,1,3]
        Output: [[1,2],[2,3],[3,4]]*/
        System.out.println(minimumAbsDifference(new int[]{4,2,1,3}));
        System.out.println(minimumAbsDifference(new int[]{1,3,6,10,15}));
        System.out.println(minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> rs = new ArrayList<>();
        // sort array
        Arrays.sort(arr);
        // for loop find all minimum absolute
        int min = Integer.MAX_VALUE;
        for (int i = arr.length - 1; i > 0; i--) {
            if (min > arr[i] - arr[i - 1]) {
                min = arr[i] - arr[i - 1];
            }
        }
        // loop again
        for (int i = arr.length - 1; i > 0; i--) {
            if (min == arr[i] - arr[i - 1]) {
                rs.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        rs.sort((x, y) -> {
            for (int i = 0; i < Math.min(x.size(), y.size()); i++) {
                if (x.get(i) != y.get(i)) {
                    return x.get(i) - y.get(i);
                }
            }
            return x.size() - y.size();
        });
        return rs;
    }
}
