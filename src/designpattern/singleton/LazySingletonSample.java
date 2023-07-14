package designpattern.singleton;

public class LazySingletonSample {

    private static LazySingletonSample SINGLETON_SAMPLE;

    private LazySingletonSample() {};

    public static LazySingletonSample getInstance() {
        if (SINGLETON_SAMPLE == null)
            SINGLETON_SAMPLE = new LazySingletonSample();
        return SINGLETON_SAMPLE;
    }
}
