package generics.instantiation;

import java.util.ArrayList;
import java.util.Collection;

public class BoundedAnimalContainer<T extends Animal> {

    private Collection<T> collection;

    public BoundedAnimalContainer() {
        collection = new ArrayList<>();
    }

    public static void main(String[] args) {
        BoundedAnimalContainer<Animal> catBoundedAnimalContainer = new BoundedAnimalContainer<>();
        catBoundedAnimalContainer.add(new Cat());
        catBoundedAnimalContainer.add(new Dog());
        catBoundedAnimalContainer.printAllSounds();

    }

    public void add(T t) {
        collection.add(t);
    }

    public void printAllSounds() {
        for (T t : collection) {
            System.out.print(t.makeNoise() + "\n");
        }
    }
}
