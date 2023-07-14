package multithreading.coordination;

import java.io.IOException;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {
        /*Thread thread = new Thread(new BlockTask());

        thread.start();
        thread.interrupt();*/
//
        Thread thread = new Thread(new LongCompatationTask(new BigInteger("10"), new BigInteger("3")));
//        thread.setDaemon(true);
        thread.start();
//        thread.interrupt();
    }

    static class LongCompatationTask implements Runnable {
        private BigInteger base;
        private BigInteger power;

        public LongCompatationTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base + "^" + power + "=" + pow(base,power));
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;

            for (BigInteger i = BigInteger.ONE; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Prematurely interrupted computation");
                    return BigInteger.ZERO;
                }
                result = result.multiply(base);
            }
            return result;
        }
    }

    static class BlockTask extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println("BlockTask running");
            } catch (InterruptedException e) {
                System.out.println("Existing Blocking thread");
            }
        }
    }

}
