package day17_Java;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        String div15 = "";
        String div5 = "";
        String div3 = "";

        for (int i = 1; i <=n; i++) {
            if(i%15==0)
                div15+=i+" ";
            else if (i%5==0)
                div5+=i+" ";
            else if (i%3==0)
                div3+=i+" ";
        }
        System.out.println("div15 = " + div15);
        System.out.println("div5 = " + div5);
        System.out.println("div3 = " + div3);



    }
}
