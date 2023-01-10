package day15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the word");

        String word = input.nextLine();



       /* int firstChar = word.indexOf("x");

        if (firstChar == 0) {
            String word2 = word.replaceFirst("x", "a");
            System.out.println(word2);
        } else {
            System.out.println(word);
        }*/

        System.out.println("---------------------");


        String name = input.next();

        int con = name.indexOf("x");
        int sta = name.indexOf("X");


      if (con>=0 || sta>=0){
          String name2 = name.toLowerCase();
          String name3 = name2.replace("x","a");

          System.out.println(name3);


      }else {
          System.out.println(name);}


        System.out.println("-------------------");

      input.nextLine();
      String first = input.nextLine();
      String last = input.nextLine();

      String f = first.substring(0,0+1);
      String ff = f.toUpperCase();
        String fff = first.substring(1);

        System.out.println(ff+fff);



input.close();











    }


}
