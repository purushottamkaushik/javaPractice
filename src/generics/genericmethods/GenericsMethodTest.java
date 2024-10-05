package generics.genericmethods;

import java.util.ArrayList;
import java.util.List;

public class GenericsMethodTest {

    public static <T> List<T> makeList(T t1, T t2) {

        List list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = makeList("Hello", "world");
        System.out.println(strings);

        List<Integer> integerList = (List<Integer>) makeList(1, 2);
        System.out.println(integerList);

        List<Double> doubleList = makeList(1.0, 2.0);
        System.out.println(doubleList);
    }
}
