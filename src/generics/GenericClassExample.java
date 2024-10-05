package generics;

public class GenericClassExample<T> { // Here T is the type of the class

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
