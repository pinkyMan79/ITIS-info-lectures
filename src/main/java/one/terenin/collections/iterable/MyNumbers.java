package one.terenin.collections.iterable;

import java.util.Iterator;

public class MyNumbers implements Iterable {
    int[] data = new int[]{1,2,3,4,5,6,7,8,9};

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public Object next() {
                return data[index++];
            }
        };
    }
}
