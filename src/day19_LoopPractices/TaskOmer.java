package day19_LoopPractices;

import java.util.Scanner;

public class TaskOmer {
    public static void main(String[] args) {

/*Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative*/

        Scanner scan = new Scanner(System.in);


        int numP = 0;
        int numN = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter your number: ");

            int num = scan.nextInt();

            if (num>0){

                numP++;

            } else if (num<0) {

                numN++;

            }


        }

        System.out.println("numN = " + numN);
        System.out.println("numP = " + numP);




    }
}
