package day46_Polymorphism;

import day44_Abstraction.AnimalTask.Animal;
import day44_Abstraction.AnimalTask.Dog;
import day44_Abstraction.AnimalTask.Playable;

public class PolymorphismIntro {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        Integer n1 =2;

        Double b2 = 2.5;

        Boolean r1 = true;


        Object [] array = {str,b2,n1,r1};

        Animal animal = new Dog("O","S","B",'s',21,'s');

        animal.drink();


    }


}
