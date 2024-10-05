package generics.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        FruitsHelper fruitsHelper = new FruitsHelper();
        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Apple()); // Apple is a Fruit , so allowed
        fruits.add(new Banana()); // Banana is a Fruit, so allowed
        fruitsHelper.addApple(fruits);  // Fruit super Apple  ==> TRUE
        fruitsHelper.eatAll(fruits);   // A collection that extends FRUIT Or its child ==> TRUE


        Collection<Banana> bananas = new ArrayList<>();
        bananas.add(new Banana());
//        fruitsHelper.addApple(bananas); // java: incompatible types:
        // java.util.Collection<generics.extensions.Banana> cannot be converted to
        // java.util.Collection<? super generics.extensions.Apple>

        fruitsHelper.eatAll(bananas); //  Banana extends FRUIT so allowed

        Collection<Apple> apples = new ArrayList<>();
        fruitsHelper.addApple(apples);

        apples.add(new GrannySmith());
        fruitsHelper.eatAll(apples);

        Collection<GrannySmith> grannySmiths = new ArrayList<>();
//        fruitsHelper.addApple(grannySmiths); // GrannySmith is not a super type of apple its a subtype

        apples.add(new GrannySmith());
        fruitsHelper.eatAll(apples); // allowed as apples are extending fruits

        Collection<Object> objects = new ArrayList<>();
        fruitsHelper.addApple(objects); // Accepted because Object is super of apple

        objects.add(new Shoe()); // Not a fruit
        objects.add(new IPhone()); // Not a Fruit

        fruitsHelper.addApple(objects);
        // fruitsHelper.eatAll(objects); // Not a subclass of fruit thats why error .


    }
}
