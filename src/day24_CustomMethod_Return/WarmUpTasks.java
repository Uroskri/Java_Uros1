package day24_CustomMethod_Return;

public class WarmUpTasks {
 public static void initials(String name){

    String initial =name.charAt(0)+"."+name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2) ;

     System.out.println(initial);

 }
 public static void domain(String email){
     String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
     System.out.println(domain);
 }
 public static void nameOfMonths(int number ){
     String name="";

     if (number>=1&& number<=12){
         name = (number==1)?"Jan" :(number==2)?"Feb":(number==3)?"Mar"
                 :(number==4)?"Apr":(number==5)?"May":(number==6)?"Jun":(number==7)?"Jul"
                 :(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov"
                 :"Dec";
     }else {name="Invalid";}

     System.out.println(name);

 }
 public static void nameOfDay(int dayNumber){
     String dayOfWeek="";
     if (dayNumber>=1&&dayNumber<=7){
         dayOfWeek=(dayNumber==1)?"Mon":(dayNumber==2)?"Tue":(dayNumber==3)?"Wed"
                 :(dayNumber==4)?"Thu":(dayNumber==5)?"Fri":(dayNumber==6)?"Sat"
                 :"Sun";
     }else {dayOfWeek="Invalid";}
     System.out.println("dayOfWeek = " + dayOfWeek);
 }

    public static void main(String[] args) {
        initials("Uros Krivokuca");
        domain("krivokucau@gmail.com");


        String [] emails = {"Krivokuca@gmail.com","uros@gmail.com","Krivi@gmail.com","ja@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        nameOfMonths(5);

        nameOfDay(6);



    }

}
