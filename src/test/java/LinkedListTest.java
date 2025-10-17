import one.terenin.generics.MyListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    public MyListImpl<String> listToTest;

    @BeforeEach
    public void setUp() {
        listToTest = new MyListImpl<>();
    }

    @Test
    public void testListPut() {
        listToTest.putElement("New1");
        listToTest.putElement("New2");
        Assertions.assertEquals(2, listToTest.getSize());
    }

    @Test
    public void testList() {

    }

}
