package day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter "+names[i]+" grade:");
            grades[i]=scan.next().charAt(0);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);
        }













        }






    }

