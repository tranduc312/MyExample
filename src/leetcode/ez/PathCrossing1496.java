package leetcode.ez;

import java.util.Arrays;
import java.util.List;

public class PathCrossing1496 {

    private static final List<String> LIST = Arrays.asList("N", "S", "E", "W");

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NES"));
        System.out.println(isPathCrossing("NESWW"));
    }

    static boolean isPathCrossing(String path) {
        return (path.contains("N") && path.contains("S") && path.contains("E") && path.contains("W"));

    }
}
