package week07_22_10_2022;

import java.util.Random;
import java.util.Scanner;

public class FindingHiddenNumbers {
    public static void main(String[] args) {


        Random random = new Random();

        int hiddenNumber = random.nextInt(10);

        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
do {
    System.out.println("Enter a number: ");
    int searchNumber = scanner.nextInt();
    if (searchNumber == hiddenNumber) {
        System.out.println("Congrats");
        flag = false;

    }


}while(flag);



    }

}
