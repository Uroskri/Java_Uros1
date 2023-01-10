package practice;

import java.util.Arrays;

public class Vezba {

    public static int frequencyOfWord(String sentence, String word) {

        int count = 0;
        String[] arr = sentence.split(" ");

        for (String each : arr) {
            if (each.equalsIgnoreCase(word)) {

                count++;
            }

        }
        System.out.println(count);
        return count;
    }

    public static int[] removeElement(int[] array, int index) {


        int[] removeElement = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) removeElement[j++] = array[i];
        }

        System.out.println(Arrays.toString(removeElement));
        return removeElement;
    }

    public static boolean contains(int[] array, int index) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == index) {
                return true;
            }

        }

        return false;
    }


    public static int[] reverse(int[] rever) {
        int j = 0;
        int r[] = new int[rever.length];
        for (int i = rever.length - 1; i >= 0; i--) {
            r[j++] = rever[i];
        }


        return r;
    }

    public static int[] merge(int arr1[], int arr2[]) {

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            merged[i] += each;
            i++;
        }
        for (int each1 : arr2) {
            merged[i] += each1;
            i++;
        }

        return merged;
    }

    public static int[] adding(int[] arr, int num) {

        int[] added = new int[arr.length + 1];
        int i = 0;
        for (int each : arr) {
            added[i] += each;
            i++;
        }
        added[arr.length]=num;
        return added;
    }
    public static int frequencyOfNumber (int []arr,int num){
        int [] array1=new int[arr.length];
        int i = 0;
        int c = 0;
        for (int each : arr) {
            array1[i]=each;
            i++;
            if (each==num){
                c++;
            }
        }
        System.out.println("Frequency of the number "+num+" = "+ c);
     return c;
    }
    public static boolean isPalindrome (String str){
       String str1="";
        for (int i = str.length()-1; i >=0 ; i--) {
            char ch =str.charAt(i);

            str1+=ch;

            if (str1.equalsIgnoreCase(str)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        frequencyOfWord("Java Java java Python Python jaVa", "java");
        removeElement(new int[10], 3);
        contains(new int[10], 4);

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int num = 6;

        int arr1[] = {8, 9, 10};


        System.out.println(contains(arr, num));
        reverse(arr);

        System.out.println(Arrays.toString(reverse(arr)));

        merge(arr, arr1);
        System.out.println(Arrays.toString(merge(arr, arr1)));

        int[] arr5 = {1, 2, 3, 5};
        int num5 = 4;

        System.out.println(Arrays.toString(adding(arr5, num5)));

        int [] arr4={1,1,1,1,1,1,1,1,4,5,6};
        int num4=6;

        frequencyOfNumber(arr4,num4);

        String str4="Level";

        isPalindrome(str4);

        System.out.println(isPalindrome(str4));


    }
}
