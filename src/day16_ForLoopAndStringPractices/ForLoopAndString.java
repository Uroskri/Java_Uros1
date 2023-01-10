package day16_ForLoopAndStringPractices;

public class ForLoopAndString {
    public static void main(String[] args) {

        //Reverse String

        String str = "I love Java, Java is a fun language";
        //index:      0123456...

        String result = "";//Contains the reverse version of str
        /*

        result += str.charAt(11);
        result += str.charAt(10);
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);*/

        for (int i = str.length()-1; i >=0 ; i--) {

            result += str.charAt(i);


        }
        System.out.println(result);









    }
}
