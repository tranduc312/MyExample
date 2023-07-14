package leetcode.ez;

public class MaximumEnemyFortsThatCanBeCaptured2511 {

    public static void main(String[] args) {
        System.out.println('1' - '0');
//        System.out.println(captureForts(new int[]{1,0,0,-1,0,0,0,0,1}));
//        System.out.println(captureForts(new int[]{0,0,1,-1}));
//        System.out.println(captureForts(new int[]{1,0,0,-1}));
//        System.out.println(captureForts(new int[]{0,-1,-1,0,-1}));
//        System.out.println(captureForts(new int[]{1,0,0,-1,0,0,-1,0,0,1}));
    }

    static int captureForts(int[] forts) {
        int ans = 0;
        for (int i = 0, j = 0; i < forts.length; ++i)
            if (forts[i] != 0) {
                if (forts[j] !=0 && forts[i] != forts[j])
                    ans = Math.max(ans, i - j - 1);
                j = i;
            }
        return ans;
    }
}
