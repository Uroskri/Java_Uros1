package day18_NestedLoops;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Enter your age");
            int age = scan.nextInt();

            while (!(age>=1 && age<=120)){
                System.out.println("Invalid age re enter");
                age= scan.nextInt();
            }


            System.out.println("Would you like to continue");
            String a = scan.next().toLowerCase();

            while (!(a.equals("Yes")||a.equals("No"))){
                System.out.println("Invalid entry, do you want to continue?");
                a= scan.next();
            }

            scan.close();



            if (a.equals("No")){
                break;
            }



        }




    }
}
