package day14_String;

import day24_CustomMethod_Return.ReturnMethodIntro;
import day24_CustomMethod_Return.ReturnMethodPractice4;

public class Task {
    public static void main(String[] args) {


        String str = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbcccccccccccccccc";

        str=ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);


        String name = "Java Programming";

        name = ReturnMethodIntro.reverse(name);
        System.out.println(name);
    }
}
