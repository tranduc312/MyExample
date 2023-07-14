package anthoer.test.day100520203;

public class Main {

    public static void main(String[] args) {
        NormalSingleTon normalSingleTon = NormalSingleTon.getSingleton();
        System.out.println(normalSingleTon);

        LazySingleton lazySingleton = LazySingleton.get();
        System.out.println(lazySingleton);

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.get();
        System.out.println(EnumSingleton.INSTANCE);
    }
}
