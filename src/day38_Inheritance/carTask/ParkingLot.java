package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry","grey",20000,12345,2020);

        Tesla tesla =new Tesla("Model S","Red",95900,12333,2020);


        toyota.start();
        tesla.start();

    }
}
