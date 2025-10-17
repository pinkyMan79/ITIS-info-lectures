package one.terenin.generics;

public class MyListImpl<T> implements MyLinkedList<T>{

    private Node<T> head = new Node<>();
    private int size = 0;

    @Override
    public T getElement(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }

    @Override
    public void putElement(T element) {
        Node<T> node = new Node<>();
        node.next = head;
        while (node.next != null) {
            node = node.next;
        }
        Node<T> newNode = new Node<>();
        newNode.value = element;
        node.next = newNode;
        size++;
    }

    @Override
    public T[] getAllElements() {
        Node<T> tmp = head.next;
        T[] result = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = tmp.value;
            tmp = tmp.next;
        }
        return result;
    }

    public int getSize() {
        return size;
    }
}
