package day44_Abstraction.AnimalTask;

public final class Parrot extends Animal implements Playable,Flyable{
    public Parrot(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    public void play() {
        System.out.println(getName()+" is playing with cotton");
    }

    public void fly(){
        System.out.println(getName()+" can fly 20km/h");
    }

}
