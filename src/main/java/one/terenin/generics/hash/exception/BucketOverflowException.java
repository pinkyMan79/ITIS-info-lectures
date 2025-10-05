package one.terenin.generics.hash.exception;

public class BucketOverflowException extends RuntimeException {

    public BucketOverflowException(int maxCapacity) {
        super(String.format("Bucket overflow, maximum capacity is -> %s", maxCapacity));
    }

}
