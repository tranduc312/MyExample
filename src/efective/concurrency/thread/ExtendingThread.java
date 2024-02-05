package efective.concurrency.thread;

public class ExtendingThread extends Thread {

    @Override
    public void run() {
        try {
            Thread thread = Thread.currentThread();
            System.out.println("Thread " + thread.toString() + " is running!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
