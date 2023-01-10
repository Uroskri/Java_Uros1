package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Vezba {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));


        int last = 0;


        for (int i = 0; i < numbers.size(); i++) {
            if (i==numbers.size()-1){
                numbers.set(i,last);

            }
        }
        System.out.println(numbers);
    }
}
