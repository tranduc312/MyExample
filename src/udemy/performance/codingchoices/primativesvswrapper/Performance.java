package udemy.performance.codingchoices.primativesvswrapper;

public class Performance {
    public void run() {

        System.out.println("start primatives");
        long startTime = System.currentTimeMillis();
        addPrimatives(10000000l);
        System.out.println("total time primatives: " + (System.currentTimeMillis() - startTime));
        System.out.println("start wrapper");
        startTime = System.currentTimeMillis();
        addWrapper(10000000L);
        System.out.println("total time wrapper: " + (System.currentTimeMillis() - startTime));
    }

    private void addPrimatives(long howMany) {
        long res = 0L;
        for (long i = 0; i <= howMany; i++) {
            res += 17L;
        }
    }

    private void addWrapper(Long howMany) {
        Long res = 0L;
        Long adder = 17L;
        for (long i = 0; i <= howMany; i++) {
            res += adder;
        }
    }
}
