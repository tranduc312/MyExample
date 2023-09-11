package leetcode.test.inheritance;

import java.io.Serializable;

public class B extends A {

    public B () {
        System.out.println("B");
    }

    public static void main(String[] args) {
        B b = new B();
        Cloneable a;
        Serializable c;
//        System.out.println(b);
    }
}
