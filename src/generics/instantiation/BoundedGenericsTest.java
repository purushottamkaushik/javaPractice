package generics.instantiation;

import java.util.ArrayList;
import java.util.Collection;

public class BoundedGenericsTest<T> {
    private Collection<T> col;

    public BoundedGenericsTest() {
        col = new ArrayList<>();
    }

    public static void main(String[] args) {
        BoundedGenericsTest<String> stringBoundedGenericsTest = new BoundedGenericsTest<>();
        stringBoundedGenericsTest.add("str");
        stringBoundedGenericsTest.add("str1");
        stringBoundedGenericsTest.printAllSounds();
    }

    public void add(T t) {
        col.add(t);
    }

    public void printAllSounds() {
        for (T t : col) {
            System.out.println(t);
        }
    }
}
