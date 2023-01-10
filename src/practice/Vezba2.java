package practice;

public class Vezba2 {
    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt ";

        String search1 = "cat";
        String search2 = "dog";

        String result = "";
        int count1 = 0;
        int count2 = 0;

       String [] sen = sentence.split(" ");

        for (String each : sen) {
            each=each.toLowerCase();
            if (each.contains(search1)) {

                count1++;
            }if (each.contains(search2)) {

                count2++;
            }
        }

        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
    }
}
