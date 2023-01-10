package day37_Iheritance.animalTask;

public class AnimalObject {

    public static void main(String[] args) {


        Dog dog1 = new Dog("Oscar","Labrador","Gold","Large",'M',8,2);

        System.out.println(dog1);
        dog1.bark();

        Parrot parrot1 = new Parrot("King","Macaw","Blue","small",'M',2);
        System.out.println(parrot1);
        parrot1.sing();







    }
}
