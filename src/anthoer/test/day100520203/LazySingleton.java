package anthoer.test.day100520203;

public class LazySingleton {

    private static LazySingleton SINGLETON;

    private LazySingleton() {}

    public static LazySingleton get() {
        if (SINGLETON == null) {
            SINGLETON = new LazySingleton();
        }
        return SINGLETON;
    }
}
