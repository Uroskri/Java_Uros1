package day38_Inheritance.carTask;

public class Car {
    public String brand,model,color;
    public double price,miles;
    public int year;


    public Car(String brand, String model, String color, double price, double miles, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.miles = miles;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " "+ model+" has started");
    }
    public void drive() {
        System.out.println(brand + " "+ model+" is driving");
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", miles=" + miles +
                ", year=" + year +
                '}';

    }
}
