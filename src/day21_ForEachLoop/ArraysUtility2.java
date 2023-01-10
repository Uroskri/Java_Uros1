package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String students [] = {"Elif","Sinem","Gunay","Uros","Milos","Milena"};
        String earlyBirds [] = Arrays.copyOfRange(students,3,5);
        System.out.println(Arrays.toString(earlyBirds));

        char ch1 [] = {'A','B','C','D','E','F','G','H','J'};

        char ch2 [] = Arrays.copyOfRange(ch1,2,6);
        System.out.println(Arrays.toString(ch2));





    }
}
