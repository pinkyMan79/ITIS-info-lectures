package one.terenin.generics.hash;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CoolHashMap<K, V> implements CoolMap <K, V> {

    private final int MAP_CAPACITY = 16; // represents how many buckets are possible to store
    private final int BUCKET_CAPACITY = 8; // represents how many HashNode elements in bucket can be stored, if it is more throw an exception

    HashNode<K, V>[] buckets = new HashNode[MAP_CAPACITY];

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Set<HashNode<K, V>> entrySet() {
        return Set.of();
    }

    @Override
    public Collection<V> values() {
        return List.of();
    }

    @Override
    public Set<K> keys() {
        return Set.of();
    }
}
