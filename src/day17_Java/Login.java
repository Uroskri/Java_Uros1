package day17_Java;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int attempt = 3;

        System.out.println("Please enter the right credentials:");
        String userName = scan.nextLine();

        String password = scan.nextLine();


        while(!(userName.equals("Cydeo")&&password.equals("Cydeo123"))&&attempt>0){

            attempt-=1;

            System.out.println("Please enter the right credentials:");

            userName=scan.nextLine();
            password=scan.nextLine();

        }

        if (attempt==0){

            System.out.println("Your account has been blocked");
        }else {
            System.out.println("You have been logged in");
        }



scan.close();


    }
}
