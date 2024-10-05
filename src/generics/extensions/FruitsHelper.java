package generics.extensions;

import java.util.Collection;

public class FruitsHelper {


    public void eatAll(Collection<? extends Fruit> fruits) {
    }

    public void addApple(Collection<? super Apple> apples) {
    }
}

