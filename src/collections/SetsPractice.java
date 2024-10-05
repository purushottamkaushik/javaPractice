package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsPractice {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(22);
        set.add(12);
        set.add(32);
        set.add(44);
        System.out.println(set);

    }
}
