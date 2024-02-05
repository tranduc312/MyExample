package leetcode.test.inheritance.removeabstractinterface;

public class Main {

    public static void main(String[] args) {
        FakeInterface fi = new SubClass();
        fi.access();
        fi.test();
    }
}
