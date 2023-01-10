package week11_11_19_2022;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>();

        cities.add("Beograd");
        cities.add("Pancevo");
        cities.add("Novi Sad");
        cities.add("Nis");
        cities.add(0,"Krusevac");
        System.out.println(cities);
        System.out.println(cities.get(0));
        cities.set(0,"Kragujevac");
        System.out.println(cities);
        System.out.println(cities.indexOf("Beograd"));

        int [] first = {1,2,3,4,5,6,7};
        int [] second = {4,5,6,8};



    }



}
