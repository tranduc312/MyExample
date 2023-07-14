package udemy.performance.customer;

public interface ReadOnlyCustomer {
    String getName();

    @Override
    String toString();
}
