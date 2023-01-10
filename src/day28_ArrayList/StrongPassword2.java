package day28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {


        String password = "cLdeo1990@";

        int countUperCase = 0;
        int countLowerCase =0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;
            } else if (Character.isDigit(each)) {
                countDigits++;
            }else {
                countSpecialChar++;
            }


        }


        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUperCase = " + countUperCase);


        boolean hasUperCase = countUperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasDigit = countDigits>0;
        boolean hasSpecialChar = countSpecialChar>0;


        boolean strongPassword = password.length()>=8 && !password.contains(" ") &&
                hasSpecialChar && hasDigit && hasLowerCase && hasUperCase;


        System.out.println("strongPassword = " + strongPassword);








    }


}
