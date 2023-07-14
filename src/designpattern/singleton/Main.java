package designpattern.singleton;

public class Main {

    public static void main(String[] args) {
        Runnable getInstance = LazySingletonSample::getInstance;

        System.out.println(getInstance);
        System.out.println(EnumSingletonSample.INSTANCE);
    }
}
