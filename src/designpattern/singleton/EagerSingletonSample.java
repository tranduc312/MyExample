package designpattern.singleton;

public class EagerSingletonSample {

    private static final EagerSingletonSample SINGLETON_SAMPLE = new EagerSingletonSample();

    private EagerSingletonSample() {
    }

    public static EagerSingletonSample getInstance() {
        return SINGLETON_SAMPLE;
    }
}
