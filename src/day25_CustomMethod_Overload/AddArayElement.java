package day25_CustomMethod_Overload;

import java.util.Arrays;

public class AddArayElement {
    public static int [] addElementToArray (int [] array,int element){
        int [] result = new int [array.length+1];
        int i = 0;
        for (int each : array) {
            result [i++] =each;


        }
        result[i]=element;

        return result;

    }
    public static double [] addElementToArray (double [] array,double element){
        double [] result = new double [array.length+1];
        int i = 0;
        for (double each : array) {
            result [i++] =each;


        }
        result[i]=element;

        return result;

    }
    public static char [] addElementToArray (char [] array,char element){
        char [] result = new char [array.length+1];
        int i = 0;
        for (char each : array) {
            result [i++] =each;


        }
        result[i]=element;

        return result;
    }
    public static String [] addElementToArray (String [] array,String element){
        String [] result = new String [array.length+1];
        int i = 0;
        for (String each : array) {
            result [i++] =each;


        }
        result[i]=element;

        return result;
    }

    public static void main(String[] args) {


        String [] strArr = {"Bla","BLA","Bla","BLA"};

       String [] sta =  addElementToArray(strArr,"BLablabla");

        System.out.println(Arrays.toString(sta));




    }

}
