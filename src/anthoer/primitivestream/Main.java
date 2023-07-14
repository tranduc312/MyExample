package anthoer.primitivestream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        System.out.println();
//        test5();
        System.out.println(test6());
    }

    static int test6() {
        IntStream ints = IntStream.of(2,10);
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }

    static void test1() {
        Stream<Integer> integerStream = Stream.of(1,2,3);
        System.out.println(integerStream.reduce(0, (a, b) -> a + b));
    }

    static void test2() {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());
    }

    static void test3() {
//        DoubleStream random = DoubleStream. generate (Math::random);
        DoubleStream fractions = DoubleStream.iterate (2, d -> d * d);
//        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(64).forEach(System.out::println);
    }

    static void test4() {
        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print);
    }

    static void test5() {
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print);
    }
}
