package udemy.performance.unnecessaryobject;

public class AutoBoxingSample {

    public static void main(String[] args) {
        testLong1();
        testLong2();
    }

    private static void testLong1() {
        System.out.println(">>>>>>>>>>>>>>>>>start test long AutoBoxing<<<<<<<<<<<<<<<<<");
        long startTime = System.currentTimeMillis();
        Long rs = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            rs += i;
        }
        System.out.println(rs);
        System.out.println(">>>>>>>>>>>>>>>>>end test long AutoBoxing<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>total time test long AutoBoxing<<<<<<<<<<<<<<<<<" + (System.currentTimeMillis() - startTime));
    }

    private static void testLong2() {
        System.out.println(">>>>>>>>>>>>>>>>>start test long Normal<<<<<<<<<<<<<<<<<");
        long startTime = System.currentTimeMillis();
        long rs = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            rs += i;
        }
        System.out.println(rs);
        System.out.println(">>>>>>>>>>>>>>>>>end test long Normal<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>total time test long Normal<<<<<<<<<<<<<<<<<" + (System.currentTimeMillis() - startTime));
    }
}
