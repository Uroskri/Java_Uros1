package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,9,9,9,9,3,2,1,9,9,9,9,9));

        Collections.sort(list);

        System.out.println("list = " + list);

        Collections.reverse(list);
        System.out.println("list = " + list);

        Collections.swap(list,2,5);

        System.out.println("list = " + list);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        System.out.println("---------------------");

        Collections.replaceAll(list,9,1000);

        System.out.println("list = " + list);

        System.out.println("-------------------");

        Integer freq = Collections.frequency(list,1000);
        System.out.println("freq = " + freq);






    }
}
