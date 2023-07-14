package leetcode.ez;

import java.util.ArrayList;
import java.util.List;

public class BackspaceStringCompare844 {

    public static void main(String[] args) {
//        s = "ab#c", t = "ad#c"
//        System.out.println(backspaceCompare("ab#c", "ad#c"));
//        s = "ab##", t = "c#d#"
//        System.out.println(backspaceCompare("ab##", "c#d#"));
//        System.out.println("first "+ rs("ab##"));
//        System.out.println("second "+ rs("c#d#"));
//        s = "a#c", t = "b"
//        System.out.println(backspaceCompare("a#c", "b"));

//        "a##c" "#a#c"
//        System.out.println(backspaceCompare("a##c", "#a#c"));

//        "y#fo##f" "y#f#o##f"
//        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
        System.out.println("first "+ rs("y#fo##f"));
        System.out.println("second "+ rs("y#f#o##f"));

//        "f" "f"

    }

    static boolean backspaceCompare(String s, String t) {

        return rs(s).equals(rs(t));
    }

    private static String rs(String s) {
        String[] array = s.split("");
        List<String> list = new ArrayList<>();
        for (String temp : array) {
            if ("#".equals(temp) && list.size() > 0) {
                list.remove(list.size() - 1);
            } else if (!"#".equals(temp)) {
                list.add(temp);
            }
        }
        return list.toString();
    }
}
