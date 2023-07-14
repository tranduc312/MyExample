package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        System.out.println(letterCombinations(""));
        System.out.println(letterCombinations("2"));
    }
    static List<String> letterCombinations(String digits) {
        List<String> rs = new ArrayList<>();
        if (digits.isEmpty()) return rs;
        String[] array = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        rs.add("");
        for (char c : digits.toCharArray()) {
            rs = combine(array[c - '0'], rs);
        }
        return rs;
    }

    static List<String> combine(String s, List<String> list) {
        List<String> rs = new ArrayList<>();
        for (String l : list) {
            for (char c : s.toCharArray()) {
                rs.add(l + c);
            }
        }
        return rs;
    }
}
