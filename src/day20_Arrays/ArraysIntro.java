package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        String myGroup [] = new String [5];
        myGroup[0]="Uros";
        myGroup[1]="Milos";
        myGroup[2]="Stefan";
        myGroup[3]="Aleksandar";
        myGroup[4]="Miodrag";

        System.out.println(Arrays.toString(myGroup));

        String days[] = {"Monday","Tue","Wed","Thur","Fri","Sat","Sun"};
        System.out.println(Arrays.toString(days));


        int number =5;
        if (number <1|| number>7){
            System.out.println("Invalid");
            System.exit(0);
        }

        System.out.println(days[number-1]);


        String months[] = {"Jan","Feb","Mar","Apr","May","Jun",
        "Jul","Aug","Sep","Oct","Nov","Dec"};

        int num = 7;

        if (num<1&&num>12){
            System.out.println("Invalid");
            System.exit(0);
        }

        System.out.println(months[num-1]);


        for (int i = months.length-1; i >=0 ; i--) {

            System.out.println(months[i]);

        }












    }
}
