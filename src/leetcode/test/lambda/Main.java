package leetcode.test.lambda;

import leetcode.test.lambda.Math.MathOperation;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.LongBinaryOperator;

public class Main {

    public static void main(String[] args) {
//        testLambda();
        testMethodRerefences();
        Runnable aNew = Object::new;
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        LongBinaryOperator longBinaryOperator;
    }

    private static void testMethodRerefences() {
        List<String> list = Arrays.asList("A", "B", "c", "d");
        list.stream().map(String::toLowerCase).forEach(System.out::println);
        list.stream().map(String::length).forEach(System.out::println);
    }

    private static void testLambda() {
        AInterface aInterface = (a, b) -> a + b;
        System.out.println(concat("a", "b", aInterface));
        MathOperation mathOperation = (a, b) -> a + b;
        System.out.println(operate(2, 3, mathOperation));
    }

    static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    static String concat(String a, String b, AInterface aInterface) {
        return aInterface.concat(a , b);
    }
}
