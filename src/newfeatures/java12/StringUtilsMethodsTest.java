package newfeatures.java12;

public class StringUtilsMethodsTest {
    public static void main(String[] args) {
        String s = "hello";
        s = s.indent(5);
        System.out.println(s);

        String result = s.transform(s1->s1.toUpperCase())
                .transform(s1-> new StringBuilder(s1).reverse().toString());
        System.out.println(result);

    }
}
