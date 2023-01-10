package day44_Abstraction.AnimalTask;

public final class Eagle extends Animal implements WildAnimal,Flyable {
    public Eagle(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a sheep");
    }
    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting a rabbit");
    }

    public void fly(){
        System.out.println(getName()+" can fly 50km/h");
    }


}
