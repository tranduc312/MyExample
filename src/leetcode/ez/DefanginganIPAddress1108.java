package leetcode.ez;

public class DefanginganIPAddress1108 {

    public static void main(String[] args) {
        /*Input: address = "1.1.1.1"
        Output: "1[.]1[.]1[.]1"*/
        System.out.println(defangIPaddr("1.1.1.1"));
//        Semaphore
    }

    static String defangIPaddr(String address) {
        if (address.length() == 0) return "";
        return address.replace(".", "[.]");
    }
}
