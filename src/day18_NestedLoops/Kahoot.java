package day18_NestedLoops;

public class Kahoot {
    public static void main(String[] args) {


        String str = "Dog Cat";
        str.replace("Cat","Dog");
        str.replaceFirst("Dog","tiger");

        System.out.println(str.endsWith("Dog"));
        System.out.println(str.startsWith("Dog"));


    }
}
