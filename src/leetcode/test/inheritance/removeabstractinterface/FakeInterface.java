package leetcode.test.inheritance.removeabstractinterface;

public class FakeInterface {

    public void access() {
        throw new RuntimeException("necessary implement this method");
    }

    public void test() {
        throw new RuntimeException("necessary implement this method");
    }
}
