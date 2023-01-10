package day19_LoopPractices;

import java.util.Scanner;

public class Task2Omer {
    public static void main(String[] args) {

        /*Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = scan.nextLine();
        System.out.println("Enter  the char: ");
        String ch = ""+(scan.next().charAt(0));
        int count = 0;
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {

            str1=""+str.charAt(i);

            if (str1.equalsIgnoreCase(ch)){

                count++;
            }



        }

        System.out.println("count = " + count);

    }
}
