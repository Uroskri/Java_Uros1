package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrazPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers you want to enter? ");

        int numbers = scan.nextInt();

        int num [] = new int[numbers];

        for (int i = 0; i<num.length ; i++) {
            System.out.println("Please enter your number :");
            int number = scan.nextInt();
            num[i]=number;
            System.out.println(num[i]);

        }

        System.out.println(Arrays.toString(num));


    }
}
