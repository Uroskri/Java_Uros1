package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static int [] uniqueElements(int [] arr){

        int [] result = {};

        for (int each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each)==1){
                result=ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    public static double [] uniqueElements(double [] arr){

        double [] result = {};

        for (double each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each)==1){
                result=ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    public static char [] uniqueElements(char [] arr){

        char [] result = {};

        for (char each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each)==1){
                result=ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    public static String [] uniqueElements(String [] arr){

        String [] result = {};

        for (String each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each)==1){
                result=ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int [] ar = {1,2,2,2,2,23,3,3,3,3,4,5,4,6,6};

        int [] unique = uniqueElements(ar);
        System.out.println("unique = " + Arrays.toString(unique));

double[] arrD = {23.4,234.3,23.4};

        double [] unique2 = uniqueElements(arrD);

        System.out.println("unique2 = " + Arrays.toString(unique2));


    }
}
