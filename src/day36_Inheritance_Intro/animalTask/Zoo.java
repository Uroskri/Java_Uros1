package day36_Inheritance_Intro.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.setInfo("Max", "Husky","Black and White","small",'M',2 );
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();
        System.out.println(dog1);



        Cat cat = new Cat();
        cat.setInfo("Tarcin","British","brown","Small",'M',3);
        cat.sleep();
        cat.eat();
        cat.drink();
        cat.move();
     //   cat.bark();
        cat.scratch();
        System.out.println(cat);



        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal","Red","Large",'M',4);
        tiger.eat();
        tiger.drink();
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);

    }
}
