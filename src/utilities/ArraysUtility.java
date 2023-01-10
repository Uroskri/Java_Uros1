package utilities;

import java.util.Arrays;

public class ArraysUtility {
//prints each int of an int array in separate lines
    public static void printEachElement(int [] array){

        for (int each : array) {
            System.out.println(each);
        }
        
    }
//print aeach double of double array in separate lines
    public static void printEachElement(double [] array){

        for (double each : array) {
            System.out.println(each);
        }

    }
//prints each char of char array in separate lines
    public static void printEachElement(char [] array){

        for (char each : array) {
            System.out.println(each);
        }

    }
//prints each String of String array in separate lines
    public static void printEachElement(String [] array){

        for (String each : array) {
            System.out.println(each);
        }

    }
    //returns the max num for integer array
    public static int max(int [] numbers){

        Arrays.sort(numbers);
        return numbers[numbers.length-1];


    }
    //returns the max num for double array
    public static double max(double [] numbers) {

        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }
    //returns the min num from integer array
    public static int min(int [] numbers) {

        Arrays.sort(numbers);
        return numbers[0];

    }
    //returns the min num from double array
    public static double min(double [] numbers) {

        Arrays.sort(numbers);
        return numbers[0];

    }
    //checks if the given int is contained in the given array.Returns boolean
    public static boolean contains (int[] array,int element){

        boolean result =false;

        for (int each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }
    //checks if the double num is contained in double array
    public static boolean contains (double[] array,double element){

        boolean result =false;

        for (double each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }
//checks if the given char is contained in the given array
    public static boolean contains (char[] array,char element){

        boolean result =false;

        for (char each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }
    //checks if the given String is contained in the given array
    public static boolean contains (String[] array,String element){

        boolean result =false;

        for (String each : array) {
            if (each.equals(element)){
                result=true;
            }
        }
        return result;
    }
    //Adds elements to the variable array
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
//returns the frequency of given element of given array
    public static int frequencyOfElement(int [] arr,int element){

        int count = 0;

        for (int each : arr) {
            if (each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(double [] arr,double element){

        int count = 0;

        for (double each : arr) {
            if (each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(char [] arr,char element){

        int count = 0;

        for (char each : arr) {
            if (each==element){
                count++;
            }
        }

        return count;
    }
    public static int frequencyOfElement(String [] arr,String element){

        int count = 0;

        for (String each : arr) {
            if (each.equals(element)){
                count++;
            }
        }

        return count;
    }
//returns the unique of element of given array
public static int [] uniqueElements(int [] arr){

    int [] result = {};

    for (int each : arr) {
        if (ArraysUtility.frequencyOfElement(arr,each)==1){
            result=ArraysUtility.addElementToArray(result,each);
        }
    }
    return result;
}
    public static double [] uniqueElements(double [] arr){

        double [] result = {};

        for (double each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each)==1){
                result=ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    public static char [] uniqueElements(char [] arr){

        char [] result = {};

        for (char each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each)==1){
                result=ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    public static String [] uniqueElements(String [] arr){

        String [] result = {};

        for (String each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each)==1){
                result=ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
//removes the element from the given array
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
//merge the given two arrays and returns the new array
public static  int [] merge (int[] arr1,int []arr2){
    int[] result = {};

    for (int each : arr1) {
        addElementToArray(result,each);
    }
    for (int each : arr2) {
        addElementToArray(result,each);
    }
    return result;
}
    public static  double [] merge (double[] arr1,double []arr2){
        double[] result = {};

        for (double each : arr1) {
            addElementToArray(result,each);
        }
        for (double each : arr2) {
            addElementToArray(result,each);
        }
        return result;
    }
    public static  char [] merge (char[] arr1,char []arr2){
        char[] result = {};

        for (char each : arr1) {
            addElementToArray(result,each);
        }
        for (char each : arr2) {
            addElementToArray(result,each);
        }
        return result;
    }
    public static  String [] merge (String[] arr1,String []arr2){
        String[] result = {};

        for (String each : arr1) {
            addElementToArray(result,each);
        }
        for (String each : arr2) {
            addElementToArray(result,each);
        }
        return result;
    }
//the given array returns as reverse array
public static int [] reverse (int[]arr1){
    int[]result=new int[arr1.length];

    for (int i = arr1.length - 1,j=0; i >= 0;j++, i--) {
        result[j] =arr1[i];
    }
    return result;
}
    public static double [] reverse (double[]arr1){
        double[]result=new double[arr1.length];

        for (int i = arr1.length - 1,j=0; i >= 0;j++, i--) {
            result[j] =arr1[i];
        }
        return result;
    }
    public static char [] reverse (char[]arr1){
        char[]result=new char[arr1.length];

        for (int i = arr1.length - 1,j=0; i >= 0;j++, i--) {
            result[j] =arr1[i];
        }
        return result;
    }
    public static String [] reverse (String[]arr1){
        String[]result=new String[arr1.length];

        for (int i = arr1.length - 1,j=0; i >= 0;j++, i--) {
            result[j] =arr1[i];
        }
        return result;
    }
//replaces the specific element of the array with the given new element and return an array
    public static int[] replace(int[] arr, int index, int newElement) {


        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        arr[index] = newElement;

        return arr;
    }
    public static double[] replace(double[] arr, int index, double newElement) {


        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        arr[index] = newElement;

        return arr;
    }
    public static char[] replace(char[] arr, int index, char newElement) {


        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        arr[index] = newElement;

        return arr;
    }
    public static String[] replace(String[] arr, int index, String newElement) {


        if (index < 0 || index > arr.length - 1) {
            System.out.println("Invalid index " + index);
            System.exit(0);
        }

        arr[index] = newElement;

        return arr;
    }
//replaces all matching old value with the new value
    public static double [] replaceAll(double[]arr, double oldValue, double newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldValue){
                arr[i] = newValue;
            }
        }

        return arr;
    }
    public static int [] replaceAll(int[]arr, int oldValue, int newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldValue){
                arr[i] = newValue;
            }
        }

        return arr;
    }
    public static char [] replaceAll(char[]arr, char oldValue, char newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==oldValue){
                arr[i] = newValue;
            }
        }

        return arr;
    }
    public static String [] replaceAll(String[]arr, String oldValue, String newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldValue)){
                arr[i] = newValue;
            }
        }

        return arr;
    }
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
