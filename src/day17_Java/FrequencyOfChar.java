package day17_Java;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "AAABBBC";

        char ch ='A';

        int frequency = 0;

        for (int i = 0; i <str.length() ; i++) {


            char eachChar = str.charAt(i);

            if (ch==eachChar){

                frequency+=1;
            }



        }
        System.out.println("frequency = " + frequency);

        System.out.println("-------------------------------------------------");


        String str1 = "JavaJava";

        int freq = 0;

        for (int i = 0; i <str1.length()-3; i++) {

           String str2 =  str1.substring(i,i+4);



           if (str2.equals("Java")){

               freq+=1;
           }

        }

        System.out.println(freq);


        System.out.println("---------------------------------");


        String d = "dogdogdogdog Dog doG  dog";

        int f = 0;

        for (int i = 0; i <d.length()-2 ; i++) {

            String each = d.substring(i,i+3);
            if (each.equalsIgnoreCase("dog")){

                f+=1;
            }


        }

        System.out.println(f);








        }



    }

