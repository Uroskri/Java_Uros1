package day21_ForEachLoop;

import java.util.Arrays;

public class AddArrays {
    public static void main(String[] args) {

        int arr1 []={1,2,3,4,5};
        int arr2 []={6,7,8,9,10};


        int sumarr [] = new int[arr1.length+arr2.length];

int i = 0;
        for (int each : arr1) {
            sumarr[i++] =each;


        }


        for (int each : arr2) {
            sumarr[i++] =each;


        }

        System.out.println(Arrays.toString(sumarr));








    }
}
