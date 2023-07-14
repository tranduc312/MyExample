package anthoer.prepare.brycen.string;

public class Main {

    public static void main(String[] args) {
        /*String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello");
        String s5 = new String("Hello");

        System.out.println(s1 == s1); // true
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == s4); // false
        System.out.println(s4 == s5); // false

        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s4.equals(s5)); // true*/

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(sb1.toString() == s1); // false
        System.out.println(sb1.toString().equals(s1)); // true
    }
}
