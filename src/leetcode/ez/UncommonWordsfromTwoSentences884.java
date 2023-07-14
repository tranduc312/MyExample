package leetcode.ez;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class UncommonWordsfromTwoSentences884 {

    public static void main(String[] args) {
//        s1 = "this apple is sweet", s2 = "this apple is sour"
        System.out.println(uncommonFromSentences("this apple is sweet", "this apple is sour"));
    }

    static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] array = Stream.of(s1.split(" "), s2.split(" ")).flatMap(Stream::of).toArray(String[]::new);

        for (String a : array) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        return map.entrySet().stream().filter(m -> (m.getValue() == 1)).map(Map.Entry::getKey).toArray(String[]::new);
    }
}
