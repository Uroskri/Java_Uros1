package day44_Abstraction.AnimalTask;

public final class Cat extends Animal implements Playable {


    public Cat(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a fish ");
    }


    public void Meow(){
        System.out.println(getName()+" is Meowing");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}
