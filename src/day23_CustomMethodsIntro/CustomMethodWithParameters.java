package day23_CustomMethodsIntro;

public class CustomMethodWithParameters {

    public static void oddOrEven(int number){

        if (number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }

    }

    public static void ageOfPerson(int birthYear){

        int age =2022 - birthYear;

        System.out.println("Your age is: " + age);
    }

    public static void printNumbers(int x, int y){
        if (x>y){
            System.out.println("Numbers between are: ");
            for (int i = y; i <=x; i++) {

                System.out.print(i+",");
            }
        }else if (y>x){
            System.out.println("Numbers between are: ");
            for (int i = x; i <=y ; i++) {
                System.out.print(i+",");
            }
        }else {
            System.out.println("Numbers are equal");
        }

    }

    public static void main(String[] args) {





        oddOrEven(10);


        ageOfPerson(1995);


        printNumbers(10,20);









    }
}
