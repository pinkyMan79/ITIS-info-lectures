package one.terenin.generics;

public class MyListImpl implements MyLinkedList <Integer>{

    private Node<Integer> head = new Node<>();

    @Override
    public Integer getElement(int index) {
        Node<Integer> tmpNode = new Node<>();
        tmpNode.next = head;
        for (int i = 0; i < index; i++) {
            tmpNode = tmpNode.next;
        }
        return tmpNode.value;
    }

    @Override
    public void putElement(Integer element) {

    }
}
