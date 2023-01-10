package week05_10_08_2022;

import java.util.Scanner;

public class CalculatorWithSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter first num:");
        double number1 = scan.nextDouble();
        System.out.println("Please enter second num");
        double number2 = scan.nextDouble();


        System.out.println("Please enter your operator:");
        char operator = scan.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                System.out.println("Operator is wrong");
                break;


        }
        System.out.println(result);

        scan.close();


    }


}
