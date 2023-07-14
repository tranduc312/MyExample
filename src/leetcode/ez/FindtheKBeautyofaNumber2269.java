package leetcode.ez;

public class FindtheKBeautyofaNumber2269 {

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240, 2));
        System.out.println(divisorSubstrings(430043, 2));
        System.out.println(divisorSubstrings(680, 2));
    }

    static int divisorSubstrings(int num, int k) {
        int rs = 0;
        int value = num;
        int dis = (int) Math.pow(10,k);
        while (num != 0) {
            int temp = num % dis;
            if (temp != 0 && value % temp == 0)
                rs++;
            num /= (int) Math.pow(10,k - 1);
        }
        return rs;
    }
}
