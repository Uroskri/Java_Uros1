package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";

       boolean sdk = str.isBlank();

       boolean name= str.isEmpty();

        System.out.println(name);

        System.out.println(sdk);

        String s1 = "CYDEO";

        String s2 = "cydeo";

        System.out.println(s1.equalsIgnoreCase(s2));

        String sentence = "My name is Bond James Bond";

        boolean hasCSsharp = sentence.contains("C#");

        boolean hasBond= sentence.contains("Bond");

        System.out.println(hasBond);

        System.out.println(hasCSsharp);


        String input1 ="I love Java";

        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java"));





        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");

        System.out.println(x);



    }
}
