package day25_CustomMethod_Overload;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {
        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        String str1 = StringUtility.reverse(str);
        System.out.println("str1 = " + str1);


        String string = "Level";

        boolean palindrome = StringUtility.isPalindrome(string);

        System.out.println(palindrome);

        String [] names = {"Anna","Java","Python","racecar","Cydeo"};

        int count = 0 ;
        for (String each : names) {


            if (StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);


        String str5="aaaaaaaaaaaaabbbbbbbbbbbcccccccccccccccc";


        String res = StringUtility.removeDuplicates(str5);

        System.out.println("res = " + res);
    }
}
