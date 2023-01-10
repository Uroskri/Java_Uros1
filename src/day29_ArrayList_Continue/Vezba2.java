package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Vezba2 {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
int lastI = numbers.size()-1;

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);



    }
}
