package leetcode.ez;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence2085 {

    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"leetcode", "is", "amazing", "as", "is"}, new String[]{"amazing", "leetcode", "is"}));
        System.out.println(countWords(new String[]{"b","bb","bbb"}, new String[]{"a","aa","aaa"}));
        System.out.println(countWords(new String[]{"a","ab"}, new String[]{"a","a","a","ab"}));
    }


    static int countWords(String[] words1, String[] words2) {
        int rs = 0;
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (String s : words2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        for (String s : words1) {
            if (map1.get(s) == 1 && map2.getOrDefault(s, 0) == 1)
                rs++;
        }
        return rs;
    }
}
