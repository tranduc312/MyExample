package leetcode.ez;

public class ReplaceElementswithGreatestElementonRightSide1299 {

    public static void main(String[] args) {
        System.out.println(replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
    }

    static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = -1;
        int temp = 0;
        for (int i = len -1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            max = Math.max(temp, max);
        }

        return arr;
    }
}
