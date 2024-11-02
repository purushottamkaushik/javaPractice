package newfeatures.java15;

public class TextBlocksTest {
    public static void main(String[] args) {

        String lines = """
                'HEllo \n',
                "WOrld"
                """;
        System.out.println(lines);

        String text = """
                Employee name : %s ,\n
                EmpliyeeNUMber : %d
                
                """.formatted("Purushottam" , 9089895);
        System.out.println(text);

        String input = "Hello \t world \n";
        System.out.println(input.translateEscapes());


    }
}
