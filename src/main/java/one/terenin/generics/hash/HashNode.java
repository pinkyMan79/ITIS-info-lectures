package one.terenin.generics.hash;

// think about optimizations, for example, are we really need to calculate hashCode on every call, or it is better to store it in the variable and calculate once?
public class HashNode<K, V> {
    public K key;
    public V value;
    public HashNode<K, V> next;

    @Override
    public int hashCode() {
        // specify your own hash code function here
        // it is allowed to search any implementations of hash function in the internet

        // your code here
        return 0; // fixme
    }

    @Override
    public boolean equals(Object obj) {
        // your own equals function, need to implement something like this.key == obj.key and so on for every needed variable
        // don't forget about "instance of"

        // your code here
        return false; // fixme
    }
}
