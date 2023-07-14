package leetcode.ez;

public class ContainerWithMostWater11 {

    public static void main(String[] args) {
//        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
//        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{1,2,1}));
    }

    static int maxArea(int[] height) {
        int rs = 0;
        for (int i = 0; i < height.length; i++) {
            int min = height[i] < height.length ? Math.min(height[i], height[height[i]]) : 0;
            rs = Math.max(min * (height[i] - i), rs);
        }
        return rs;
    }
}
