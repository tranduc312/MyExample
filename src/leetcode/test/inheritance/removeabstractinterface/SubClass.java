package leetcode.test.inheritance.removeabstractinterface;

public class SubClass extends FakeInterface {

    @Override
    public void access() {
        System.out.println(getClass() + "access");
    }
}
