package day19_LoopPractices;

import java.util.Scanner;

public class Task3Omer {
    public static void main(String[] args) {
        /*Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num1 = scan.nextInt();

        int result =0;

        if (num < 0 && num1 < 0) {
            System.out.println("Invalid");

            System.exit(0);}


            for (int i = 0; i <num1; i++) {
               result+=num;

            }




        System.out.println("result = " + result);

    }

}
