package leetcode.ez;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestDigitinaString1796 {

    public static void main(String[] args) {
        System.out.println(secondHighest("dfa12321afd"));
        System.out.println(secondHighest("abc1111"));
        System.out.println(secondHighest("ck077"));
    }

    static int secondHighest(String s) {
        int rs = -1;
        int max = -1;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                set.add(c - '0');
            }
        }
        if (set.size() < 2) return -1;
        return new ArrayList<>(set).get(set.size() - 2);
    }
}
