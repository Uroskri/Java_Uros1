package day21_ForEachLoop;

public class ReversedNames {
    public static void main(String[] args) {



        String classMates [] = {"Omer Poyraz","Aleksandar Jovanovic","Milena Stojilovic", "Milos Krivokuca"};


        for (String each : classMates) {


            String reversed = "";


            for (int i = each.length()-1; i >=0 ; i--) {

                reversed += each.charAt(i);

            }
            System.out.println(reversed);

        }





    }
}
