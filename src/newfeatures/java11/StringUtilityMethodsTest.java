package newfeatures.java11;

public class StringUtilityMethodsTest {

    public static void main(String[] args) {
        String s = "hello".repeat(3);
        System.out.println(s);

        String s1 = " helloo world      9";
        System.out.println(s1.strip());
        System.out.println(s1.stripLeading());
        System.out.println(s1.stripTrailing());
        System.out.println(s1.isBlank());

        System.out.println("========");
        String linesString = "hello\n world \n demo";
        linesString.lines().forEach(System.out::println);
    }
}
