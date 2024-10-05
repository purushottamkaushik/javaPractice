package stringpac;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringDemo {

    public static void main(String[] args) {

        String sample = "Hello"; // Its unmutable
        System.out.println(sample); // Hello
        String world = sample.concat("world");
        System.out.println(sample); // Hello
        System.out.println(world); // HelloWorld


        StringBuffer strB = new StringBuffer("study"); // MUtable
        strB.append("tonight");
        System.out.println(strB); //studytonight


        System.out.println(String.format("%s , %d" ,"Hello",98) ); // Hello , 98


        StringJoiner joiner = new StringJoiner(",","[","]");
        for (String s : new String[]{"a","b","c","d","e","f","g","h"}) {
            joiner.add(s);
        }
        System.out.println(joiner); // [a,b,c,d,e,f,g,h]


        System.out.println("Tokenizer");

        StringTokenizer tokenizer = new StringTokenizer("Hello world its going to be good soon" , " ");
        while(tokenizer.hasMoreTokens()){
            System.out.printf(tokenizer.nextToken() + " ,");
        }


    }
}
