package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class FindWordsThatCanBeFormedbyCharacters1160 {

    public static void main(String[] args) {
        /*Input: words = ["cat","bt","hat","tree"], chars = "atach"
        Output: 6*/
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
        /*Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
        Output: 10*/
        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

    static int countCharacters(String[] words, String chars) {
        List<String> list = new ArrayList<>();
        int rs = 0;
        for (String w : words) {
            boolean correct = true;
            for (char c : w.toCharArray()) {
                if (chars.indexOf(c) == -1) {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                list.add(w);
            }
        }
        rs = list.stream().mapToInt(i -> i.length()).sum();
        return rs;
    }
}
