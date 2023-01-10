package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (result.contains(each))
                continue;
            result.add(each);

        }

        System.out.println(result);



        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);

        System.out.println(list1.equals(list2));


        System.out.println("-------------------------------");


        boolean r4 = list1.isEmpty();
        System.out.println(r4 + "r4");
        list1.clear();

        boolean r5 = list1.isEmpty();

        System.out.println(r5 + "r5");


        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.addAll(Arrays.asList(1,2,2,4,4,6,6));

        System.out.println(numbers);

        ArrayList<Integer> result1 = new ArrayList<>();

Integer count = 0;
        for (Integer each : numbers) {

            if (numbers.contains(each)){
                count++;
                if (count>1)
                    continue;

            }

            result1.add(each);




        }


        for (int i = 0; i < result1.size(); i++) {

            result1.get(i);

            if(i==0){

                System.out.println(result1.get(i));
            }
        }






    }
}
