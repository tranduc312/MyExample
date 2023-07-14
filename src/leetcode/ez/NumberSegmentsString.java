package leetcode.ez;

public class NumberSegmentsString {

    public static void main(String[] args) {
        System.out.println(countSegments("    foo    bar"));
        System.out.println(countSegments1("    foo    bar"));
    }

    static int countSegments(String s) {
//        String trim = s.trim();
//        if ("".equals(trim)) return 0;
//        return s.split("\\s+").length;

        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }
    static int countSegments1(String s) {
        String trim = s.trim();
        if ("".equals(trim)) return 0;
        return trim.split("\\s+").length;
    }
}
