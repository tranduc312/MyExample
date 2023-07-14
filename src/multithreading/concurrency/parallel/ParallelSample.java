package multithreading.concurrency.parallel;

import java.util.Arrays;

public class ParallelSample {

    public static void main(String[] args) {
//        test();
//        for (int i = 0; i < 10; i++) {
//            parallel();
//        }
        reduce();
    }

    static void reduce() {
        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("",(c,s1) -> c + s1,
                        (s2,s3) -> s2 + s3));
    }

    static void parallel() {
        System.out.println();
        Arrays.asList(1,2,3,4,5,6).stream().parallel().forEach(s -> System.out.print(s + " "));
        Arrays.asList(1,2,3,4,5,6).stream().parallel().forEachOrdered(s -> System.out.print(s + " "));
        Arrays.asList(1,2,3,4,5,6).parallelStream().forEachOrdered(s -> System.out.print(s + " "));
    }

    static void test() {
        Arrays.asList(1,2,3,4,5,6).stream().forEach(s -> System.out.print(s + " "));
    }
}
