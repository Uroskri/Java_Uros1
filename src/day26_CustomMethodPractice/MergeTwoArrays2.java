package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class MergeTwoArrays2 {

    public static int [] merge(int[] arr1,int[]arr2){
        int [] result = {};

        for (int each : arr1) {
          result =   ArraysUtility.addElementToArray(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElementToArray(result,each);

        }

return result;
    }



}
