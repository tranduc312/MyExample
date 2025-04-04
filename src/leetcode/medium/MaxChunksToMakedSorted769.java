package leetcode.medium;

public class MaxChunksToMakedSorted769 {

    public static void main(String[] args) {
//        System.out.println(maxChunksToStored(new int[]{4, 3, 2, 1, 0}));
//        System.out.println(maxChunksToStored(new int[]{1, 0, 2, 3, 4}));
        System.out.println(maxChunksToStored(new int[]{1,2,0,3}));
//        System.out.println(maxChunksToStored(new int[]{1,4,3,6,0,7,8,2,5}));
    }

    static int maxChunksToStored(int[] arr) {
        int max = 0;
        int rs = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            if (max == i) rs++;
        }
        return rs;
    }

}
