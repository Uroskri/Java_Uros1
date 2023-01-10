package day19_LoopPractices;

import java.util.Scanner;

public class Task4Omer {
    public static void main(String[] args) {

        /*1. Write a program that can calculate the area and perimeter of a
circle:
1. Ask the user "Enter the radius of the
circle:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the radius of the circle"
2. Display:
1. Diameter of circle
2. Area of circle
3. Perimeter of circle
3. Ask the user "Would you like to calculate
another circle?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Circle Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry*/


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the radius of the circle: ");

            double radius = scan.nextDouble();

            if (radius <= 0) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }

            double pi = 3.14;
            double diameter = 2 * radius;
            double perimeter = 2 * radius * pi;
            System.out.println("perimeter = " + perimeter);
            System.out.println("diameter = " + diameter);
            System.out.println("area = " + pi * radius * radius);


            System.out.println("Would you like to calculate another circle?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid entry");
                System.out.println("Would you like to calculate another circle?");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you\n" +
                        "for using Cydeo Circle Calculator APP");break;
            }


        }


    }
}
