package day37_Iheritance.animalTask;


import day37_Iheritance.Animal;

public class Dog extends Animal {

    public int a;

    public  Dog(String name, String breed, String color, String size, char gender, int age,int a){

        super(name, breed, color, size, gender, age);

        this.a=a;


    }

    public void bark(){
        System.out.println(name+" is barking");
    }
}
