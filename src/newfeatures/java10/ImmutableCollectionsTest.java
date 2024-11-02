package newfeatures.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableCollectionsTest {
    public static void main(String[] args) {
        var list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        List<Object> collect = list.stream().collect(Collectors.toUnmodifiableList());
//        collect.add(400); // unsupported operation
        collect.stream().forEach(System.out::println);

        List<Object> objects = List.copyOf(collect);
        objects.add(5000);
    }
}
