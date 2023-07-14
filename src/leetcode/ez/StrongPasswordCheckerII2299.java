package leetcode.ez;

public class StrongPasswordCheckerII2299 {

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("11A!A!Aa"));
//        System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
//        System.out.println(strongPasswordCheckerII("Me+You--IsMyDream"));
//        System.out.println(strongPasswordCheckerII("1aB!"));
    }

    static boolean strongPasswordCheckerII(String password) {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean notSame = true;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            String temp = String.valueOf(c);
            if (!hasLower && Character.isLowerCase(c)) hasLower = true;
            if (!hasUpper && Character.isUpperCase(c)) hasUpper = true;
            if (!hasDigit && Character.isDigit(c)) hasDigit = true;
            if (!hasSpecial && "!@#$%^&*()-+".contains(temp)) hasSpecial = true;
            if (notSame && i < password.length() - 1 && c == password.charAt(i + 1))
                hasLower = false;
        }
        return hasLower && hasUpper && hasDigit && hasSpecial && notSame;
    }
}
