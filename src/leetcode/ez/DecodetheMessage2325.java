package leetcode.ez;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecodetheMessage2325 {

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    static String decodeMessage(String key, String message) {
        StringBuilder rs = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (char c : key.toCharArray()) {
            if (!list.contains(c) && c != ' ')
                list.add(c);
        }
        Map<Character, Character> map = new HashMap<>();
        char c1 = 'a';
        for (char c : list) {
            map.put(c, c1++);
        }
        for (char c : message.toCharArray()) {
            if (c == ' ') rs.append(' ');
            else rs.append(map.get(c));
        }
        return rs.toString();
    }
}
