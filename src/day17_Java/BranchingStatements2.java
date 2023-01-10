package day17_Java;

public class BranchingStatements2 {
    public static void main(String[] args) {


        for (char i = 'A'; i <= 'E'; i++) {

            System.out.println(i + " ");

            if (i == 'C') {

                // break;stops the loop and continue skips the statement
                continue;
            }

            System.out.println(i);

        }
        System.out.println("-----------------------");


        for (int i = 1; i < 11; i++) {

            if (!(i % 2 == 0)) {

                continue;
            }
            System.out.println(i + " ");
        }


    }
}
