package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String classMates [] = {"Omer Poyraz","Aleksandar Jovanovic","Milena Stojilovic", "Milos Krivokuca"};





            for (String classMat : classMates) {

                String initial = classMat.charAt(0)+""+ classMat.charAt(classMat.indexOf(" ")+1);

                System.out.println(initial);

            }








    }
}
