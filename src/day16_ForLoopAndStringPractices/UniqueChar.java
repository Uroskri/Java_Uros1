package day16_ForLoopAndStringPractices;

public class UniqueChar {
    public static void main(String[] args) {

        String str = "aaabccc";


        String result = "";


        for (int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);

            if (str.indexOf(ch)==str.lastIndexOf(ch)){

                result += ch;

                System.out.println(result);



            }











        }





    }
}
