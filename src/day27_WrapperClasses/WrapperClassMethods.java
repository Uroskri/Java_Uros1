package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);


        System.out.println(num+1);
        System.out.println(str+1);

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);//Parse method

        System.out.println(num2+1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);



        String s3 = "1.5";

        Double z = Double.valueOf(s3);//ValueOf method

        System.out.println("z = " + z);

        System.out.println("---------------------------------------");


        char ch1 = '!';

        boolean isDigit = Character.isDigit(ch1);
        System.out.println("isDigit = " + isDigit);

        boolean isLetter = Character.isLetter(ch1);

        System.out.println("isLetter = " + isLetter);

        boolean isSpecialCH = !Character.isLetterOrDigit(ch1);

        System.out.println("isSpecialCH = " + isSpecialCH);


        boolean isUpperCase = Character.isUpperCase(ch1);
        System.out.println("isUpperCase = " + isUpperCase);

        boolean isLowerCase = Character.isLowerCase(ch1);

        System.out.println("isLowerCase = " + isLowerCase);


        String s = "jh312jh3j21h3j12h44369687";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if (Character.isDigit(each))
            sum+=Integer.parseInt(""+each);

        }

        System.out.println("sum = " + sum);



      }
}
