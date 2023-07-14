package leetcode.ez;

public class FindtheHighestAltitude1732 {

    public static void main(String[] args) {
        /*Input: gain = [-5,1,5,0,-7]
        Output: 1
        Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.*/
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    static int largestAltitude(int[] gain) {
        int rs = 0;
        int value = 0;
        for (int i : gain) {
            value += i;
            if (value > rs) rs = value;
        }
        return rs;
    }
}
