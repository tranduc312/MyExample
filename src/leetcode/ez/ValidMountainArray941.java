package leetcode.ez;

public class ValidMountainArray941 {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2,1}));
        System.out.println(validMountainArray(new int[]{3,5,5}));
        System.out.println(validMountainArray(new int[]{0,3,2,1}));
        System.out.println(validMountainArray(new int[]{0,2,3,4,5,2,1,0}));
        System.out.println(validMountainArray(new int[]{0,2,3,3,5,2,1,0}));
    }

    static boolean validMountainArray(int[] arr) {
        int lengthArray = arr.length;
        if (lengthArray < 3) return false;
        // find index max
        boolean rs = true;
        for (int i = 0; i < lengthArray; i++) {

        }

        return rs;
    }
}
