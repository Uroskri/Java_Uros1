package day44_Abstraction.AnimalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats Pizza");
    }
    public void play() {
        System.out.println(getName()+" is playing with ball");
    }
}
