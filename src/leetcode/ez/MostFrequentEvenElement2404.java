package leetcode.ez;

public class MostFrequentEvenElement2404 {

    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
        System.out.println(mostFrequentEven(new int[]{4,4,4,9,2,4}));
        System.out.println(mostFrequentEven(new int[]{29,47,21,41,13,37,25,7}));
        System.out.println(mostFrequentEven(new int[]{10000}));
    }

    static int mostFrequentEven(int[] nums) {
        int[] array = new int[100001];
        for (int i : nums) {
            if (i % 2 == 0)
                array[i]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (array[i] != 0)
                return i;
        }
        return -1;
    }

}
