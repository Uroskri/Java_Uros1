package day17_Java;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {

        /*1. Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed*/



       /*

        if (size.equalsIgnoreCase("tall")){

            System.out.println("tall:\n" +
                    "price is $3.69\n" +
                    "90 calories\n" );
        } else if (size.equalsIgnoreCase("venti")) {

            System.out.println("venti:\n" +
                    "price is $4.29\n" +
                    "150 calories");

        } else if (size.equalsIgnoreCase("grande")) {

            System.out.println("grande:\n" +
                    "price is $3.99;\n" +
                    "120 calories");

        }else {
            System.out.println("Invalid Size");
        }
        System.out.println("------------------------------");

        switch (size){
           case
         */

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose size of your coffee.Valid sizes are tall, grande, venti");
        String size = scan.next();

        switch (size.toLowerCase()) {

            case "tall":
                System.out.println("tall:\n" +
                        "price is $3.69\n" +
                        "90 calories");
                break;

            case "venti":
                System.out.println("venti:\\n\" +\n" +
                        "                    \"price is $4.29\\n\" +\n" +
                        "                    \"150 calories");
                break;

            case "grande":
                System.out.println("grande:\\n\" +\n" +
                        "                    \"price is $3.99;\\n\" +\n" +
                        "                    \"120 calories");
                break;
            default:
                System.out.println("Invalid Size"); */



        Scanner scan = new Scanner(System.in);
        System.out.println("Choose size of your coffee.Valid sizes are tall, grande, venti");
        String size = scan.next();


        if (size.equalsIgnoreCase("tall")||size.equalsIgnoreCase("venti")||size.equalsIgnoreCase("grande")){

            switch (size.toLowerCase()) {

                case "tall":
                    System.out.println("tall:\n" +
                            "price is $3.69\n" +
                            "90 calories");
                    break;

                case "venti":
                    System.out.println("venti:\\n\" +\n" +
                            "                    \"price is $4.29\\n\" +\n" +
                            "                    \"150 calories");
                    break;

                case "grande":
                    System.out.println("grande:\\n\" +\n" +
                            "                    \"price is $3.99;\\n\" +\n" +
                            "                    \"120 calories");
                    break;

        }


            }else {
            System.out.println("Invalid Size");





        }

    }

}
