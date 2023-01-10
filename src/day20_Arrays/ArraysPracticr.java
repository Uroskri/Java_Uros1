package day20_Arrays;

import java.util.Arrays;

public class ArraysPracticr {
    public static void main(String[] args) {

        int number[] = {10, 20, 50, 70};

        System.out.println(Arrays.toString(number));


        int score[] = new int[5];
        score[1] = 85;
        score[score.length-1] = 95;
        score[3] = 75;
        score[0] = 65;
        score[2] = 55;


        System.out.println(Arrays.toString(score));


    }
}
