package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {

    public static void main(String[] args) {
        /*Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/

        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
//        System.out.println(groupAnagrams(new String[]{""}));
//        System.out.println(groupAnagrams(new String[]{"a"}));
//        System.out.println(groupAnagrams(new String[]{"",""}));
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rs = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        for (int i = 0; i < n; i++) {
            String key = strs[i].chars()
                    .sorted()
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            List<String> values = new ArrayList<>();
            if (map.get(key) == null) {
                values.add(strs[i]);
            } else {
                values = map.get(key);
                values.add(strs[i]);
            }
            map.put(key, map.getOrDefault(key, values));
        }
        map.entrySet().forEach(m -> rs.add(m.getValue()));
        return rs;
    }
}
