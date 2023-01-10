package day16_ForLoopAndStringPractices;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW

        Scanner scan = new Scanner(System.in);

        double premiumCost =0;

        System.out.println("Enter your full name");

        String fullName=scan.nextLine();


        String fullName3=""+fullName.indexOf(' ');
        String fullName4=fullName3.toUpperCase();
        System.out.println(fullName4);



            String fullName1=fullName.substring(0,1).toUpperCase()+""+fullName.substring(1,fullName.length());

            System.out.println(fullName1 +", here's your quote!");













    }
}
