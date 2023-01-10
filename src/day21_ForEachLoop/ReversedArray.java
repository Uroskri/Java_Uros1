package day21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int numbers [] = {10,20,30,40};


        int reserved []= new int [numbers.length];


        for (int i = numbers.length-1,j=0; i >=0 ;j++, i--) {

            reserved[j]=numbers[i];

        }
        System.out.println(Arrays.toString(reserved));








    }
}
