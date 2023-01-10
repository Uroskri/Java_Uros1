package homework;

import java.util.Arrays;

public class domaci {
    public static int [] fibonacci(int num){

        int [] temp = new int[num+1];


        for (int i = 0; i <=num; i++) {
            temp[i]=i;

            if (i>1){
                temp[i]=temp[i-1]+temp[i-2];
            }




        }



        return temp;
    }
    public static void fibonaccci(int num){

        int x=0;
        int y=1;
        int z=0;
        for (int i = 0; i <= num; i++) {
            z=x;
            x=y;
            y=z+y;
            System.out.print(z+" ");
        }
    }

    public static void main(String[] args) {

        int [] arr = fibonacci(8);

        System.out.println(Arrays.toString(arr));
      fibonaccci(8);

    }
}
