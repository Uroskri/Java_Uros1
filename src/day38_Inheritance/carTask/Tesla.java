package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla( String model, String color, double price, double miles, int year) {
        super("Tesla", model, color, price, miles, year);
    }

    public void autoPilot(){
        System.out.println(brand+" "+model+" has auto pilot");
    }

    @Override
    public void start() {
        System.out.println("Say \"start\" ");
    }
}
