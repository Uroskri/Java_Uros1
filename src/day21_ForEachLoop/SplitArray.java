package day21_ForEachLoop;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {

        String sentence = "I love learning Java programming language";

        String words [] = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int numOfWords = words.length;

        System.out.println(numOfWords);


        String email = "WoodenSpoon@cydeo.com";

        String arr []= email.split("@");

        System.out.println(Arrays.toString(arr));








    }
}
