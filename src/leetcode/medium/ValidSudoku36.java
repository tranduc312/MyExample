package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku36 {

    public static void main(String[] args) {
        /**
         00,03,06
         30,33,36
         60,63,66
         */
        System.out.println(isValidSudoku(new char[][]{
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}));
        System.out.println(isValidSudoku(new char[][]{
                 {'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}}));
        System.out.println(isValidSudoku(new char[][]{
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}}));
    }

    static boolean isValidSudoku(char[][] board) {
        for (char[] boa : board) {
            if (!isValidRow(boa))
                return false;
        }
        if (!isValidCol(board))
            return false;
        for (int i = 0; i <=6; i += 3) {
            for (int j = 0; j <= 6; j += 3) {
//                System.out.println(String.format("i: %s, j: %s", i, j));
                if (!isValidSubBox(board, i, j))
                    return false;
            }
        }
        return true;
    }

    private static boolean isValidSubBox(char[][] board, int n, int m) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Character.isDigit(board[n+i][m+j])) {
                    if (!set.add(board[n+i][m+j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isValidRow(char[] board) {
        Set<Character> set = new HashSet<>();
        for (char c : board) {
            if (Character.isDigit(c)) {
                if (!set.add(c)) return false;
            }
        }
        return true;
    }

    private static boolean isValidCol(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[j][i])) {
                    if (!set.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
