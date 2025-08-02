package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSpecialSubstringThatOccursThriceI2981 {

    public static void main(String[] args) {
//        System.out.println(maximumLength("aaaa")); // 2
//        System.out.println(maximumLength("abcdef")); // -1
        System.out.println(maximumLength("abcaba")); // 1
    }

    static int maximumLength(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) break;
                String key = s.substring(i, j + 1);
                int count = map.getOrDefault(key, 0) + 1;
                map.put(key, count);
            }
        }
        int res = -1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 3) {
                res = Math.max(res, entry.getKey().length());
            }
        }
        return res;
    }
}
