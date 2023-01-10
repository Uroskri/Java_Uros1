package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW( String model, String color, double price, double miles, int year) {
        super("BMW", model, color, price, miles, year);
    }


    public void breakDown(){
        System.out.println(brand+ " "+model+ " breaks down every 100 miles");
    }
    public void raceCar(){
        System.out.println(brand+" "+model+" is a race car");
    }
}
