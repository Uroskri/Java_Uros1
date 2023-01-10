package day21_ForEachLoop;

public class Practice2 {
    public static void main(String[] args) {

        String classMates[] ={"Uros Krivokuca","Milena Stojilovic","Milos Krivokuca","Omer Poyraz","Vucina Draskovic"};



        for (String each : classMates) {

            String name = "";


            for (int i = each.length()-1; i >=0 ; i--) {
               name+=each.charAt(i);

            }

            System.out.println(name);
        }







    }
}
