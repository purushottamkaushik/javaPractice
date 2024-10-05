package generics.instantiation;

public class GenericInstantiationTest {


    public static <T> T genericMethod(Class<T> clazz) {
        try {
            T t = clazz.newInstance();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String s = genericMethod(String.class);
        System.out.println(s);
    }

}
