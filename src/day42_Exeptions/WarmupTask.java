package day42_Exeptions;

public class WarmupTask {

    public static void sleep (double seconds){
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        System.out.println("--------------------Push up started------------------------");

        for (int i = 0; i <=30 ; i++) {


            System.out.print("\rPush up "+ i);
            sleep(1.5);

        }

        System.out.println("Push ups completed");

        System.out.println("--------------Pull up started-------------------");

        for (int i = 0; i <=20 ; i++) {


            System.out.print("\rPull up "+ i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

        System.out.println("Pull ups completed ");

    }
}
