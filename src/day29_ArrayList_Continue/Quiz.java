package day29_ArrayList_Continue;

public class Quiz {

    public static void method1 (){


        int n = -5;
        for (int i = 1; i <5 ; i++) {
            n*=i;
        }

        System.out.println("n = " + n);

    }

    public static void method2 (String s){

        String a = s.substring(10);
        if (a.length()>s.length()){

            System.out.println(a);
        }else {
            System.out.println(s);
        }

    }

    public static String method3 (int num){
        if (num<0){return "Less than 0";} else if (num<50) {
            return "Less than 50";

        } else if (num<100) {return "Less then 100";

        }else {return "other";}

    }

    public static int method4 (char c, String s){
        if (s.contains(""+c)){
            return 1;
        }else {return 0;}
    }

    public static boolean method5 (String str){
        boolean check = true;
        if (str.isEmpty()){
            check=false;
        }
        if (!str.contains("a")){
            check=false;
        } else if (str.contains("z")) {
            check=false;

        }
        check=str.substring(0,1).equals("a")? check : false;
        return check;
    }

    public static int [] method6 (String str){

        int [] arr = new int[str.length()];
        int n =10;

        for (int i = 0; i < arr.length; i++) {
            if (n==20||n==50||n==70){continue;}
            arr[i]=n;
            n*=10;
        }
        return arr;

    }

    public static String method7 (String str,int s){
        str =str.substring(6);
        if (s<10){str=str.substring(8);}else {
            if (str.length()>s){
                str="weekday";
            } else if (s>10||s==-10) {

                str = str.substring(5);
            }
        }
        return str;
    }

    public static void  method8 (int [] arr){

        for (int n : arr) {
            if (n%4==0){continue;}
            System.out.println(n);
        }

    }

    public static  char middle (String s){
        return s.charAt(s.length()/2);
    }


    public static String method9 (String one,String two,String three){
        return ""+middle(one) + middle(two) + middle(three);
    }


    public static int add (int n){return 5;}
    public static double add (double d){return 2.5;}
    public static long add (String s){return 10;}

    public static int action ( ){return 0;}
    public static int action (int i){
        return i*2;
    }
    public static int action (String s){
        return s.length();
    }
    public static int action (boolean b){
        if (!b){
            return 5;
        }else return 10;
    }


}
