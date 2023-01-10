package day17_Java;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to reserve the room?");
        String yesOrNo = scan.next();

        if (yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("no")){
            if (yesOrNo.equalsIgnoreCase("yes")){
                System.out.println("Please choose your room: ");
                System.out.println("Option number 1 : King Bed ==> 120$\n" +
                        "Option number 2 : Queen Bed ==> 100$\n" +
                        "Option number 3 : single Bed ==> 80$");

                System.out.println("Option number(1-3): ");

                int option = scan.nextInt();
                if (option>=1&&option<=3){

                    if (option==1){
                        System.out.println("You have choose King Bed ==> 120$ ");
                    } else if (option==2) {
                        System.out.println("You have choose Queen Bed ==> 100$");
                    }else {
                        System.out.println("You have choose single Bed ==> 80$");
                    }


                }else {
                    while(true){
                        System.out.println("Please re-select the room: ");
                        option= scan.nextInt();
                    }
                }


            } else if (yesOrNo.equalsIgnoreCase("no")) {
                System.out.println("Have a nice day.");

            }


        }else {
            while (true){
                System.out.println("Do you want to reserve the room?");
                yesOrNo= scan.next();
            }
        }



    }



          }
















