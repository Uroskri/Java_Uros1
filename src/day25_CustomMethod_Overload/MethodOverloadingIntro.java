package day25_CustomMethod_Overload;

import java.util.Arrays;



public class MethodOverloadingIntro {

    
    public static int sumOfNumbers (int num1,int num2){



        return num1+num2;
    }
    public static double sumOfNumbers (double num1,double num2){



        return num1+num2;
    }
    
    public static int sumOfNumbers(int num1,int num2,int num3) {
        return num1+num2+num3;
    }
    public static double sumOfNumbers(double num1,double num2,double num3) {
        return num1+num2+num3;
    }
    public static int sumOfNumbers (int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
    public static double sumOfNumbers (double num1,double num2,double num3,double num4){
        return num1+num2+num3+num4;
    }




    public static void main(String[] args) {


        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);


        double[] doubleArray = {10.5, 12.6, 13.7, 15.6};
        Arrays.sort(doubleArray);

        char[] charArray = {'A', 'B', 'C'};
        Arrays.sort(charArray);
        
        
        sumOfNumbers(10,20,30,40);
        
    }
}
