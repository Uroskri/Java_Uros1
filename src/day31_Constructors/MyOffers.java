package day31_Constructors;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

       Offer offer1 = new Offer();
       offer1.setInfo("VA","SDET","Amazon",110000,true,true,true,true);

       Offer offer2 = new Offer();
       offer2.setInfo("CA","QA","Sony",20000,true,false,false,true);


       Offer offer3 = new Offer();
       offer3.setInfo("FL","QE","Apple Inc",125000,true,true,true,true);

       Offer offer4 = new Offer();
       offer4.setInfo("TX","SM","Capital One",115000,false,false,true,true);

       Offer offer5 = new Offer();
       offer5.setInfo("WA","BA","Bank Of America",13000,true,true,false,true);

      Offer [] myOffers = {offer1,offer2,offer3,offer4,offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p-> !p.isFullTime);
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("VA"));

        System.out.println(localOffers.size());

        System.out.println(localOffers.get(0));







    }
}
