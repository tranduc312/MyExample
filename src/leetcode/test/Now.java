package leetcode.test;

import java.util.ArrayList;
import java.util.List;

public class Now {

    public static void main(String[] args) {

        /*int i  = 1;
        float f = 2.2f;
        double d = 3.3;
        f = i;

        d = f;
        System.out.println(System.currentTimeMillis());
        System.out.println(LocalDateTime.now());*/
       /* int[] nums = {5,3,2,8};
        Arrays.sort(nums);
        Arrays.stream(nums).forEach(System.out::println);

        List<Integer> list = Arrays.stream(nums).boxed()
                .sorted(Collections.reverseOrder()).collect(Collectors.toList());
        Arrays.stream(nums).boxed().forEach(System.out::println);
        */

        /*String text = "a b c. \n d a.";
        String searchString = "\\s+";
        String replacementString = "";
        int maxReplacements = 2;
        System.out.println(text.replaceAll("\\s+", "").replace(".", "-"));
        System.out.println(StringUtils.replaceEach(text, {"\\s+", "."}, "", ".", "-"));*/

//        String newText = StringUtils.replace(text, searchString, replacementString);
//        System.out.printf("StringUtils.replace(%s, %s, %s, %s) = %s", text, searchString, replacementString, maxReplacements, newText);
//        System.out.println(newText);

        /*Double d = 1.1;
        String s = "1.1";
        System.out.println(Double.parseDouble(s) == d);
        System.out.println(Double.valueOf(s) == d);*/

        /*System.out.println("first:");
        testVarargs(false);
        System.out.println("second:");
        testVarargs(false);
        System.out.println("third:");
        testVarargs(true);*/

        /*double price = 200;
        int format = 10000;
        int roundingValue = 100;
        double fixPrice = price * format * roundingValue;
        double rs = Math.round(fixPrice);
        System.out.println(rs);*/
        testEmptyListForEach();
    }

    static void testEmptyListForEach() {
        List<String> list = new ArrayList<>();
        for (String s : list) {
            System.out.println(s);
        }
    }

    static void testVarargs(boolean isReject) {
        if (!isReject)
            System.out.println("save item return");
    }
}
