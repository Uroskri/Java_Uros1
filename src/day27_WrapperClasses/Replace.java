package day27_WrapperClasses;

public class Replace {

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





}