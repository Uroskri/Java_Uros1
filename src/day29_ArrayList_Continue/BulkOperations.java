package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(3,5,8));

        System.out.println("list = " + list);

        list.retainAll(Arrays.asList(2,4,10));

        System.out.println("list = " + list);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r2 = nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


        String [] names = {"Jelena","Aleksandra","Uros"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
/*
        namesList.addAll(Arrays.asList(names));
        System.out.println("namesList = " + namesList);*/


        Integer [] arr ={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));


    }


}
