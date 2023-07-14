package anthoer.test.day100520203;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton SINGLETON;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton get() {
        if (SINGLETON == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (SINGLETON == null) {
                    SINGLETON = new ThreadSafeSingleton();
                }
            }
        }
        return SINGLETON;
    }
}
