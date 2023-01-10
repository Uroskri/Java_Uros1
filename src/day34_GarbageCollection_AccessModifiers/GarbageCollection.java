package day34_GarbageCollection_AccessModifiers;

import day32_Constructor.Car;
import day33_Statics.IPhone;
import day33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {


    public static void main(String[] args) {


        String str = null;



        String str1 = "wooden Spoon";
        str=null;

        System.out.println(str);

        Car car1 = new Car("Toyota");
        System.out.println("car1 = " + car1);

        car1=null;

        System.out.println("car1 = " + car1);


        System.out.println("-------------------------");

        String language = "Python";
                          language="Java";

        System.out.println("----------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list2);
        System.out.println(list1);


        System.out.println("--------------------------");


        Student student1 = new Student("Tahir",'M','B',14);

        student1.grade='A';

        Student student2 = student1;
        student2.name="Ahmet";

        System.out.println(student1);
        System.out.println(student2);









    }
}
