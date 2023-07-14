package leetcode.ez;

public class BuildArrayfromPermutation1920 {

    public static void main(String[] args) {
        /*Input: nums = [5,0,1,2,3,4]
        n[n[0], n[n[1], n[n[2], n[n[3], n[n[4], n[n[5]
        ->
        n[5], n[0], n[1], n[2], n[3], n[4]
        ->
        4,5,0,1,2,3*/
//        Arrays.stream(buildArray(new int[]{5, 0, 1, 2, 3, 4})).forEach(s -> System.out.print(s + " "));
//        System.out.println();

        System.out.println("101");
        System.out.println(3 << 1);
        System.out.println(3 << 2);
        System.out.println("110");

    }

    static int[] buildArray(int[] nums) {
        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rs[i] = nums[nums[i]];
        }
        return rs;
    }
}
