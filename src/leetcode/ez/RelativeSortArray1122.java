package leetcode.ez;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RelativeSortArray1122 {

    public static void main(String[] args) {
        /*Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
        Output: [2,2,2,1,4,3,3,9,6,7,19]*/
        System.out.println(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
    }

    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> rs = new ArrayList<>();
        List<Integer> list2 = IntStream.of(arr2).boxed().collect(Collectors.toList());
        List<Integer> temp = new ArrayList<>();
        for (int i : arr1) {
            if (!list2.contains(i)) {
                temp.add(i);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : arr2) {
            int count = map.get(i);
            for (int j = 0; j < count; j++)
                rs.add(i);
        }
        Collections.sort(temp);
        rs.addAll(temp);
        return rs.stream().mapToInt(Integer::intValue).toArray();
    }
}
