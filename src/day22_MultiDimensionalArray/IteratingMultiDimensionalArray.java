package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3} , {4,5,7,8} , {9,1,2,3}};


        for (int i = 0; i < arr2D.length; i++) {

           // System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j]);
            }

        }













    }
}
