package day42_Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {


        System.out.println("enter your age: ");

        int age = new Scanner(System.in).nextInt();

        if (age<0){

            throw  new InputMismatchException("Cannot be negative: "+age);
        }

        if (age>21){
            System.out.println("Eligible");
        }else {
            throw new RuntimeException("You have to be at least 21");
        }



    }
}
