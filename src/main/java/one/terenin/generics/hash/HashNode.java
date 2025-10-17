package one.terenin.generics.hash;

import one.terenin.generics.MyLinkedList;

public class HashNode<K, V> {
    public K key;
    public V value;
    public HashNode<K, V> next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int hashCode() {
        if (key == null) return 0;
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HashNode<?, ?> hashNode) {
            return key.equals(hashNode.key) && value.equals(hashNode.value);
        }
        return false; // fixme
    }
}
