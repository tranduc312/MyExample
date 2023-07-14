package leetcode.ez;

public class CountofMatchesinTournament1688 {

    public static void main(String[] args) {

        System.out.println(numberOfMatches(7));
        System.out.println(numberOfMatches(14));
    }

    static int numberOfMatches(int n) {
        int teams = 0;
        int matches = 0;
        while (n >= 2) {
            if (n % 2 == 0) {
                teams = n/2;
                matches += n/2;
            } else {
                matches += (n - 1) / 2;
                teams = (n - 1) / 2 + 1;
            }
            n = teams;
        }
        return matches;
    }
}
