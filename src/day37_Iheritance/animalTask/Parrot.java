package day37_Iheritance.animalTask;

import day37_Iheritance.Animal;



public class Parrot extends Animal {





    public Parrot(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void sing(){
        System.out.println(name+" is singing");
    }






}
