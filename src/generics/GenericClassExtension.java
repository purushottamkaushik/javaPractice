package generics;

public abstract class GenericClassExtension<T> {

    private T value;

    public GenericClassExtension(T value) {
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

//class Email<T> extends GenericClassExtension<String> {
//    public Email(String value) {
//        super(value);
//    }
//}
//
//class Age extends GenericClassExtension<Integer> {
//    public Age(Integer value) {
////        System.out.println("Hello");System
//        super(value);
//    }
//}
