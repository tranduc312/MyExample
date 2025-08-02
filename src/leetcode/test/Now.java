package leetcode.test;

import leetcode.test.dto.C;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
//        testEmptyListForEach();

//        compareHHMMDD("2025-02-16 10:00:00", "2025-02-17 20:00:00");
//        compareHHMMDD("2025-12-31 10:00:00", "2026-01-11 20:00:00");
//        compareHHMMDD("2025-02-16 10:00:00", "2025-02-16 20:00:00");
//        compareHHMMDD("2025-02-16 20:00:00", "2025-02-16 10:00:00");
//        compareHHMMDD("2025-02-17 20:00:00", "2025-02-16 10:00:00");
        C c = new C();
        c.setAmount(new BigDecimal("120"));
        System.out.println();
    }

    static void compareHHMMDD(String date1, String date2) {


        // Define the date-time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Parse the strings to LocalDateTime
        LocalDateTime dateTime1 = LocalDateTime.parse(date1, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(date2, formatter);

        // Convert LocalDateTime to LocalDate
//        LocalDate localDate1 = dateTime1.toLocalDate();
//        LocalDate localDate2 = dateTime2.toLocalDate();

        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);

        // Compare the dates
        if (localDate1.isBefore(localDate2)) {
            System.out.println("The first date is before the second date.");
        }
        if (localDate1.isAfter(localDate2)) {
            System.out.println("The first date is after the second date.");
        }
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
