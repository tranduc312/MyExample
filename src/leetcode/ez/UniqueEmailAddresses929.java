package leetcode.ez;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueEmailAddresses929 {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    static int numUniqueEmails(String[] emails) {
        return Arrays.stream(emails)
                .map(e -> e.substring(0, e.indexOf("@")).replace(".", "") + e.substring(e.indexOf("@")))
                .map(e -> e.indexOf("+") > 0 ? e.substring(0, e.indexOf("+")) + e.substring(e.indexOf("@")) : e)
                .collect(Collectors.toSet()).size();
    }
}
