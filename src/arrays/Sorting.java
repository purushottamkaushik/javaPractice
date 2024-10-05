package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Sorting {
    public static void main(String[] args) {

        int[] intArr = new int[] {4,3,5,6,2,7,8,1};
        System.out.println("Before sort:: "+Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(" After sort :: " + Arrays.toString(intArr));


        String[] names = {"John", "Steve", "Shane", "Adam", "Ben"};

        System.out.println("Before sort:: "+Arrays.toString(names));
        Arrays.sort(names,0,names.length); // Ascending order
        System.out.println(" After sort :: " + Arrays.toString(names));
        Arrays.sort(names,0,names.length, Collections.reverseOrder());
        System.out.println(" After sort [Descending]:: " + Arrays.toString(names));


        System.out.println("=========================");

        Course[] courses = new Course[4];
        courses[0] = new Course(201, "Java", 300);
        courses[1] = new Course(101, "Ruby", 200);
        courses[2] = new Course(401, "Python", 400);
        courses[3] = new Course(301, "Scala", 100);

        System.out.println("Before sort:: "+Arrays.toString(courses));

        Arrays.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        Arrays.sort(courses);

        System.out.println("After sort:: "+Arrays.toString(courses));


        Integer arr[] = new Integer[] {1,2,3,null,5,null,7,null,null,null,11,null,13};
        int arrayLength = arr.length;
        System.out.println(arrayLength);

        String[] stringArr = new String[] {"A","B","C"};
        int index = IntStream.range(0, stringArr.length)
                .filter(i -> "F".equals(stringArr[i]))
                .findFirst()
                .orElse(-1);

        System.out.println("Array found at index: "+index);
        System.out.println("Found using binary search :: " +  Arrays.binarySearch(stringArr,"B"));
    }
}
