package efective.concurrency;

public class StopThread {

    private static volatile boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }



    public static void main(String[] args) throws InterruptedException {
        /*Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested()) {
                System.out.println(i++);
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();*/
        try {
            StopThread stopThread = new StopThread();
            stopThread.testVolatile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    int count = 0;
    void testVolatile() throws Exception {

        Thread backgroundThread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("backgroundThread1 " + count++);
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        });
        backgroundThread1.start();


//        TimeUnit.SECONDS.sleep(1);

        Thread backgroundThread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("backgroundThread2 " + count++);
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        });
        backgroundThread2.start();

//        TimeUnit.SECONDS.sleep(1);

        Thread backgroundThread3 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("backgroundThread3 " + count++);
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        });
        backgroundThread3.start();

        Thread backgroundThread4 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("backgroundThread4 " + count++);
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        });
        backgroundThread4.start();

        Thread backgroundThread5 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("backgroundThread5 " + count++);
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        });
        backgroundThread5.start();
    }
}
