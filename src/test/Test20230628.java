package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test20230628 {
    public static void main(String[] args) {
//        testDoubleEquals();
        double discount = 0.24600000000000002;
        System.out.println(Math.ceil(discount));
        System.out.println(Math.round(discount));


        BigDecimal bd = BigDecimal.valueOf(discount);
        bd = bd.setScale(2, RoundingMode.CEILING);
        System.out.println(bd.doubleValue());
    }

    static void testDoubleEquals() {
        final double currentDiscount = -5.6;
        final double newDiscount = 2.8;

        System.out.println(Double.valueOf(newDiscount).equals(currentDiscount));
    }
}
