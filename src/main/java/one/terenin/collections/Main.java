package one.terenin.collections;

import one.terenin.collections.iterable.MyNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map numbers = new HashMap();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put("Four", 4);

        for (Object o : numbers.keySet()) {
            int key = (int) o;
            String value = (String) numbers.get(o);
            System.out.println(key + ": " + value);
        }

    }
}
