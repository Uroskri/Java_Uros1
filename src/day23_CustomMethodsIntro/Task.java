package day23_CustomMethodsIntro;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        /*Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry*/


        Scanner scan = new Scanner(System.in);
        while (true) {
            int answerForRoom = 0;



            System.out.println("Please choose your room option: ");
            System.out.println("Option 1 : King Bed ==> 120$");
            System.out.println("Option 2 : Queen Bed ==> 100$");
            System.out.println("Option 3 : single Bed ==> 80$");

                int answerForRo = scan.nextInt();
                answerForRoom=answerForRo;;



            System.out.println("How many nights are you staying?");
            int nightsNumber = scan.nextInt();

            System.out.println("Would you like to reserve another room?");
            String answer = scan.next();


            for (int i = 0; i < 3;) {

                if (answer.equalsIgnoreCase("yes")) {
                    break;
                } else if (answer.equalsIgnoreCase("no")) {
                    if (answerForRoom==1){
                        System.out.println("You have chosen Option 1 : King Bed ==> 120$");
                    } else if (answerForRoom==2) {
                        System.out.println("You have chosen Option 2 : Queen Bed ==> 100$");
                    } else if (answerForRoom==3) {
                        System.out.println("You have chosen Option 3 : single Bed ==> 80$");
                    }else {continue;}

                }else {continue;}

            }

        }
    }
}
