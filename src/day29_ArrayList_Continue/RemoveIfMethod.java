package day29_ArrayList_Continue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

     /*   for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 != 0){
                list.remove(i);
            }
        }
*/
        System.out.println("list = " + list);

        list.removeIf(p->p<5);

        System.out.println("list = " + list);


        System.out.println("-------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each->each%2==0);

        System.out.println("list2 = " + list2);

        System.out.println("------------------------");

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("Java","Python","JavaScript","Java","C#"));

        list3.removeIf(p->p.startsWith("J"));

        System.out.println("list3 = " + list3);

        ArrayList<String> names  = new ArrayList<>();

        names.addAll(Arrays.asList("Anna","racecar","Level","Eye","Java","Python"));

        names.removeIf(name -> !StringUtility.isPalindrome(name));

        System.out.println("names = " + names);






    }
}
