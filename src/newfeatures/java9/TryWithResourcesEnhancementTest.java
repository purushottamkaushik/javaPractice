package newfeatures.java9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class TryWithResourcesEnhancementTest {
    public static void main(String[] args) throws FileNotFoundException {
        // java
//        try (FileOutputStream fos = new FileOutputStream("output.txt")){
//            fos.write("hello".getBytes(StandardCharsets.UTF_8));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        FileOutputStream fos = new FileOutputStream("output9.txt");
        try (fos){
            fos.write("demo".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
