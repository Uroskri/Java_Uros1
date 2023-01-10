package day17_Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scan.nextInt();

        while (!(age >= 1 && age <= 129)) {

            System.err.println("Invalid entry,enter again");
            age = scan.nextInt();
        }


        System.out.println("Are you a US citizen?yes/no");

        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry,enter again");

            answer = scan.next().toLowerCase();


        }

        if(age>=18&&answer.equalsIgnoreCase("yes")){

            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible" );
        }


    }
}
