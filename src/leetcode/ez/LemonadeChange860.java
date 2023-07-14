package leetcode.ez;

public class LemonadeChange860 {

    public static void main(String[] args) {
//        [5,5,5,10,20]
        //        [1,1,1,2,4]
        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
    }

    static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; ++i) {
            if (bills[i] == 5) {
                ++five;
            } else if (bills[i] == 10) {
                if (five == 0) return false;
                ++ten;
                --five;
            } else {
                if (five > 0 && ten > 0) {
                    --five;
                    --ten;
                } else if (five > 2) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
