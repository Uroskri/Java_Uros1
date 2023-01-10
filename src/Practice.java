import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the sentence:");

        String sentence = scan.nextLine();

        String result = "";

        int count = 0;


        for (int i = 0; i < sentence.length(); i++) {
            char ch1 = sentence.charAt(i);
            for (int j = 0; j < sentence.length(); j++) {

                char each = sentence.charAt(i);
                int counter = 0;

                if (ch1==each){
                    counter++;

                }

                if (counter>count){

                    count=counter;
                    result=""+ch1;
                }


            }











        }
        System.out.println(result);











    }
}
