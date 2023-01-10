package day44_Abstraction.AnimalTask;

public abstract class Animal {

    private String name;
    private final String breed,color;
    private final char gender;
    private int age;
    private char size;

    public Animal(String name, String breed, String color, char gender, int age, char size) {
        setName(name);
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        setAge(age);
        setSize(size);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public char getSize() {
        return size;
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size=" + size +
                '}';
    }

    public abstract void eat();
    public final void drink(){
        System.out.println(breed +" "+ name+" is drinking water");
    }


}
