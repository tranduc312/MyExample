package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram1078 {

    public static void main(String[] args) {
//        Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
//        Output: ["girl","student"]
        System.out.println(findOcurrences("a good girl she is a good student", "a", "good"));
    }

    static String[] findOcurrences(String text, String first, String second) {
        List<String> rs = new ArrayList<>();
        String[] word = text.split(" ");
        for (int i = 0; i < word.length - 2; i++) {
            if (word[i].equals(first) && word[i + 1].equals(second)) {
                rs.add(word[i + 2]);
            }
        }

        return rs.toArray(String[]::new);
    }
}
