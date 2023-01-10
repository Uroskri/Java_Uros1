package day17_Java;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Java Python";

        int frequency = 0;

        while(str.contains("Java")){

            str = str.replaceFirst("Java","");


            frequency+=1;



        }

        System.out.println(frequency);


        String sentence = "cat cat cat cat cat cat cat cat";


        int c = 0;


        while(sentence.contains("cat")){


            sentence=sentence.replaceFirst("cat","");

            c+=1;


        }

        System.out.println(c);


        System.out.println("---------------------------");


        String str2 = "Java Java Java Java Python Java Python";


        int java=0;
        int python=0;


        while(str2.contains("Java")||str2.contains("Python")){


            if (str2.contains("Java")){


                str2=str2.replaceFirst("Java","");

                java+=1;

            }

            if (str2.contains("Python")){

                str2=str2.replaceFirst("Python","");

                python+=1;
            }

        }


        System.out.println("python = " + python);
        System.out.println("java = " + java);



    }





}
