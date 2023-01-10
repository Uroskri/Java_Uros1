package day44_Abstraction.AnimalTask;

public final class Tiger extends  Animal implements WildAnimal {
    public Tiger(String name, String breed, String color, char gender, int age, char size) {
        super(name, breed, color, gender, age, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a dear ");
    }


    public void Meow(){
        System.out.println(getName()+" is Meowing");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting an impala");
    }
}
