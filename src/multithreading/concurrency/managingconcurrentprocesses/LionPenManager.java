package multithreading.concurrency.managingconcurrentprocesses;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {

    private void addLion() {
        System.out.println("Adding Lion");
    }

    private void removeLion() {
        System.out.println("Removing Lion");
    }

    private void cleanPen() {
        System.out.println("Cleaning the Pen");
    }

    public void performTask() {
        removeLion();
        cleanPen();
        addLion();
    }

    public static void main(String[] args) {
        ExecutorService exe = null;
        try {
            exe = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            for (int i = 0; i < 4; i++) {
                exe.submit(() -> manager.performTask());
            }
        } catch (Exception e) {

        } finally {
            if (exe != null) exe.shutdown();
        }
    }
}
