package newfeatures.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionFactoryTest {


     public static void main(String[] args) {

         List<String> strings = List.of("a", "b", "c");
//         strings.add("d");  unsupported as it is unmodifiable
         strings.forEach(System.out::println);

         Set<String> setOfStrings = Set.of("a", "b", "c", "d");
         setOfStrings.forEach(System.out::println);

         Map<String, String> stringStringMap = Map.of("HEllo", "Mamta", "hi", "purushottam");
         stringStringMap.forEach((k,v) ->{
             System.out.println("key " + k + " value =" + v);
         });

     }
}
