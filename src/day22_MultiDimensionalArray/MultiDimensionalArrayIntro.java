package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String group1 [] = {"John","Steven","Jack"};
        String group2 [] = {"Uros","Milena","Marta"};
        String group3 [] = {"John","Omer","Milos"};

        String[][] groups= new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));

         //index element   0 1 2     0 1 2 3     0 1 2 3
        int [][] arr2D = {{1,2,3} , {4,5,6,7,8} , {9,10,11,12,13}};
        //         index      0         1            2

        System.out.println(arr2D[1][2]);


    }
}
