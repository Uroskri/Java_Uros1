package day18_NestedLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username");
        String u = scan.next();
        System.out.println("Please enter your password");
        String p = scan.next();


        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");

        } else {
            for (int i = 0; i < 3; i++) {

                System.out.println("Incorect username or password");

                System.out.println("Ente your username");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }

            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {

                System.err.println("Your account is locked, Please contact support team");
            }


        }


    }
}
