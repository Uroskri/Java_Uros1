package day35_Encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank() || name.charAt(0) < 'a' ||  name.charAt(0) > 'z' || name.charAt(0) < 'A' || name.charAt(0) > 'Z')
        {
            return;
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0){return;}
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if  (name.equalsIgnoreCase("toilette paper")){
            if (quantity<=1){
                this.quantity = quantity;
            }else return;
        }


        this.quantity = quantity;
    }

    public Item(String name,double unitPrice,int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){

        return getUnitPrice()*getQuantity();

    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost=" + calcCost() +
                '}';

    }
}
