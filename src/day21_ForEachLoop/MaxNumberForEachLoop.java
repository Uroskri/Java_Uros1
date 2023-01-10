package day21_ForEachLoop;

public class MaxNumberForEachLoop {
    public static void main(String[] args) {

        int numbers [] = {10,5,4,20,1,0};

        int max = numbers[0];
        int min = numbers[0];

       /* for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];


          }}*/

        for (int number : numbers) {
            if (number>max){
                max=number;
            }

        }

        for (int each : numbers) {
            if (each<min){
                min=each;
            }

        }


        System.out.println(min);


        System.out.println(max);










    }
}
