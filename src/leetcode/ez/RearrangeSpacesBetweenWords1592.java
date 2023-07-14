package leetcode.ez;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeSpacesBetweenWords1592 {

    public static void main(String[] args) {
        /*Input: text = "  this   is  a sentence "
        Output: "this   is   a   sentence"*/
//        System.out.println(reorderSpaces("  this   is  a sentence "));
        String url = new StringBuilder().append("url")
                .append("product").append("?page[limit]=").append("25")
                .append("&page[offset]=").append(0).append(String.format("&filter=eq(sku,%s)", "SUPPORT-DLTUFF.050WH10'")).toString();

        System.out.println(url);

    }

    static String reorderSpaces(String text) {
        return null;
    }

    static List<String> countWord(String s) {
        List<String> list = Arrays.asList(s.split(" "));
        return list.stream().filter(l -> l.isBlank()).collect(Collectors.toList());
    }
}
