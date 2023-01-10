package day29_ArrayList_Continue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GreatCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);
        gradeOfA.removeIf(p -> !(p>=90 && p <=100));

        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p -> !(p>=80 && p <=89));

        System.out.println(gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p -> !(p>=70 && p <=79));

        System.out.println(gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p -> !(p>=60 && p <=69));

        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println(gradeOfF);

        System.out.println(gradeOfA.size());


        System.out.println("------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));
int n =5;

        for (int i = 1; i <n ; i++) {
            numbers.removeIf(p -> Collections.max(numbers)==p);

        }
int max = Collections.max(numbers);




        System.out.println("The 5th largest number in Array List is number "+max);











    }
}
