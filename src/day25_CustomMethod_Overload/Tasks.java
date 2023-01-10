package day25_CustomMethod_Overload;

import java.util.Arrays;

public class Tasks {

    public static int [] reverse(int [] arr){

        int [] result = new int[arr.length];

        for (int i = arr.length-1, j=0; i >=0;j++,  i--) {
            result[j]=arr[i];
        }
        return result;
    }
    public static double [] reverse(double [] arr){

        double [] result = new double[arr.length];

        for (int i = arr.length-1, j=0; i >=0;j++,  i--) {
            result[j]=arr[i];
        }
        return result;
    }
    public static char [] reverse(char [] arr){

        char [] result = new char[arr.length];

        for (int i = arr.length-1, j=0; i >=0;j++,  i--) {
            result[j]=arr[i];
        }
        return result;
    }
    public static String [] reverse(String [] arr){

        String [] result = new String[arr.length];

        for (int i = arr.length-1, j=0; i >=0;j++,  i--) {
            result[j]=arr[i];
        }
        return result;
    }

    public static void main(String[] args) {


        int arr [] = {10,20,30,40,50,60,70};

        int [] arr1 =reverse(arr);

        System.out.println("arr1 = " + Arrays.toString(arr1));

        String [] strAr={"JA","TI","ON"};

        String [] strA = reverse(strAr);
        System.out.println(Arrays.toString(strA));


    }
}
