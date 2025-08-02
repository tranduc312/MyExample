package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class ProductOfTheLastKNumbers1352 {

    public static void main(String[] args) {
        testCase1();
    }

    /**
     * Input
     * ["ProductOfNumbers","add","add","add","add","add","getProduct","getProduct","getProduct","add","getProduct"]
     * [[],[3],[0],[2],[5],[4], [2],[3],[4],[8],[2]]
     *
     * Output
     * [null,null,null,null,null,null,20,40,0,null,32]
     */
    static void testCase1() {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);
        System.out.println(productOfNumbers.getProduct(2));
        System.out.println(productOfNumbers.getProduct(3));
        System.out.println(productOfNumbers.getProduct(4));

        productOfNumbers.add(8);
        System.out.println(productOfNumbers.getProduct(2));
    }

    static class ProductOfNumbers {
        List<Integer> integers;
        int prod = 1;

        public ProductOfNumbers() {
            integers = new ArrayList<>();
        }

        public void add(int num) {
            if (num == 0) {
                integers = new ArrayList<>();
                prod = 1;
                return;
            }
            prod *= num;
            integers.add(prod);
        }

        public int getProduct(int k) {
            if (integers.size() < k) return 0;
            int ans = integers.get(integers.size() - 1);
            if (integers.size() == k) return ans;
            return ans/integers.get(integers.size()-1-k);
        }
    }

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
}
