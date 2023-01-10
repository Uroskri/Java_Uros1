package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static int[] removeElement(int[] arr, int index) {
if (index<0||index> arr.length-1){
    System.err.println("Invalid index "+ index);
    System.exit(0);
}
        int[] result = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {


            if (i==index) {
                continue;
            }
            result[j++] = arr[i];

        }
return result;
    }
    public static double[] removeElement(double[] arr, int index) {
        if (index<0||index> arr.length-1){
            System.err.println("Invalid index "+ index);
            System.exit(0);
        }
        double[] result = new double[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {


            if (i==index) {
                continue;
            }
            result[j++] = arr[i];

        }
        return result;
    }
    public static String[] removeElement(String[] arr, int index) {
        if (index<0||index> arr.length-1){
            System.err.println("Invalid index "+ index);
            System.exit(0);
        }
        String[] result = new String[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {


            if (i==index) {
                continue;
            }
            result[j++] = arr[i];

        }
        return result;
    }
    public static char[] removeElement(char[] arr, int index) {
        if (index<0||index> arr.length-1){
            System.err.println("Invalid index "+ index);
            System.exit(0);
        }
        char[] result = new char[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {


            if (i==index) {
                continue;
            }
            result[j++] = arr[i];

        }
        return result;
    }


    public static void main(String[] args) {

        int [] numbers = {100,200,300,400,500,600};
        numbers=removeElement(numbers,1);
        numbers=removeElement(numbers,1);

        System.out.println(Arrays.toString(numbers));


        double [] num = {10.4,10.5,14.4,24.5};

        double [] num1 = removeElement(num,3);

        System.out.println(Arrays.toString(num1));


    }

}
