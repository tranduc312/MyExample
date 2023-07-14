package multithreading.concurrency;

public class FunctionInterfaceSampleMain {

    public static void main(String[] args) {

        FunctionInterfaceSample functionInterfaceSample = () -> System.out.println("FunctionInterfaceSample");
        functionInterfaceSample.test();
    }
}
