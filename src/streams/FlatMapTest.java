package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> list3 = Arrays.asList(10, 11, 12, 13, 14, 15);
        Stream<List<Integer>> integerStreamList = Stream.of(list1, list2, list3);
        ArrayList arr = integerStreamList.flatMap(Collection::stream)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arr);


        Map<String, List<Integer>> stringMap = new HashMap<>();
        stringMap.put("one", Arrays.asList(1, 2));
        stringMap.put("two", Arrays.asList(3, 4));
        stringMap.put("three", Arrays.asList(5, 6));

        HashSet s1 = stringMap.values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(s1);


        System.out.println("==========");
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map1 = new HashMap();
        map1.put("1", "one");
        map1.put("2", "two");
        Map<String, String> map2 = new HashMap();
        map2.put("3", "three");
        map2.put("4", "four");
        list.add(map1);
        list.add(map2);
        Set<String> output = list.stream()
                .map(Map::values)
                .flatMap(Collection::stream)
                .collect(Collectors.toUnmodifiableSet());

        System.out.println(output);


    }
}
