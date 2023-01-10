package day15_ForLoop;

public class ForLoopPractice2 {

    public static void main(String[] args) {


        for (int j=1;j<7;j++){
    for (int i = 1; i<7;i++) {

            System.out.print("* ");

        }

            System.out.println("* ");}




        for (int i = 1; i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.print("FINRA ");
            } else if (i%3==0 && i%5!=0) {
                System.out.print("FIN ");

            } else if (i%3!=0 && i%5==0) {
                System.out.print("RA ");

            }else {
                System.out.print(i+" ");
            }
        }







    }
}
