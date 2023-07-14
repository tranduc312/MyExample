package leetcode.ez;

public class CheckIfNandItsDoubleExist1346 {

    public static void main(String[] args) {
        /*Input: arr = [10,2,5,3]
        Output: true*/
        System.out.println(checkIfExist(new int[]{10,2,5,3}));
        System.out.println(checkIfExist(new int[]{3,1,7,11}));
        System.out.println(checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
        System.out.println(checkIfExist(new int[]{0,0}));
        // 20 4 10 6
    }

    static boolean checkIfExist(int[] arr) {
        int[] arrayTemp = arr.clone();
        for (int i = 0; i < arrayTemp.length; i++) {
            arrayTemp[i] *= 2;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrayTemp.length; j++) {
                if (i != j && arr[i] == arrayTemp[j])
                    return true;
            }
        }
        return false;
    }
}
