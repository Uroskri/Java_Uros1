package day37_Iheritance.PhoneTask;

public class Nokia extends Phone{
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence(){
        System.out.println("you can use "+brand + " "+ model+" as a tool for self defence");
    }


}
