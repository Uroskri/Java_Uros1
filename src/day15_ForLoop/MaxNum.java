package day15_ForLoop;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long number = 0l;

        for (int i = 1; i <5 ; i++) {

            System.out.println("Enter number");

            number = scan.nextLong();


        }

        if (number> scan.nextLong()){
            System.out.println(number);
        }

        }



    }

