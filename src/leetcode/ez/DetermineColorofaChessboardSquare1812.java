package leetcode.ez;

public class DetermineColorofaChessboardSquare1812 {

    public static void main(String[] args) {
        System.out.println(squareIsWhite("a1"));
        System.out.println(squareIsWhite("h3"));
        System.out.println(squareIsWhite("c7"));
    }

    static boolean squareIsWhite(String coordinates) {
        char c1 = coordinates.charAt(0);
        int c2 = coordinates.charAt(1) - '0';
        if (c1 == 'a' || c1 == 'c' || c1 == 'e' || c1 == 'g') {
            if (c2 % 2 == 0) return true;
            else return false;
        } else {
            if (c2 % 2 == 0) return false;
            else return true;
        }
    }
}
