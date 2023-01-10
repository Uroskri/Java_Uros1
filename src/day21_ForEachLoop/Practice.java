package day21_ForEachLoop;

public class Practice {
    public static void main(String[] args) {

        String classMates[] ={"Uros Krivokuca","Milena Stojilovic","Milos Krivokuca","Omer Poyraz","Vucina Draskovic"};

        for (String each : classMates) {
            String initials =each.charAt(0)+""+each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);

        }








    }
}
