package day25_CustomMethod_Overload;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElementsToArray {
    public static int [] addInteger (int [] array,int element){
        int [] result = new int [array.length+1];
int i = 0;
        for (int each : array) {
           result [i++] =each;


        }
        result[i]=element;

        return result;

    }
    public static double [] addDouble (double [] array,double element){
        double [] result = new double [array.length+1];
        int i = 0;
        for (double each : array) {
            result [i++] =each;


        }
        result[i]=element;

        return result;

    }
    public static char [] addCharArray (char [] array,char element){
        char [] result = new char [array.length+1];
        int i = 0;
        for (char each : array) {
            result [i++] =each;


        }
        result[i]=element;

        return result;
    }
    public static String [] addStringArray (String [] array,String element){
        String [] result = new String [array.length+1];
        int i = 0;
        for (String each : array) {
            result [i++] =each;


        }
        result[i]=element;

        return result;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        int [] arr2 = addInteger(arr,5);
        System.out.println("arr2 = " + Arrays.toString( arr2));



        double [] arr3= {1.5,2.5,3.5,4.5};

        double [] arrDouble = addDouble(arr3,5.5);

        System.out.println("arrDouble = " + Arrays.toString(arrDouble));
        char [] charArr={'a','b','c','d'};

        char [] chars = addCharArray(charArr,'e');


        String [] names = {"Uros","Milena","Milos","Nemanja"};

       String [] name= addStringArray(names,"Marta");

       String [] nam =addStringArray(name,"Jovan");

        System.out.println("Arrays.toString(nam = " + Arrays.toString(nam));

        System.out.println(Arrays.toString(addStringArray(names,"Marta")));




    }


}
