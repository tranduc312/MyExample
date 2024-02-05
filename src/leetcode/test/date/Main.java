package leetcode.test.date;

import java.math.BigDecimal;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        attachTimeOfCheck();
//        secondAttack();
        /*java.time.Period period;
        Set<Integer> set = new HashSet<>();
        set.clear();
        Set<Integer> otherSet = Set.of(1, 2, 3);
        set.addAll(otherSet);
        System.out.println(set.size());*/

//        testBigDecimalWithCurrency();
//        testBigDecimalToDoubleValue();
    }

    private static void testBigDecimalToDoubleValue() {
        BigDecimal bigDecimal = null;
        System.out.println(bigDecimal.doubleValue());
    }

    private static void testBigDecimalWithCurrency() {
        /*BigDecimal price = new BigDecimal("£119.00");
        System.out.println(price);*/
        String priceString = "$119.00";
        // Remove the currency symbol and any other non-numeric characters if needed
        priceString = priceString.replaceAll("[^\\d.]", "");

        BigDecimal price = new BigDecimal(priceString);
        System.out.println(price);
    }

    private static void attachTimeOfCheck() {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        System.out.println(period);
        end.setYear(79);
        System.out.println(period);
    }

    private static void secondAttack() {
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start, end);
        System.out.println(period);
        period.getEnd().setYear(79);
        System.out.println(period);
    }
}
