package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysPractice {


    public static void main(String[] args) {
        String[] strArr = {"A", "B", "C", "D", "E", "F"};
       List<String> arrayL= Arrays.asList(strArr);

        System.out.println(arrayL);
//        arrayL.add("hello"); // will Exception in thread "main" java.lang.UnsupportedOperationException
        // because array is unchangeable and adding to it is not possible

        List<String> arrayList = new ArrayList<>(Arrays.asList(strArr)); // changeable as it makes copy of it.
        arrayList.add(0,"Hello");
        System.out.println(arrayList);
        

    }
}
