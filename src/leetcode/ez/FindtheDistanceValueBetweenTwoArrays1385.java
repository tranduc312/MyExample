package leetcode.ez;

public class FindtheDistanceValueBetweenTwoArrays1385 {

    public static void main(String[] args) {
        /*Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
        Output: 2*/
        System.out.println(findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2));
        System.out.println(findTheDistanceValue(new int[]{1, 4, 2, 3}, new int[]{-4, -3, 6, 10, 20, 30}, 3));
        System.out.println(findTheDistanceValue(new int[]{2, 1, 100, 3}, new int[]{-5, -2, 10, -3, 7}, 6));
    }

    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int rs = 0;
        for (int i : arr1) {
            boolean isDistanceCorrect = true;
            for (int j : arr2) {
                if (Math.abs(i - j) <= d) {
                    isDistanceCorrect = false;
                    break;
                }
            }
            if (isDistanceCorrect) rs++;
        }
        return rs;
    }

}
