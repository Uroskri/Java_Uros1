package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int lenght= list.size();

        list.removeAll(Arrays.asList(0));

        int newSize = list.size();

        int totalNumOfZeros = lenght-newSize;
        System.out.println("totalNumOfZeros = " + totalNumOfZeros);

        for (int i = 0; i < totalNumOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list);


        String str = "ABCD123!@#456EFG";
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);

        letters.removeIf(p-> !Character.isLetter(p) );

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);

        digits.removeIf(p-> !Character.isDigit(p));

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>(chars);

        specialChar.removeAll(letters);
        specialChar.removeAll(digits);

        System.out.println("specialChar = " + specialChar);




    }
}
