package day23_CustomMethodsIntro;

public class MethodPractice2 {
    public static void helloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    public static void evenNum() {
        int even = 10;

        int evenN = 0;

        for (int i = 1; i <= even; i++) {
            if (!(i % 2 == 0)) {
                continue;
            }
            evenN = i;
            System.out.println(evenN);
        }

    }

    public static void main(String[] args) {


        helloCydeo5Times();
        System.out.println();
        System.out.println();
        helloWorld5Times();
        System.out.println();
        System.out.println();
        evenNum();


    }
}
