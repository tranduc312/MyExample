package leetcode.ez;

public class FindSmallestLetterGreaterThanTarget744 {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters)
            if (c > target) return c;

        return letters[0];
    }
}
