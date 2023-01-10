package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static day29_ArrayList_Continue.Quiz.*;

public class TestArrayListQuiz {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
      list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        for (Integer each : list) {
            if (each%2!=0){
                continue;
            }
            System.out.println(each+" ");
            break;
        }

        method1();
        method2("The sun set quickly and created a shadow");
        String tekst = method3(50);
        System.out.println(tekst);

        System.out.println(method5("apple"));

        System.out.println(method6("mark"));

        String str =method7("on the weekend" , 20);
        System.out.println(str);

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[]a=new int[size];
        int i = 0;

        while (i<size){
            a[i++]=input.nextInt();
        }

        method8(a);

        Scanner scan = new Scanner(System.in);
        String str1 = method9(scan.next(),scan.next(),scan.next());
        System.out.println(str1);













    }




}
