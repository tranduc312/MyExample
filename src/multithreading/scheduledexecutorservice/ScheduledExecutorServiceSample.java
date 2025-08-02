package multithreading.scheduledexecutorservice;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.*;
import java.util.regex.Pattern;

public class ScheduledExecutorServiceSample {
    static class CpuFilter implements FileFilter {
        @Override
        public boolean accept(final File pathname) {
            if (Pattern.matches("cpu[0-9]+", pathname.getName()))
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(getCoresCount());
        run();
    }

    static int getCoresCount() {
        try {
            final File dir = new File("/sys/devices/system/cpu/");
            final File[] files = dir.listFiles(new CpuFilter());
            return files.length;
        } catch (final Exception e) {
            return Math.max(1, Runtime.getRuntime().availableProcessors());
        }
    }

    static void run() {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        Future<?> result1 = service.schedule(task1, 1, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 2, TimeUnit.SECONDS);
    }
}
