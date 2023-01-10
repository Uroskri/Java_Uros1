package day18_NestedLoops;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number:");

        int num = scan.nextInt();


        while (true){
            if (num%2==0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }

            System.out.println("Do you want to enter another number?");

            String a = scan.next();
            while(!(a.equalsIgnoreCase("Yes")||a.equalsIgnoreCase("no"))){

                System.out.println("Invalid input" );
                System.out.println("Do you want to enter another number?");
                a = scan.next();


            }

            if (a.equalsIgnoreCase("yes")){
                System.out.println("Please enter the number:");
                num = scan.nextInt();

            }else if (a.equalsIgnoreCase("no")){
                break;
            }





        }

















    }



}
