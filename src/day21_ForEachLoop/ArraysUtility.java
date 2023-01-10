package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {


        int nums [] = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));

        String str ="Java";

        System.out.println(str);

        System.out.println(nums[0]);

        int scores [] = {95,100,55,65,78,85};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        String names [] = {"Anna","Uros","Milos","Stefan"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int arr1 []= {1,2,3};
        int arr2 [] = {2,3,1};

       boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);



        char ch1 [] = {'a','c','b'};
        char ch2 [] = {'a','b','c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println(anagram);





    }
}
