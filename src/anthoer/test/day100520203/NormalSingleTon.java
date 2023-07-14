package anthoer.test.day100520203;

public class NormalSingleTon {

    private static final NormalSingleTon singleTon = new NormalSingleTon();

    private NormalSingleTon() {

    }

    public static NormalSingleTon getSingleton() {
        return singleTon;
    }
}
