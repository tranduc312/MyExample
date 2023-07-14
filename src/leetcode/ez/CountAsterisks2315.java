package leetcode.ez;

import java.util.HashSet;
import java.util.Set;

public class CountAsterisks2315 {

    public static void main(String[] args) {
//        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
//        System.out.println(countAsterisks("iamprogrammer"));
//        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
        Set<Character> set = new HashSet<>();
        String s = "abac";
        for (char c : s.toCharArray()) {
            set.add(c);
        }

//        System.out.println(set.toString());


        char c1 = 'a';
        System.out.println(c1++);
        System.out.println(c1++);
    }

    static int countAsterisks(String s) {
        int count = 0;
        String[] array = s.split("\\|");
        for (int i = 0; i < array.length; i += 2) {
            for (char c : array[i].toCharArray()) {
                if(c == '*')
                    count++;
            }
        }
        return count;
    }
}
