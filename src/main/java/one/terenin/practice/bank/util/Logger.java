package one.terenin.practice.bank.util;

public class Logger<T> {
    public void log(T message) {
        System.out.println("[LOG] " + message.toString());
    }
}
