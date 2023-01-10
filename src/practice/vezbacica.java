package practice;

import java.util.Arrays;

public class vezbacica {

    public static int [] insert(int[]arr,int index,int elementOfArray){

        int [] arr1 = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            arr1[i]+=arr[i];
            if (i==index){
                arr1[i]=elementOfArray;
            }

        }


        return arr1;
    }
    public static int [] swap(int[]arr,int i,int j){

        int temp=0;
        int temp1=0;

        if (i<= arr.length-1 && j<=arr.length-1){

            temp=arr[i];
            temp1=arr[j];
            arr[i]=temp1;
            arr[j]=temp;

        }else {
            System.err.println("Invalid index number");
        }






return arr;

    }

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,78,98,755,};

        int arr1[]=insert(arr,5,2000);

        System.out.println(Arrays.toString(arr1));

int[] arr3=swap(arr1,5,1);
        System.out.println(Arrays.toString(arr3));
    }



}
