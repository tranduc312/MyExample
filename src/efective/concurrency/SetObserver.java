package efective.concurrency;

@FunctionalInterface
public interface SetObserver<E> {
    void added();
}
