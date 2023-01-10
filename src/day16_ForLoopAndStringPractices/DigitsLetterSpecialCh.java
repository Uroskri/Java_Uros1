package day16_ForLoopAndStringPractices;

public class DigitsLetterSpecialCh {
    public static void main(String[] args) {

        String str = "Cydeo12345School! @#WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                digits += ch;

            } else if (ch >= 'A' && ch <= 'Z') {

                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {

                letters += ch;

            } else {
                if (ch!=' '){

                specialChars += ch;}
            }

        }
        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);


    }
}
