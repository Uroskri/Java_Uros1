package day37_Iheritance.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {


        Iphone iphone = new Iphone("Iphone 12","6.7 inches",1000,"Black");

        Samsung samsung = new Samsung("Galaxy S19","6 inch",900,"White");

        Nokia nokia = new Nokia("Brick","4 inch",50,"GRay");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(12324556);
        iphone.faceTime(3812389);
        iphone.faceTime("yahoo@yahoo.com");









    }
}
