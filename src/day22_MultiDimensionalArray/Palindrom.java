package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {

        String sentence = "Ana voli Milovana";

        String words []= sentence.split(" ");


        for (int i = 0; i < words.length; i++) {
            char ch=' ';
            String reversed = "";
            String word = words[i];

                for (int i1 = word.length()-1; i1 >= 0; i1--) {
                    ch=word.charAt(i1);

                    reversed+=ch;


                }

            boolean isPalindrome = words[i].equalsIgnoreCase( reversed);

            System.out.println("This word is Palindrom: " + isPalindrome);
            System.out.println(reversed + "-" + word);
        }





    }
}
