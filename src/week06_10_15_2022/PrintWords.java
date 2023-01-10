package week06_10_15_2022;

public class PrintWords {
    public static void main(String[] args) {


        String str = "Java is java in everywhere is Java";

        String str1 = "";

        for (int i = 0; i <= str.length()-1; i++) {

            if (str.charAt(i)!=' '){

                str1+=str.charAt(i);
            }

            if (str.charAt(i)==' '){

                System.out.println(str1);
                str1="";
            }




        }






    }
}
