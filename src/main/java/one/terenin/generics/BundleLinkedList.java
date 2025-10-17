package one.terenin.generics;

public class BundleLinkedList implements MyLinkedList<String>{

    @Override
    public String getElement(int index) {
        return "Elemne";
    }

    @Override
    public void putElement(String element) {

    }

    @Override
    public String[] getAllElements() {
        return new String[0];
    }
}
