package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static int maxNum(int a,int b){
        int result=0;
        if (a>b){
            result=a;
        }else result=b;
        return result;
    }

    public static void main(String[] args) {

        int maxNumber=maxNum(100,200);

        System.out.println(maxNumber);


        int multi=maxNumber*2;
        System.out.println(multi);





    }

}
