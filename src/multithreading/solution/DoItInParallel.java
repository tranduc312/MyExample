package multithreading.solution;

import java.util.List;
import java.util.concurrent.Callable;

public class DoItInParallel implements Callable<Void> {

    private final List<String> objects;

    public DoItInParallel(List<String> objects) {
        this.objects = objects;
    }

    @Override
    public Void call() throws Exception {
        for (Object object : objects) {
            //here you can call your services or just use jdbc api to retrieve data from db and do some business logic
            System.out.println(object.toString());
        }
        return null;
    }
}