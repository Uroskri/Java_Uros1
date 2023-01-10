package day26_CustomMethodPractice;

public class ReverseArray {
   public static int [] reverse (int[]arr1){
       int[]result=new int[arr1.length];

       for (int i = arr1.length - 1,j=0; i >= 0;j++, i--) {
          result[j] =arr1[i];
       }
return result;
   }


}
