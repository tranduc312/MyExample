package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringinanArray2053 {

    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
        System.out.println(kthDistinct(new String[]{"aaa","aa","a"},1));
        System.out.println(kthDistinct(new String[]{"a","b","a"},3));
    }

    static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (String s : arr) {
            if (map.get(s) == 1 && ++count == k) {
                return s;
            }
        }
        return "";
    }
}
