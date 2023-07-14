package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25InSortedArray1287 {

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1,2,2,6,6,6,6,7,10}));
        System.out.println(findSpecialInteger(new int[]{1,1}));
    }

    static int findSpecialInteger(int[] arr) {
        int rs = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        rs = map.entrySet().stream().filter(m -> m.getValue() > arr.length/4).map(Map.Entry::getKey).findFirst().get();
        return rs;
    }
}
