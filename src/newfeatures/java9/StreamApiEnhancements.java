package newfeatures.java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiEnhancements {
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(2, 4, 6, 1, 2, 3, 4, 5, 6, 7, 8, 9);

//        list.stream().filter(x-> x%2==0).forEach(x1 -> System.out.print( x1 + " ")); // 2 4 6 2 4 6 8
//        list.stream().takeWhile(x->x%2==0).forEach(x1 -> System.out.print( x1 + " ")); // 2 4 6
//        list.stream().dropWhile(x->x%2==0).forEach(x1 -> System.out.print( x1 + " ")); // 1 2 3 4 5 6 7 8 9


//        Stream.iterate(100, x -> x<108, x->x+1).forEach(System.out::println);println
        ;

        Stream.iterate(100,x->x+1).limit(20).forEach(System.out::println);
    }
}
