package day27_WrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)*2);



        }

        System.out.println(numbers);


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Milos");
        employees.add("Jovana");
        employees.add("Milica");
        employees.add("Ivan");
        employees.add("Uros");
        employees.add("Milena");
        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(employees.size()-1);

        System.out.println(employees);

        employees.remove("Uros");

        System.out.println(employees);

    }

}
