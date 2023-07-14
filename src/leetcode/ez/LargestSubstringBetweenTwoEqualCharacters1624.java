package leetcode.ez;

import java.util.*;

public class LargestSubstringBetweenTwoEqualCharacters1624 {

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
        System.out.println(maxLengthBetweenEqualCharacters("ojdncpvyneq"));
        System.out.println(maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
    }

    static int maxLengthBetweenEqualCharacters(String s) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            List<Integer> list = new ArrayList<>();
            if (map.containsKey(temp)) {
                list = map.get(temp);
                list.add(i);
            } else {
                map.put(temp, new ArrayList<>(Arrays.asList(i)));
            }
        }
        int rs = 0;
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                int value = entry.getValue().get(entry.getValue().size() - 1) - entry.getValue().get(0);
                rs = rs < value ? value : rs;
            }
        }
        return rs - 1;
    }
}
