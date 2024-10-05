package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class StreamsTest {

    public static void main(String[] args) {

        Stream<String> fruitsStream = Stream.of("apple", "banana", "pear", "kiwi", "orange");
        fruitsStream.filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        // count odd

        List<Integer> integerList = Arrays.asList(0, 4, 5, 61, 34);
        long count = integerList.stream().filter(element -> element % 2 == 1).count();
        long countParallel = integerList.parallelStream().filter(element -> element % 2 == 1).count();
        System.out.println(count);
        System.out.println(countParallel);

        System.out.println("=====================");
        int sum = IntStream.range(0, 10).filter(a -> a % 2 == 0).peek(System.out::println).sum();
        System.out.println(sum);
        System.out.println("/n");
        IntStream.range(1, 100).filter(a -> a % 2 == 0).forEach(System.out::println);


        try {
            IntStream.range(100, 200).filter(null);
        } catch (NullPointerException e) {
            System.out.println("Got a NullPointerException");
        }


        Stream.of("apple", "banana", "pear", "orange", "apple")
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);


        // Infinite Stream

        IntStream intStream = IntStream.iterate(1, i -> i + 1);
        intStream.limit(20).forEach(System.out::println);


        Stream.iterate(1, i -> i + 1).limit(5).forEach(System.out::println);


        System.out.println(Arrays
                .asList("apple", "banana", "pear", "kiwi", "orange", "apple")
                .stream()
                .filter(s -> s.contains("a"))
                .collect(Collectors.toList()));


        System.out.println(Arrays
                .asList("apple", "banana", "pear", "kiwi", "orange", "apple")
                .stream()
                .filter(s -> s.contains("a"))
                .collect(toSet()));


    }
}
