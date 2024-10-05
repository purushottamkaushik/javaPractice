package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCreationAndOperationsTest {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        Set collectedSet = IntStream.of(ints).boxed().collect(Collectors.toSet());
        System.out.println(collectedSet);


        List<Integer> naturalNumbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics intSummaryStatistics = naturalNumbers.stream().mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);


        String[] names = {"John", "Jane", "Jack", "Bob"};
        IntStream.range(0, names.length).forEach(System.out::println);

        String collectedString = Stream.of(names)
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(collectedString);


        Stream<String> characters = Stream.of("A", "B", "C", "A");
        Map<Integer, String> map = characters.distinct()
                .collect(Collectors.toMap(element -> element.hashCode(), element -> element));
        System.out.println(map);

        Stream<String> characters1 = Stream.of("A", "B", "C", "A");
        Map<String, String> map1 = characters1.distinct()
                .collect(Collectors.toMap(Function.identity(), element -> element));
        System.out.println(map1);


        Stream<String> words = Stream.of("Hello", "Apple", "Banana", "Orange", "Santre");
        Stream<String> words1 = Stream.of("Hello", "Apple", "Banana", "Orange", "Santre");
        String collectedString1 = words.sorted().collect(Collectors.joining(",", "Fruits : ", "."));
        String collectedString2 = words1.sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.joining(",", "Fruits : ", ".")); // reverese
        System.out.println(collectedString1);
        System.out.println(collectedString2);

    }
}
