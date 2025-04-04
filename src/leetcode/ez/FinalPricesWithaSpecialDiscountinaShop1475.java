package leetcode.ez;

import java.util.Arrays;
import java.util.Stack;

public class FinalPricesWithaSpecialDiscountinaShop1475 {

    public static void main(String[] args) {
        /*Input: prices = [8,4,6,2,3]
        Output: [4,2,4,2,3]*/
        System.out.println(Arrays.toString(finalPrices3(new int[]{8, 4, 6, 2, 3})));
//        System.out.println(Arrays.toString(finalPrices3(new int[]{1,2,3,4,5})));
//        System.out.println(Arrays.toString(finalPrices3(new int[]{10,1,1,6}))); // [9,0,1,6]
//        System.out.println();
//        Arrays.stream(finalPrices(new int[]{10,2,5,2,8})).forEach(s -> System.out.print(s + " "));
//        System.out.println();
//        Arrays.stream(finalPrices(new int[]{8,7,4,2,8,1,7,7,10,1})).forEach(s -> System.out.print(s + " "));
    }
    static int[] finalPrices3(int[] prices) {
        int n = prices.length;
        int[] rs = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = n - 1; i >= 0; i--) {
            while (stack.peek() > prices[i]) {
                stack.pop();
            }
            rs[i] = prices[i] - stack.peek();
            stack.push(prices[i]);
        }
        return rs;
    }

    static int[] finalPrices2(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] -= findDiscount(prices, i);
        }
        return prices;
    }

    static int findDiscount(int[] array, int index) {
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] <= array[index]) {
                return array[i];
            }
        }
        return 0;
    }



    static int[] finalPrices(int[] prices) {
        int[] rs = new int[prices.length];
        // find min right
        for (int i = 0; i < prices.length; i++) {
            int minRight = findMidRight(prices, i);
            rs[i] = prices[i] >= minRight ? prices[i] - minRight : prices[i];
        }
        return rs;
    }

    static int findMidRight(int[] array, int index) {
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] <= array[index]) return array[i];
        }
        return Integer.MAX_VALUE;
    }
}
