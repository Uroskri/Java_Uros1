package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class Vezba4 {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDuplicate = 0;
        ArrayList<Integer>arr2=new ArrayList<>();

        for (Integer each : arr1) {
            if (arr1.indexOf(each)!=arr1.lastIndexOf(each)){
                arr2.add(each);


            }


        }
        System.out.println(arr2.get(0));



    }
}
