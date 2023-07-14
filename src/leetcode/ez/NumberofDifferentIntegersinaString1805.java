package leetcode.ez;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class NumberofDifferentIntegersinaString1805 {

    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(numDifferentIntegers("leet1234code234"));
        System.out.println(numDifferentIntegers("a1b01c001"));
        System.out.println(numDifferentIntegers("167278959591294"));
    }

    static int numDifferentIntegers(String word) {
        Set<Integer> set = new TreeSet<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                temp.append(c);
            } else {
                if (!"".equals(temp.toString()))
                    set.add(stringToInt(temp.toString()));
                temp = new StringBuilder();
            }
        }
        if (!"".equals(temp))
            set.add(stringToInt(temp.toString()));
        return set.size();
    }

    static int stringToInt(String s) {
        BigInteger number = new BigInteger(s , 16);
        return number.intValue();
    }
}
