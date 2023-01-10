package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPractice2 {
    public static void main(String[] args) {


        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali","David","Ahmed","Uros","Milena"));

        employees.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println("employees = " + employees);


        System.out.println("----------------------------");

        String [] names = {"Mary","Monica","Musti","Sumerya","Uros"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p-> p.charAt(0)=='M');

        names= list.toArray(new String[0]);

        System.out.println("list = " + list);list.toArray(new String [0] );

        System.out.println(Arrays.toString(names));










    }
}
