package day17_Java;

public class Taskic {
    public static void main(String[] args) {

        String s = "Java Java Java Java Python Java Python";


        int java=0;
        int python=0;


        while(s.contains("Java")||s.contains("Python")){


            if (s.contains("Java")){


                s=s.replaceFirst("Java","");

                java+=1;
            }




        }

        System.out.println("python = " + python);
        System.out.println("java = " + java);
        if(s.contains("Python")){

            python+=1;
        }








    }
}
