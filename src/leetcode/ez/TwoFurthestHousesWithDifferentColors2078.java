package leetcode.ez;

public class TwoFurthestHousesWithDifferentColors2078 {

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{1,1,1,6,1,1,1}));
        System.out.println(maxDistance(new int[]{1,8,3,8,3}));
        System.out.println(maxDistance(new int[]{0,1}));
    }

    static int maxDistance(int[] colors) {
        int n = colors.length;
        int i = 0;
        int j = n - 1;
        while (colors[0] == colors[j])
            j--;
        while (colors[n - 1] == colors[i])
            i++;
        return Math.max(n - 1 - i, j);
    }
}
