package day17_Java;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");

        String answer = scan.next();

        while(!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No"))){

            System.out.println("Please re-enter your answer:");

            answer= scan.next();


        }

        if (answer.equalsIgnoreCase("Yes")){

            System.out.println("Congrats");
        }
        if (answer.equalsIgnoreCase("No")){

            System.out.println("Goodbye");
        }


scan.close();







    }
}
