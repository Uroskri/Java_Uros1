package day25_CustomMethod_Overload;

public class SumOfNumbers {
    public static int sumOf2Numbers (int num1,int num2){



        return num1+num2;
    }
    public static int sumOf3Numbers(int num1,int num2,int num3) {
        return num1+num2+num3;
    }
    public static int numOf4Numbers (int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    public static void main(String[] args) {

        int sum =sumOf2Numbers(10,20);
        System.out.println(sum);
        int sum4 = numOf4Numbers(10,20,30,40);

        System.out.println("sum4 = " + sum4);


    }

}
