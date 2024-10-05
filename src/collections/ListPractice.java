package collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListPractice {


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3);
        Set<String> collect = integerList.stream()
                .map(Object::toString)
                .collect(Collectors.toSet());
        System.out.println("Set ::: " + collect );


        List<String> strings = new ArrayList<String>();
        strings.add("Program starting!");
        strings.add("Hello world!");
        strings.add("Goodbye world!");

        System.out.println(strings);
        strings.set(1,"Helloooo");
        System.out.println(strings);


        List<String> ls = new ArrayList<String>();
        List<String> unmodifiableList = Collections.unmodifiableList(ls);

        ls.add("UN");
        System.out.println(unmodifiableList);
        ls = new ArrayList<>();
        System.out.println(ls);

        List<String> unmodifiableList2 = Collections.singletonList("Hello");
//        unmodifiableList2.add(1,"world");
//        System.out.println(unmodifiableList2);
    }
}
