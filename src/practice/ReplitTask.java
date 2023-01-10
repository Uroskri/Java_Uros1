package practice;

import java.util.Scanner;

public class ReplitTask {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW

        int lastName = email.lastIndexOf("_");
        String name = email.substring(0,lastName);
        String str = name.substring(0,1).toUpperCase();
        String str2 = name.substring(1).toLowerCase();
        String name2=str+str2;

        int surname = email.indexOf("_")+1;
        int lastSur = email.indexOf("@");
        String surname1 = email.substring(surname,lastSur);
        String str3 = surname1.substring(0,1).toUpperCase();
        String str4 = surname1.substring(1).toLowerCase();
        String surname2=str3+str4;


        int dom = email.lastIndexOf("@")+1;
        String dome = email.substring(dom,email.lastIndexOf("."));
        String domei = dome.substring(0,1).toUpperCase();
        String domei2 = dome.substring(1).toLowerCase();
        String domein=domei+domei2;


        System.out.println("First name: "+name2);
        System.out.println("Last name: "+ surname2);
        System.out.println("Domain: "+ domein);








    }
}
