package one.terenin.generics.hash;

import java.util.Collection;
import java.util.Set;

public interface CoolMap<K, V> {
    V put(K key, V value); // return old element in case of key update
    V get(K key);
    V remove(K key); // return removed element
    int size();
    boolean isEmpty();
    Set<HashNode<K, V>> entrySet(); // return set of all key-value pairs from map
    Collection<V> values(); // values are possible to repeat in map
    Set<K> keys(); // key's in map can not repeat
}
