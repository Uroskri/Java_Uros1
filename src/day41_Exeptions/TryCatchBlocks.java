package day41_Exeptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");

        try {
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch (ArithmeticException e){

            System.out.println("Catch Block");
            System.out.println("Arithmetic exception was occured");
        }


        System.out.println("Test2 started");
        int[] numbers = {1,2,3,45,5};

        try {
            System.out.println(numbers[200]);
        }catch (RuntimeException a){
            a.printStackTrace();
           // System.out.println(a.getMessage());
        }

        System.out.println("Test two completed");






        System.out.println("Test completed");


        System.out.println("-----------------------------");

        try {
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException c){
            c.printStackTrace();
        }





    }
}
