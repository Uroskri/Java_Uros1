package week06_10_15_2022;

public class WarmUpTask {
    public static void main(String[] args) {

        String str = "Code";


        String str1 = "";

        for (int i = 0; i <str.length(); i++) {

            String str2 = str.substring(0,i);

            str1+=str2;


        }

        System.out.println(str1+str);

    }
}
