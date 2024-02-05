package efective.concurrency.thread;

import org.apache.commons.lang3.concurrent.ConcurrentUtils;

public class Main {

    public static void main(String[] args) {
//        runExtendingThread();
        runImplementingRunnable();
        ConcurrentUtils concurrentUtils;
    }

    private static void runExtendingThread() {
        for (int i = 0; i < 10; i++) {
            ExtendingThread extendingThread = new ExtendingThread();
            extendingThread.start();
        }
    }

    private static void runImplementingRunnable() {
        for (int i = 0; i < 10; i++) {
            Thread implementRunnable = new Thread(new ImplementingRunnable());
            implementRunnable.start();
        }
    }
}
