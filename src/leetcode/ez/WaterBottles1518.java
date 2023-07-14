package leetcode.ez;

public class WaterBottles1518 {

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
        System.out.println(numWaterBottles(15,4));
        System.out.println(numWaterBottles(15,8));
    }

    static int numWaterBottles(int numBottles, int numExchange) {
        int rs = numBottles;
        while (numBottles != 0) {
            rs += numBottles / numExchange;
            int temp = numBottles % numExchange;
            numBottles = (numBottles / numExchange);
            if (numBottles != 0) {
                numBottles += temp;
            }
        }
        return rs;
    }
}
