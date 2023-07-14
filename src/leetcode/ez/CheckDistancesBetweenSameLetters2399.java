package leetcode.ez;

public class CheckDistancesBetweenSameLetters2399 {

    public static void main(String[] args) {
//        System.out.println(checkDistances("abaccb", new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(checkDistances("aa", new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
//        System.out.println(checkDistances("rryzglzgyl", new int[]{1,9,22,36,3,20,2,42,47,5,35,3,11,37,14,37,44,0,15,9,19,44,16,32,5,2}));
//        System.out.println(checkDistances("zz", new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}));
    }

    static boolean checkDistances(String s, int[] distance) {
        for (int i = 0; i < s.length(); i++) {
            int value = distance[s.charAt(i) - 'a'];
            if (i + value + 1 >= s.length() || s.charAt(i + value + 1) != s.charAt(i))
                return false;
            distance[s.charAt(i) - 'a'] = -1;
        }
        return true;
    }
}
