package leetcode.ez;

public class LongPressedName925 {

    private static final String REGEX = "(?<=(.))(?!\\1)";

    public static void main(String[] args) {
//        String   str = "aaaabbbccccaaddddcfggghhhh";
//        String[] out = str.split(REGEX);
//        System.out.println("ssaaedd".split(REGEX));
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("a", "b"));
    }

    static boolean isLongPressedName(String name, String typed) {
        String[] nameArray = name.split(REGEX);
        String[] typedArray = typed.split(REGEX);
        if (nameArray.length != typedArray.length) return false;

        for (int i = 0; i < nameArray.length; i++) {
            if (!typedArray[i].contains(nameArray[i]) || (nameArray[i].length() > typedArray[i].length())) return false;
        }

        return true;
    }
}
