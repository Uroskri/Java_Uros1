package week06_10_15_2022;

public class While_DoWhilePractice {
    public static void main(String[] args) {


        String str = "Java is java in everywhere is Java";
        int count = 0;
        String word = "Java";


        for (int i = 0; i <= str.length()-word.length(); i++) {

            String each = str.substring(i,i+ word.length());



            if (each.equalsIgnoreCase(word)){

                count++;
            }


        }
        System.out.println(count);

        int counter=0;

        for (int j = 0; j < str.length(); j++) {

            if (str.charAt(j)==' '){

                counter++;
            }

        }
        System.out.println(counter+1);







    }
}
