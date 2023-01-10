package day27_WrapperClasses;

import utilities.ArraysUtility;

public class RemoveDuplicates {
//removes the duplicates from the given array,returns the new array
    public static int [] removeDuplicates(int arr[]){
        int [] result = {};

        for (int each : arr) {
            if (!ArraysUtility.contains(result,each)){
                
                ArraysUtility.addElementToArray(result,each);
                
            }
        }
        
        return result;
    }
    public static double [] removeDuplicates(double arr[]){
        double [] result = {};

        for (double each : arr) {
            if (!ArraysUtility.contains(result,each)){

                ArraysUtility.addElementToArray(result,each);

            }
        }

        return result;
    }
    public static char [] removeDuplicates(char arr[]){
        char [] result = {};

        for (char each : arr) {
            if (!ArraysUtility.contains(result,each)){

                ArraysUtility.addElementToArray(result,each);

            }
        }

        return result;
    }
    public static String [] removeDuplicates(String arr[]){
        String [] result = {};

        for (String each : arr) {
            if (!ArraysUtility.contains(result,each)){

                ArraysUtility.addElementToArray(result,each);

            }
        }

        return result;
    }
    
    
}
