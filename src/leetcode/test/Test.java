package leetcode.test;
class A {
    static int i = 1_00;

}
public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
        a = null;
        System.out.println(a.i);
    }
}
