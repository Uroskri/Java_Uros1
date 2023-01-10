package day38_Inheritance.carTask;

public class Toyota extends Car{
    public Toyota(String model, String color, double price, double miles, int year) {
        super("Toyota", model, color, price, miles, year);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable.");
    }


  public void start(){
      System.out.println("Twist the key to ignition");
  }
}
