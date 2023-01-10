package day32_Constructor;

public class Car {

    public  String make,model,color;
    public int price,year;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make,model);
        this.year = year;
    }

    public Car(String make, String model, int price, int year) {
        this(make,model,price);

        this.price = price;

    }

    public Car(String make, String model, String color, int price, int year) {
        this(make,model,year,price);
        this.color = color;

    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }












}
