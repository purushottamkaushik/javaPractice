package newfeatures.java11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtilityMethods {

    public static void main(String[] args) throws IOException {
    String fileText=    Files.readString(Path.of("/Users/kaushik/Desktop/work/backend/javaPractice/output.txt"));

        System.out.println(fileText);
        String filesOutput = "Hello\n world";
        Files.write(Path.of("/Users/kaushik/Desktop/work/backend/javaPractice/sample.txt"),filesOutput.getBytes(StandardCharsets.UTF_8));
    }
}
