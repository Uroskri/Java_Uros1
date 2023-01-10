package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char letters []= new char [26];



            for (char i = 'z', j=0; i >='a' && j<letters.length; j++,i--) {

                letters[j]=i;

                System.out.println(letters[j]);

        }
        System.out.println(Arrays.toString(letters));



    }
}
