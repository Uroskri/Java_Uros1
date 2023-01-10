package day25_CustomMethod_Overload;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {



        int [] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        double [] arr2 = {10.4,11.2,11.5,12.5};

        ArraysUtility.printEachElement(arr2);

        int [] arr = {1,2,3,4,5,6};

        int max = ArraysUtility.max(arr);

        System.out.println(max);


        int [] arr6 = {1,2,3,4,5,6,7};
        boolean r1=ArraysUtility.contains(arr6,1);

        System.out.println("r1 = " + r1);




    }
}
