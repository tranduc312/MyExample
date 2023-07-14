package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters1002 {

    public static void main(String[] args) {
//        Input: words = ["bella","label","roller"]
//        Output: ["e","l","l"]
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
//        System.out.println(commonChars(new String[]{"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"}));
    }

    static List<String> commonChars(String[] words) {
        List<String> rs = new ArrayList<>();
        for (int i = 0; i < words[0].length(); i++) {
            boolean flag = true;
            char c = words[0].charAt(i);
            for (int j = 1; j < words.length; j++) {
                int index = words[j].indexOf(c);
                if (index == -1) {
                    flag = false;
                    break;
                } else {
                    words[j] = words[j].substring(0, index) + words[j].substring(index + 1);
                }
            }
            if (flag)
            rs.add(Character.toString(c));
        }
        return rs;
    }
}
